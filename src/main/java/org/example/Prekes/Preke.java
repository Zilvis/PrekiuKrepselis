package org.example.Prekes;

import java.util.HashMap;
import java.util.Random;

public class Preke {
    private String pavadinimas;
    private double kaina;
    private double svoris;

    public Preke(String pavadinimas) {
        this.pavadinimas = pavadinimas;
        kaina = new Random().nextDouble(1, 10);
        svoris = new Random().nextDouble(0.1, 5);
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public double getKaina() {
        return kaina;
    }

    public double getSvoris() {
        return svoris;
    }

    @Override
    public String toString() {
        return "Preke{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", kaina=" + kaina +
                ", svoris=" + svoris +
                '}';
    }
}
