package org.example.Prekes;

import java.util.ArrayList;
import java.util.HashMap;

public class PrekiuLentyna {
    private static ArrayList<String> prekiuLentyna = new ArrayList<>();

    public PrekiuLentyna(String pavadinimas) {
        prekiuLentyna.add(pavadinimas);
    }

    public static ArrayList<String> getPrekiuLentyna() {
        return prekiuLentyna;
    }
}
