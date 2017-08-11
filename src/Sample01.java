
public class Sample01 {

	public static void main(String[] args) {
		//String a = new String("aaa");
		String a = "aaa";
		//String b = new String("aaa");
		//String b = "aaa";
		String b = a;
		b = b + "a";
		//int a[] = {1, 2, 3, 4};
		//int b[] = {1, 2, 3, 4};
		//int b[] = a;

		if ( a == b ) {
			System.out.println("同じ");
			System.out.println(a);
			System.out.println(b);
		} else {
			System.out.println("違う");
			System.out.println(a);
			System.out.println(b);
		}

	}

}
