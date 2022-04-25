package home_work_4;

import java.util.Objects;

public class DataID {

     int id;
     String name;

    public DataID(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private int getId() {
        return id;
     }

    private String getName() {
       return name;
   }

    @Override
    public String toString() {
        return "DataID{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataID dataID = (DataID) o;
        return id == dataID.id && Objects.equals(name, dataID.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
