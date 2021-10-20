
public class FunctionEx {

	public static void main(String[] args) {
		
		int sum = sumFromZero(10);
		String result = sumString("i","you");
		
		System.out.println(sum);
		if(result.equals("iyou")) {
			System.out.println("here");
		}else {
			System.out.println("here2");
		}
		
		boolean myBool = true;
		myBool = false;
		System.out.println(myBool);
		
		if(isSameNumber(10)) {
			System.out.println("Same");
		}else {
			System.out.println("Not Same");
		}
	}
	
	public static int sumFromZero(int a) {
		int sum = 0;
		
		for(int i=0; i<(a+1); i++) {
			sum = sum + i;
		}
		return sum;
	}
	public static String sumString(String a,String b) {
		return a+b;
	}
	
	public static boolean isSameNumber(int a) {
		if(a ==10) {
			return true;
		}else {
			return false;
		}
	}
}
