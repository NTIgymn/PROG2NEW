
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.lang.String;
import java.util.ArrayList;

public class kalkex1 extends Application {

    TextField inputField;
    ArrayList<Button> numpad;
    GridPane numpadLayout;
    HBox utilContainer;
    BorderPane mainLayout;
    VBox displayLayout;
    int num1;
    int num2;
    String op;
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Calc");

        initField();

        displayLayout.getChildren().add(inputField);
        numpad();
        calculate();
        displayButtons();

        mainLayout.setTop(displayLayout);
        mainLayout.setCenter(numpadLayout);
        mainLayout.setBottom(utilContainer);

        Scene scene = new Scene(mainLayout, 100, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initField() {
        inputField = new TextField();
        numpad = new ArrayList<>();
        numpadLayout = new GridPane();
        utilContainer = new HBox();
        displayLayout = new VBox();
        mainLayout = new BorderPane();
    }

    private void displayButtons() {
        int buttonIndex = 0;
        for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 4; columnIndex++) {
                numpadLayout.add(numpad.get(buttonIndex), columnIndex, rowIndex);
                buttonIndex++;
                if (buttonIndex == numpad.size())
                    break;
            }
        }
    }

    private void numpad() {
        char[] buttons = new char[]{'1', '2', '3', '+', '4', '5', '6', '-', '7', '8', '9', '*', ',', '0', '=' ,'c','/'};

        for (char key : buttons) {
            String keyText = key + "";
            Button tempButton = new Button(keyText);
            tempButton.setId(keyText);
            /*tempButton.setOnAction(event -> {
                inputField.textProperty().set(inputField.textProperty().get() + keyText);
            });*/
            numpad.add(tempButton);
        }
    }

    /*
    En funktion som tar reda på vilken knapp som blir nedtryckt och gör beräkningen.
     */
    private void calculate (){

        for (Button clickedButton : numpad) {


            clickedButton.setOnAction(event -> {


                switch (clickedButton.getId()) {

                    case "0":
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                        inputField.textProperty().set(inputField.textProperty().get() + clickedButton.getId());
                        break;
                    case "+":
                        inputField.textProperty().set(inputField.textProperty().get() + clickedButton.getId());
                        num1 = Integer.parseInt(inputField.textProperty().get());
                        op = "+";
                       // inputField.textProperty().set("");

                        break;

                    case "-":
                        num1 = Integer.parseInt(inputField.textProperty().get());
                        op = "-";
                        inputField.textProperty().set("");
                        break;

                    case "*":
                        num1 = Integer.parseInt(inputField.textProperty().get());
                        op = "*";
                        inputField.textProperty().set("");
                        break;
                    case "/":
                        num1 = Integer.parseInt(inputField.textProperty().get());
                        op = "/";
                        inputField.textProperty().set("");
                        break;

                    case "=":
                        num2 = Integer.parseInt(inputField.textProperty().get());
                        System.out.println(inputField.textProperty().get());


                        switch (op) {
                            case "+":
                                inputField.textProperty().set(Integer.toString(num1 + num2));
                                break;

                            case "-":
                                int result = num1 - num2;
                                inputField.textProperty().set(Integer.toString(result));
                                System.out.println(op + " " + num1 + " " + num2);
                                break;

                            case "*":
                                inputField.textProperty().set(Integer.toString(num1 * num2));
                                break;
                            case "/":
                                inputField.textProperty().set(Integer.toString(num1 / num2));
                                break;
                        }

                        break;
                    case "c":
                        num1 = 0;
                        num2 = 0;
                        op = "";
                        inputField.textProperty().set("");
                        break;
                }


            });
        }


    }



}