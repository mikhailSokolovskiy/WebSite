package ru.sokolovskiy.website.teachdolbaeba;

import org.springframework.boot.ExitCodeEvent;

import java.util.Scanner;

public class sex {

    public static void main(String[] args) {

        System.out.println("Введите имя кто хочет секс");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        /////пустой метод который делает логику внутри себя и съеюывает (void)
        wantSex(text);
        /////
        text = sc.nextLine();



        ////метод возвращающий какойто тип данных (String, int, short, bool, float, double, byte)
        System.out.println(sexType(chooseAnswer(text)));
        /////
    }

    private static boolean chooseAnswer(String text) {
        if ("да".equals(text)) {
            return true;
        }
        return false;
    }

    private static String sexType(boolean mbsex) {
        String text;
        if (mbsex) {
            text = "anal?";
        } else {
            text = "dolbaeba?";
        }

        return text;
    }


    private static void wantSex(String name) {


        switch (name) {
            case "Nikita":
                System.out.println("go sex?");
                break;
            case "Anton":
                System.out.println("ebatsya hochesh?");
                break;
            case "Misha":
                System.out.println("gou trah?");
                break;
            default:
                System.out.println("nikto ne hochet sexa");
                System.exit(0);
                break;
        }

    }


}
