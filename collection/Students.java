package collection;

import java.text.DecimalFormat;
import java.util.Objects;

public class Students {
    int number;
    String name;
    int age;
    double mark;
    boolean olimp;
    DecimalFormat df = new DecimalFormat ("#.##");

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public boolean isOlimp() {
        return olimp;
    }

    public void setOlimp(boolean olimp) {
        this.olimp = olimp;
    }

    @Override
    public String toString() {
        return "Students{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + df.format(mark) +
                ", olimp=" + olimp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return Objects.equals(name, students.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
