import java.time.LocalDate;
import java.util.Scanner;

import static java.lang.Integer.MAX_VALUE;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1 урока ООП 2 **********************************************************");
        System.out.println();

        System.out.println("Список людей:" + "\n");
        {
            Human [] human = new Human[6];

            human[0] = new Human("Максим", "Минск", 35, "бренд-менеджер");
            human[1] = new Human("Аня", "Москва", 29, "методист образовательных программ");
            human[2] = new Human("Катя", "Калининград", 28, "продакт-менеджер");
            human[3] = new Human("Артём", "Москва", 27, "директор по развитию бизнеса");
            human[4] = new Human(null, null, 0,null );
            human[5] = new Human("Владимир", "Казань", 21,"безработный" );
            printHumans(human);

            System.out.println();
            System.out.println("Изменил город и возраст в 4-й строке:");
            human[4].setTown("Уфа"); human[4].setAge(50);
            System.out.println("Привет! Меня зовут " + human[4].getName() + ". Я из города " + human[4].getTown() + ". Я родился в " +
                (LocalDate.now().getYear() - human[4].getAge()) + " году. Я работаю на должности " + human[4].getPosition() + ". Будем знакомы!");
        }

        System.out.println();
        System.out.println("Задание 2. Цветы **************************************************************************" + "\n");
        System.out.println("В магазине есть следующие цветы:"+ "\n");

        Flower [] flower = new Flower[4];

        flower[0] = new Flower("Роза","","Голландия",35.59,0);
        flower[1] = new Flower("Хризнтема"," ","",15,5);
        flower[2] = new Flower("Пион","","Англия",69.9,1);
        flower[3] = new Flower("Гипсофила","","Турция",19.5,10);

        printFlows (flower);

    // Количество цветов каждого вида в букете:
        int numbflower0 = 5;
        int numbflower1 = 0;
        int numbflower2 = 6;
        int numbflower3 = 4;

        System.out.println();
        bouquet (flower, numbflower0,  numbflower1, numbflower2, numbflower3);

    }  // Main **********************************************************************************

    public static void bouquet (Flower [] flower, int numbflower0, int numbflower1, int numbflower2, int numbflower3) {

        int lifeBouquet = MAX_VALUE;
        for (Flower el : flower ) {
            if (el.getLifeSpan() < lifeBouquet) lifeBouquet = el.getLifeSpan();
        }
        System.out.println("Состав букета: " );
        if (numbflower0 != 0) System.out.println(" - " + flower[0].getNameFlower() + " " + numbflower0 + " шт.");
        if (numbflower1 != 0) System.out.println(" - " + flower[1].getNameFlower() + " " + numbflower1 + " шт.");
        if (numbflower2 != 0) System.out.println(" - " + flower[2].getNameFlower() + " " + numbflower2 + " шт.");
        if (numbflower3 != 0) System.out.println(" - " + flower[3].getNameFlower() + " " + numbflower3 + " шт.");

        double sum = numbflower0 * flower[0].getCost() + numbflower1 * flower[1].getCost() +
                numbflower2 * flower[2].getCost() + numbflower3 * flower[3].getCost() ;

        System.out.println("Стоимость букета с учетом 10% флориста: " + (float)(sum * 1.1) + " рублей.");

        System.out.println("Срок стояния букета: " + lifeBouquet + " дня.");
    }
    public static void printFlows (Flower [] flower) {
        for (Flower el : flower) {
            System.out.println(el);
        }
    }
    public static void printHumans (Human [] human) {
        for (Human el : human) {
            System.out.println(el);
        }
    }
} // Class ****************************************************************************

/*  ПЕРЕНОШУ ЭТО В НОВЫЙ ПРОЕКТ CAR -  HW_OOP2_CAR
        System.out.println();
        System.out.println("Задание 3." + "\n");
        {
            Car car1 = new Car("Lada", "Granta", 2015, "Россия", "желтый", 1.7);
            car1.printCars();
            Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020, "Германия", "черный", 3.0);
            car2.printCars();
            Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 3.0);
            car3.printCars();
            Car car4 = new Car("Kia", "Sportage", 2018, "Южная Корея", "красный", 2.4);
            car4.printCars();
            Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 1.6);
            car5.printCars();
            Car car6 = new Car(null, null, 0, null, null, 0);
            car6.printCars();
        }

 */
