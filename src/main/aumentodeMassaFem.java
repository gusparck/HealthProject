package main;

public class aumentodeMassaFem {
    
    public static void calcularMacros(double peso, double altura, int idade, taxadeAtv taxa){
        double TMB = 447.6 + (9.2 * peso) + (3.1 * (altura * 100)) - (4.3 * idade);
        System.out.printf("Sua taxa de metabolismo basal é de aproximadamente %.2f calorias.\n", TMB);
        
        double freqdeAtv = taxa.getfreqdeAtv();

        double TDEE = TMB * freqdeAtv; // Gasto Calórico Total Diário (TDEE)
        double ganhodeMassa = TDEE + 350;

        System.out.printf("Considerando que seu gasto calórico é aproximadamente %.2f e adicionando 350 calorias para gerar o superavit calorico, o número de calorias para o ganho de massa é de %.2f, aproximadamente.\n", TDEE, ganhodeMassa);
        
        double carbs = 5 * peso;
        double prots = 1.9* peso;
        double gord = 0.8 * peso;
        double agua = 0.035 * peso;

        System.out.printf("Além disso a proporção adequada dos outros macros é em média de:\nCarboidratos: %.2f\nProteínas: %.2f\nGorduras: %.2f\nÁgua(35ml/kg): %.2f\n", carbs, prots, gord, agua);
        
        System.out.println(""); // Tentativa de resolver o problema de buffer
    }
}
