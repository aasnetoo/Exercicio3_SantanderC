import java.util.Scanner;

public class Questao2_VotoTernario {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma idade: ");
        int idade = scan.nextInt();
        if (idade >= 16){
            System.out.println((idade<=18 || idade>=70) ? "Voto facultativo" : "Voto obrigatório") ;
        }
        else{
            System.out.println("Não pode votar.");
        }
    }
}
