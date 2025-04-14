package Controller;


public class SomaDoisNumeros {
    public static void main(String[] args) {
        
        int[] l1 = {2, 4, 6};
        int[] l2 = {4, 7, 8};
        
        int[] resultado = new int[l1.length];

        for (int i = 0; i < l1.length; i++) {
            resultado[i] = l1[i] + l2[i];
        }

        System.out.print("Resultado da soma: ");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}
