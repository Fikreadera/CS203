package W1D4;
// Question 3
public class CompareTest {
   public static void main(String[]args){
	   byte b=5;
	   short s= 5;
	   int i= 5;
	   long L =5;
	   float f =5.0f;
	   double d=5.0;
	   
	   String s1 ="Mi";
	   String s2 = "Mi";
	   String s3 = "MiMi";
	   
	   System.out.println(b==s); 
	   System.out.println(s==i); 
	   System.out.println(b==i); 
	   System.out.println(s==L);
	   System.out.println(b==L); 
	   System.out.println(f==d); 
	   System.out.println(d==L);
	   System.out.println(d==i); 
	   System.out.println(d==s);
	   System.out.println(d==b);
	   System.out.println(s1==s2);
	   System.out.println(s1+s2==s3); 
	  
	
}
}
