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
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TRUE=17, 
		FALSE=18, NUM=19, DOUBLE=20, STRING=21, VAR=22, OP=23, SPACES=24;
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
			null, "'obj'", "'='", "'{'", "','", "'}'", "'.'", "'function'", "'('", 
			"')'", "'var'", "'print'", "'while'", "'if'", "'else'", "':'", "'return'", 
			"'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "TRUE", "FALSE", "NUM", "DOUBLE", "STRING", 
			"VAR", "OP", "SPACES"
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__10) | (1L << VAR))) != 0)) {
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
				case T__10:
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
	public static class ModificaCriaFuncaoContext extends ObjContext {
		public List<TerminalNode> VAR() { return getTokens(ObjParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(ObjParser.VAR, i);
		}
		public BlocoContext bloco() {
			return getRuleContext(BlocoContext.class,0);
		}
		public ModificaCriaFuncaoContext(ObjContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterModificaCriaFuncao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitModificaCriaFuncao(this);
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
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
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
				_localctx = new ModificaCriaFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				match(VAR);
				setState(52);
				match(T__5);
				setState(53);
				match(VAR);
				setState(54);
				match(T__1);
				setState(55);
				match(T__6);
				setState(56);
				match(T__7);
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(57);
					match(VAR);
					setState(62);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(58);
						match(T__3);
						setState(59);
						match(VAR);
						}
						}
						setState(64);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(67);
				match(T__8);
				setState(68);
				match(T__2);
				setState(69);
				bloco();
				setState(70);
				match(T__4);
				}
				break;
			case 4:
				_localctx = new ChamarFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(72);
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
			setState(75);
			match(T__9);
			setState(76);
			match(VAR);
			setState(77);
			match(T__1);
			setState(78);
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
			setState(80);
			match(T__10);
			setState(81);
			match(T__7);
			setState(82);
			expr(0);
			setState(83);
			match(T__8);
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
	public static class AtribVariavelContext extends ComContext {
		public TerminalNode VAR() { return getToken(ObjParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AtribVariavelContext(ComContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).enterAtribVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ObjListener ) ((ObjListener)listener).exitAtribVariavel(this);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				_localctx = new AtribVariavelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
				match(VAR);
				setState(86);
				match(T__1);
				setState(87);
				expr(0);
				}
				break;
			case T__11:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__11);
				setState(89);
				match(T__7);
				setState(90);
				expr(0);
				setState(91);
				match(T__8);
				setState(92);
				match(T__2);
				setState(93);
				seq();
				setState(94);
				match(T__4);
				}
				break;
			case T__12:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(T__12);
				setState(97);
				match(T__7);
				setState(98);
				expr(0);
				setState(99);
				match(T__8);
				setState(100);
				match(T__2);
				setState(101);
				seq();
				setState(102);
				match(T__4);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(103);
					match(T__13);
					setState(104);
					match(T__2);
					setState(105);
					seq();
					setState(106);
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
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new CriarAtributoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(VAR);
				setState(113);
				match(T__14);
				setState(114);
				valor();
				}
				break;
			case 2:
				_localctx = new CriarFuncaoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				match(VAR);
				setState(116);
				match(T__7);
				setState(125);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(117);
					match(VAR);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__3) {
						{
						{
						setState(118);
						match(T__3);
						setState(119);
						match(VAR);
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(127);
				match(T__8);
				setState(128);
				match(T__2);
				setState(129);
				bloco();
				setState(130);
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
			setState(134);
			seq();
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__15) {
				{
				setState(135);
				match(T__15);
				setState(136);
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
			setState(144);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << VAR))) != 0)) {
				{
				setState(142);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__9:
					{
					setState(139);
					decVar();
					}
					break;
				case T__11:
				case T__12:
				case VAR:
					{
					setState(140);
					com();
					}
					break;
				case T__10:
					{
					setState(141);
					print();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(146);
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
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				_localctx = new ConstanteContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(148);
				valor();
				}
				break;
			case 2:
				{
				_localctx = new VariavelContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(149);
				match(VAR);
				}
				break;
			case 3:
				{
				_localctx = new GrupoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(150);
				match(T__7);
				setState(151);
				expr(0);
				setState(152);
				match(T__8);
				}
				break;
			case 4:
				{
				_localctx = new AtributoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(154);
				match(VAR);
				setState(155);
				match(T__5);
				setState(156);
				match(VAR);
				}
				break;
			case 5:
				{
				_localctx = new ValorFuncaoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				funcao();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(165);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new OpContext(new ExprContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(160);
					if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
					setState(161);
					match(OP);
					setState(162);
					expr(5);
					}
					} 
				}
				setState(167);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
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
			setState(168);
			match(VAR);
			setState(169);
			match(T__5);
			setState(170);
			match(VAR);
			setState(171);
			match(T__7);
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__7) | (1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << DOUBLE) | (1L << STRING) | (1L << VAR))) != 0)) {
				{
				setState(172);
				expr(0);
				setState(177);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__3) {
					{
					{
					setState(173);
					match(T__3);
					setState(174);
					expr(0);
					}
					}
					setState(179);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(182);
			match(T__8);
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
		public TerminalNode DOUBLE() { return getToken(ObjParser.DOUBLE, 0); }
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
			setState(184);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << NUM) | (1L << DOUBLE) | (1L << STRING))) != 0)) ) {
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u00bd\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\7\2\33\n\2\f\2\16\2\36\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\7\3)\n\3\f\3\16\3,\13\3\5\3.\n\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\7\3?\n\3\f\3\16\3B\13\3\5\3D"+
		"\n\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6o\n\6\5\6q\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7{\n\7\f\7\16\7~\13\7\5\7\u0080\n\7\3\7\3\7\3\7\3\7\3\7\5"+
		"\7\u0087\n\7\3\b\3\b\3\b\5\b\u008c\n\b\3\t\3\t\3\t\7\t\u0091\n\t\f\t\16"+
		"\t\u0094\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00a1\n"+
		"\n\3\n\3\n\3\n\7\n\u00a6\n\n\f\n\16\n\u00a9\13\n\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00b2\n\13\f\13\16\13\u00b5\13\13\5\13\u00b7\n\13\3"+
		"\13\3\13\3\f\3\f\3\f\2\3\22\r\2\4\6\b\n\f\16\20\22\24\26\2\3\3\2\23\27"+
		"\2\u00cb\2\34\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2\bR\3\2\2\2\np\3\2\2\2\f\u0086"+
		"\3\2\2\2\16\u0088\3\2\2\2\20\u0092\3\2\2\2\22\u00a0\3\2\2\2\24\u00aa\3"+
		"\2\2\2\26\u00ba\3\2\2\2\30\33\5\4\3\2\31\33\5\b\5\2\32\30\3\2\2\2\32\31"+
		"\3\2\2\2\33\36\3\2\2\2\34\32\3\2\2\2\34\35\3\2\2\2\35\37\3\2\2\2\36\34"+
		"\3\2\2\2\37 \7\2\2\3 \3\3\2\2\2!\"\7\3\2\2\"#\7\30\2\2#$\7\4\2\2$-\7\5"+
		"\2\2%*\5\f\7\2&\'\7\6\2\2\')\5\f\7\2(&\3\2\2\2),\3\2\2\2*(\3\2\2\2*+\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2-%\3\2\2\2-.\3\2\2\2./\3\2\2\2/L\7\7\2\2\60"+
		"\61\7\30\2\2\61\62\7\b\2\2\62\63\7\30\2\2\63\64\7\4\2\2\64L\5\26\f\2\65"+
		"\66\7\30\2\2\66\67\7\b\2\2\678\7\30\2\289\7\4\2\29:\7\t\2\2:C\7\n\2\2"+
		";@\7\30\2\2<=\7\6\2\2=?\7\30\2\2><\3\2\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2"+
		"\2AD\3\2\2\2B@\3\2\2\2C;\3\2\2\2CD\3\2\2\2DE\3\2\2\2EF\7\13\2\2FG\7\5"+
		"\2\2GH\5\16\b\2HI\7\7\2\2IL\3\2\2\2JL\5\24\13\2K!\3\2\2\2K\60\3\2\2\2"+
		"K\65\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7\f\2\2NO\7\30\2\2OP\7\4\2\2PQ\5\22"+
		"\n\2Q\7\3\2\2\2RS\7\r\2\2ST\7\n\2\2TU\5\22\n\2UV\7\13\2\2V\t\3\2\2\2W"+
		"X\7\30\2\2XY\7\4\2\2Yq\5\22\n\2Z[\7\16\2\2[\\\7\n\2\2\\]\5\22\n\2]^\7"+
		"\13\2\2^_\7\5\2\2_`\5\20\t\2`a\7\7\2\2aq\3\2\2\2bc\7\17\2\2cd\7\n\2\2"+
		"de\5\22\n\2ef\7\13\2\2fg\7\5\2\2gh\5\20\t\2hn\7\7\2\2ij\7\20\2\2jk\7\5"+
		"\2\2kl\5\20\t\2lm\7\7\2\2mo\3\2\2\2ni\3\2\2\2no\3\2\2\2oq\3\2\2\2pW\3"+
		"\2\2\2pZ\3\2\2\2pb\3\2\2\2q\13\3\2\2\2rs\7\30\2\2st\7\21\2\2t\u0087\5"+
		"\26\f\2uv\7\30\2\2v\177\7\n\2\2w|\7\30\2\2xy\7\6\2\2y{\7\30\2\2zx\3\2"+
		"\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2\177w\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\7\13\2\2\u0082\u0083"+
		"\7\5\2\2\u0083\u0084\5\16\b\2\u0084\u0085\7\7\2\2\u0085\u0087\3\2\2\2"+
		"\u0086r\3\2\2\2\u0086u\3\2\2\2\u0087\r\3\2\2\2\u0088\u008b\5\20\t\2\u0089"+
		"\u008a\7\22\2\2\u008a\u008c\5\22\n\2\u008b\u0089\3\2\2\2\u008b\u008c\3"+
		"\2\2\2\u008c\17\3\2\2\2\u008d\u0091\5\6\4\2\u008e\u0091\5\n\6\2\u008f"+
		"\u0091\5\b\5\2\u0090\u008d\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u008f\3\2"+
		"\2\2\u0091\u0094\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\21\3\2\2\2\u0094\u0092\3\2\2\2\u0095\u0096\b\n\1\2\u0096\u00a1\5\26\f"+
		"\2\u0097\u00a1\7\30\2\2\u0098\u0099\7\n\2\2\u0099\u009a\5\22\n\2\u009a"+
		"\u009b\7\13\2\2\u009b\u00a1\3\2\2\2\u009c\u009d\7\30\2\2\u009d\u009e\7"+
		"\b\2\2\u009e\u00a1\7\30\2\2\u009f\u00a1\5\24\13\2\u00a0\u0095\3\2\2\2"+
		"\u00a0\u0097\3\2\2\2\u00a0\u0098\3\2\2\2\u00a0\u009c\3\2\2\2\u00a0\u009f"+
		"\3\2\2\2\u00a1\u00a7\3\2\2\2\u00a2\u00a3\f\6\2\2\u00a3\u00a4\7\31\2\2"+
		"\u00a4\u00a6\5\22\n\7\u00a5\u00a2\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\23\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7\30\2\2\u00ab\u00ac\7\b\2\2\u00ac\u00ad\7\30\2\2\u00ad\u00b6\7"+
		"\n\2\2\u00ae\u00b3\5\22\n\2\u00af\u00b0\7\6\2\2\u00b0\u00b2\5\22\n\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2\2\2\u00b6"+
		"\u00b7\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00b9\7\13\2\2\u00b9\25\3\2\2"+
		"\2\u00ba\u00bb\t\2\2\2\u00bb\27\3\2\2\2\25\32\34*-@CKnp|\177\u0086\u008b"+
		"\u0090\u0092\u00a0\u00a7\u00b3\u00b6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}