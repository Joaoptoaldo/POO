package AtividadesAula01;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        double odometroInicial, odometroFim, litrosGastos, valorRecebido, Distancia, Media, CustoTotal, Lucro;
        final double PRECO_LITRO = 4.90;

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o odômetro inicial:");
        odometroInicial = leitor.nextDouble();

        System.out.println("Digite o odômetro final:");
        odometroFim = leitor.nextDouble();

        System.out.println("Digite a quantidade de litros gastos:");
        litrosGastos = leitor.nextDouble();

        System.out.println("Digite o valor recebido:");
        valorRecebido = leitor.nextDouble();

        Distancia = odometroFim - odometroInicial;
        Media = Distancia / litrosGastos;
        CustoTotal = litrosGastos * PRECO_LITRO;
        Lucro = valorRecebido - (litrosGastos * PRECO_LITRO);

        System.out.println("Distância percorrida: " + Distancia);
        System.out.println("Média de consumo: " + Media);
        System.out.println("Custo total: " + CustoTotal);
        System.out.println("Lucro: " + Lucro);

        leitor.close(); 
    }
}
