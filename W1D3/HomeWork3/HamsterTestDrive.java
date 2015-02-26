package HomeWork3;



public class HamsterTestDrive {
 public static void main (String [] args){
        Hamster[] hums= new Hamster[100];
        double TotalAge=0;
        for (int i=0; i<hums.length;i++){
            hums[i]= new Hamster();
            hums[i].age = Math.random()*3;
            TotalAge = hums[i].age+TotalAge;
        }
        double AverageAge= TotalAge/100;
        System.out.println("The average age of the hamster = " + AverageAge);   
    }
   

}
