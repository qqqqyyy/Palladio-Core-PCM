package de.uka.ipd.sdq.stoex.parser.test;

import java.io.StringReader;
import java.util.ArrayList;
 
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.junit.Test;

import de.uka.ipd.sdq.stoex.parser.StochasticExpressionsLexer;
import de.uka.ipd.sdq.stoex.parser.StochasticExpressionsParser;

public class StoExParserTests {
	
	@Test public void stoExParserTests() throws RecognitionException {
		parse("true");
		parse("5 > 4");
		parse("IntPMF[(1;0.2)(2;0.4)]");
		parse("10.8E4");
		parse("5+5*6 > 7*7 AND 6*6 < 7");
		parse("-4");
		parse("NOT true");
	}

	@Test(expected=RecognitionException.class) public void stoExParserNegativeTests() throws RecognitionException {
		parse("+6***6");
		parse("�$JFf�RKrp23r32#");
	}
	
	private void parse(String s) throws RecognitionException {
		StochasticExpressionsLexer lexer = new StochasticExpressionsLexer(
				new ANTLRStringStream(s));
		StochasticExpressionsParser parser = new StochasticExpressionsParser(
				new CommonTokenStream(lexer));
		parser.expression();
	}
}