import java.util.Arrays;

public class StackImp {
	int i = 0;

	String[] array = new String[5];

	public static void main(String[] args) {

//			push("ani");
//			push("res");
//			push("zak");
//			//push("rudra");
//			//push("abc");
//			//push("extra");
//			System.out.println(Arrays.toString(array));
//			peek();

	}

	boolean push(String str) {
		if (i < array.length) {
			array[i++] = str;
			return true;

		} else {

			throw new ArrayIndexOutOfBoundsException();

		}

	}

	void peek() {

		System.out.println(array[i - 1]);
	}

	void pop() {

		array[--i] = null;

		System.out.println();
	}

	public String toString() {
		// TODO Auto-generated method stub
		for (int k = 0; k < i; k++) {
			System.out.println(array[k]);

		}

		return " ";
	}

}
