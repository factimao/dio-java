public class Operadores {
    
    public static void main (String[] args) {

        int numero = 0;
        String nome;
        boolean logical;

        try {
            numero = Integer.valueOf(args [0]);
            System.out.println("Numero: ");
            System.out.println(numero);
        }
            catch (Exception e){
            System.out.println("Impossível converter 'numero'!");
        }

        nome = args[1];
        System.out.println("Nome: ");
        System.out.println(nome);

        if (args[2].equals("true") || args[2].equals("false") ){
            logical = Boolean.valueOf(args[2]);
            System.out.println("Logico: ");
            System.out.println(logical);            
        }else{
            System.out.println("Impossível converter 'logical'!");
        }
        
        






    }



    }
