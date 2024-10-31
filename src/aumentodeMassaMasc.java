public class aumentodeMassaMasc {
    public static void calcularMacros(double peso, double altura, int idade){
        double TMB = 88.36 + (13.4 * peso) + (4.8 * (altura * 100)) - (5.7 * idade);
        System.out.printf("Sua taxa de metabolismo basal é de aproximadamente %.2f calorias.\n", TMB);
        double TDEE = TMB * 1.55; // Gasto Calórico Total Diário (TDEE) usado foi o de alguém moderadamente ativo, melhorar isso depois
        double ganhodeMassa = TDEE + 350;
        System.out.printf("Considerando que seu gasto calórico é aproximadamente %.2f e adicionando 350 calorias para gerar o superavit calorico, o número de calorias para o ganho de massa é de %.2f, aproximadamente.\n", TDEE, ganhodeMassa);
        double carbs = 0.5 * ganhodeMassa;
        double prots = 0.25 * ganhodeMassa;
        double gord= 0.25 * ganhodeMassa;

        System.out.printf("Além disso a proporção adequada dos outros macros é em média de:\nCarboidratos: %.2f\nProteínas: %.2f\nGorduras: %.2f\n", carbs, prots, gord);
    }
}
