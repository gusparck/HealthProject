package main;

public class aumentodeMassaMasc {

    public static void calcularMacros(double peso, double altura, int idade, taxadeAtv taxa){
        double TMB = 88.36 + (13.4 * peso) + (4.8 * (altura * 100)) - (5.7 * idade);
        System.out.printf("Sua taxa de metabolismo basal é de aproximadamente %.2f calorias.\n", TMB);

        double freqdeAtv = taxa.getfreqdeAtv();

        double TDEE = TMB * freqdeAtv; // Gasto Calórico Total Diário (TDEE)
        double ganhodeMassa = TDEE + 350;

        System.out.printf("Considerando que seu gasto calórico é aproximadamente %.2f e adicionando 350 calorias para gerar o superavit calorico, o número de calorias para o ganho de massa é de %.2f, aproximadamente.\n", TDEE, ganhodeMassa);
        
        double carbs = 5 * peso;
        double prots = 1.9* peso;
        double gord = 0.8 * peso;
        double agua = 0.035 * peso;

        System.out.printf("Além disso a proporção adequada dos outros macros é em média de:\nCarboidratos(5g/kg): %.2f gramas\nProteínas(1.9g/kg): %.2f gramas\nGorduras(0.7g/kg): %.2f gramas\nÁgua(35ml/kg): %.2f litros\n", carbs, prots, gord, agua);
        
        System.out.println(""); // Tentativa de resolver o problema de buffer
    }
}
