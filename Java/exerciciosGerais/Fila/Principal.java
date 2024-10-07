package recebito;

public class Principal {

	public static void main(String[] args) {
		Fila fila = new Fila();
		fila.enfileirar("1");
		System.out.println(fila.inicio);
		fila.enfileirar("2");
		fila.enfileirar("3");
		Object info = fila.desenfileirar();
		while(info != null) {
			System.out.println(info);
			info = fila.desenfileirar();
		}
		fila.enfileirar("4");
		fila.enfileirar("5");
		info = fila.desenfileirar();
		while(info != null) {
			System.out.println(info);
			info = fila.desenfileirar();
		}
	}
}
