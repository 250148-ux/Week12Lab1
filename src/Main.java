import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Main extends Application {
    private double offsetX, offsetY;

    @Override
    public void start(Stage stage) throws Exception {

        ///Problem 6
        Rectangle rect = new Rectangle(220,180,60,40);
        rect.setFill(Color.BLUE);

        TextField posField = new TextField("X: 220  Y: 180");
        posField.setEditable(false);
        posField.setLayoutX(0);
        posField.setLayoutY(360);  // near bottom of 400px pane

        Pane pane = new Pane(rect, posField);
        pane.setPrefSize(500, 400);

        Scene scene = new Scene(pane);

        scene.setOnKeyPressed(e -> {
            double x = rect.getX();
            double y = rect.getY();

            switch (e.getCode()) {
                case UP    -> y -= 10;
                case DOWN  -> y += 10;
                case LEFT  -> x -= 10;
                case RIGHT -> x += 10;
            }

            x = Math.max(0, Math.min(x, 500 - 60));
            y = Math.max(0, Math.min(y, 400 - 40));

            rect.setX(x);
            rect.setY(y);
            posField.setText("X: " + (int)x + "  Y: " + (int)y);
        });

        stage.setScene(scene);
        stage.setTitle("Keyboard Move");
        stage.show();
        scene.getRoot().requestFocus();

        ///Problem 5
        /*Circle circle = new Circle(250, 200, 40, Color.CORAL);

        circle.setOnMousePressed(e -> {
            offsetX = e.getSceneX() - circle.getCenterX();
            offsetY = e.getSceneY() - circle.getCenterY();
            circle.setFill(Color.TOMATO);
        });

        circle.setOnMouseDragged(e -> {
            circle.setCenterX(e.getSceneX() - offsetX);
            circle.setCenterY(e.getSceneY() - offsetY);
        });

        circle.setOnMouseReleased(e -> {
            circle.setFill(Color.CORAL);
        });

        Pane pane = new Pane(circle);
        pane.setPrefSize(500, 400);

        stage.setScene(new Scene(pane));
        stage.setTitle("Draggable Circle");
        stage.show();*/

        ///Problem 4
        /*TextField inputField = new TextField();
        inputField.setPromptText("Type here...");

        TextArea logArea = new TextArea();
        logArea.setEditable(false);
        logArea.setPrefRowCount(5);

        inputField.setOnKeyPressed(e -> {
            logArea.appendText("PRESSED  | Code: " + e.getCode() + " | Shift: " + e.isShiftDown() + " | Ctrl: "  + e.isControlDown() + "\n");
        });
        inputField.setOnKeyReleased(e -> {
            logArea.appendText("RELEASED | Code: " + e.getCode() + "\n");
        });
        inputField.setOnKeyTyped(e -> {
            logArea.appendText("TYPED    | Char: " + e.getCharacter() + "\n");
        });

        Button clearBtn = new Button("Clear Log");
        clearBtn.setOnAction(e -> logArea.clear());

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(20));
        vbox.getChildren().addAll(inputField, logArea, clearBtn);

        stage.setScene(new Scene(vbox, 420, 320));
        stage.setTitle("Key Logger");
        stage.show();*/

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