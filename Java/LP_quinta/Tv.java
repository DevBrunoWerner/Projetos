public class Tv {
    private String pg; // Programa
    private String fm; // Filme
    private int vm; // Volume
    private int ns; // Número de séries
    private String sm; // Serviço de streaming
    private int sN; // Variável de controle para assistir ou não assistir
	private String escolha;
	
    // Getters e setters para os atributos
    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getFm() {
        return fm;
    }

    public void setFm(String fm) {
        this.fm = fm;
    }

    public int getVm() {
        return vm;
    }

    public void setVm(int vm) {
        this.vm = vm;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public void detalhes(String escolha){
		this.escolha = escolha;
		System.out.println("Detalhes:");
                System.out.println("Streaming: " + this.getSm());
				
                if (escolha.equalsIgnoreCase("filme")) {
                    System.out.println("Filme: " + this.getFm());
                } else if (escolha.equalsIgnoreCase("programa")) {
                    System.out.println("Programa: " + this.getPg());
                }
	}	
}
