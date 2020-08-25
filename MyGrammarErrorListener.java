import org.antlr.v4.runtime.*;

public class MyGrammarErrorListener extends BaseErrorListener
{
    @Override 
    public void syntaxError(Recognizer<?,?> recognizer, 
                Object offendingSymbol, 
                int line, 
                int charPositionInLine, 
                String msg, 
                RecognitionException e)
    {
        System.out.println(msg);
    }
}