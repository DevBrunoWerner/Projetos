package exerciciosGerais.manip;
import java.io.*;
import java.util.Collections;
import java.util.ArrayList;
public class ex2Manip {

	public static void main(String[] args) {
		final String ARQ_IN = "C:\\Users\\brbru\\Projetos\\Java\\exerciciosGerais\\manip\\ex2_in.txt"; 
		final String ARQ_OUT = "C:\\Users\\brbru\\Projetos\\Java\\exerciciosGerais\\manip\\ex2_out.txt";
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			FileReader fr = new FileReader(ARQ_IN);
			FileWriter fw = new FileWriter(ARQ_OUT);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			String linha;
			ArrayList<String> nomes = new ArrayList();
			ArrayList<Integer> numeros = new ArrayList();
			while ((linha = br.readLine()) != null) {
				String parte [] = linha.split(" ");
				String nome = ""; 
				int nota = Integer.parseInt(parte[parte.length -1]);
				numeros.add(nota);
				for (int i = 0;i < parte.length - 1; i++){
					nome += parte[i];
					if (i < parte.length - 2) {
						nome += " ";
					}
				}
				nomes.add(nome);
				
			}
			Collections.sort(nomes);
			for (int i = 0; i < nomes.size();i++) {
				int n = numeros.get(i);
				if (n >= 7) {
					bw.write(nomes.get(i));
					bw.newLine();
				}
			}
			bw.flush();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
	
}


