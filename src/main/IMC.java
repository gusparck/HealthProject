package main;

public class IMC {
    public static double calcularIMC(double peso, double altura){
       double resultado =  peso / (altura * altura);
       return resultado;
    }
}
