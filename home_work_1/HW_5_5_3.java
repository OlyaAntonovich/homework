package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;
import java.util.Scanner;

public class HW_5_5_3 implements ICommunicationPrinter {


    @Override
    public String welcom(String name) {

        String fraz = null;
        switch (name) {
            case "Вася":
                fraz ="Привет! Я так долго тебя ждал";
                break;
            case "вася":
                fraz ="Привет! Я так долго тебя ждал";
                break;

            case "Анастасия":
                fraz ="Я так долго тебя ждал";
                break;
            case "анастасия":
                fraz ="Я так долго тебя ждал";
                break;
            default:
                fraz ="Добрый день, а вы кто?";
        }
        return fraz;
    }
}
