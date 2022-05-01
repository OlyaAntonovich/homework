package home_work_1;


import home_work_1.api.ICommunicationPrinter;

import java.util.Objects;

public class HW_5_5_1 implements ICommunicationPrinter {


        @Override
    public String welcom(String name) {

        String fraz = null;

        if (name.equalsIgnoreCase("вася")){
            fraz = "Привет! Я так долго тебя ждал";
            return fraz;

        }
        if (name.equalsIgnoreCase("анастасия")){
            fraz ="Я так долго тебя ждал";

        } else {
            fraz = "Добрый день, а вы кто?";
        }

        return fraz;

    }


}
