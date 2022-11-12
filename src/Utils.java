public class Utils {

    // Utils Questão 1

    public static boolean podeVotar(int idade){
        return idade>=16;
    }
    public static boolean votoFacultativo(int idade){

        if (idade>=16 && idade<=18){
            return true;
        }
        else if(idade>=70){
            return true;
        }
        else{
            return false;
        }
    }

    // Utils Questão 3 e 4


    public static void showResult(String nome, double valor) {
        System.out.println("Você escolheu " + nome + " com o preço de: R$ " + valor);
    }
}
