/*
 * generated by Xtext 2.18.0
 */
package org.jucmnav.turn.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class TurnAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("org/jucmnav/turn/parser/antlr/internal/InternalTurn.tokens");
	}
}