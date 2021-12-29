// Generated from C:/Users/george.siqueira/IdeaProjects/Projeto_Compiladores/src\Obj.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, TRUE=11, FALSE=12, VAR=13, NUM=14, STRING=15, SPACES=16;
	public static final int
		RULE_start = 0, RULE_dec = 1, RULE_com = 2, RULE_atrib = 3, RULE_valor = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dec", "com", "atrib", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'obj'", "'='", "'{'", "','", "'}'", "'.'", "':'", "'('", "')'", 
			"'return'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "TRUE", 
			"FALSE", "VAR", "NUM", "STRING", "SPACES"
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
	public String getGrammarFileName() { return "Obj.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ObjParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(ObjParser.EOF, 0); }
		public List<DecContext> dec() {
			return getRuleContexts(DecContext.class);
		}
		public DecContext dec(int i) {
			return getRuleContext(DecContext.class,i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(13);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(10);
				dec();
				}
				}
				setState(15);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VAR) {
				{
				{
				setState(16);
				com();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
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

	public static class DecContext extends ParserRuleContext {
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
	 
		public DecContext() { }
		public void copyFrom(DecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjVazioContext extends DecContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ObjVazioContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterObjVazio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitObjVazio(this);
		}
	}
	public static class ObjNVazioContext extends DecContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public ObjNVazioContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterObjNVazio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitObjNVazio(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				_localctx = new ObjNVazioContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(T__0);
				setState(25);
				match(VAR);
				setState(26);
				match(T__1);
				setState(27);
				match(T__2);
				setState(28);
				atrib();
				setState(33);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(29);
					match(T__3);
					setState(30);
					atrib();
					}
					}
					setState(35);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(36);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ObjVazioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(T__0);
				setState(39);
				match(VAR);
				setState(40);
				match(T__1);
				setState(41);
				match(T__2);
				setState(42);
				match(T__4);
				}
				break;
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

	public static class ComContext extends ParserRuleContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterCom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitCom(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_com);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(VAR);
			setState(46);
			match(T__5);
			setState(47);
			match(VAR);
			setState(48);
			match(T__1);
			setState(49);
			valor();
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

	public static class AtribContext extends ParserRuleContext {
		public AtribContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atrib; }
	 
		public AtribContext() { }
		public void copyFrom(AtribContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AtributoContext extends AtribContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public AtributoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitAtributo(this);
		}
	}
	public static class FuncaoSemArgumentosContext extends AtribContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public FuncaoSemArgumentosContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterFuncaoSemArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitFuncaoSemArgumentos(this);
		}
	}
	public static class FuncaoComArgumentosContext extends AtribContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public FuncaoComArgumentosContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterFuncaoComArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitFuncaoComArgumentos(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atrib);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new AtributoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				match(VAR);
				setState(52);
				match(T__6);
				setState(53);
				valor();
				}
				break;
			case 2:
				_localctx = new FuncaoComArgumentosContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				match(VAR);
				setState(55);
				match(T__7);
				setState(56);
				match(VAR);
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(57);
					match(T__3);
					setState(58);
					match(VAR);
					}
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(64);
				match(T__8);
				setState(65);
				match(T__2);
				setState(66);
				match(T__9);
				setState(67);
				valor();
				setState(68);
				match(T__4);
				}
				break;
			case 3:
				_localctx = new FuncaoSemArgumentosContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				match(VAR);
				setState(71);
				match(T__7);
				setState(72);
				match(T__8);
				setState(73);
				match(T__2);
				setState(74);
				match(T__9);
				setState(75);
				valor();
				setState(76);
				match(T__4);
				}
				break;
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

	public static class ValorContext extends ParserRuleContext {
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	 
		public ValorContext() { }
		public void copyFrom(ValorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NumContext extends ValorContext {
		public TerminalNode NUM() { return getToken(ObjParser.NUM, 0); }
		public NumContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitNum(this);
		}
	}
	public static class TrueContext extends ValorContext {
		public TerminalNode TRUE() { return getToken(ObjParser.TRUE, 0); }
		public TrueContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterTrue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitTrue(this);
		}
	}
	public static class FalseContext extends ValorContext {
		public TerminalNode FALSE() { return getToken(ObjParser.FALSE, 0); }
		public FalseContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterFalse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitFalse(this);
		}
	}
	public static class StringContext extends ValorContext {
		public TerminalNode STRING() { return getToken(ObjParser.STRING, 0); }
		public StringContext(ValorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitString(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valor);
		try {
			setState(84);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FALSE:
				_localctx = new FalseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(FALSE);
				}
				break;
			case TRUE:
				_localctx = new TrueContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(TRUE);
				}
				break;
			case NUM:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				match(NUM);
				}
				break;
			case STRING:
				_localctx = new StringContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\22Y\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\7\2\16\n\2\f\2\16\2\21\13\2\3\2\7\2\24"+
		"\n\2\f\2\16\2\27\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3\"\n\3\f"+
		"\3\16\3%\13\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5>\n\5\f\5\16\5A\13\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5Q\n\5\3\6\3\6\3\6\3"+
		"\6\5\6W\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2]\2\17\3\2\2\2\4-\3\2\2\2\6/\3\2"+
		"\2\2\bP\3\2\2\2\nV\3\2\2\2\f\16\5\4\3\2\r\f\3\2\2\2\16\21\3\2\2\2\17\r"+
		"\3\2\2\2\17\20\3\2\2\2\20\25\3\2\2\2\21\17\3\2\2\2\22\24\5\6\4\2\23\22"+
		"\3\2\2\2\24\27\3\2\2\2\25\23\3\2\2\2\25\26\3\2\2\2\26\30\3\2\2\2\27\25"+
		"\3\2\2\2\30\31\7\2\2\3\31\3\3\2\2\2\32\33\7\3\2\2\33\34\7\17\2\2\34\35"+
		"\7\4\2\2\35\36\7\5\2\2\36#\5\b\5\2\37 \7\6\2\2 \"\5\b\5\2!\37\3\2\2\2"+
		"\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\7\2\2\'.\3\2"+
		"\2\2()\7\3\2\2)*\7\17\2\2*+\7\4\2\2+,\7\5\2\2,.\7\7\2\2-\32\3\2\2\2-("+
		"\3\2\2\2.\5\3\2\2\2/\60\7\17\2\2\60\61\7\b\2\2\61\62\7\17\2\2\62\63\7"+
		"\4\2\2\63\64\5\n\6\2\64\7\3\2\2\2\65\66\7\17\2\2\66\67\7\t\2\2\67Q\5\n"+
		"\6\289\7\17\2\29:\7\n\2\2:?\7\17\2\2;<\7\6\2\2<>\7\17\2\2=;\3\2\2\2>A"+
		"\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\13\2\2CD\7\5\2\2"+
		"DE\7\f\2\2EF\5\n\6\2FG\7\7\2\2GQ\3\2\2\2HI\7\17\2\2IJ\7\n\2\2JK\7\13\2"+
		"\2KL\7\5\2\2LM\7\f\2\2MN\5\n\6\2NO\7\7\2\2OQ\3\2\2\2P\65\3\2\2\2P8\3\2"+
		"\2\2PH\3\2\2\2Q\t\3\2\2\2RW\7\16\2\2SW\7\r\2\2TW\7\20\2\2UW\7\21\2\2V"+
		"R\3\2\2\2VS\3\2\2\2VT\3\2\2\2VU\3\2\2\2W\13\3\2\2\2\t\17\25#-?PV";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}