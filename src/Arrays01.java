public class Arrays01 {
    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = 20 + i;
        }

        System.out.println("--- Lista de Idades ---");

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Na gaveta " + i + " temos a idade: " + idades[i]);
        }
    }
}