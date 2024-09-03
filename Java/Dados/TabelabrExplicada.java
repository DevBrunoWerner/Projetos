package Dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Tabelabr {
    // Declaração de variáveis para leitura de arquivos
    static FileReader fi;
    static BufferedReader bi;    
    static final String ARQENT = "C:\\Users\\brbru\\Desktop\\ARQENT.txt"; 

    public static void main(String[] args) {     
        try {
            // Arrays para armazenar os nomes dos times e seus pontos
            String[] times = new String[4]; // Presume que há 4 times no total
            int[] pontos = new int[times.length]; // Array para armazenar pontos correspondentes aos times
            
            // Inicializa o FileReader e BufferedReader para leitura do arquivo
            fi = new FileReader(ARQENT);
            bi = new BufferedReader(fi);
            
            // Chama métodos para ler os nomes dos times e calcular os pontos
            cdTimes(times); // Lê os nomes dos times do arquivo
            pontos(times, pontos); // Calcula os pontos dos times com base nos resultados das partidas
            
            // Criação de array de SortEntry para armazenar pontos e índices dos times
            SortEntry[] sortedEntries = new SortEntry[times.length];
            for (int i = 0; i < times.length; i++) {
                sortedEntries[i] = new SortEntry(pontos[i], i);
            }
            
            // Ordena os times em ordem decrescente de pontos usando um Comparator
            Arrays.sort(sortedEntries, new Comparator<SortEntry>() {
                @Override
                public int compare(SortEntry e1, SortEntry e2) {
                    return Integer.compare(e2.pontos, e1.pontos); // Ordenação decrescente
                }
            });

            // Imprime o resultado final da classificação dos times
            for (int i = 0; i < sortedEntries.length; i++) {
                int index = sortedEntries[i].indice; // Obtém o índice original do time
                System.out.println((i + 1) + " - " + times[index] + " - " + pontos[index] + " pontos");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Tratamento de exceções para erros de I/O
        } finally {
            try {
                if (bi != null) {
                    bi.close(); // Fecha o BufferedReader se ele foi inicializado
                }
                if (fi != null) {
                    fi.close(); // Fecha o FileReader se ele foi inicializado
                }
            } catch (IOException e) {
                e.printStackTrace(); // Tratamento de exceções ao fechar arquivos
            }
        }
    }
    
    // Método para calcular os pontos dos times com base nos resultados das partidas
    private static void pontos(String[] times, int[] pontos) {
        String linha;
        try {
            while ((linha = bi.readLine()) != null) { // Lê cada linha do arquivo
                if (linha.trim().isEmpty()) {
                    continue; // Ignora linhas vazias
                }
                String[] pos = linha.split(" "); // Divide a linha em partes
                if (pos.length != 4) {
                    continue; // Ignora linhas que não têm 4 elementos (formato esperado)
                }
                try {
                    int codT1 = Integer.parseInt(pos[0]) - 1; // Código do primeiro time (ajusta para índice de array)
                    int codT2 = Integer.parseInt(pos[1]) - 1; // Código do segundo time (ajusta para índice de array)
                    int gols1 = Integer.parseInt(pos[2]); // Gols do primeiro time
                    int gols2 = Integer.parseInt(pos[3]); // Gols do segundo time

                    // Verifica se os códigos dos times são válidos e dentro do range do array
                    if (codT1 >= 0 && codT1 < times.length && codT2 >= 0 && codT2 < times.length) {
                        if (gols1 > gols2) {
                            pontos[codT1] += 3; // 3 pontos para o time vencedor
                        } else if (gols2 > gols1) {
                            pontos[codT2] += 3; // 3 pontos para o time vencedor
                        } else {
                            pontos[codT1] += 1; // 1 ponto para cada time em caso de empate
                            pontos[codT2] += 1; 
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace(); // Tratamento de exceções para erros de conversão de número
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Tratamento de exceções para erros de I/O
        }
    }

    // Método para ler os nomes dos times do arquivo
    private static void cdTimes(String[] times) {
        String linha;
        int i = 0;
        try {
            while (i < times.length && (linha = bi.readLine()) != null) { // Lê cada linha do arquivo até completar o array
                if (linha.length() > 4) {
                    times[i] = linha.substring(1).trim(); // Extrai o nome do time da linha e o adiciona ao array
                    i++; // Incrementa o índice do array de times
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Tratamento de exceções para erros de I/O
        }
    }

    // Classe interna para ajudar na ordenação dos times por pontos
    static class SortEntry {
        int pontos; // Pontos do time
        int indice; // Índice original do time no array

        SortEntry(int pontos, int indice) {
            this.pontos = pontos;
            this.indice = indice;
        }
    }
}
