public class IMC {
    public static double calcularIMC(double peso, double altura){
       double resultado =  peso / (altura * altura);
       System.out.printf("Seu IMC é: %.2f\n", resultado);
       return resultado;
    }
}
