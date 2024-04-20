package org.example.Prekes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PrekiuKrepselis {
    private HashMap<String, Integer> prekiuKrepselis;

    public PrekiuKrepselis() {
        prekiuKrepselis = new HashMap<>();
    }

    public void idetiPrekeIKrepseli(String preke) {
        if (prekiuKrepselis.isEmpty()) {
            prekiuKrepselis.put(preke, 1);
        } else if (!prekiuKrepselis.containsKey(preke)) {
            prekiuKrepselis.put(preke, 1);
        } else {
            prekiuKrepselis.forEach(
                    (key, value) -> {
                        if (key.equals(preke))
                            prekiuKrepselis.put(key, value + 1);
                    }
            );
        }
    }

    // TODO Neveikia isemimas
    public void istrintiPreke(String preke) {
        if (prekiuKrepselis.isEmpty()) {
            System.out.println("Prekiu krepselis tuscias!");
        } else if (!prekiuKrepselis.containsKey(preke)) {
            System.out.println("Tokios prekes nera!");
        } else {
            prekiuKrepselis.forEach(
                    (key, value) -> {
                        if (key.equals(preke) && !value.equals(1)) {
                            prekiuKrepselis.put(key, value - 1);
                        } else {
                            prekiuKrepselis.remove(key);
                        }
                    }
            );

        }
    }

    public HashMap<String, Integer> getPrekiuKrepselis() {
        return prekiuKrepselis;
    }

    public void atspauzdintiPrekiuKrepseli() {

        if (prekiuKrepselis.isEmpty()) {
            System.out.println("Prekiu krepselis tuscias!");
        } else {
            System.out.println("\n Jusu prekes:");
            prekiuKrepselis.forEach((key, value)
                    -> System.out.println("Preke: " + key + " Kiekis: " + value));
        }
        System.out.println();
    }
}
