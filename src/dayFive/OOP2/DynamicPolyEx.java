package dayFive.OOP2;

// Dynamic polyphorism
public class DynamicPolyEx {

	public static void main(String[] args) {
		DynamicPoly dp = new DynamicPoly();
		dp.myMethodDy();
		
		DynamicPolyEx dp1 = new DynamicPolyEx();
		dp1.myMethodDy();
	}
	
	public void myMethodDy() {
		System.out.println("Method from dynamic poly child example Class");
	}
}

class DynamicPoly{
	public void myMethodDy() {
		System.out.println("Method from dynamic poly super example Class");
	}
}