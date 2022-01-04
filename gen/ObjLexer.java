// Generated from C:/Users/george.siqueira/IdeaProjects/Projeto_Compiladores/src\Obj.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ObjLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, TRUE=17, 
		FALSE=18, NUM=19, STRING=20, VAR=21, OP=22, SPACES=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "TRUE", 
			"FALSE", "NUM", "STRING", "VAR", "OP", "SPACES"
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
			null, null, null, null, null, "TRUE", "FALSE", "NUM", "STRING", "VAR", 
			"OP", "SPACES"
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


	public ObjLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Obj.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3"+
		"\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\5\24z\n\24\3\24\6\24}\n\24\r\24"+
		"\16\24~\3\25\3\25\3\25\3\25\7\25\u0085\n\25\f\25\16\25\u0088\13\25\3\25"+
		"\3\25\3\26\6\26\u008d\n\26\r\26\16\26\u008e\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00a0\n\27\3\30"+
		"\3\30\3\30\3\30\2\2\31\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\3\2\7\3\2"+
		"\62;\3\2$$\5\2\62;C\\c|\5\2,-//\61\61\5\2\13\f\17\17\"\"\2\u00b1\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\3\61"+
		"\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r=\3\2\2\2\17"+
		"?\3\2\2\2\21H\3\2\2\2\23J\3\2\2\2\25L\3\2\2\2\27P\3\2\2\2\31V\3\2\2\2"+
		"\33\\\3\2\2\2\35_\3\2\2\2\37d\3\2\2\2!f\3\2\2\2#m\3\2\2\2%r\3\2\2\2\'"+
		"y\3\2\2\2)\u0080\3\2\2\2+\u008c\3\2\2\2-\u009f\3\2\2\2/\u00a1\3\2\2\2"+
		"\61\62\7q\2\2\62\63\7d\2\2\63\64\7l\2\2\64\4\3\2\2\2\65\66\7?\2\2\66\6"+
		"\3\2\2\2\678\7}\2\28\b\3\2\2\29:\7.\2\2:\n\3\2\2\2;<\7\177\2\2<\f\3\2"+
		"\2\2=>\7\60\2\2>\16\3\2\2\2?@\7h\2\2@A\7w\2\2AB\7p\2\2BC\7e\2\2CD\7v\2"+
		"\2DE\7k\2\2EF\7q\2\2FG\7p\2\2G\20\3\2\2\2HI\7*\2\2I\22\3\2\2\2JK\7+\2"+
		"\2K\24\3\2\2\2LM\7x\2\2MN\7c\2\2NO\7t\2\2O\26\3\2\2\2PQ\7r\2\2QR\7t\2"+
		"\2RS\7k\2\2ST\7p\2\2TU\7v\2\2U\30\3\2\2\2VW\7y\2\2WX\7j\2\2XY\7k\2\2Y"+
		"Z\7n\2\2Z[\7g\2\2[\32\3\2\2\2\\]\7k\2\2]^\7h\2\2^\34\3\2\2\2_`\7g\2\2"+
		"`a\7n\2\2ab\7u\2\2bc\7g\2\2c\36\3\2\2\2de\7<\2\2e \3\2\2\2fg\7t\2\2gh"+
		"\7g\2\2hi\7v\2\2ij\7w\2\2jk\7t\2\2kl\7p\2\2l\"\3\2\2\2mn\7v\2\2no\7t\2"+
		"\2op\7w\2\2pq\7g\2\2q$\3\2\2\2rs\7h\2\2st\7c\2\2tu\7n\2\2uv\7u\2\2vw\7"+
		"g\2\2w&\3\2\2\2xz\7/\2\2yx\3\2\2\2yz\3\2\2\2z|\3\2\2\2{}\t\2\2\2|{\3\2"+
		"\2\2}~\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177(\3\2\2\2\u0080\u0086\7$\2\2"+
		"\u0081\u0085\n\3\2\2\u0082\u0083\7^\2\2\u0083\u0085\7$\2\2\u0084\u0081"+
		"\3\2\2\2\u0084\u0082\3\2\2\2\u0085\u0088\3\2\2\2\u0086\u0084\3\2\2\2\u0086"+
		"\u0087\3\2\2\2\u0087\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008a\7$"+
		"\2\2\u008a*\3\2\2\2\u008b\u008d\t\4\2\2\u008c\u008b\3\2\2\2\u008d\u008e"+
		"\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f,\3\2\2\2\u0090"+
		"\u00a0\t\5\2\2\u0091\u0092\7?\2\2\u0092\u00a0\7?\2\2\u0093\u0094\7#\2"+
		"\2\u0094\u00a0\7?\2\2\u0095\u00a0\7@\2\2\u0096\u0097\7@\2\2\u0097\u00a0"+
		"\7?\2\2\u0098\u00a0\7>\2\2\u0099\u009a\7>\2\2\u009a\u00a0\7?\2\2\u009b"+
		"\u009c\7~\2\2\u009c\u00a0\7~\2\2\u009d\u009e\7(\2\2\u009e\u00a0\7(\2\2"+
		"\u009f\u0090\3\2\2\2\u009f\u0091\3\2\2\2\u009f\u0093\3\2\2\2\u009f\u0095"+
		"\3\2\2\2\u009f\u0096\3\2\2\2\u009f\u0098\3\2\2\2\u009f\u0099\3\2\2\2\u009f"+
		"\u009b\3\2\2\2\u009f\u009d\3\2\2\2\u00a0.\3\2\2\2\u00a1\u00a2\t\6\2\2"+
		"\u00a2\u00a3\3\2\2\2\u00a3\u00a4\b\30\2\2\u00a4\60\3\2\2\2\t\2y~\u0084"+
		"\u0086\u008e\u009f\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}