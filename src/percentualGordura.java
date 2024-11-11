public  class percentualGordura {

    public static void calcular(double peso, double idade, double altura, String sexo){
        int s;
        double resultado;
        double useIMC = IMC.calcularIMC(peso, altura);

        if(peso <= 0 || altura <= 0 || idade <= 0){
            System.out.println("Valores negativos são inválidos. Tente novamente.");
        } else{
            if(sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("Homem")){
                s = 1;
                resultado = ((1.20 * useIMC) + (0.23 * idade)-(10.8 * s) - 5.4);
                System.out.printf("Seu percentual de gordura é: %.2f%%.%n", resultado);
            } else if(sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("Mulher")){
                s = 0;
                resultado = ((1.20 * useIMC) + (0.23 * idade)-(10.8 * s) - 5.4);
                System.out.printf("Seu percentual de gordura é: %.2f%%.%n", resultado);
            } else{
                System.out.println("Tente digitar 'Masculino' ou 'Feminino' nas suas informações.");
            }
    }
}
}
