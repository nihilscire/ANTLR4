import java.util.Base64;
import java.lang.*;

public class Base64Test
{
    public static void main(String[] args) throws Exception
    {
        if(args.length != 1)
        {
            System.out.println("not enough args");
            System.exit(1);
        }
        String originalInput = args[0];
        //originalInput = "{¬½²³²½³";
        String encodedString = Base64.getEncoder().withoutPadding().encodeToString(
            originalInput.getBytes("UTF-8"));
        String decodedString = new String(
            Base64.getDecoder().decode(encodedString),
            "UTF-8");

        System.out.println("I received "+originalInput);
        System.out.println("Encoded as "+encodedString);
        System.out.println("Decoded as "+decodedString);
    }
}