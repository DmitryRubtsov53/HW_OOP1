public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1 урока ООП 1 **********************************************************");
        System.out.println();

        System.out.println("Задание 1 и 2." + "\n");
        {
            Human human1 = new Human("Максим", "Минск", 35, "бренд-менеджер");
            Human human2 = new Human("Аня", "Москва", 29, "методист образовательных программ");
            Human human3 = new Human("Катя", "Калининград", 28, "продакт-менеджер");
            Human human4 = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");
        }

        System.out.println();
        System.out.println("Задание 3." + "\n");
        {
            Car car1 = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7);
            Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
            Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
            Car car4 = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 2.4);
            Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
        }

    }
}