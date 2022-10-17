public class Human {

    String name;
    String town;
    int yearOfBirth;
    String position;

    Human (String name, String town, int yearOfBirth, String position) {
        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.position = position;

        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town +
                ". Я родился в " +  (2022 - yearOfBirth) + " году. Я работаю на должности " + position + ". Будем знакомы!");
    }
}