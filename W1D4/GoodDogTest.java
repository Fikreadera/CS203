package W1D4;
//Question from text page82
public class GoodDogTest {
	public static void main(String[]args){
		GoodDog one=new GoodDog();
		one.setSize(70);
		GoodDog two =new GoodDog();
		two.setSize(8);
		
		System.out.println("Dog one:"+one.getSize());
		System.out.println("Dog two:"+two.getSize());
        one.bark();
        two.bark();
	}

}
