package Dados;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ManipularArquivos {
    static FileReader fi;
    static BufferedReader bi;
    static FileWriter fw;
    static BufferedWriter bw;	
    static final String ARQENT = "C:\\Users\\Aluno.LAPTOP-NKEPL977\\Desktop\\ARQENT.txt"; 
    static final String ARQSAI = "C:\\Users\\Aluno.LAPTOP-NKEPL977\\Desktop\\ARQSAI.txt"; 

    public static void main(String[] args) {
        try {
            fi = new FileReader(ARQENT);
            bi = new BufferedReader(fi);
            fw = new FileWriter(ARQSAI);
            bw = new BufferedWriter(fw);
            //LendoArquivo();
            EscreverArquivo();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bi != null) {
                    bi.close();
                }
                if (fi != null) {
                    fi.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    private static void EscreverArquivo() {
    	try {
			bw.write("Primeira Linha");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}


