import java.util.Scanner;

public class Calculadora_Financeira {

    private static double calcularValorFuturo(double pv, double i, int n) {
        return pv * Math.pow(1 + i, n);
    }

    private static double calcularValorPresente(double vf, double i, int n) {
        return vf / Math.pow(1 + i, n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Imprimir valores para o calculo de Valor Futuro e Valor Presente:");
        System.out.println("______________________________________________________________________");

        // Código referente ao cálculo do Valor presente
        System.out.print("\nDigite o valor futuro que almeja: R$:");
        double vfDesejado = scanner.nextDouble();
        System.out.print("\nDigite a taxa de juros anual (em %):");
        double i = scanner.nextDouble() / 100;
        System.out.print("\nDigite a quantidade de anos que deseja calcular:");
        int n = scanner.nextInt();
        double pvDesejado = calcularValorPresente(vfDesejado, i, n);
        System.out.printf("\nPara obter R$%.2f apos %d anos, voce precisa depositar: R$%.2f\n",
                vfDesejado, n, pvDesejado);
        System.out.println("______________________________________________________________________");
        
        // Código referente ao cálculo do Valor Futuro
        System.out.print("\nDigite o valor presente referente ao deposito inicial: R$:");
        double pv = scanner.nextDouble();
        System.out.print("\nDigite a taxa de juros anual(em %):");
        i = scanner.nextDouble() / 100;
        System.out.print("\nDigite a quantidade de anos que deseja calcular:");
        n = scanner.nextInt();
        double vf = calcularValorFuturo(pv, i, n);
        System.out.printf("\nO valor futuro apos %d anos sera: R$%.2f\n", n, vf);
        System.out.println("______________________________________________________________________");
        
        System.out.printf("\n");
        scanner.close();
    }
}

