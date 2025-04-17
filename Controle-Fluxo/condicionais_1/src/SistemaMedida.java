public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.out.println("\nPequeno!");
                break;
            }
            case "M":{
                System.out.println("\nMedio!");
                break;
            }
            case "G":{
                System.out.println("\nGrande!");
                break;
            }
            default: 
            System.out.println("\nIndefinido1");
            
        } 
    }
}
