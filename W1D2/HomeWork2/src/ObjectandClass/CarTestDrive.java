package ObjectandClass;

public class CarTestDrive {
    public static void main(String[] args){
        Car myCar= new Car(0,0);
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


