/*
 * The class "Airship" implements actions for this type of ship
 */
public class Airship extends Ship {
    private String Action;
    private Plane Plane;
    /*
     * @param name Название коробля
     * @param water Водоизмещение
     *
     */
    public Airship(String name, double water) {
        super(name, water);
        Plane = new Plane();
    }
    /**
     * Реализует действие "Запустить самолет"
     * @return  Результат выполненной операции
     */
    public String RunPlane() {
        Action = Plane.Fly() + "\n" + Plane.LaunchWeapon() + "\n" + Plane.SetDown();
        return Action;
    }
    /*
     * Данный метод реализует действие "Принять самолет на палубу"
     * @return  Результат выполненной операции: название действия
     */
    public String GetPlane() {
        Action = "Принял самолет!";
        return Action;
    }
}

