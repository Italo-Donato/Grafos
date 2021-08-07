import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class XAEDsMaps {
    private XGrafo grafo;
    private List<Peso> itens;   //arvore de caminho mínimo do ponto A pra qualquer ponto B
    private int A;  //ponto A fixo

    public XAEDsMaps(XGrafo grafo, int A){
        this.grafo = grafo;
        this.A = A;
        itens = new ArrayList<>();

        Peso aux = new Peso(A, 0, null);
        aux.setUsado(true);
        itens.add(aux);//           cadastra o ponto A
        geraArvore(A);//            inicia a construcao da arvore
    }

    private Peso returnItem(int item){//verifica a existencia de um item no array e o retorna caso exista
        int aux = itens.indexOf(new Peso(item, 0, null));
        if(aux != -1)
            return itens.get(aux);//retorna o objeto caso exista
        return null;// return null caso não esteja contido
    }

    private void atualiza(int atual, int peso, int pai){// atualiza a arvore ou cria um item caso n exista
        boolean criado = false;
        Peso paiP = returnItem(pai);
        for(Peso aux: itens){
            if(aux.getNome() == atual){// caso encontre o item será atualizado
                criado = true;
                aux.setPeso(peso);
                aux.setPai(paiP);
            }
        }
        if(!criado){// caso n tenha encontrado será criado
            itens.add(new Peso(atual, peso, paiP));
        }
    }

    private void testaFilhos(int pai){// compara os filhos de cada vertice com a arvore para encontrar um caminho menor
        Aresta atual = grafo.nextAresta(pai);
        Peso p_pai = returnItem(pai);
        while(Objects.nonNull(atual)){
            Peso p_atual = returnItem(atual.getFim());
            if(Objects.isNull(p_atual)){                //caso seja um vertice novo será cadastrado
                atualiza(atual.getFim(), atual.getPeso(), pai);
            }
            else if(p_atual.getPeso() > atual.getPeso()+p_pai.getPeso()){// caso o vertice exista e seja mais leve
               atualiza(atual.getFim(), atual.getPeso(), pai); //       será atualizado o valor
            }
            atual = grafo.nextAresta(pai);
        }
        setUsado(pai, true);// coloca o vertice como usado
    }

    private void setUsado(int nome,boolean usado){//coloca o atributo usado como o parametro pra um item
        Peso p = returnItem(nome);
        itens.remove(p);
        p.setUsado(usado);
        itens.add(p);
    }

    private int nextVertice(){//retorna o proximo vertice nao usado
        for(Peso item: itens){
            if(!item.isUsado())
                return item.getNome();
        }
        return -1;
    }

    private void geraArvore(int atual){//testa todos os vertices
        testaFilhos(atual);// testa o vertice atual e cadastra/atualiza seus filhos
        int proximo = nextVertice();//pega o proximo vertice
        if(proximo != -1)//caso exista
            geraArvore(proximo);//faz a chamada para o proximo
    }

    public int getPeso(int B){//retorna o peso minimo para o ponto B a partir do ponto A
        Peso b = returnItem(B);
        if(Objects.nonNull(b)){
            return b.getPeso();
        }
        return -1;
    }

    public String getCaminho(int B){
        Peso b = returnItem(B);
        if(Objects.nonNull(b)){
            return b.getNomes();
        }
        return "";
    }

    public int getPontoInicial(){
        return A;
    }
}
