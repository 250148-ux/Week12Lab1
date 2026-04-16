import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        ///Problem 4


        ///Problem 3
        /*Label label = new Label("Move the mouse over the pane");

        StackPane stackPane = new StackPane();
        stackPane.setPrefSize(400, 300);
        stackPane.setStyle("-fx-background-color: lightblue;");

        stackPane.setOnMouseMoved(e -> {
            label.setText("X: " + e.getX() + "    Y: " + e.getY());
        });

        stackPane.setOnMouseClicked(e -> {
            int r = (int)(Math.random() * 256);
            int g = (int)(Math.random() * 256);
            int b = (int)(Math.random() * 256);
            stackPane.setStyle(String.format("-fx-background-color: rgb(%d,%d,%d);", r, g, b));
        });

        stackPane.setOnMouseExited(e -> {
            label.setText("Move the mouse over the pane");
        });

        BorderPane borderPane = new BorderPane();
        borderPane.setCenter(stackPane);
        borderPane.setBottom(label);

        stage.setScene(new Scene(borderPane));
        stage.setTitle("Mouse Coords");
        stage.show();*/

        ///Problem 2
        /*TextField number1 = new TextField();
        TextField number2 = new TextField();
        TextField result = new TextField();
        result.setEditable(false);

        Button calc = new Button("Calculate");
        Button clear = new Button("Clear");
        calc.setOnAction(e -> {
            try{
                double a = Double.parseDouble(number1.getText());
                double b = Double.parseDouble(number2.getText());
                result.setText(String.format("Sum:  %.2f", a + b));
            }catch (NumberFormatException ex){
                result.setText("Invalid input");
            }
        });
        clear.setOnAction(e -> {
            number1.clear();
            number2.clear();
            result.clear();
        });

        GridPane gridPane = new GridPane();
        gridPane.setHgap(10); gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20));
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(new Label("Number 1"), 0, 0); gridPane.add(number1,1,0);
        gridPane.add(new Label("Number 2"), 0, 1); gridPane.add(number2,1,1);
        gridPane.add(calc, 0, 2); gridPane.add(clear,1,2);
        gridPane.add(new Label("Result:"),0,3);  gridPane.add(result,1,3);

        Scene scene = new Scene(gridPane,300,200);
        stage.setScene(scene);
        stage.setTitle("Simple Calculator");
        stage.show();*/

        ///Problem 1
        /*int[] n = {0};
        Label counter = new Label("Clicks: "+n[0]);
        counter.setFont(Font.font("System", FontWeight.BOLD, 24));

        Button button = new Button("Click me!");
        button.setOnAction(e -> {
            n[0]++;
            counter.setText("Clicks: "+n[0]);
        });

        VBox vBox = new VBox(20);
        vBox.setPadding(new Insets(30)); vBox.setAlignment(Pos.CENTER);
        vBox.getChildren().addAll(counter,button);
        Scene scene = new Scene(vBox,300,200);

        stage.setTitle("Click Counter");
        stage.setScene(scene);
        stage.show();*/
    }

    public static void main(String[] args) {
        launch(args);
    }
}