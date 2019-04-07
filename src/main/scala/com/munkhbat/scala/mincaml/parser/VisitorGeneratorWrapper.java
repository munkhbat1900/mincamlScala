package com.munkhbat.scala.mincaml.parser;

import com.munkhbat.scala.mincaml.ast.Ast;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

/**
 * I needed this wrapper because in scala I couldn't call visitor.
 */
public class VisitorGeneratorWrapper {
    public Ast.Exp generateVisitorJavaWrapper(String sourceCode) {
        CharStream charStream = new ANTLRInputStream(sourceCode);
        MincamlLexer lexer = new MincamlLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        MincamlParser mincamlParser = new MincamlParser(tokenStream);

        Visitor visitor = new Visitor();
        return visitor.visit(mincamlParser.exp());
    }
}
