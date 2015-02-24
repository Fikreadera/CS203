
public class PhraseOMatic {
	public static void main (String[] args) {
      String[] wordListTwo = {"Object"
      		, "Java", "Class","Method","Argument","Array",
	"value-added.", "oriented", "centric", "distributed",
	"do some thing", "program", "outaide-the-box", "positioned",
	"networked", "focused" , "JDK", "aligned",
	"targeted", "shared" , "cooperative", "accelerated"};
	
      int twoLength = wordListTwo .length;
	
      int rand2 = (int) (Math.random() * twoLength);
		
      String phrase=wordListTwo[rand2];
      
      System.out.println("What we need is a " + phrase);

}}
