package exerciciosGerais.manip;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class ex1Manip {

	public static void main(String[] args) {
		final String ARQ_IN = "C:\\Users\\brbru\\Projetos\\Java\\exerciciosGerais\\manip\\ex1_in.txt"; 
		final String ARQ_OUT = "C:\\Users\\brbru\\Projetos\\Java\\exerciciosGerais\\manip\\ex1_out.txt";
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			FileReader fr = new FileReader(ARQ_IN);
			FileWriter fw = new FileWriter(ARQ_OUT);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			String linha = br.readLine();
			ArrayList<String> nomes = new ArrayList<String>();
			while( linha != null) {
				nomes.add(linha);
				linha = br.readLine();
			}
			Collections.sort(nomes);
			for (int i = 0; i < nomes.size();i++) {
				bw.write(nomes.get(i));
				bw.newLine();
			}
			bw.flush();
			
			} catch (IOException e) {
				e.printStackTrace();
			}	finally {
				try {
					if (br != null){				
					br.close();
				} if (bw != null) {
					bw.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
			}
	}

}
