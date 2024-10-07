package recebito;
public class Fila {
    private long tamanho;
    No inicio;
    No fim;

    public Fila() {
        tamanho = 0;
        setInicio(null);
        fim = null;
    }

    public boolean estaVazia() {
        return this.tamanho == 0;
    } 

    public void enfileirar(Object info) {
        No no = new No(info);
        if (estaVazia()) {
            setInicio(no);
            this.fim = no;
        } else {
            fim.prox = no; 
            fim = no; 
        }
        this.tamanho++; 
    }
    public Object inicio() {
        if (estaVazia()) {
            return null;
        }
        return this.inicio.info;
    }
    public Object desenfileirar() {
        if (estaVazia()) {
            return null;
        }
        Object info = getInicio().info;
        setInicio(getInicio().prox);
        this.tamanho--;
        if (estaVazia()) {
            fim = null;
        }
        return info; 
    }

    public No getInicio() {
        return inicio;
    }

    public void setInicio(No inicio) {
        this.inicio = inicio;
    }
}
