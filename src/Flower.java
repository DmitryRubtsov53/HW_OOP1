import java.util.Scanner;

public class Flower {

    private String nameFlower;
    private String flowerColor;
    private String country;     // страна происхождения цветов
    private double cost;        // стоимость цветов
    int lifeSpan;               // срок стояния цветов


// get & set *************************************************************************


    public String getNameFlower() {
        return nameFlower;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }
    // Constructor ************************************************************************

    public Flower(String nameFlower, String flowerColor, String country, double cost, int lifeSpan) {

        this.nameFlower = nameFlower;

        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
            }  else { this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
            }  else { this.country = country;
        }
        if (cost <= 0) { this.cost = 1;
            } else { this.cost = cost;
        }
        if (lifeSpan <= 0 ) { this.lifeSpan = 3;
            }  else { this.lifeSpan = lifeSpan;
        }
    }  //******************************************************************************

    void printFlower () {
        System.out.println(this.nameFlower + ":" + "\t" + "цвет " + this.flowerColor + "\t" + "страна " + this.country
                + "\t" + this.cost + " руб." + "\t" + "срок стояния " + this.lifeSpan + " дня.");
    }


}
