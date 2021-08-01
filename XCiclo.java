import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XCiclo {
    private List <Integer> lista = new ArrayList<>(), inicio = new ArrayList<>(), fim = new ArrayList<>();
    
    public XCiclo(){
        
    }

    public boolean isCicle(XGrafo grafo){ 
        for(int vertice: grafo.getVertices()){
            if(!lista.contains(vertice)){           //pega cada vertice não usado 
                haveCicle(vertice, grafo);    //         e procura um caminho ciclico por ele
            }
        }
        for(int i = 0; i < inicio.size(); i++){
            grafo.reset();
            if(confereVoltas(inicio.get(i), fim.get(i), grafo)){
                grafo.reset();  //reseta o uso do grafo
                return true;
            }
        }
        grafo.reset();
        return false;
    }
    private boolean haveCicle(int vertice, XGrafo grafos) {
        if(lista.contains(vertice)){    //caso o vértice ja tenha sido encontrado encerra o método
            return true;            // e parte para a verificação
        }
        lista.add(vertice);

        Aresta atual = grafos.nextAresta(vertice);
        while(Objects.nonNull(atual)){              //pega as arestas que saem do vertice comparado
            if(haveCicle(atual.getFim(),grafos)){       //caso tenha chego em um possível loop
                if(direction(vertice, atual.getFim()) < 0){    //caso a aresta atual seja de retorno
                    inicio.add(vertice);
                    fim.add(atual.getFim());
                    return true;
                }
            }
            atual = grafos.nextAresta(vertice);//itera
        }
        return false;
    }
    private int direction(int vertice, int fim) {
        return lista.indexOf(fim) - lista.indexOf(vertice); //arestas de retorno
    }
    
    private boolean confereVoltas(int inicio, int fim, XGrafo grafos){
        if(inicio == fim)
            return true;

        Aresta atual = grafos.nextAresta(fim);
        while(Objects.nonNull(atual)){
            if(confereVoltas(inicio, atual.getFim(), grafos)){
                return true;
            }
            atual = grafos.nextAresta(fim);
        }
        return false;
    }
}
