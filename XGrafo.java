import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class XGrafo {
    private List<Aresta> arestas;
    private List<Integer> vertices;

    public XGrafo() {
        arestas = new ArrayList<>();
        vertices = new ArrayList<>();
    }

    public void addAresta(int inicio, int fim){ //para facilitar a criação
        addAresta(new Aresta(inicio, fim));
    }
    
    public void addAresta(int inicio, int fim, int peso){ //para facilitar a criação
        addAresta(new Aresta(inicio, fim, peso));
    }

    public void addArestaDupla(int inicio, int fim){ //para facilitar a criação
        addAresta(new Aresta(inicio, fim));
        addAresta(new Aresta(fim, inicio));
    }
    
    public void addArestaDupla(int inicio, int fim, int peso){ //para facilitar a criação
        addAresta(new Aresta(inicio, fim, peso));
        addAresta(new Aresta(fim, inicio, peso));
    }

    public void addAresta(Aresta aresta){
        arestas.add(aresta);
        arestas = arestas.stream()
        .sorted()
        .collect(Collectors.toList());  //adiciona a aresta e ordena

        if(!vertices.contains(aresta.getInicio())){ //caso seja um vertice novo adiciona e ordena
            vertices.add(aresta.getInicio());
            vertices = vertices.stream()
            .sorted()
            .collect(Collectors.toList());
        }

        if(!vertices.contains(aresta.getFim())){ //caso seja um vertice novo adiciona e ordena
            vertices.add(aresta.getFim());
            vertices = vertices.stream()
            .sorted()
            .collect(Collectors.toList());
        }
    }

    public void removeAresta(Aresta aresta){
        arestas.remove(aresta);
    }

    public Aresta nextAresta(int verticeInicial){   //recebe qual o vértice inicial da aresta desejada
        for(Aresta aresta : arestas){
            if(aresta.getInicio() == verticeInicial && !aresta.isUsado()){ //procura a aresta 
                aresta.setUsado(true);//             e caso ela não tenha sido usada será retornada
                return aresta;
            }
        }
        return null;
    }

    public Aresta nextArestaFim(int verticeFinal){  //recebe qual o vértice final da aresta desejada
        for(Aresta aresta : arestas){
            if(aresta.getFim() == verticeFinal && !aresta.isUsado()){ //procura a aresta 
                aresta.setUsado(true);//             e caso ela não tenha sido usada será retornada
                return aresta;
            }
        }
        return null;
    }

    private Aresta primeiraNaoUsada(){ //retorna a primeira aresta não usada
        for(Aresta aresta : arestas){
            if(!aresta.isUsado())
                return aresta;
        }
        return null;
    }

    public Aresta nextAresta(){   //retorna a próxima aresta com menor peso
        Aresta retorno = primeiraNaoUsada();//método criado para evitar possíveis erros
        if(Objects.isNull(retorno))
            return null;
        for(Aresta aresta : arestas){
            if(aresta.getPeso() < retorno.getPeso() && !aresta.isUsado()){ //procura a aresta com menor peso
                retorno = aresta;//             e caso ela não tenha sido usada será guardada
            }
        }
        if(Objects.nonNull(retorno))    //faz a mudança de uso com cuidados para caso seja nula
            arestas.get(arestas.indexOf(retorno)).setUsado(true);
            
        return retorno;
    }

    //reseta todas as arestas para não usadas
    public void reset(){    arestas.forEach(aresta -> aresta.setUsado(false));  } 

    public List<Integer> getVertices(){ 
        return vertices;
    }
}
