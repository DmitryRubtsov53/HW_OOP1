import java.time.LocalDate;

public class Human {

    private String name;
    private String town;
    private int age;
    String position;



    Human (String name, String town, int age, String position) {
        if (name == null) { this.name = "Информация не указана";
        } else this.name = name;
        if (town == null) { this.town = "Информация не указана";
        } else this.town = town;
        if (position == null) { this.position = "Информация не указана";
        } else this.position = position;
        if (age < 0) { this.age = LocalDate.now().getYear();
        } else this.age = age;
    }

    public String getName() { return name; }
    public String getPosition() { return position;  }
    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isBlank() || town.isEmpty()) {
            this.town = "Информация не указана";
        } else this.town = town;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) { this.age = LocalDate.now().getYear();
        } else this.age = age;
    }
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " +
                (LocalDate.now().getYear() - age) + " году. Я работаю на должности " + position + ". Будем знакомы!";
    }
}