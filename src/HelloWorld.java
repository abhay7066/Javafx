import javafx.application.Application;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.net.URL;
import java.net.URLConnection;

public class HelloWorld extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {

        SimpleStringProperty x = new SimpleStringProperty("hello");
        SimpleIntegerProperty m = new SimpleIntegerProperty();

        Label label = new Label("Hello, JavaFX!");
        label.textProperty().bind(x);



        Text x5 = new Text();
        x5.setFont(Font.font("modena", FontWeight.BLACK, FontPosture.ITALIC, 0.5));
        primaryStage.setTitle("string");
        x5.setText("hello");

        Rectangle rectangle = new Rectangle(100,100);
        rectangle.setFill(Color.rgb(255,0,0, 0.5));
URL y = new URL();
        URLConnection c = y.openConnection();
        c.getInputStream();
        Group x2 = new Group();
        x2.getChildren().addAll(rectangle, x5,label);
        primaryStage.show();
        primaryStage.setScene(new Scene(x2,500,500));
    }


}


class main extends Application{

    @Override
    public void start(Stage primaryStage){
        primaryStage.setScene(new Scene(new Label("hello"), 600,600));
        primaryStage.show();
    }
}


