package W1D4;
//Question 4
public class TestDriver {

	public static void main(String[] args){
		Scientiest sn=new Scientiest();
		GuineaPic gn=new GuineaPic();
		gn.setName("zaka");
		sn.setName("zukenberg");
		int n=3;
		sn.changeThese(n,gn);
		
		System.out.println(n);
		System.out.println(gn.getName());
		
		
	}
}
