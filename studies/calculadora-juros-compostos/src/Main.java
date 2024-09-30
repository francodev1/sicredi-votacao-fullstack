import entities.Juros;
import service.CompostoService;
import service.SimplesService;
import service.TaxaJurosService;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        while (continuar) {
            System.out.println("Escolha seu tipo de cálculo:");
            System.out.println("1 - Juros Simples");
            System.out.println("2 - Juros Compostos");
            System.out.println("3 - Calculo de taxas de juros");

            int escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor do Capital:");
                    double capitalSimples = sc.nextDouble();
                    System.out.println("Digite o valor da taxa de juros (%):");
                    double taxaSimples = sc.nextDouble();
                    System.out.println("Digite o tempo (ano):");
                    int tempoSimples = sc.nextInt();

                    Juros jurosSimples = new Juros(capitalSimples, taxaSimples, tempoSimples);
                    double montanteSimples = SimplesService.calculoJurosSimples(jurosSimples);
                    System.out.printf("Montante: %.2f%n", montanteSimples);
                    break;

                case 2:
                    System.out.println("Digite o capital:");
                    double capitalComposto = sc.nextDouble();
                    System.out.println("Digite a taxa de juros (%):");
                    double taxaComposta = sc.nextDouble();
                    System.out.println("Digite o tempo (ano):");
                    int tempoComposto = sc.nextInt();

                    Juros jurosCompostos = new Juros(capitalComposto, taxaComposta, tempoComposto);
                    double montanteComposto = CompostoService.calculoJurosComposto(jurosCompostos);
                    System.out.printf("Montante: %.2f%n", montanteComposto);
                    break;

                case 3:
                    System.out.println("Digite o montante final:");
                    double montanteTaxa = sc.nextDouble();
                    System.out.println("Digite o capital inicial:");
                    double capitalTaxa = sc.nextDouble();
                    System.out.println("Digite o tempo (ano):");
                    int tempoTaxa = sc.nextInt();

                    Juros jurosTaxa = new Juros(montanteTaxa, capitalTaxa, tempoTaxa);
                    double taxaJuros = TaxaJurosService.calculoTaxaJuros(jurosTaxa);
                    System.out.printf("Taxa de juros: %.2f%n", taxaJuros);
                    break;

                default:
                    System.out.println("Opção inválida");
                    break;
            }

            System.out.println("Deseja realizar outro cálculo? (s/n)");
            char resposta = sc.next().charAt(0);
            continuar = (resposta == 's');
        }

        System.out.println("Fim do programa, Desenvolvido por Lucas Franco");
        sc.close();
    }
}
