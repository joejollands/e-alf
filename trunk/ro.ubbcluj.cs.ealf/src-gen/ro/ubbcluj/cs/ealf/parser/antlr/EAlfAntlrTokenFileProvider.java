/*
* generated by Xtext
*/
package ro.ubbcluj.cs.ealf.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EAlfAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("ro/ubbcluj/cs/ealf/parser/antlr/internal/InternalEAlf.tokens");
	}
}