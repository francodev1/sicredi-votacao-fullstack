package service;

import entities.Juros;

public class TaxaJurosService {
    public static double calculoTaxaJuros(Juros juros) {
        System.out.println("Montante: " + juros.getMontante());
        System.out.println("Capital: " + juros.getCapital());
        System.out.println("Tempo: " + juros.getTempo());

        double taxa = (Math.pow((juros.getMontante() / juros.getCapital()), 1.0 / juros.getTempo()) - 1) * 100;
        juros.setTaxa(taxa);

        System.out.println("Taxa calculada: " + taxa);
        return taxa;
    }

}
