package org.example.UI;

import org.example.Prekes.PrekiuKrepselis;
import org.example.Prekes.PrekiuLentyna;

import java.util.Scanner;

public class MainUI {
    private boolean aktyvus = true;
    private String pasirinkimas;
    private String pavadinimas;
    private Scanner scanner = new Scanner(System.in);
    private PrekiuKrepselis prekiuKrepselis = new PrekiuKrepselis();

    public MainUI() {
       PrekiuLentyna.getPrekiuLentyna().add("bananas");
       PrekiuLentyna.getPrekiuLentyna().add("obuolys");
       PrekiuLentyna.getPrekiuLentyna().add("kriause");
    }

    public void run() {

        aktyvus = true;
        while (aktyvus) {

            System.out.println("1: Perziureti krepseli");
            System.out.println("2: Ideti i krepseli");
            System.out.println("3: Isimti is krepselio");
            System.out.println("4: Iseiti");

            pasirinkimas = scanner.nextLine();
            switch (pasirinkimas) {
                case "1":
                    prekiuKrepselis.atspauzdintiPrekiuKrepseli();
                    aktyvus = true;
                    break;
                case "2":
                    System.out.println(PrekiuLentyna.getPrekiuLentyna());
                    System.out.println("Iveskite prekes pavadinima: ");
                    pavadinimas = scanner.nextLine().toLowerCase();

                    if (PrekiuLentyna.getPrekiuLentyna().contains(pavadinimas)){
                        prekiuKrepselis.idetiPrekeIKrepseli(pavadinimas);
                    } else {
                        System.out.println("Tokios prekes nera!");
                    }

                    aktyvus = true;
                    break;

                case "3":
                    prekiuKrepselis.atspauzdintiPrekiuKrepseli();
                    if (!prekiuKrepselis.getPrekiuKrepselis().isEmpty()) {
                        System.out.println("Iveskite prekes pavadinima: ");
                        pavadinimas = scanner.nextLine().toLowerCase();
                        prekiuKrepselis.istrintiPreke(pavadinimas);
                    }
                    aktyvus = true;
                    break;
                case "4":
                    aktyvus = false;
                    break;

                default:
                    System.out.println("Netinkamas pasirinkimas");
            }
        }
    }
}
