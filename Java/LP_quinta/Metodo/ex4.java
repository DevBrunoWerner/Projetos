import java.util.Scanner; 

class ex4{
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("Insira o tempo em segundos. ");
		int t; 
		t = in.nextInt();
		verificarTempo(t);
	}
	public static void verificarTempo(int t){
		int ti, h, m, s;
		ti = t;
		h = t / 3600;
		t = t % 3600; 
		m = t / 60;
		t = t % 60;
		s = t;
		System.out.printf("%d segundo(s) equivalem a %d hora(s), %d minuto(s) e %d segundo(s)", ti, h, m, s); 
	}
}