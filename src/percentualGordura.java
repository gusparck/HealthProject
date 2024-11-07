public  class percentualGordura {

    public static void calcular(double peso, double gordura){
        if(peso <= 0 || gordura <= 0){
            System.out.println("Valores negativos são inválidos. Tente novamente.");
            return;
        }
        System.out.printf("Seu percentual de gordura é: %.2f%%.%n", (gordura / peso * 100));
    }
}
