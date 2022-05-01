package home_work_1;

import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;
import java.util.Scanner;

public class HW_5_5_2 implements ICommunicationPrinter {


    @Override
    public String welcom(String name) {
        String fraz = null;

        if (name.equalsIgnoreCase("вася")){
            fraz = "Привет! Я так долго тебя ждал";
        }
        else if (name.equalsIgnoreCase("анастасия")){
            fraz ="Я так долго тебя ждал";}

        else {
            fraz = "Добрый день, а вы кто?";
        }

        return fraz;
    }
}
