
public class OperationAppl {

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = x + y;
		System.out.println(z);
		x = 18 % 7; //operacia ostatok ot deleniya (18/7)
		System.out.println(x);
		y = y +100;
		System.out.println(y);
		boolean check = y > 50;
		System.out.println(check);
		x = -x; // unarniy operator
		System.out.println(x);
		x++;
		System.out.println(x); //inkrimentniy operator
		x--;
		System.out.println(x); //dekrimentniy operator
		int age = 17;
		double vol = age >= 18 ? 42 : 1.5;
		System.out.println(vol);

	}

}