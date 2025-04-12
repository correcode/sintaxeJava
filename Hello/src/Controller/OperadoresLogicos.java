package Controller;

public class OperadoresLogicos {
    public static void main(String[] args) {
        //operadores logicos && (E) || (OU)
    
        //operador && verifica se as duas condicoes sao true

        //operador || verifica se uma das condicoes sao verdadeiras

        Boolean condicaoUm = true;
        Boolean condicaoDois = false;

        if (condicaoUm && condicaoDois) {
            System.out.println("As duas condicoes sao verdadeiras\n");
        }

        if (condicaoUm || condicaoDois) {
            System.out.println("Apenas uma das condicoes e verdadeira\n");
        }
    }
}
