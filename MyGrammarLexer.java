// Generated from MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LOWERCASE=2, UPPERCASE=3, DIGIT=4, NUMBER=5, CMD=6, NOTES=7, END_NOTES=8, 
		COLON=9, COMMENT=10, WHITESPACE=11, NEWLINE=12, WORD=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "LOWERCASE", "UPPERCASE", "DIGIT", "NUMBER", "CMD", "NOTES", 
			"END_NOTES", "COLON", "COMMENT", "WHITESPACE", "NEWLINE", "WORD"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", null, null, null, null, "'CMD'", "'NOTES'", "'END_NOTES'", 
			"':'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "LOWERCASE", "UPPERCASE", "DIGIT", "NUMBER", "CMD", "NOTES", 
			"END_NOTES", "COLON", "COMMENT", "WHITESPACE", "NEWLINE", "WORD"
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


	public MyGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17d\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\6\6"+
		"\'\n\6\r\6\16\6(\3\6\3\6\6\6-\n\6\r\6\16\6.\5\6\61\n\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\7\13M\n\13\f\13\16\13P\13\13\3\f\3\f\3\r\5\rU\n"+
		"\r\3\r\3\r\6\rY\n\r\r\r\16\rZ\3\16\3\16\3\16\3\16\6\16a\n\16\r\16\16\16"+
		"b\2\2\17\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17"+
		"\3\2\b\3\2c|\3\2C\\\3\2\62;\4\2..\60\60\4\2\f\f\17\17\4\2\13\13\"\"\2"+
		"n\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7!\3\2\2\2\t#\3\2"+
		"\2\2\13&\3\2\2\2\r\62\3\2\2\2\17\66\3\2\2\2\21<\3\2\2\2\23F\3\2\2\2\25"+
		"H\3\2\2\2\27Q\3\2\2\2\31X\3\2\2\2\33`\3\2\2\2\35\36\7\60\2\2\36\4\3\2"+
		"\2\2\37 \t\2\2\2 \6\3\2\2\2!\"\t\3\2\2\"\b\3\2\2\2#$\t\4\2\2$\n\3\2\2"+
		"\2%\'\5\t\5\2&%\3\2\2\2\'(\3\2\2\2(&\3\2\2\2()\3\2\2\2)\60\3\2\2\2*,\t"+
		"\5\2\2+-\5\t\5\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\61\3\2\2\2\60"+
		"*\3\2\2\2\60\61\3\2\2\2\61\f\3\2\2\2\62\63\7E\2\2\63\64\7O\2\2\64\65\7"+
		"F\2\2\65\16\3\2\2\2\66\67\7P\2\2\678\7Q\2\289\7V\2\29:\7G\2\2:;\7U\2\2"+
		";\20\3\2\2\2<=\7G\2\2=>\7P\2\2>?\7F\2\2?@\7a\2\2@A\7P\2\2AB\7Q\2\2BC\7"+
		"V\2\2CD\7G\2\2DE\7U\2\2E\22\3\2\2\2FG\7<\2\2G\24\3\2\2\2HI\7/\2\2IJ\7"+
		"/\2\2JN\3\2\2\2KM\n\6\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O\26"+
		"\3\2\2\2PN\3\2\2\2QR\t\7\2\2R\30\3\2\2\2SU\7\17\2\2TS\3\2\2\2TU\3\2\2"+
		"\2UV\3\2\2\2VY\7\f\2\2WY\7\17\2\2XT\3\2\2\2XW\3\2\2\2YZ\3\2\2\2ZX\3\2"+
		"\2\2Z[\3\2\2\2[\32\3\2\2\2\\a\5\5\3\2]a\5\7\4\2^a\7a\2\2_a\5\13\6\2`\\"+
		"\3\2\2\2`]\3\2\2\2`^\3\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2c"+
		"\34\3\2\2\2\f\2(.\60NTXZ`b\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}