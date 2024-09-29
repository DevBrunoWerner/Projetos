package exerciciosGerais.manip;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;


public class manip1 {
    public static void main(String[] args)  {
        final String ARQ = "C:\\Users\\brbru\\Projetos\\Java\\exerciciosGerais\\manip\\arqpraler.txt"; 
        final String ARQ_sai = "C:\\Users\\brbru\\Projetos\\Java\\exerciciosGerais\\manip\\arqprasair.txt";
        BufferedReader br = null;
        BufferedWriter bw = null;
        
        try {
            FileReader fr = new FileReader(ARQ);
            FileWriter fw = new FileWriter(ARQ_sai);
            bw = new BufferedWriter(fw);
            br = new BufferedReader(fr);
            String linha = br.readLine();
            while(linha != null){
            	bw.write(linha);
            	bw.newLine();
                linha = br.readLine();
            }
            bw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + ARQ);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro ao ler ou escrever arquivo.");
            e.printStackTrace();
        } finally {
            try{
                if (br != null){
                    br.close();
                } if (bw != null) {
                	bw.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }

        }
    }

