
public class VarAppl {

	public static void main(String[] args) {
		int a; 
		a = 42;
		System.out.println(a);
		a = 100500;
		System.out.println(a);
		int b = a; //celie chisla
		System.out.println(b);
		double pi = 3.1215926; // drobnie chisla
		System.out.println(pi);
		double gr = 6.67e43; //bolshie chisla
		System.out.println(gr);
		float x = a;
		System.out.println(x);
		b = (int) 2.5;
		System.out.println(b);
		b = (int) x;
		System.out.println(b);
		long z = 1_000_000_000_000_000_000l; // l- long v konce chisla chtobi java znala chto chislo long inache error
		System.out.println(z);
		float y = 9.8f;
		System.out.println(y);
		y = (float) pi;
		System.out.println(y);
		boolean check = true;
		System.out.println(check);
		
	}

}
