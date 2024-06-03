public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("23768646");
            System.out.println(cepFormatado);

        } catch (CepInvalidoException e) {
           System.out.println("o cep nao corresponde as regras de negocios");
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() != 8 )
        throw new CepInvalidoException();

        return "23.765-864";
    }
}
