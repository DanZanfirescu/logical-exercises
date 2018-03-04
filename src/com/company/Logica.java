package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Logica {

    //Problema1
    public String comparaDouaNumereDate(double primulNumar, double alDoileaNumar) {
        if (primulNumar > alDoileaNumar) {
            return String.valueOf(primulNumar);
        } else if (primulNumar < alDoileaNumar) {
            return String.valueOf(alDoileaNumar);
        } else {
            return "Numerele sunt egale";
        }
    }


    //Problema2
    public String comparaTextDat(String inputText) {
        if (inputText.equals("FastTrack")) {
            return "Learning text comparison.";
        } else {
            return "Got to try some more.";
        }
    }


    //Problema3
    public String comparaUnNumarDat(double numar) {
        if (numar >= 2 && numar <= 8) {
            return String.valueOf(numar);
        } else {
            return "Nu se aplica";
        }
    }


    //Problema4
    public String comparaUnNumarSiUnText(String inputText2, double number) {
        if (inputText2.equals("FastTrack") && number <= 3) {
            return inputText2 + "   " + number;
        } else if (!inputText2.equals("FastTrack") && number >= 4) {
            return number + "   " + inputText2;
        } else
            return "Nu se aplica.";
    }


    //Problema5
    public String comparaUnNumarAfiseazaUnText(double numar5) {
        if (numar5 > 8 || numar5 == 6) {
            return "The amount of snow this winter was " + numar5 + " cm.";
        } else
            return "The forecast snow is " + numar5 + " cm.";
    }


    //Problema6
    public String userNumberShowPredefinedText(double numar6) {
        if (numar6 > 3 && numar6 != 4) {
            return "The number is greater than 3 and not equal to 4.";
        } else if (numar6 == 4) {
            return "The number is equal to 4.";
        } else {
            return "The number is lower than 3.";
        }
    }

    //Problema7
    public String userNumberShowNumber(int numar7) {
        switch (numar7) {
            case 0:
                return "Numarul este: " + numar7;
            case 1:
                return "Numarul este: " + numar7;
            case 2:
                return "Numarul este: " + numar7;
            case 3:
                return "Numarul este: " + numar7;
            case 4:
                return "Numarul este: " + numar7;
            case 5:
                return "Numarul este: " + numar7;
            case 6:
                return "Numarul este: " + numar7;
            case 7:
                return "Numarul este: " + numar7;
            case 8:
                return "Numarul este: " + numar7;
            case 9:
                return "Numarul este: " + numar7;
            default:
                return "Not Allowed.";
        }
    }


    //Problema8
    public String evenOrOddNumber(int numar8) {
        if (numar8 % 2 == 0) {
            return numar8 + " is even.";
        } else {
            return numar8 + " is odd.";
        }
    }


    //Problema9
    public String voteEligible(double ageInput) {
        if (ageInput >= 18) {
            return "You are eligible to vote.";
        } else if (ageInput < 18 && ageInput >= 0) {
            return "You are not eligibile to vote.";
        } else {
            return "Not alowed input.";
        }
    }

    public ArrayList<String> asd() {
        ArrayList<String> test1 = new ArrayList<>();
        test1.add("andrei");
        test1.add("mihaiu");
        test1.add("ionelt");
        test1.add("gicure");
        test1.add("mariaw");
        System.out.println(test1);
        for (int i = 0; i < test1.size() - 1; i++) {
            for (int j = i + 1; j < test1.size(); j++) {
                int m = 0;
                if (test1.get(i).charAt(m) > test1.get(j).charAt(m)) {
                    String temporary = test1.get(i);
                    test1.set(i, test1.get(j));
                    test1.set(j, temporary);
                }
            }
            System.out.println(test1);
        }return test1;
    }

    public void qwe() {
        asd();
        for (int i = 0; i < asd().size() - 1; i++) {
            for (int j = i + 1; j < asd().size(); j++) {
                int m = 1;
                if (asd().get(i).charAt(0) == asd().get(j).charAt(0) && asd().get(i).charAt(m) > asd().get(j).charAt(m)) {
                    String temporary = asd().get(i);
                    asd().set(i, asd().get(j));
                    asd().set(j, temporary);
                }
            }System.out.println(asd());
        }
    }
}