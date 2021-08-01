public class App {
    public static void main(String[] args) throws Exception {
        /* XGrafo grafo = new XGrafo();
        grafo.addArestaDupla(0, 1, 5);
        grafo.addArestaDupla(0, 6, 10);
        grafo.addArestaDupla(0, 3, 10);
        grafo.addArestaDupla(0, 7, 10);
        grafo.addArestaDupla(1, 5, 5);
        grafo.addArestaDupla(5, 6, 15);
        grafo.addArestaDupla(6, 3, 10);
        grafo.addArestaDupla(6, 2, 5);
        grafo.addArestaDupla(3, 2, 5);
        grafo.addArestaDupla(3, 4, 5);
        grafo.addArestaDupla(2, 4, 10);
        grafo.addArestaDupla(4, 8, 10);
        grafo.addArestaDupla(8, 7, 20);
        grafo.addArestaDupla(8, 1, 10);
        grafo.addArestaDupla(1, 7, 5);
        XAGM arvore = new XAGM();
        arvore.arvoreCaminhoMinimo(grafo).forEach(numSEi -> System.out.println(numSEi.toString()));
        System.out.println(arvore.pesoArvore());
        System.out.println("---------------");
        XGrafo grafo2 = new XGrafo();
        grafo2.addArestaDupla(2, 1, 8);
        grafo2.addArestaDupla(2, 3, 3);
        grafo2.addArestaDupla(2, 4, 2);
        grafo2.addArestaDupla(2, 5, 7);
        grafo2.addArestaDupla(2, 6, 5);
        grafo2.addArestaDupla(2, 7, 6);
        grafo2.addArestaDupla(3, 1, 2);
        grafo2.addArestaDupla(3, 4, 6);
        grafo2.addArestaDupla(5, 4, 6);
        grafo2.addArestaDupla(5, 6, 5);
        grafo2.addArestaDupla(8, 6, 4);
        grafo2.addArestaDupla(7, 1, 9);
        grafo2.addArestaDupla(7, 3, 6);
        grafo2.addArestaDupla(7, 4, 2);
        grafo2.addArestaDupla(7, 5, 4);
        grafo2.addArestaDupla(7, 6, 6);
        grafo2.addArestaDupla(7, 8, 3);
        XAGM arvore2 = new XAGM();
        arvore2.arvoreCaminhoMinimo(grafo2).forEach(numSEi -> System.out.println(numSEi.toString()));
        System.out.println(arvore2.pesoArvore()); */
        XGrafo grafo3 = new XGrafo();
        grafo3.addArestaDupla(0, 1);
        grafo3.addArestaDupla(0, 3);
        grafo3.addArestaDupla(2, 1);
        grafo3.addArestaDupla(0, 4);
        grafo3.addArestaDupla(5, 1);
        grafo3.addArestaDupla(4, 5);
        grafo3.addArestaDupla(4, 7);
        grafo3.addArestaDupla(5, 6);
        grafo3.addArestaDupla(7, 6);
        grafo3.addArestaDupla(3, 2);

        XCiclo cicloGrafo = new XCiclo();
        System.out.println(cicloGrafo.isCicle(grafo3));

        XGrafo grafo4 = new XGrafo();
        grafo4.addAresta(9, 6);
        grafo4.addAresta(0, 5);
        grafo4.addAresta(0, 1);
        grafo4.addAresta(0, 2);
        grafo4.addAresta(0, 3);
        grafo4.addAresta(5, 4);
        grafo4.addAresta(5, 6);
        grafo4.addAresta(1, 2);
        grafo4.addAresta(2, 4);
        grafo4.addAresta(2, 3);
        grafo4.addAresta(4, 6);
        grafo4.addAresta(6, 7);
        grafo4.addAresta(6, 8);
        grafo4.addAresta(7, 8);
        XCiclo cicloGrafo2 = new XCiclo();
        System.out.println(cicloGrafo2.isCicle(grafo4));
    }
}
