public class Array {

	public static void main(String[] args) {
		String[] a = new String[5];
		
		for(int i =0; i<a.length; i++) {
			String b = "*";
//			�ڹ� 11���� �߰��� �޼��� repeat
//			a[i] = b.repeat(i+1);
			System.out.println(a[i]);
		}
	}
}
