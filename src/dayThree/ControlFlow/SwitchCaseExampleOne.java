package dayThree.ControlFlow;

public class SwitchCaseExampleOne {

	public static void main(String[] args) {
		int num =2;
		switch (num) {
		case 1:
			System.out.println("Case 1 1" + num);
			break;
		case 2:
			System.out.println("Case 2 2" + num);
			break;
		case 3:
			System.out.println("Case 3 " + num);
			break;
		case 4:
			System.out.println("Case 4 " + num);
			break;
		default:
			System.out.println("Default: value is :" + num);
		}
	}
}
