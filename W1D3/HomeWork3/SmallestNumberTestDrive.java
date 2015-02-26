package HomeWork3;

public class SmallestNumberTestDrive {
    public static void main (String[] args){
        double [] nums= new double[100];
        double smallest=0;
        for(int i=0; i<nums.length;i++){
            nums[i]= Math.random()*100;
              smallest= nums[i];
            }   
        
        System.out.println( "The smallest is " +smallest);
    }
}


