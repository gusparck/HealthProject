import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        Scanner ler = new Scanner (System.in);
        System.out.println("Digite os seus dados:");

        System.out.println("Qual o seu sexo?");
        String sexo = ler.nextLine();

        System.out.println("Qual é a sua altura?");
        double altura = ler.nextDouble();

        System.out.println("Qual é o seu peso?");
        double peso = ler.nextDouble();

        System.out.println("Qual a sua idade?");
        int idade = ler.nextInt();

        ler.nextLine();

        System.out.println("Qual é a sua taxa de atividade física?");
        taxadeAtv taxa = new taxadeAtv(ler.nextLine());
        
        IMC.calcularIMC(peso, altura);

        if(sexo.equalsIgnoreCase("Masculino")){ //Lembrar de tratar os casos de "F, M, Homem e Mulher"
           aumentodeMassaMasc.calcularMacros(peso, altura, idade, taxa);
        } else if(sexo.equalsIgnoreCase("Feminino")){
           aumentodeMassaFem.calcularMacros(peso, altura, idade, taxa);
        }

        ler.close();
    }
}
