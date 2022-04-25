package home_work_4;

import java.util.Objects;

public class DataChel {

    int age;
    String name;

    public DataChel(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "DataChel{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


