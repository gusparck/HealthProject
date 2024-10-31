public class IMC {
    public static void calcularIMC(double peso, double altura){
       double formula =  peso / (altura * altura);
       System.out.printf("Seu IMC é: %.2f\n", formula);
    }
}
