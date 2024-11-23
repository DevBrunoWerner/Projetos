package exerciciosGerais.Prova;
import java.util.Scanner; 

class exp4 {
	public static void main(String[]args){
		Scanner in = new Scanner(System.in);
		System.out.println("1 para juntar String");
		System.out.println("2 para juntar matriz");
		System.out.println("3 para asteriscar uma string");dfaipus
						int n = in.nextInt();
						if(n == 1){
							String v1[] = new String[4];
							for (int i = 0; i<4; i++){
								System.out.println("Digite a palavra um");
								v1[i] = in.nextLine();
							}
							juntarString(v1);
						} else if(n==2) {
							int mat1[][] = new int[4][4];
							for (int i = 0; i<4;i++) {
								for (int j = 0; j<4;j++) {
									System.out.println("Digite o proximo número");
									mat1[i][j] = in.nextInt();								}
							}
							somarMat(mat1); 
						} else if(n==3) {
							in.nextLine();
							System.out.println("Digite uma string com vogais");
							String vs = new String();
							vs = in.nextLine();
							String aster = astPalavra(vs);
							System.out.println(aster);
							}
	}
	public static void juntarString(String[] v1){
		StringBuilder frase = new StringBuilder();
		for (int i = 0;i<4;i++){
			frase.append(v1[i] + " ");
		}
		System.out.println(frase);
	}
	public static void somarMat(int[][] mat1) {
		int soma =  0;
		for (int i = 0; i<4;i++) {
			for (int j = 0; j<4;j++) {
				System.out.println("Digite o proximo número");
				soma += mat1[i][j];								}
		}
		System.out.println("Soma: " + soma);
	}
	public static String astPalavra(String vs) {
		String sub = new String();
		for(int i = 0;i<vs.length();i++){
			if (vs.charAt(i) == 'a' || vs.charAt(i) == 'e'|| vs.charAt(i) == 'i' || vs.charAt(i) == 'o' || vs.charAt(i) == 'u' || vs.charAt(i) == 'A' || vs.charAt(i) == 'E'|| vs.charAt(i) == 'I' || vs.charAt(i) == 'O' || vs.charAt(i) == 'U' ) {
				sub += '*';
			} else {
				sub += vs.charAt(i);
			}
		}
		return sub;
	}
}