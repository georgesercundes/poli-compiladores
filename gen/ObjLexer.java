// Generated from C:/Users/georg/IdeaProjects/Projeto_Compiladores/src\Obj.g4 by ANTLR 4.9.2
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
		T__9=10, T__10=11, T__11=12, TRUE=13, FALSE=14, NUM=15, STRING=16, VAR=17, 
		OP=18, SPACES=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "TRUE", "FALSE", "NUM", "STRING", "VAR", "OP", 
			"SPACES"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0086\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6"+
		"\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\5\20[\n\20\3\20\6\20^\n\20\r\20\16\20_\3\21"+
		"\3\21\3\21\3\21\7\21f\n\21\f\21\16\21i\13\21\3\21\3\21\3\22\6\22n\n\22"+
		"\r\22\16\22o\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\5\23\u0081\n\23\3\24\3\24\3\24\3\24\2\2\25\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25\3\2\7\3\2\62;\3\2$$\5\2\62;C\\c|\5\2,-//\61\61\5\2\13\f"+
		"\17\17\"\"\2\u0092\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3)\3\2\2\2\5-\3\2\2\2\7/\3"+
		"\2\2\2\t\61\3\2\2\2\13\63\3\2\2\2\r\65\3\2\2\2\179\3\2\2\2\21;\3\2\2\2"+
		"\23A\3\2\2\2\25C\3\2\2\2\27E\3\2\2\2\31G\3\2\2\2\33N\3\2\2\2\35S\3\2\2"+
		"\2\37Z\3\2\2\2!a\3\2\2\2#m\3\2\2\2%\u0080\3\2\2\2\'\u0082\3\2\2\2)*\7"+
		"q\2\2*+\7d\2\2+,\7l\2\2,\4\3\2\2\2-.\7?\2\2.\6\3\2\2\2/\60\7}\2\2\60\b"+
		"\3\2\2\2\61\62\7.\2\2\62\n\3\2\2\2\63\64\7\177\2\2\64\f\3\2\2\2\65\66"+
		"\7x\2\2\66\67\7c\2\2\678\7t\2\28\16\3\2\2\29:\7\60\2\2:\20\3\2\2\2;<\7"+
		"r\2\2<=\7t\2\2=>\7k\2\2>?\7p\2\2?@\7v\2\2@\22\3\2\2\2AB\7*\2\2B\24\3\2"+
		"\2\2CD\7+\2\2D\26\3\2\2\2EF\7<\2\2F\30\3\2\2\2GH\7t\2\2HI\7g\2\2IJ\7v"+
		"\2\2JK\7w\2\2KL\7t\2\2LM\7p\2\2M\32\3\2\2\2NO\7v\2\2OP\7t\2\2PQ\7w\2\2"+
		"QR\7g\2\2R\34\3\2\2\2ST\7h\2\2TU\7c\2\2UV\7n\2\2VW\7u\2\2WX\7g\2\2X\36"+
		"\3\2\2\2Y[\7/\2\2ZY\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\^\t\2\2\2]\\\3\2\2\2"+
		"^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2` \3\2\2\2ag\7$\2\2bf\n\3\2\2cd\7^\2\2d"+
		"f\7$\2\2eb\3\2\2\2ec\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2i"+
		"g\3\2\2\2jk\7$\2\2k\"\3\2\2\2ln\t\4\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2"+
		"op\3\2\2\2p$\3\2\2\2q\u0081\t\5\2\2rs\7?\2\2s\u0081\7?\2\2tu\7#\2\2u\u0081"+
		"\7?\2\2v\u0081\7@\2\2wx\7@\2\2x\u0081\7?\2\2y\u0081\7>\2\2z{\7>\2\2{\u0081"+
		"\7?\2\2|}\7~\2\2}\u0081\7~\2\2~\177\7(\2\2\177\u0081\7(\2\2\u0080q\3\2"+
		"\2\2\u0080r\3\2\2\2\u0080t\3\2\2\2\u0080v\3\2\2\2\u0080w\3\2\2\2\u0080"+
		"y\3\2\2\2\u0080z\3\2\2\2\u0080|\3\2\2\2\u0080~\3\2\2\2\u0081&\3\2\2\2"+
		"\u0082\u0083\t\6\2\2\u0083\u0084\3\2\2\2\u0084\u0085\b\24\2\2\u0085(\3"+
		"\2\2\2\t\2Z_ego\u0080\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}