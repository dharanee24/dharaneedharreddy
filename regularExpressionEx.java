import java.util.regex.Pattern;
public class regularExpressionEx  {

	public static void main(String args[])
	{

		System.out.println(Pattern.matches("dharanee", "dharii"));// it returns false as the strings doesnt match
		System.out.println(Pattern.matches("dharanee", "dharanee"));// it returns  true as the strings match

	}
}