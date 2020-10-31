package dev.wdjcodes.pearrot;

import dev.wdjcodes.pearrot.PearrotLexer;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.Token;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PearrotLexerTest {


    private List<String> tokens(PearrotLexer lexer){
        List<String> tokens = new ArrayList<>();
        Token t;
        t = lexer.nextToken();
        while(t.getType() != -1){
            if(t.getType() != PearrotLexer.WS){
                tokens.add(lexer.getRuleNames()[t.getType() - 1]);
            }
            t = lexer.nextToken();
        }
        tokens.add("EOF");
        return tokens;
    }

    @Test
    public void lexVarDeclarationAssignedAnIntegerLiteral() {
        List<String> expectedTokens = Arrays.asList("INT", "ID", "ASSIGN", "INTLIT", "EOF");
        assertEquals(expectedTokens, tokens(new PearrotLexer(CharStreams.fromString("int a = 5"))));
    }

    @Test
    public void lexMathematicalExpressionWithParenthesis(){
        List<String> expectedTokens = Arrays.asList("INTLIT", "PLUS", "LPAREN", "ID", "ASTERISK", "INTLIT", "RPAREN",
                "MINUS", "DECLIT", "EOF");
        assertEquals(expectedTokens, tokens(new PearrotLexer(CharStreams.fromString("5 + (a * 7) - 9.2"))));
    }
}
