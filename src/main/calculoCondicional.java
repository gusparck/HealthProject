package main;

public class calculoCondicional {
    public static void calcular(String sexo, double peso, double altura, int idade, taxadeAtv taxa){

        if(sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Homem")){ 
        aumentodeMassaMasc.calcularMacros(peso, altura, idade, taxa);
        } 
        
        else if(sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Mulher")){
        aumentodeMassaFem.calcularMacros(peso, altura, idade, taxa);
        }

        else{
        System.out.println("Entrada inválida. Por favor tente digitar 'Masculino' ou 'Feminino'.");
        }

    }
}
