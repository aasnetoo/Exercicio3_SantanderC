import java.util.Scanner;

public class Questao4_OpcoesIF {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escolha as opções de 1 a 6: \n 1 - Coca-Cola - R$ 5 \n 2 - Coca-Cola 0 - R$ 4.50 \n 3 - Pepsi - R$ 4,40 \n 4 - Guaraná Antarctica - R$ 3,50 \n 5 - Fanta Laranja - R$ 4,23 \n 6 - Água - R$ 2,50 \n");
        int option = scan.nextInt();
        if (option == Constants.COCA_COLA){
            Utils.showResult("Coca-Cola", Constants.VALUE_COCA_COLA);
        }
        else if (option == Constants.COCA_COLA_0){
            Utils.showResult("Coca-Cola 0", Constants.VALUE_COCA_COLA_0);
        }
        else if (option == Constants.PEPSI){
            Utils.showResult("Pepsi", Constants.VALUE_PEPSI);
        }
        else if (option == Constants.GUARANA_ANTARCTICA){
            Utils.showResult("Guaraná Antarctica", Constants.VALUE_GUARANA_ANTARCTICA);
        }
        else if (option == Constants.FANTA_LARANJA){
            Utils.showResult("Fanta Laranja", Constants.VALUE_FANTA_LARANJA);
        }
        else if (option == Constants.AGUA){
            Utils.showResult("Água", Constants.VALUE_AGUA);
        }
        else{
            System.out.println("Essa opção não existe, digite uma opção válida.");
        }
    }
}
