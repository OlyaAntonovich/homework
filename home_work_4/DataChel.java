package home_work_4;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.Objects;

public class DataChel implements Comparable <DataChel>, Iterable<DataChel> {

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



    public int compareTo(DataChel o) {
        return name.compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "DataChel{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataChel dataChel = (DataChel) o;
        return age == dataChel.age && Objects.equals(name, dataChel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @NotNull
    @Override
    public Iterator<DataChel> iterator() {
        return null;
    }
}


