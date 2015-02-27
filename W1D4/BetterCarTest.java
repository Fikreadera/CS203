package W1D4;
//Question 2
public class BetterCarTest {
	 public static void main(String[] args){
	    // BetterCar.sayHi();  
	      BetterCar myCar= new BetterCar(1,1);
	  
	    myCar.moveUp();
        System.out.println(myCar.printLocation());
	    myCar.moveDown();
        System.out.println(myCar.printLocation());
        myCar.moveLeft();
        System.out.println(myCar.printLocation());
        myCar.moveRight();	       
        System.out.println(myCar.printLocation());

}
}