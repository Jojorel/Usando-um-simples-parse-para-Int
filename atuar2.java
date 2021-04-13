

public class atuar2 {
    
    public static void main(String[] args) {

    atuar1  a1 = new atuar1();
    
    do{
        a1.incrementar(2);
        System.out.println(a1.valor);
    } while (a1.valor < 10);

    a1.setNome("bubum");
    a1.setIdade(22);
    System.out.println(a1.getNome());
    System.out.println(a1.getIdade());
    a1.aniversario(12);
    a1.cocozada(true);
    int [][] pronta1={{(int) a1.getIdade(), 3, 3 }, { 3, 4, 5 }, { 7, 8, 9 }, { 0, 5, 6 } };// 4 linhas e 3 colunas
    System.out.println("\n Escrevendo a matriz pronta1 ");
    atuar1.imprimeMatrizInt(pronta1);

    }

   
}
