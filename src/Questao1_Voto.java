import java.util.Scanner;

public class Questao1_Voto {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = scan.nextInt();
        if(!Utils.podeVotar(idade)){
            System.out.println("Sem direito a votar.");
        }
        else{
            if(Utils.votoFacultativo(idade)){
                System.out.println("Voto facultativo");
            }
            else{
                System.out.println("Voto obrigatório");
            }
        }

    }
}

