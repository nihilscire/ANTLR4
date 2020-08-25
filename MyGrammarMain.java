import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class MyGrammarMain {
    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        
        InputStream is = System.in;
        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        
        CharStream input = CharStreams.fromStream(is);
        
        MyGrammarLexer lexer = new MyGrammarLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(new MyGrammarErrorListener());
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        MyGrammarParser parser = new MyGrammarParser(tokens);
        // parser.removeErrorListeners();
        // parser.addErrorListener(new MyGrammarErrorListener());

        ParseTree tree = parser.root(); // parse; start at root
        //System.out.println(tree.toStringTree(parser)); // print tree as text

        ParseTreeWalker walker = new ParseTreeWalker();
        walker.walk(new MyGrammarCustomListener(), tree);
        System.out.println("DONE!");
    }
}