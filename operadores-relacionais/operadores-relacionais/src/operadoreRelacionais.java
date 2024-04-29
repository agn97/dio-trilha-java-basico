public class operadoreRelacionais {
    public static void main(String[] args) {
        String nomeUm = "Alan";
        String nomeDois = new String("Alan");

        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1==numero2;

        if (numero1 == numero2){ //estrutura condicional if e else
           System.out.println("a nossa condicao e verdadeira"); 
        }
        else
        System.out.println("nossa condicao e falsa");// fim da estrutura

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        simNao = numero1 >= numero2;

        System.out.println("numeroUm é maior ou igual a numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor a numeroDois? " + simNao);

        simNao = numero1 <= numero2;

        System.out.println("numeroUm é menor ou igual a numeroDois? " + simNao);
        


    }
    
}
