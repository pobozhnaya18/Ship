/*
 * The class "Cruiser" implements actions for this type of ship
 *
 */
public class Cruiser extends Ship {
    private String Action;
    /*
     * @param name Название коробля
     * @param water Водоизмещение
     */
    public Cruiser(String name, double water) {
        super(name, water);
    }

    public String NameAction() {
        Action = "Начать обстрел";
        return Action;
    }

}
