
public class homeWork {

	public static void main(String[] args) {
		work(5);
		workNew(6);
	}

	public static void work(int x) {
		switch (x) {
		case 1:
			System.out.println("at 08:30 to 13:30");
			break;
		case 2:
			System.out.println("at 08:30 to 13:00 , at 16:00 to 18:00");
			break;
		case 3:
			System.out.println("at 08:30 to 13:30");
			break;
		case 4:
			System.out.println("at 08:30 to 13:00 , at 16:00 to 18:00");
			break;
		case 5:
			System.out.println("at 08:30 to 13:30");
			break;
		case 6:
			System.out.println("Close");
			break;
		case 7:
			System.out.println("Close");
			break;
		default:
			System.out.println("wrong day");

		}
	}

	public static void workNew(int x) {
		if (x < 1 || x > 7) {
			System.out.println("wrong day");
			return;
		}
		if (x == 6 || x == 7) {
			System.out.println("Close");
			return;
		}
		switch (x % 2) {
		case 1:
			System.out.println("at 08:30 to 13:30");
			break;
		case 0:
			System.out.println("at 08:30 to 13:00 , at 16:00 to 18:00");
			break;
		}
	}

}
