/*
 * The class "Destroyer" implements actions for this type of ship
 *
 */
public class Destroyer extends Ship {
    private Torpedo torpedo;
    private String Action;

    public Destroyer(){
        super();
    }
    /*
     * @param name Название коробля
     * @param water Водоизмещение
     */
    public Destroyer(String name, double water) {
        super(name, water);
        torpedo = new Torpedo();
    }
    /*
     * Возвращает название действия для последующее использовния в кнопке
     * @return  Результат выполненной операции
     */
    public java.lang.Object NameAction() {
        Action = "Запустить торпеду";
        return Action;
    }
    /*
     * Вызывает метод "Взорвать торпеду"
     * @return  Результат выполненной операции: сообщение
     */
    public String ExplodeTorpedo() {
        Action = torpedo.Explode();
        return Action;
    }

}
