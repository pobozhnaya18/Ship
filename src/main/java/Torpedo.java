/*
 * Class "Torpedo" implements actions for this type of weapon
 *
 */
public class Torpedo {
    private String ActionWeapon;
    /*
     * Возвращает сообщение о исполненном действии
     * @return ActionWeapon   Результат выполненной операции
     */
    public Torpedo() {
        ActionWeapon = "Торпеда взорвана";
    }

    public String Explode() {
        return ActionWeapon;
    }

}
