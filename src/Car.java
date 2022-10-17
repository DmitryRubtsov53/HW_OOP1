public class Car {

    String brand;
    String model;
    double engineVolume;
    String bodyColor;
    int yearOfIssue;
    String assemblyCountry;

    Car (String brand, String model, int yearOfIssue, String assemblyCountry, String bodyColor, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyColor = bodyColor;
        this.yearOfIssue = yearOfIssue;
        this.assemblyCountry = assemblyCountry;

    }
       void printCars() {
            System.out.println(brand + " " + model + ", " + yearOfIssue + "-го года выпуска, сборка " +
                    assemblyCountry + ", " + "цвет " + bodyColor + ", объем двигателя - " + engineVolume + " литра.");
        }

}