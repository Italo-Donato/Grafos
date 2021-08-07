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
        /* XGrafo grafo3 = new XGrafo();
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
        System.out.println(cicloGrafo2.isCicle(grafo4)); */
/* 
        XGrafo distacia1 = new XGrafo();
        distacia1.addAresta(1,2,8);
        distacia1.addAresta(1,3,4);
        distacia1.addAresta(1,4,5);
        distacia1.addAresta(2,5,9);
        distacia1.addAresta(4,2,3);
        distacia1.addAresta(4,3,5);
        distacia1.addAresta(4,5,2);
        distacia1.addAresta(3,4,1);
        distacia1.addAresta(3,5,5);

        XAEDsMaps mapDistacia1 = new XAEDsMaps(distacia1, 1);
        System.out.println(mapDistacia1.getCaminho(5));
        System.out.println(mapDistacia1.getPeso(5));

        System.out.println("---------------");

        XGrafo tempo1 = new XGrafo();
        tempo1.addAresta(1,2,3);
        tempo1.addAresta(1,3,2);
        tempo1.addAresta(1,4,10);
        tempo1.addAresta(2,5,5);
        tempo1.addAresta(4,2,8);
        tempo1.addAresta(4,3,7);
        tempo1.addAresta(4,5,7);
        tempo1.addAresta(3,4,4);
        tempo1.addAresta(3,5,2);


        XAEDsMaps mapTempo1 = new XAEDsMaps(tempo1, 1);
        System.out.println(mapTempo1.getCaminho(5));
        System.out.println(mapTempo1.getPeso(5)); */

        XGrafo distacia2 = new XGrafo();
        distacia2.addAresta(1,2,3);
        distacia2.addAresta(1,4,5);
        distacia2.addAresta(2,4,2);
        distacia2.addAresta(4,2,3);
        distacia2.addAresta(2,3,2);
        distacia2.addAresta(4,3,5);
        distacia2.addAresta(4,5,9);
        distacia2.addAresta(2,5,2);
        distacia2.addAresta(5,2,4);
        distacia2.addAresta(5,1,6);

        XAEDsMaps mapDistacia2 = new XAEDsMaps(distacia2, 1);
        System.out.println(mapDistacia2.getCaminho(5));
        System.out.println(mapDistacia2.getPeso(5));

        System.out.println("---------------");

        XGrafo tempo2 = new XGrafo();
        tempo2.addAresta(1,2,3);
        tempo2.addAresta(1,4,5);
        tempo2.addAresta(2,4,2);
        tempo2.addAresta(2,3,6);
        tempo2.addAresta(3,5,2);
        tempo2.addAresta(4,2,1);
        tempo2.addAresta(4,5,6);
        tempo2.addAresta(4,3,4);
        tempo2.addAresta(5,3,7);
        tempo2.addAresta(5,1,3);


        XAEDsMaps mapTempo2 = new XAEDsMaps(tempo2, 1);
        System.out.println(mapTempo2.getCaminho(5));
        System.out.println(mapTempo2.getPeso(5));
    }
}
