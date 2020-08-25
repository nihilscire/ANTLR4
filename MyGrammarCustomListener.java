public class MyGrammarCustomListener extends MyGrammarBaseListener
{
    @Override 
    public void enterCommand_name(MyGrammarParser.Command_nameContext ctx)
    {
        //System.out.println(ctx.WORD().getText());
    }
}