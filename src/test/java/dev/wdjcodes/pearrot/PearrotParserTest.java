package dev.wdjcodes.pearrot;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.junit.Test;
import org.antlr.v4.runtime.CharStreams;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class PearrotParserTest {

    PearrotLexer getLexerForResource(String resourceName) throws IOException {
        return new PearrotLexer(CharStreams.fromStream(getClass().getResourceAsStream(resourceName)));
    }

    PearrotParser getParserForResource(String resourceName) throws IOException {
        return new PearrotParser(new CommonTokenStream(getLexerForResource(resourceName)));
    }

    PearrotLexer getLexerForString(String string) {
        return new PearrotLexer(CharStreams.fromString(string));
    }

    PearrotParser getParserForString(String string) {
        return new PearrotParser(new CommonTokenStream(getLexerForString(string)));
    }

    class ParseTreeNode {
        String mName;
        List<ParseTreeNode> mChildren = new LinkedList<>();

        ParseTreeNode(String name){
            mName = name;
        }

        ParseTreeNode(ParserRuleContext context ){
            mName = context.getClass().getSimpleName().replace("Context", "");
        }

        String getTreeString(){
            StringBuilder sb = new StringBuilder();
            sb.append(mName).append("\n");
            for(ParseTreeNode child : mChildren){
                sb.append(child.getTreeString(1));
            }
            return sb.toString();
        }

        ParseTreeNode addChild(ParseTreeNode child){
            mChildren.add(child);
            return this;
        }

        String getTreeString(int indent){
            StringBuilder sb = new StringBuilder();
            sb.append("\t".repeat(indent));
            sb.append(mName).append("\n");
            for(ParseTreeNode child : mChildren){
                sb.append(child.getTreeString(indent + 1));
            }
            return sb.toString();
        }
    }

    ParseTreeNode toParseTree(ParserRuleContext context){
        ParseTreeNode root = new ParseTreeNode(context);
        for(ParseTree child : context.children){
            if(child instanceof ParserRuleContext){
                root.addChild(toParseTree((ParserRuleContext)child));
            } else if (child instanceof TerminalNode){
                root.addChild(new ParseTreeNode("T[" + child.getText() + "]"));
            }
        }
        return root;
    }


    String readResource(String resourceName){
        InputStreamReader sr = new InputStreamReader(getClass().getResourceAsStream(resourceName));
        StringBuilder sb = new StringBuilder();
        int c;
        try{
            while((c = sr.read()) != -1){
                sb.append((char)c);
            }

        } catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }

    @Test
    public void parseSimpleVarDecl() throws IOException {
        PearrotParser.VarDeclarationContext varDecl = getParserForString("int id;").varDeclaration();
        assertEquals("id", varDecl.ID().getText());
        assertEquals("int", varDecl.type().getText());
    }

    @Test
    public void parserSimpleFile() throws IOException {
        PearrotParser.PearrotFileContext pearrotFile = getParserForResource("simplePearrotFile.pearrot").pearrotFile();
        assertEquals(readResource("simplePearrotFile.tree"), toParseTree(pearrotFile).getTreeString());
    }
}
