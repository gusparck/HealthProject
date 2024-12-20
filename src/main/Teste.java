package main;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args){
        taxadeAtv taxa = null;
        int ans;
        int tx;

        Scanner ler = new Scanner (System.in);
        System.out.println("Digite os seus dados:");

        System.out.println("Qual o seu sexo?");
        String sexo = ler.nextLine();

        System.out.println("Qual é a sua altura(m)?");
        double altura = ler.nextDouble();

        System.out.println("Qual é o seu peso(kg)?");
        double peso = ler.nextDouble();

        System.out.println("Qual a sua idade?");
        int idade = ler.nextInt();

        ler.nextLine(); //solução provisória(?) para o problema com o scanner

        do{
            System.out.println("Qual é a sua taxa de atividade física?\n1-Sedentário\n2-Leve\n3-Moderado\n4-Ativo\n5-Muito ativo\n");
            tx = ler.nextInt();

            switch(tx){
                case 1:
                taxa = new taxadeAtv("Sedentário");
                break;

                case 2:
                taxa = new taxadeAtv("Leve");
                break;
                case 3:

                taxa = new taxadeAtv("Moderado");
                break;
                
                case 4:
                taxa = new taxadeAtv("Ativo");
                break;

                case 5:
                taxa = new taxadeAtv("Muito ativo");
                break;

                default:
                System.out.println("Opção inválida.");
                break;
                }
            } while(tx != 1 && tx!=2 && tx!=3 && tx!=4 && tx!=5);

        do { 
            System.out.println("Escolha qual operação deseja realizar com os dados obtidos:");
            System.out.println("1 - Calcular seu main.IMC (Índice de Massa Corporal)");
            System.out.println("2 - Calcular seus macros para aumento de massa muscular.");
            System.out.println("3 - Porcentagem de gordura corporal.");
            System.out.println("0 - Sair");
        
            ans = ler.nextInt();
        
            switch(ans) {
                case 1:
                    double resultado = IMC.calcularIMC(peso, altura);
                    System.out.printf("Seu IMC é: %.2f\n", resultado);
                    break;
        
                case 2:
                    calculoCondicional.calcular(sexo, peso, altura, idade, taxa);
                    break;
                
                case 3:
                    //System.out.println("Informe sua quantidade de gordura(kg): ");
                    //double gordura = ler.nextDouble();
                    percentualGordura.calcular(peso, idade, altura, sexo);
                    break;
                
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
        
                default:
                    System.out.println("Opção inválida. Tente selecionar outra opção.");
                    break;
            }

        } while(ans != 0); 
    
        ler.close();
    }
} 