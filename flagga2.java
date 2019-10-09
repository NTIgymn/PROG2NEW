import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class flagga2 extends Application{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        //Drawing a Circle
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();

        //Setting the properties of the rect
        rect.setX(0);
        rect.setY(0);
        rect.setWidth(210);
        rect.setHeight(300);

        rect2.setX(390);
        rect2.setY(0);
        rect2.setWidth(210);
        rect2.setHeight(300);

        rect.setFill(Color.RED);
        rect2.setFill(Color.BLUE);

        //Creating a Group object
        Group root = new Group(rect, rect2);

        //Creating a scene object
        Scene scene = new Scene(root, 600, 300);
        scene.setFill(Color.WHITE);
        //Setting title to the Stage
        primaryStage.setTitle("Drawing a Circle");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

}