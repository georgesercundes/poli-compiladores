// Generated from C:/Users/georg/IdeaProjects/Projeto_Compiladores/src\Obj.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, TRUE=13, FALSE=14, NUM=15, STRING=16, VAR=17, 
		OP=18, SPACES=19;
	public static final int
		RULE_start = 0, RULE_dec = 1, RULE_com = 2, RULE_atrib = 3, RULE_bloco = 4, 
		RULE_seq = 5, RULE_expr = 6, RULE_valor = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "dec", "com", "atrib", "bloco", "seq", "expr", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'obj'", "'='", "'{'", "','", "'}'", "'var'", "'.'", "'print'", 
			"'('", "')'", "':'", "'return'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "TRUE", "FALSE", "NUM", "STRING", "VAR", "OP", "SPACES"
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__5) {
				{
				{
				setState(16);
				dec();
				setState(20);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(17);
						com();
						}
						} 
					}
					setState(22);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
				}
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==VAR) {
				{
				{
				setState(28);
				com();
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__5) {
					{
					{
					setState(29);
					dec();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
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
	public static class DecObjContext extends DecContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public DecObjContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterDecObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitDecObj(this);
		}
	}
	public static class DecVarContext extends DecContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecVarContext(DecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitDecVar(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dec);
		int _la;
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				_localctx = new DecObjContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				match(T__0);
				setState(43);
				match(VAR);
				setState(44);
				match(T__1);
				setState(45);
				match(T__2);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(46);
					atrib();
					setState(51);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(47);
						match(T__3);
						setState(48);
						atrib();
						}
						}
						setState(53);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(56);
				match(T__4);
				}
				break;
			case T__5:
				_localctx = new DecVarContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__5);
				setState(58);
				match(VAR);
				setState(59);
				match(T__1);
				setState(60);
				expr(0);
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

	public static class ComContext extends ParserRuleContext {
		public ComContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_com; }
	 
		public ComContext() { }
		public void copyFrom(ComContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintContext extends ComContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitPrint(this);
		}
	}
	public static class ModificarInserirAtributoContext extends ComContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ModificarInserirAtributoContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterModificarInserirAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitModificarInserirAtributo(this);
		}
	}
	public static class AtribuicaoContext extends ComContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribuicaoContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitAtribuicao(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_com);
		try {
			setState(76);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new ModificarInserirAtributoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				match(VAR);
				setState(64);
				match(T__6);
				setState(65);
				match(VAR);
				setState(66);
				match(T__1);
				setState(67);
				valor();
				}
				break;
			case 2:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				match(VAR);
				setState(69);
				match(T__1);
				setState(70);
				expr(0);
				}
				break;
			case 3:
				_localctx = new PrintContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71);
				match(T__7);
				setState(72);
				match(T__8);
				setState(73);
				expr(0);
				setState(74);
				match(T__9);
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
	public static class CriarAtributoContext extends AtribContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public CriarAtributoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterCriarAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitCriarAtributo(this);
		}
	}
	public static class CriarFuncaoContext extends AtribContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public CriarFuncaoContext(AtribContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterCriarFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitCriarFuncao(this);
		}
	}

	public final AtribContext atrib() throws RecognitionException {
		AtribContext _localctx = new AtribContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atrib);
		int _la;
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new CriarAtributoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(VAR);
				setState(79);
				match(T__10);
				setState(80);
				valor();
				}
				break;
			case 2:
				_localctx = new CriarFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				match(VAR);
				setState(82);
				match(T__8);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(83);
					match(VAR);
					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(84);
						match(T__3);
						setState(85);
						match(VAR);
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(93);
				match(T__9);
				setState(94);
				match(T__2);
				setState(95);
				bloco();
				setState(96);
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

	public static class BlocoContext extends ParserRuleContext {
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlocoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloco; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterBloco(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitBloco(this);
		}
	}

	public final BlocoContext bloco() throws RecognitionException {
		BlocoContext _localctx = new BlocoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bloco);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			seq();
			setState(101);
			match(T__11);
			setState(102);
			expr(0);
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

	public static class SeqContext extends ParserRuleContext {
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
		public SeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitSeq(this);
		}
	}

	public final SeqContext seq() throws RecognitionException {
		SeqContext _localctx = new SeqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_seq);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==T__5) {
				{
				{
				setState(104);
				dec();
				setState(108);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(105);
						com();
						}
						} 
					}
					setState(110);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7 || _la==VAR) {
				{
				{
				setState(116);
				com();
				setState(120);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0 || _la==T__5) {
					{
					{
					setState(117);
					dec();
					}
					}
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				setState(127);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VariavelContext extends ExprContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public VariavelContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitVariavel(this);
		}
	}
	public static class OpContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OP() { return getToken(ObjParser.OP, 0); }
		public OpContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitOp(this);
		}
	}
	public static class AtributoContext extends ExprContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public AtributoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitAtributo(this);
		}
	}
	public static class FuncaoContext extends ExprContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FuncaoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitFuncao(this);
		}
	}
	public static class ConstanteContext extends ExprContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ConstanteContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterConstante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitConstante(this);
		}
	}
	public static class GrupoContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public GrupoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterGrupo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitGrupo(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				_localctx = new ConstanteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(129);
				valor();
				}
				break;
			case 2:
				{
				_localctx = new VariavelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(130);
				match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new GrupoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(131);
				match(T__8);
				setState(132);
				expr(0);
				setState(133);
				match(T__9);
				}
				break;
			case 4:
				{
				_localctx = new AtributoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(135);
				match(VAR);
				setState(136);
				match(T__6);
				setState(137);
				match(VAR);
				}
				break;
			case 5:
				{
				_localctx = new FuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(138);
				match(VAR);
				setState(139);
				match(T__6);
				setState(140);
				match(VAR);
				setState(141);
				match(T__8);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << STRING) | (1L << VAR))) != 0)) {
					{
					setState(142);
					expr(0);
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(143);
						match(T__3);
						setState(144);
						expr(0);
						}
						}
						setState(149);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(152);
				match(T__9);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(160);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(155);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(156);
					match(OP);
					setState(157);
					expr(5);
					}
					} 
				}
				setState(162);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ValorContext extends ParserRuleContext {
		public TerminalNode FALSE() { return getToken(ObjParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(ObjParser.TRUE, 0); }
		public TerminalNode NUM() { return getToken(ObjParser.NUM, 0); }
		public TerminalNode STRING() { return getToken(ObjParser.STRING, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitValor(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\25\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\7\2\32\n\2\f\2\16\2\35\13\2\3\2\3\2\7\2!\n\2\f\2"+
		"\16\2$\13\2\7\2&\n\2\f\2\16\2)\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\7\3\64\n\3\f\3\16\3\67\13\3\5\39\n\3\3\3\3\3\3\3\3\3\3\3\5\3@\n\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4O\n\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\5\5^\n\5\3\5\3\5\3\5\3"+
		"\5\3\5\5\5e\n\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7m\n\7\f\7\16\7p\13\7\7\7r\n"+
		"\7\f\7\16\7u\13\7\3\7\3\7\7\7y\n\7\f\7\16\7|\13\7\7\7~\n\7\f\7\16\7\u0081"+
		"\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\7\b\u0094\n\b\f\b\16\b\u0097\13\b\5\b\u0099\n\b\3\b\5\b\u009c\n\b"+
		"\3\b\3\b\3\b\7\b\u00a1\n\b\f\b\16\b\u00a4\13\b\3\t\3\t\3\t\2\3\16\n\2"+
		"\4\6\b\n\f\16\20\2\3\3\2\17\22\2\u00b6\2\33\3\2\2\2\4?\3\2\2\2\6N\3\2"+
		"\2\2\bd\3\2\2\2\nf\3\2\2\2\fs\3\2\2\2\16\u009b\3\2\2\2\20\u00a5\3\2\2"+
		"\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30\3\2\2\2\26\24\3\2\2"+
		"\2\26\27\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\31\22\3\2\2\2\32\35\3\2\2"+
		"\2\33\31\3\2\2\2\33\34\3\2\2\2\34\'\3\2\2\2\35\33\3\2\2\2\36\"\5\6\4\2"+
		"\37!\5\4\3\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#&\3\2\2\2$\""+
		"\3\2\2\2%\36\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2\2)\'\3\2"+
		"\2\2*+\7\2\2\3+\3\3\2\2\2,-\7\3\2\2-.\7\23\2\2./\7\4\2\2/8\7\5\2\2\60"+
		"\65\5\b\5\2\61\62\7\6\2\2\62\64\5\b\5\2\63\61\3\2\2\2\64\67\3\2\2\2\65"+
		"\63\3\2\2\2\65\66\3\2\2\2\669\3\2\2\2\67\65\3\2\2\28\60\3\2\2\289\3\2"+
		"\2\29:\3\2\2\2:@\7\7\2\2;<\7\b\2\2<=\7\23\2\2=>\7\4\2\2>@\5\16\b\2?,\3"+
		"\2\2\2?;\3\2\2\2@\5\3\2\2\2AB\7\23\2\2BC\7\t\2\2CD\7\23\2\2DE\7\4\2\2"+
		"EO\5\20\t\2FG\7\23\2\2GH\7\4\2\2HO\5\16\b\2IJ\7\n\2\2JK\7\13\2\2KL\5\16"+
		"\b\2LM\7\f\2\2MO\3\2\2\2NA\3\2\2\2NF\3\2\2\2NI\3\2\2\2O\7\3\2\2\2PQ\7"+
		"\23\2\2QR\7\r\2\2Re\5\20\t\2ST\7\23\2\2T]\7\13\2\2UZ\7\23\2\2VW\7\6\2"+
		"\2WY\7\23\2\2XV\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[^\3\2\2\2\\Z\3"+
		"\2\2\2]U\3\2\2\2]^\3\2\2\2^_\3\2\2\2_`\7\f\2\2`a\7\5\2\2ab\5\n\6\2bc\7"+
		"\7\2\2ce\3\2\2\2dP\3\2\2\2dS\3\2\2\2e\t\3\2\2\2fg\5\f\7\2gh\7\16\2\2h"+
		"i\5\16\b\2i\13\3\2\2\2jn\5\4\3\2km\5\6\4\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2"+
		"\2no\3\2\2\2or\3\2\2\2pn\3\2\2\2qj\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2"+
		"\2t\177\3\2\2\2us\3\2\2\2vz\5\6\4\2wy\5\4\3\2xw\3\2\2\2y|\3\2\2\2zx\3"+
		"\2\2\2z{\3\2\2\2{~\3\2\2\2|z\3\2\2\2}v\3\2\2\2~\u0081\3\2\2\2\177}\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\r\3\2\2\2\u0081\177\3\2\2\2\u0082\u0083\b"+
		"\b\1\2\u0083\u009c\5\20\t\2\u0084\u009c\7\23\2\2\u0085\u0086\7\13\2\2"+
		"\u0086\u0087\5\16\b\2\u0087\u0088\7\f\2\2\u0088\u009c\3\2\2\2\u0089\u008a"+
		"\7\23\2\2\u008a\u008b\7\t\2\2\u008b\u009c\7\23\2\2\u008c\u008d\7\23\2"+
		"\2\u008d\u008e\7\t\2\2\u008e\u008f\7\23\2\2\u008f\u0098\7\13\2\2\u0090"+
		"\u0095\5\16\b\2\u0091\u0092\7\6\2\2\u0092\u0094\5\16\b\2\u0093\u0091\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0093\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0099\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0090\3\2\2\2\u0098\u0099\3\2"+
		"\2\2\u0099\u009a\3\2\2\2\u009a\u009c\7\f\2\2\u009b\u0082\3\2\2\2\u009b"+
		"\u0084\3\2\2\2\u009b\u0085\3\2\2\2\u009b\u0089\3\2\2\2\u009b\u008c\3\2"+
		"\2\2\u009c\u00a2\3\2\2\2\u009d\u009e\f\6\2\2\u009e\u009f\7\24\2\2\u009f"+
		"\u00a1\5\16\b\7\u00a0\u009d\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a0\3"+
		"\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\17\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a5"+
		"\u00a6\t\2\2\2\u00a6\21\3\2\2\2\25\26\33\"\'\658?NZ]dnsz\177\u0095\u0098"+
		"\u009b\u00a2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}