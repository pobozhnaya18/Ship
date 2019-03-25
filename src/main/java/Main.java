

import javafx.application.Application;

import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;


public class Main extends Application {
    /**
     * В данном классе создается форма
     */
    private Stage stage;
    private Scene scene; // работает внутри stage типо можно одно окно юзать для
    // разных сцен
    private GridPane pane; // на ней рисуются все элементы// заполняет друг за
    // другом типо в строку(массив)

    private Label Information;
    private Button Destroyer;
    private Button AirShip;
    private Button Cruiser;
    private Button ButtonForSwimDestroyer;
    private Button ButtonForSwimAirship;
    private Button ButtonForSwimCruiser;
    private Label LabelForAction;

    @Override
    public void start(Stage stage) {
        try {
            this.stage = stage; // сохраняем сгенерированную стейдж в нашу
            stage.setTitle("Корабли");
            pane = new GridPane();
            pane.setPadding(new Insets(10, 10, 10, 10));
            pane.setVgap(30);
            pane.setHgap(10);

            ButtonForSwimDestroyer = new Button("Плыть");
            ButtonForSwimDestroyer.setMinHeight(55);
            ButtonForSwimAirship = new Button("Плыть");
            ButtonForSwimAirship.setMinHeight(55);
            ButtonForSwimCruiser = new Button("Плыть");
            ButtonForSwimCruiser.setMinHeight(55);
            LabelForAction = new Label();
            LabelForAction.setMinHeight(55);

            Information = new Label("Выберите корбаль." + "\n" + "Выполните действия.");
            GridPane.setConstraints(Information, 0, 0);
            pane.getChildren().add(Information);

            Destroyer = new Button("Эсминец");
            Destroyer.setMinHeight(55);
            GridPane.setConstraints(Destroyer, 0, 1);
            pane.getChildren().add(Destroyer);

            AirShip = new Button("Авианосец");
            AirShip.setMinHeight(55);
            GridPane.setConstraints(AirShip, 0, 2);
            pane.getChildren().add(AirShip);

            Cruiser = new Button("Крейсер");
            Cruiser.setMinHeight(55);
            GridPane.setConstraints(Cruiser, 0, 3);
            pane.getChildren().add(Cruiser);

            Destroyer.setOnAction(eventDestroyer -> {
                Destroyer NewDestroyer = new Destroyer("Эсминец", 7500);

                GridPane.setConstraints(ButtonForSwimDestroyer, 1, 1);
                pane.getChildren().add(ButtonForSwimDestroyer);

                ButtonForSwimDestroyer.setOnAction(eventDestroyerSwim -> {
                    LabelForAction.setText("Ок,я плыву");
                    GridPane.setConstraints(LabelForAction, 3, 1);
                    pane.getChildren().add(LabelForAction);
                });
                /**
                 * Действия при нажатии кнопки "Плыть" для Эсминца
                 */
                Button ButtonForActionDestroyer = new Button((String) NewDestroyer.NameAction());
                ButtonForActionDestroyer.setMinHeight(55);
                GridPane.setConstraints(ButtonForActionDestroyer, 2, 1);
                pane.getChildren().add(ButtonForActionDestroyer);

                ButtonForActionDestroyer.setOnAction(eventExplodeWeapon -> {
                    LabelForAction.setText(NewDestroyer.ExplodeTorpedo());
                    GridPane.setConstraints(LabelForAction, 3, 1);
                    pane.getChildren().add(LabelForAction);
                });
            });
            /**
             * Действия при нажатии кнопки "Запустить торпеду"
             */
            AirShip.setOnAction(eventAirShip -> {
                Airship NewAirShip = new Airship("Авианосец", 5000);
                Button ButtonForLaunchPlane = new Button("Запустить самолет");
                ButtonForLaunchPlane.setMinHeight(55);
                Button ButtonForAcceptPlane = new Button("Принять на палубу");
                ButtonForAcceptPlane.setMinHeight(55);
                /*
                 * Действия при нажатии кнопки "Авианосец"
                 */
                GridPane.setConstraints(ButtonForSwimAirship, 1, 2);
                pane.getChildren().add(ButtonForSwimAirship);

                GridPane.setConstraints(ButtonForLaunchPlane, 2, 2);
                pane.getChildren().add(ButtonForLaunchPlane);

                GridPane.setConstraints(ButtonForAcceptPlane, 3, 2);
                pane.getChildren().add(ButtonForAcceptPlane);

                ButtonForSwimAirship.setOnAction(eventAirShipSwim -> {
                    LabelForAction.setText("Я плыву");
                    GridPane.setConstraints(LabelForAction, 4, 2);
                    pane.getChildren().add(LabelForAction);
                });
                /*
                 * Действия при нажатии кнопки "плыть"
                 */
                ButtonForLaunchPlane.setOnAction(eventLaunchPlane -> {

                    LabelForAction.setText(NewAirShip.RunPlane());
                    GridPane.setConstraints(LabelForAction, 4, 2);
                    pane.getChildren().add(LabelForAction);
                });
                /*
                 * Действия при нажатии кнопки "Запустить самолет"
                 */
                ButtonForAcceptPlane.setOnAction(eventAcceptPlane -> {
                    LabelForAction.setText(NewAirShip.GetPlane());
                    GridPane.setConstraints(LabelForAction, 4, 2);
                    pane.getChildren().add(LabelForAction);
                });
            });
            /*
             * Действия при нажатии кнопки "Принять на палубу самолет"
             */
            Cruiser.setOnAction(eventCruiser -> {
                Cruiser NewCruiser = new Cruiser("Эсминец", 7500);
                GridPane.setConstraints(ButtonForSwimCruiser, 1, 3);
                pane.getChildren().add(ButtonForSwimCruiser);
                ButtonForSwimCruiser.setOnAction(eventCruiserSwim -> {
                    LabelForAction.setText("Плыть, так плыть");
                    GridPane.setConstraints(LabelForAction, 3, 3);
                    pane.getChildren().add(LabelForAction);
                });
                Button ButtonForActionCruiser = new Button(NewCruiser.NameAction());
                ButtonForActionCruiser.setMinHeight(55);
                GridPane.setConstraints(ButtonForActionCruiser, 2, 3);
                pane.getChildren().add(ButtonForActionCruiser);

                ButtonForActionCruiser.setOnAction(actionEvent -> {
                    LabelForAction.setText("Стреляю!!");
                    GridPane.setConstraints(LabelForAction, 3, 3);
                    pane.getChildren().add(LabelForAction);
                });
            });
            /*
             * Действия при нажатии кнопки "Плыть" для Крейсера
             */
            scene = new Scene(pane, 600, 350);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

