public class Human {

    String name;
    String town;
    int yearOfBirth;
    String position;

    Human (String name, String town, int yearOfBirth, String position) {
        if (name == null) { this.name = "Информация не указана";
        } else this.name = name;
        if (town == null) { this.town = "Информация не указана";
        } else this.town = town;
        if (position == null) { this.position = "Информация не указана";
        } else this.position = position;
        if (yearOfBirth <= 0) { this.yearOfBirth = 2022;
        } else this.yearOfBirth = yearOfBirth;
    }
    void printHumans () {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " + (2022 - yearOfBirth) + " году. Я работаю на должности " + position + ". Будем знакомы!");
    }
}