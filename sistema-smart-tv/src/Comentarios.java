/**
 * <h1>Calculador</h1>
 * A calculadora realiza operações matematicas entre numeros
 * <p>
 * <b>Note:</b> Leia atentamentente a documentação desta classe 
 * para desfrutar dos recursos oferecidos pelo autor
 * 
 * @author Alan Gomes
 * @version 1.0
 * @since 02/02/2024
 */
public class Comentarios {

    public static void main (String [] args){
    

    }

    /**
     * Este método é ultilizado para somar dois números inteiros
     * @param numeroUm este éo primeiro parametro do metodo
     * @param numeroDois este é o segundo parametro do metodo
     * @return int o resultado deste metodo é a soma dos dois numeros.
     */

    //public int somar (int numeroUm, int numeroDois){
     //   return numeroUm + numeroDois;
    

    public int somarMultiplicar (int soma, int mult, String multiplicacao){
        int resultado = 0; 
        if (multiplicacao == "M"){ // multiplicação
            resultado = mult * soma;
        }else{
            resultado = soma + mult; // soma

        }
        return resultado;

        
        


    }




    
}
