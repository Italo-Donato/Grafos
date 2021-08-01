public class Aresta implements Comparable<Aresta>{
    private int inicio, fim, peso;  //inicio = vertice inicial, fim = vertice final, peso não usado ainda
    private boolean usado;  //Diz se a aresta já foi conferida

    public Aresta(int inicio, int fim, int peso) {
        this.inicio = inicio;
        this.fim = fim;
        this.peso = peso;
        usado = false;
    }

    public Aresta(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
        usado = false;
        this.peso = 1;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    public boolean equals(Aresta aresta){
        return aresta.inicio == inicio && aresta.fim == fim;
    }

    @Override
    public int compareTo(Aresta o) {
        if(o.inicio == inicio){
            if(o.fim > fim)
                return 1;
            else if(o.fim < fim)
                return -1;
            else
                return 0;
        }
        else if(o.inicio > inicio)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return inicio +" <--> "+ fim + " peso: "+ peso;
    }
}
