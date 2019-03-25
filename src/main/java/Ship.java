/**
 * Класс "Корабль" является родителем остальных. Несет в себе основную информацию о коробле
 *
 */
public class Ship {
    private String nameofship;
    private double waterplacement;

    public Ship(){}
    /*
     * @param name  Название коробля
     * @param water  Водоизмещение
     */
    public Ship(String name, double water) {
        this.nameofship = name;
        this.waterplacement = water;
    }

    public void swim() {
    }
}

