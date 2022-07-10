import java.util.Scanner;

public class CalculadoraImc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Calcule seu IMC(Indicide de Massa Corporal)");

        System.out.println("Digite seu peso:");

        double peso = s.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = s.nextDouble();
        double alturaAoQuradado = (altura * altura);

        double imc = (peso / alturaAoQuradado);

        System.out.printf("Seu IMC: %.2f %n", imc);

        if (imc < 19) {
            System.out.println("Peso abaixo do normal.");
        } else if (imc >= 20 && imc < 25) {
            System.out.println("*****PESO ADEQUADO*****");
        } else if (imc >= 26 && imc < 30) {
            System.out.println("Voce esta com Sobrepeso.");
        } else if (imc >= 31 && imc < 40) {
            System.out.println("Voce esta com Obesidade do Tipo 1.");
        } else if (imc >=41) {
            System.out.println("Voce esta Obesx Morbidx.");
        }


    }
}

