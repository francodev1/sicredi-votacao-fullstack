package service;

import entities.Juros;

public class CompostoService {
    public static double calculoJurosComposto(Juros juros){
        double montante = juros.getCapital() * Math.pow((1 + juros.getTaxa() / 100), juros.getTempo() / 12);
        juros.setMontante(montante);
        return montante;
    }
}
