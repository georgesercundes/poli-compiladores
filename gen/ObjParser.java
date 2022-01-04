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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, TRUE=16, FALSE=17, 
		NUM=18, STRING=19, VAR=20, OP=21, SPACES=22;
	public static final int
		RULE_start = 0, RULE_obj = 1, RULE_decVar = 2, RULE_print = 3, RULE_com = 4, 
		RULE_atrib = 5, RULE_bloco = 6, RULE_seq = 7, RULE_expr = 8, RULE_funcao = 9, 
		RULE_valor = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "obj", "decVar", "print", "com", "atrib", "bloco", "seq", "expr", 
			"funcao", "valor"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'obj'", "'='", "'{'", "','", "'}'", "'.'", "'var'", "'print'", 
			"'('", "')'", "'while'", "'if'", "'else'", "':'", "'return'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "TRUE", "FALSE", "NUM", "STRING", "VAR", "OP", 
			"SPACES"
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
		public List<ObjContext> obj() {
			return getRuleContexts(ObjContext.class);
		}
		public ObjContext obj(int i) {
			return getRuleContext(ObjContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
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
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__7) | (1L << VAR))) != 0)) {
				{
				setState(24);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__0:
				case VAR:
					{
					setState(22);
					obj();
					}
					break;
				case T__7:
					{
					setState(23);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
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

	public static class ObjContext extends ParserRuleContext {
		public ObjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_obj; }
	 
		public ObjContext() { }
		public void copyFrom(ObjContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecObjContext extends ObjContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public List<AtribContext> atrib() {
			return getRuleContexts(AtribContext.class);
		}
		public AtribContext atrib(int i) {
			return getRuleContext(AtribContext.class,i);
		}
		public DecObjContext(ObjContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterDecObj(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitDecObj(this);
		}
	}
	public static class ModificaCriaAtributoContext extends ObjContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ModificaCriaAtributoContext(ObjContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterModificaCriaAtributo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitModificaCriaAtributo(this);
		}
	}
	public static class ChamarFuncaoContext extends ObjContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ChamarFuncaoContext(ObjContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterChamarFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitChamarFuncao(this);
		}
	}

	public final ObjContext obj() throws RecognitionException {
		ObjContext _localctx = new ObjContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_obj);
		int _la;
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DecObjContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(31);
				match(T__0);
				setState(32);
				match(VAR);
				setState(33);
				match(T__1);
				setState(34);
				match(T__2);
				setState(43);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(35);
					atrib();
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(36);
						match(T__3);
						setState(37);
						atrib();
						}
						}
						setState(42);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(45);
				match(T__4);
				}
				break;
			case 2:
				_localctx = new ModificaCriaAtributoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				match(VAR);
				setState(47);
				match(T__5);
				setState(48);
				match(VAR);
				setState(49);
				match(T__1);
				setState(50);
				valor();
				}
				break;
			case 3:
				_localctx = new ChamarFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				funcao();
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

	public static class DecVarContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DecVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterDecVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitDecVar(this);
		}
	}

	public final DecVarContext decVar() throws RecognitionException {
		DecVarContext _localctx = new DecVarContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_decVar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__6);
			setState(55);
			match(VAR);
			setState(56);
			match(T__1);
			setState(57);
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

	public static class PrintContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitPrint(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(T__7);
			setState(60);
			match(T__8);
			setState(61);
			expr(0);
			setState(62);
			match(T__9);
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
	public static class WhileContext extends ComContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SeqContext seq() {
			return getRuleContext(SeqContext.class,0);
		}
		public WhileContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitWhile(this);
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
	public static class IfContext extends ComContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<SeqContext> seq() {
			return getRuleContexts(SeqContext.class);
		}
		public SeqContext seq(int i) {
			return getRuleContext(SeqContext.class,i);
		}
		public IfContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitIf(this);
		}
	}

	public final ComContext com() throws RecognitionException {
		ComContext _localctx = new ComContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_com);
		int _la;
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new AtribuicaoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(VAR);
				setState(65);
				match(T__1);
				setState(66);
				expr(0);
				}
				break;
			case T__10:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__10);
				setState(68);
				match(T__8);
				setState(69);
				expr(0);
				setState(70);
				match(T__9);
				setState(71);
				match(T__2);
				setState(72);
				seq();
				setState(73);
				match(T__4);
				}
				break;
			case T__11:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(75);
				match(T__11);
				setState(76);
				match(T__8);
				setState(77);
				expr(0);
				setState(78);
				match(T__9);
				setState(79);
				match(T__2);
				setState(80);
				seq();
				setState(81);
				match(T__4);
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(82);
					match(T__12);
					setState(83);
					match(T__2);
					setState(84);
					seq();
					setState(85);
					match(T__4);
					}
				}

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
		enterRule(_localctx, 10, RULE_atrib);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CriarAtributoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(VAR);
				setState(92);
				match(T__13);
				setState(93);
				valor();
				}
				break;
			case 2:
				_localctx = new CriarFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(VAR);
				setState(95);
				match(T__8);
				setState(104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(96);
					match(VAR);
					setState(101);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(97);
						match(T__3);
						setState(98);
						match(VAR);
						}
						}
						setState(103);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(106);
				match(T__9);
				setState(107);
				match(T__2);
				setState(108);
				bloco();
				setState(109);
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
		enterRule(_localctx, 12, RULE_bloco);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			seq();
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__14) {
				{
				setState(114);
				match(T__14);
				setState(115);
				expr(0);
				}
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

	public static class SeqContext extends ParserRuleContext {
		public List<DecVarContext> decVar() {
			return getRuleContexts(DecVarContext.class);
		}
		public DecVarContext decVar(int i) {
			return getRuleContext(DecVarContext.class,i);
		}
		public List<ComContext> com() {
			return getRuleContexts(ComContext.class);
		}
		public ComContext com(int i) {
			return getRuleContext(ComContext.class,i);
		}
		public List<PrintContext> print() {
			return getRuleContexts(PrintContext.class);
		}
		public PrintContext print(int i) {
			return getRuleContext(PrintContext.class,i);
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
		enterRule(_localctx, 14, RULE_seq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__10) | (1L << T__11) | (1L << VAR))) != 0)) {
				{
				setState(121);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__6:
					{
					setState(118);
					decVar();
					}
					break;
				case T__10:
				case T__11:
				case VAR:
					{
					setState(119);
					com();
					}
					break;
				case T__7:
					{
					setState(120);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(125);
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
	public static class ValorFuncaoContext extends ExprContext {
		public FuncaoContext funcao() {
			return getRuleContext(FuncaoContext.class,0);
		}
		public ValorFuncaoContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterValorFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitValorFuncao(this);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				_localctx = new ConstanteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(127);
				valor();
				}
				break;
			case 2:
				{
				_localctx = new VariavelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(128);
				match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new GrupoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(129);
				match(T__8);
				setState(130);
				expr(0);
				setState(131);
				match(T__9);
				}
				break;
			case 4:
				{
				_localctx = new AtributoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(133);
				match(VAR);
				setState(134);
				match(T__5);
				setState(135);
				match(VAR);
				}
				break;
			case 5:
				{
				_localctx = new ValorFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(136);
				funcao();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(144);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(139);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(140);
					match(OP);
					setState(141);
					expr(5);
					}
					} 
				}
				setState(146);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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

	public static class FuncaoContext extends ParserRuleContext {
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
		public FuncaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitFuncao(this);
		}
	}

	public final FuncaoContext funcao() throws RecognitionException {
		FuncaoContext _localctx = new FuncaoContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_funcao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(VAR);
			setState(148);
			match(T__5);
			setState(149);
			match(VAR);
			setState(150);
			match(T__8);
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__8) | (1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << STRING) | (1L << VAR))) != 0)) {
				{
				setState(151);
				expr(0);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(152);
					match(T__3);
					setState(153);
					expr(0);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(161);
			match(T__9);
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
		enterRule(_localctx, 20, RULE_valor);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30\u00a8\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\5\3\67\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6Z\n\6\5\6\\\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7f\n"+
		"\7\f\7\16\7i\13\7\5\7k\n\7\3\7\3\7\3\7\3\7\3\7\5\7r\n\7\3\b\3\b\3\b\5"+
		"\bw\n\b\3\t\3\t\3\t\7\t|\n\t\f\t\16\t\177\13\t\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u008c\n\n\3\n\3\n\3\n\7\n\u0091\n\n\f\n\16\n"+
		"\u0094\13\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\7\13\u009d\n\13\f\13\16"+
		"\13\u00a0\13\13\5\13\u00a2\n\13\3\13\3\13\3\f\3\f\3\f\2\3\22\r\2\4\6\b"+
		"\n\f\16\20\22\24\26\2\3\3\2\22\25\2\u00b3\2\34\3\2\2\2\4\66\3\2\2\2\6"+
		"8\3\2\2\2\b=\3\2\2\2\n[\3\2\2\2\fq\3\2\2\2\16s\3\2\2\2\20}\3\2\2\2\22"+
		"\u008b\3\2\2\2\24\u0095\3\2\2\2\26\u00a5\3\2\2\2\30\33\5\4\3\2\31\33\5"+
		"\b\5\2\32\30\3\2\2\2\32\31\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3"+
		"\2\2\2\35\37\3\2\2\2\36\34\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\7\3\2\2\""+
		"#\7\26\2\2#$\7\4\2\2$-\7\5\2\2%*\5\f\7\2&\'\7\6\2\2\')\5\f\7\2(&\3\2\2"+
		"\2),\3\2\2\2*(\3\2\2\2*+\3\2\2\2+.\3\2\2\2,*\3\2\2\2-%\3\2\2\2-.\3\2\2"+
		"\2./\3\2\2\2/\67\7\7\2\2\60\61\7\26\2\2\61\62\7\b\2\2\62\63\7\26\2\2\63"+
		"\64\7\4\2\2\64\67\5\26\f\2\65\67\5\24\13\2\66!\3\2\2\2\66\60\3\2\2\2\66"+
		"\65\3\2\2\2\67\5\3\2\2\289\7\t\2\29:\7\26\2\2:;\7\4\2\2;<\5\22\n\2<\7"+
		"\3\2\2\2=>\7\n\2\2>?\7\13\2\2?@\5\22\n\2@A\7\f\2\2A\t\3\2\2\2BC\7\26\2"+
		"\2CD\7\4\2\2D\\\5\22\n\2EF\7\r\2\2FG\7\13\2\2GH\5\22\n\2HI\7\f\2\2IJ\7"+
		"\5\2\2JK\5\20\t\2KL\7\7\2\2L\\\3\2\2\2MN\7\16\2\2NO\7\13\2\2OP\5\22\n"+
		"\2PQ\7\f\2\2QR\7\5\2\2RS\5\20\t\2SY\7\7\2\2TU\7\17\2\2UV\7\5\2\2VW\5\20"+
		"\t\2WX\7\7\2\2XZ\3\2\2\2YT\3\2\2\2YZ\3\2\2\2Z\\\3\2\2\2[B\3\2\2\2[E\3"+
		"\2\2\2[M\3\2\2\2\\\13\3\2\2\2]^\7\26\2\2^_\7\20\2\2_r\5\26\f\2`a\7\26"+
		"\2\2aj\7\13\2\2bg\7\26\2\2cd\7\6\2\2df\7\26\2\2ec\3\2\2\2fi\3\2\2\2ge"+
		"\3\2\2\2gh\3\2\2\2hk\3\2\2\2ig\3\2\2\2jb\3\2\2\2jk\3\2\2\2kl\3\2\2\2l"+
		"m\7\f\2\2mn\7\5\2\2no\5\16\b\2op\7\7\2\2pr\3\2\2\2q]\3\2\2\2q`\3\2\2\2"+
		"r\r\3\2\2\2sv\5\20\t\2tu\7\21\2\2uw\5\22\n\2vt\3\2\2\2vw\3\2\2\2w\17\3"+
		"\2\2\2x|\5\6\4\2y|\5\n\6\2z|\5\b\5\2{x\3\2\2\2{y\3\2\2\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~\21\3\2\2\2\177}\3\2\2\2\u0080\u0081\b\n"+
		"\1\2\u0081\u008c\5\26\f\2\u0082\u008c\7\26\2\2\u0083\u0084\7\13\2\2\u0084"+
		"\u0085\5\22\n\2\u0085\u0086\7\f\2\2\u0086\u008c\3\2\2\2\u0087\u0088\7"+
		"\26\2\2\u0088\u0089\7\b\2\2\u0089\u008c\7\26\2\2\u008a\u008c\5\24\13\2"+
		"\u008b\u0080\3\2\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2\2\2\u008b\u0087"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\u0092\3\2\2\2\u008d\u008e\f\6\2\2\u008e"+
		"\u008f\7\27\2\2\u008f\u0091\5\22\n\7\u0090\u008d\3\2\2\2\u0091\u0094\3"+
		"\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\23\3\2\2\2\u0094"+
		"\u0092\3\2\2\2\u0095\u0096\7\26\2\2\u0096\u0097\7\b\2\2\u0097\u0098\7"+
		"\26\2\2\u0098\u00a1\7\13\2\2\u0099\u009e\5\22\n\2\u009a\u009b\7\6\2\2"+
		"\u009b\u009d\5\22\n\2\u009c\u009a\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c"+
		"\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1"+
		"\u0099\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a4\7\f"+
		"\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\t\2\2\2\u00a6\27\3\2\2\2\23\32\34*-"+
		"\66Y[gjqv{}\u008b\u0092\u009e\u00a1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}