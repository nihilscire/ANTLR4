// Generated from MyGrammar.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LOWERCASE=2, UPPERCASE=3, DIGIT=4, NUMBER=5, CMD=6, NOTES=7, END_NOTES=8, 
		COLON=9, COMMENT=10, WHITESPACE=11, NEWLINE=12, WORD=13;
	public static final int
		RULE_root = 0, RULE_line = 1, RULE_comment_line = 2, RULE_command_line = 3, 
		RULE_command = 4, RULE_note_cmd = 5, RULE_command_name = 6;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "line", "comment_line", "command_line", "command", "note_cmd", 
			"command_name"
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

	@Override
	public String getGrammarFileName() { return "MyGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(MyGrammarParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14);
				line();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CMD || _la==COMMENT );
			setState(19);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public Comment_lineContext comment_line() {
			return getRuleContext(Comment_lineContext.class,0);
		}
		public Command_lineContext command_line() {
			return getRuleContext(Command_lineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COMMENT:
				{
				setState(21);
				comment_line();
				}
				break;
			case CMD:
				{
				setState(22);
				command_line();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(25);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comment_lineContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(MyGrammarParser.COMMENT, 0); }
		public Comment_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterComment_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitComment_line(this);
		}
	}

	public final Comment_lineContext comment_line() throws RecognitionException {
		Comment_lineContext _localctx = new Comment_lineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_comment_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			match(COMMENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_lineContext extends ParserRuleContext {
		public TerminalNode CMD() { return getToken(MyGrammarParser.CMD, 0); }
		public Note_cmdContext note_cmd() {
			return getRuleContext(Note_cmdContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public Command_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCommand_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCommand_line(this);
		}
	}

	public final Command_lineContext command_line() throws RecognitionException {
		Command_lineContext _localctx = new Command_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_command_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(CMD);
			setState(30);
			match(T__0);
			setState(33);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOTES:
				{
				setState(31);
				note_cmd();
				}
				break;
			case WORD:
				{
				setState(32);
				command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommandContext extends ParserRuleContext {
		public Command_nameContext command_name() {
			return getRuleContext(Command_nameContext.class,0);
		}
		public TerminalNode COLON() { return getToken(MyGrammarParser.COLON, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(MyGrammarParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(MyGrammarParser.WHITESPACE, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_command);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			command_name();
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(43);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(36);
					match(COLON);
					setState(40);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1 ) {
							{
							{
							setState(37);
							match(WHITESPACE);
							}
							} 
						}
						setState(42);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
					}
					}
					break;
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(45);
						matchWildcard();
						}
						} 
					}
					setState(50);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Note_cmdContext extends ParserRuleContext {
		public TerminalNode NOTES() { return getToken(MyGrammarParser.NOTES, 0); }
		public List<TerminalNode> COLON() { return getTokens(MyGrammarParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MyGrammarParser.COLON, i);
		}
		public TerminalNode NEWLINE() { return getToken(MyGrammarParser.NEWLINE, 0); }
		public TerminalNode CMD() { return getToken(MyGrammarParser.CMD, 0); }
		public TerminalNode END_NOTES() { return getToken(MyGrammarParser.END_NOTES, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(MyGrammarParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(MyGrammarParser.WHITESPACE, i);
		}
		public Note_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_note_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterNote_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitNote_cmd(this);
		}
	}

	public final Note_cmdContext note_cmd() throws RecognitionException {
		Note_cmdContext _localctx = new Note_cmdContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_note_cmd);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(NOTES);
			setState(54);
			match(COLON);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(55);
				match(WHITESPACE);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(NEWLINE);
			setState(65);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(62);
					matchWildcard();
					}
					} 
				}
				setState(67);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			}
			{
			setState(68);
			match(CMD);
			setState(69);
			match(T__0);
			setState(70);
			match(END_NOTES);
			setState(71);
			match(COLON);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Command_nameContext extends ParserRuleContext {
		public TerminalNode WORD() { return getToken(MyGrammarParser.WORD, 0); }
		public Command_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).enterCommand_name(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyGrammarListener ) ((MyGrammarListener)listener).exitCommand_name(this);
		}
	}

	public final Command_nameContext command_name() throws RecognitionException {
		Command_nameContext _localctx = new Command_nameContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_command_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WORD);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\17N\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\2\3\2\3\3\3\3\5\3\32\n\3\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\5\5$\n\5\3"+
		"\6\3\6\3\6\7\6)\n\6\f\6\16\6,\13\6\5\6.\n\6\3\6\7\6\61\n\6\f\6\16\6\64"+
		"\13\6\5\6\66\n\6\3\7\3\7\3\7\7\7;\n\7\f\7\16\7>\13\7\3\7\3\7\7\7B\n\7"+
		"\f\7\16\7E\13\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\4\62C\2\t\2\4\6\b\n\f"+
		"\16\2\2\2O\2\21\3\2\2\2\4\31\3\2\2\2\6\35\3\2\2\2\b\37\3\2\2\2\n%\3\2"+
		"\2\2\f\67\3\2\2\2\16K\3\2\2\2\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2"+
		"\2\23\21\3\2\2\2\23\24\3\2\2\2\24\25\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2"+
		"\2\27\32\5\6\4\2\30\32\5\b\5\2\31\27\3\2\2\2\31\30\3\2\2\2\32\33\3\2\2"+
		"\2\33\34\7\16\2\2\34\5\3\2\2\2\35\36\7\f\2\2\36\7\3\2\2\2\37 \7\b\2\2"+
		" #\7\3\2\2!$\5\f\7\2\"$\5\n\6\2#!\3\2\2\2#\"\3\2\2\2$\t\3\2\2\2%\65\5"+
		"\16\b\2&*\7\13\2\2\')\7\r\2\2(\'\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2"+
		"+.\3\2\2\2,*\3\2\2\2-&\3\2\2\2-.\3\2\2\2.\62\3\2\2\2/\61\13\2\2\2\60/"+
		"\3\2\2\2\61\64\3\2\2\2\62\63\3\2\2\2\62\60\3\2\2\2\63\66\3\2\2\2\64\62"+
		"\3\2\2\2\65-\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2\2\678\7\t\2\28<\7\13\2"+
		"\29;\7\r\2\2:9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2"+
		"\2?C\7\16\2\2@B\13\2\2\2A@\3\2\2\2BE\3\2\2\2CD\3\2\2\2CA\3\2\2\2DF\3\2"+
		"\2\2EC\3\2\2\2FG\7\b\2\2GH\7\3\2\2HI\7\n\2\2IJ\7\13\2\2J\r\3\2\2\2KL\7"+
		"\17\2\2L\17\3\2\2\2\13\23\31#*-\62\65<C";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}