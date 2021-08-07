import java.util.Objects;

public class Peso {
    private int peso, nome;
    private Peso pai;
    private boolean usado;

    public Peso(int nome, int peso, Peso pai) {
        this.nome = nome;
        this.peso = peso;
        this.pai = pai;
        usado = false;
    }


    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }

    
    public int getPeso() {
        if(Objects.nonNull(pai))
            return peso+pai.getPeso();//faz o somatorio do peso atual e dos pais
        return 0;
    }

    public String getNomes(){
        if(Objects.isNull(pai)){
            return ""+nome;
        }
        return pai.getNomes()+"->"+nome;
    }

    public void setPeso(int peso) {
        
        this.peso = peso;
    }

    public Peso getPai() {
        return pai;
    }

    public void setPai(Peso pai) {
        this.pai = pai;
    }

    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getNome() {
        return nome;
    }
    
    @Override
    public boolean equals(Object obj) {
        Peso obj2 = (Peso)obj;
        return nome == obj2.nome;
    }

}
