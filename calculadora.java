import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o valor do Alcool");
        double precoAlcool = input.nextDouble();

        System.out.println("Informe o valor do Gasolina");
        double precoGasolina = input.nextDouble();

        double verificador = precoAlcool / precoGasolina;

        if (verificador < 0.70){
            System.out.println("Vale mais a pena usar Álcool!");
        } else
            System.out.println("Vale mais a pena usar Gasolina!");

    }
}
