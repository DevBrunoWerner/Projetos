package Dados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Tabelabr {
    static FileReader fi;
    static BufferedReader bi;    
    static final String ARQENT = "C:\\Users\\brbru\\Desktop\\ARQENT.txt"; 

    public static void main(String[] args) {     
        try {
            String[] times = new String[4];
            int[] pontos = new int[times.length];
            
            fi = new FileReader(ARQENT);
            bi = new BufferedReader(fi);
            
            cdTimes(times);
            pontos(times, pontos);
            
            SortEntry[] sortedEntries = new SortEntry[times.length];
            for (int i = 0; i < times.length; i++) {
                sortedEntries[i] = new SortEntry(pontos[i], i);
            }
            
            Arrays.sort(sortedEntries, new Comparator<SortEntry>() {
                @Override
                public int compare(SortEntry e1, SortEntry e2) {
                    return Integer.compare(e2.pontos, e1.pontos);
                }
            });

            for (int i = 0; i < sortedEntries.length; i++) {
                int index = sortedEntries[i].indice;
                System.out.println((i + 1) + " - " + times[index] + " - " + pontos[index] + " pontos");
            }
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
    
    private static void pontos(String[] times, int[] pontos) {
        String linha;
        try {
            while ((linha = bi.readLine()) != null) {
                if (linha.trim().isEmpty()) {
                    continue; 
                }
                String[] pos = linha.split(" ");
                if (pos.length != 4) {
                    continue;
                }
                try {
                    int codT1 = Integer.parseInt(pos[0]) - 1;
                    int codT2 = Integer.parseInt(pos[1]) - 1;
                    int gols1 = Integer.parseInt(pos[2]);
                    int gols2 = Integer.parseInt(pos[3]);

                    if (codT1 >= 0 && codT1 < times.length && codT2 >= 0 && codT2 < times.length) {
                        if (gols1 > gols2) {
                            pontos[codT1] += 3;
                        } else if (gols2 > gols1) {
                            pontos[codT2] += 3;
                        } else {
                            pontos[codT1] += 1; 
                            pontos[codT2] += 1; 
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void cdTimes(String[] times) {
        String linha;
        int i = 0;
        try {
            while (i < times.length && (linha = bi.readLine()) != null) {
                if (linha.length() > 4) {
                    times[i] = linha.substring(1).trim();
                    i++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class SortEntry {
        int pontos;
        int indice;

        SortEntry(int pontos, int indice) {
            this.pontos = pontos;
            this.indice = indice;
        }
    }
}
