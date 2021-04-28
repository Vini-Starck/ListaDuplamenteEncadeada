package estruturadedados;

public class Metodos {

    private Elemento inicio = null;
    private Elemento atual, aux;
    private int quantidadeElementos = 0;

    public Elemento getInicio() {
        return inicio;
    }

    public Elemento getAtual() {
        return atual;
    }

    public void inserirElemento(Object objeto) {
        if (inicio == null) {
            Elemento novoElemento = new Elemento(null, null, objeto);
            this.inicio = novoElemento;
            aux = inicio;
        } else {
            Elemento novoElemento = new Elemento(null, aux, objeto);
            this.atual = novoElemento;
            aux.setProx(atual);
            aux = atual;
        }
        quantidadeElementos++;
    }

    public void exibirInicio(Elemento elemento) {
        System.out.print("{");
        while (elemento != null) {
            System.out.print(elemento + " ");
            elemento = elemento.getProx();
        }
        System.out.print("}");
    }
    
    public void exibirFim(Elemento elemento) {
        System.out.print("{");
        while (elemento != null) {
            System.out.print(elemento + " ");
            elemento = elemento.getAnt();
        }
        System.out.print("}");
    }
    
    public void exibir(Elemento elemento){
        if(elemento == inicio){
            
        }
    }
}