package com.munkhbat.scala.mincaml.parser;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

public class Parse {
    public static void main(String[] args) {
        CharStream charStream = new ANTLRInputStream("5 + 6");
        MincamlLexer lexer = new MincamlLexer(charStream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        MincamlParser mincamlParser = new MincamlParser(tokenStream);

        Visitor visitor = new Visitor();
        visitor.visit(mincamlParser.exp());
    }
}
