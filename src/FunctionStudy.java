
public class FunctionStudy {

	public static void main(String[] args) {
		
		printNumber(5);
		
		int number= printNumber(10);
		
		System.out.println(number);
		
		printNumberWithforLoop();
		
		int sum = printSum(3,4);
		System.out.println(sum);
	}
	
	public static int printNumber(int a) {
		System.out.println("number" + a);
		return a;
	}
	
	public static void printNumberWithforLoop() {
		for(int i =0; i<4; i++){
			System.out.println("print(for):" + i);
		}
	}
	
	public static int printSum(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
