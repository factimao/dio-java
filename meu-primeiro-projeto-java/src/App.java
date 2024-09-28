public class App {
    public static void main(String[] args) {

        String cep = "12";

        try {
            formatarCep(cep);
        } catch (CepInvalidoException e) {
            // TODO fazer alguma coisa
            e.printStackTrace();
            System.err.println("ERRO ERRO ERRO");
        }



    }

    static String formatarCep(String cep) throws CepInvalidoException{
        if (cep.length() < 8){
            throw new CepInvalidoException();
        };
        return "12345678";
        
    }


}
