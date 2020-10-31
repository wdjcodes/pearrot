// Generated from /home/wdjcodes/dev/pearrot/src/main/antlr/PearrotLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PearrotLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, INT=2, CLASS=3, INTLIT=4, DECLIT=5, PLUS=6, MINUS=7, ASTERISK=8, 
		DIVISION=9, ASSIGN=10, LPAREN=11, RPAREN=12, LBRACE=13, RBRACE=14, SEMICOLON=15, 
		ID=16;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WS", "INT", "CLASS", "INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK", 
			"DIVISION", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
			"ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'int'", "'class'", null, null, "'+'", "'-'", "'*'", "'/'", 
			"'='", "'('", "')'", "'{'", "'}'", "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WS", "INT", "CLASS", "INTLIT", "DECLIT", "PLUS", "MINUS", "ASTERISK", 
			"DIVISION", "ASSIGN", "LPAREN", "RPAREN", "LBRACE", "RBRACE", "SEMICOLON", 
			"ID"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public PearrotLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PearrotLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\22f\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2%\n"+
		"\2\r\2\16\2&\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5\66"+
		"\n\5\r\5\16\5\67\3\6\6\6;\n\6\r\6\16\6<\3\6\3\6\7\6A\n\6\f\6\16\6D\13"+
		"\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\7\21[\n\21\f\21\16\21^\13\21\3\21\3\21\7\21"+
		"b\n\21\f\21\16\21e\13\21\2\2\22\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22\3\2\7\5\2\13\f\17\17\"\"\3\2"+
		"\62;\3\2aa\4\2C\\c|\6\2\62;C\\aac|\2k\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2"+
		"\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3$\3\2\2\2\5*\3\2\2\2\7.\3\2\2\2\t\65\3"+
		"\2\2\2\13:\3\2\2\2\rE\3\2\2\2\17G\3\2\2\2\21I\3\2\2\2\23K\3\2\2\2\25M"+
		"\3\2\2\2\27O\3\2\2\2\31Q\3\2\2\2\33S\3\2\2\2\35U\3\2\2\2\37W\3\2\2\2!"+
		"\\\3\2\2\2#%\t\2\2\2$#\3\2\2\2%&\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'(\3\2\2"+
		"\2()\b\2\2\2)\4\3\2\2\2*+\7k\2\2+,\7p\2\2,-\7v\2\2-\6\3\2\2\2./\7e\2\2"+
		"/\60\7n\2\2\60\61\7c\2\2\61\62\7u\2\2\62\63\7u\2\2\63\b\3\2\2\2\64\66"+
		"\t\3\2\2\65\64\3\2\2\2\66\67\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28\n\3\2"+
		"\2\29;\t\3\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>B\7\60"+
		"\2\2?A\t\3\2\2@?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2C\f\3\2\2\2DB\3"+
		"\2\2\2EF\7-\2\2F\16\3\2\2\2GH\7/\2\2H\20\3\2\2\2IJ\7,\2\2J\22\3\2\2\2"+
		"KL\7\61\2\2L\24\3\2\2\2MN\7?\2\2N\26\3\2\2\2OP\7*\2\2P\30\3\2\2\2QR\7"+
		"+\2\2R\32\3\2\2\2ST\7}\2\2T\34\3\2\2\2UV\7\177\2\2V\36\3\2\2\2WX\7=\2"+
		"\2X \3\2\2\2Y[\t\4\2\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2"+
		"\2\2^\\\3\2\2\2_c\t\5\2\2`b\t\6\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2cd\3"+
		"\2\2\2d\"\3\2\2\2ec\3\2\2\2\t\2&\67<B\\c\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}