package W1D4;

//Question 2
	public class BetterCar {
	    private int x;
	    private int y;
	    
	   BetterCar(){
	        x = 0;
	        y = 0;
	    }
	    BetterCar(int x, int y){
	        this.x = x;
	        this.y = y;
	    }
	    
	    public void moveUp(){
	        this.y = this.y + 1;
	    }
	    
	    public void moveDown(){
	        
	        this.y = this.y -1;
	    }
	    
	    public void moveLeft(){
	        this.x = this.x -1;
	    }
	    
	    public void moveRight(){
	        this.x = this.x + 1;
	    }
	    
	    public String printLocation(){
	        return "(" + this.x + " ," + this.y + ")";
	    }
		public int getX() {
			return x;
		}
		public void setX(int x) {
			this.x = x;
		}
		public int getY() {
			return y;
		}
		public void setY(int y) {
			this.y = y;
		}
	 // public static void sayHi(){
		 // System.out.println("hi fikre"); //if you insert static in front of void then you can call to the main...
	  }  
		    
	



