public class taxadeAtv{

    private final String frequency;

    public taxadeAtv(String frequency){
        this.frequency = frequency;
    }

    public String gettaxadeAtv(){
        return frequency;
    }

    public double getfreqdeAtv(){ // valor padrão
        switch (frequency) { // existe um problema nesse método que precisa ser corrigido (Reavaliar a Main)
            case "Sedentário":
                return 1.2;
               
            case "Leve":
                return 1.375;
                
            case "Moderado":
                return 1.55;
                
            case "Ativo":
                return 1.725;
                
            case "Muito ativo":
                return 1.9;
                
            default:
                System.out.println("Taxa de atividade física não reconhecida; será utilizado o valor padrão de 1,55, considerando atividade moderada.");
                return 1.55;
                
        }
    }
}