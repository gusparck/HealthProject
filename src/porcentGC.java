/*public class porcentGC {
    public static void calcular(double peso, double altura, int idade, String sexo) {
        // Verificar entradas inválidas
        if (peso <= 0 || altura <= 0 || idade <= 0) {
            System.out.println("Erro: Valores inválidos. Verifique o peso, altura e idade.");
            return;
        }

        // Determinar o fator 's' com base no sexo
        double s = 0;
        if (sexo.equalsIgnoreCase("Masculino") || sexo.equalsIgnoreCase("Homem") || sexo.equalsIgnoreCase("M")) {
            s = 1; // Homem
        } else if (sexo.equalsIgnoreCase("Feminino") || sexo.equalsIgnoreCase("Mulher") || sexo.equalsIgnoreCase("F")) {
            s = 0; // Mulher
        } else {
            System.out.println("Erro: Sexo inválido. Tente 'Masculino' ou 'Feminino'.");
            return;
        }

        System.out.printf("Altura: %.2f", altura);

        // Calcular o IMC
        double imcGC = peso / (altura * altura);
        System.out.printf("IMC Calculado: %.2f\n", imcGC);

        // Calcular a porcentagem de gordura corporal
        double PGC = (1.20 * imcGC) + (0.23 * idade) - (10.8 * s) - 5.4;
        System.out.printf("Intermediários: (1.20 * IMC) = %.2f, (0.23 * Idade) = %.2f, (10.8 * s) = %.2f\n",
                (1.20 * imcGC), (0.23 * idade), (10.8 * s));

        // Exibir o resultado ou informar erro
        if (PGC < 0) {
            System.out.println("Erro: O cálculo retornou um valor negativo. Verifique os dados de entrada.");
        } else {
            System.out.printf("A sua porcentagem de gordura corporal é de %.2f%%.\n", PGC);
        }
    }
}
*/