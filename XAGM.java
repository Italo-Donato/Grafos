import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class XAGM{  //feito pelo segundo método apresentado em aula
    private List<List<Integer>> conjuntos = new ArrayList<>();//conjuntos de arestas
    private List<Aresta> arvoreMinima = new ArrayList<>();

    public XAGM(){
        
    }

    private void iniciaConjuntos(List<Integer> vertices){
        conjuntos.clear();
        arvoreMinima.clear();

        List<Integer> aux;
        for(int vertice: vertices){//   inicialmente cada aresta será um conjunto
            aux = new ArrayList<>();
            aux.add(vertice);
            conjuntos.add(aux);
        }
    }

    private boolean areConjuntosDiferentes(int inicio, int fim){//verifica se dois vertices fazem
        List<Integer> listaInicio = new ArrayList<>(), listaFim = null;//parte de conjuntos diferentes
        for(List<Integer> conjunto: conjuntos){
            if(conjunto.contains(inicio) && conjunto.contains(fim)){
                return false;// caso as dois sejam encontradas no mesmo conjunto retorna falso
            }
            else if(conjunto.contains(inicio))//armazena o conjunto do vertice inicio
                listaInicio = conjunto;
            else if(conjunto.contains(fim))//armazena o conjunto do vertice fim
                listaFim = conjunto;
        }

        conjuntos.remove(listaFim);
        conjuntos.remove(listaInicio);
        for(int number: listaFim){      //concatena os dois conjuntos e coloca novamente
            listaInicio.add(number);
        }
        conjuntos.add(listaInicio);
        return true;
    }

    

    public List<Aresta> arvoreCaminhoMinimo(XGrafo grafo){
        Aresta atual = grafo.nextAresta();
        iniciaConjuntos(grafo.getVertices());//inicia os conjuntos

        while(Objects.nonNull(atual)){
            if(areConjuntosDiferentes(atual.getInicio(), atual.getFim())){//testa se os vertices
                arvoreMinima.add(atual);    //fazem parte do mesmo conjunto, senão concatena os conjuntos
            }
            atual = grafo.nextAresta();
        }
        grafo.reset();  //reseta o uso do grafo
        return arvoreMinima;
    }

    public int pesoArvore(){
        int peso = 0;
        for(Aresta aresta: arvoreMinima){//soma o peso da arvore gerada
            peso+= aresta.getPeso();
        }
        return peso;
    }
}