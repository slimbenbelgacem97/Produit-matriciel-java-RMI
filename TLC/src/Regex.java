import java.util.regex.*;;
public class Regex {
	
	private static Pattern pattern;
	private static Matcher matcher;
	public static void main(String args[]) {
	pattern = Pattern.compile("Regex");
	matcher = pattern.matcher("Bonjour Regex ");
	
	while(matcher.find()) {
	System.out.println("Trouvé !");
	}}
}
