public class Array {

	public static void main(String[] args) {
		String[] a = new String[5];
		
		for(int i =0; i<a.length; i++) {
			String b = "*";
//			자바 11에서 추가된 메서드 repeat
//			a[i] = b.repeat(i+1);
			System.out.println(a[i]);
		}
	}
}
