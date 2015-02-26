package HomeWork3;

public class PersonTestDrive {
		    public static void main(String[] args){
		        Person[] person= new Person[5];
		        Person f= new Person();
		        f.name = "John Doe";
		        
		        for (int i=0; i<person.length; i++){
		            person[i]= f;
		        }
		        person[0].name= "John Smith";
		        for (int j=0; j<person.length; j++) {
		            System.out.println(person[j].name);
		        }
		    }
}




		    
		    
		

	
	


