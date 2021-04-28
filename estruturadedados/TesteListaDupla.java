package estruturadedados;

import java.util.Scanner;

public class TesteListaDupla {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Metodos metodo = new Metodos();
        
        metodo.inserirElemento("Gerson");
        metodo.inserirElemento("Anna");
        metodo.inserirElemento("Sandra");
        
        
        System.out.println("Escolha o método de exibição:\n"
                + "\n1 - Do início ao fim"
                + "\n2 - Do fim ao início");
        int op = leitor.nextInt();
        
        if(op == 1){
            metodo.exibirInicio(metodo.getInicio());
        }else if(op == 2){
            metodo.exibirFim(metodo.getAtual());
        }else{
            System.out.println("Erro");
        }
    }
}