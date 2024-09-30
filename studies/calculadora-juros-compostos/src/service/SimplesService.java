package service;

import entities.Juros;

public class SimplesService {

    public static double calculoJurosSimples(Juros juros) {
       double montante =  juros.getCapital() + (juros.getCapital() * juros.getTaxa() / 100 * juros.getTempo() / 12);

       juros.setMontante(montante);
       return montante;
    }
}
