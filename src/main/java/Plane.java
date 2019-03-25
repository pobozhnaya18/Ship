/*
 * The class "Plane" implements actions for this type of aircraft
 *
 *
 */
public class Plane {
    /*
     * Навзвание операции
     */
    private String Action;

    public Plane() {}
    /*
     * Операция "Бомбардировка"
     *
     * @return Возвращает результат проведенной оперции
     */
    public String LaunchWeapon() {
        Action = "Бомбардировка!!!";
        return Action;
    }
    /*
     * Операция "Взлететь"
     *
     * @return Возвращает результат проведенной оперции
     */
    public String Fly() {
        Action = "Я взлетаюююю";
        return Action;
    }
    /*
     * Операция "Вернуть самолет"
     *
     * @return Возвращает результат проведенной оперции
     */
    public String SetDown() {
        Action = "Я вернулся";
        return Action;
    }
}
