package app.Graphics;

import app.Working.CD;
import app.Working.DVD;
import app.Working.WertNegativ;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DatentragerGui extends Application {

    private final VBox mainWindow = new VBox(); // or vbox
    private final HBox hbox = new HBox(); // or vbox
    private final Button clear = new Button("Clear");
    private final Button ok = new Button("Ok");
    private final TextField textField = new TextField();
    private final TextArea textArea = new TextArea();


    @Override
    public void start(Stage stage) {

        setupScene();
        setupEventHandlers() ;
        Scene scene = new Scene(mainWindow, 300, 300);
        stage.setTitle("Datentraeger");
        stage.setScene(scene);
        stage.show();


    }



    private void setupScene() {
        hbox.getChildren().addAll(textField, ok, clear);
        mainWindow.getChildren().addAll(hbox, textArea);
        textArea.setEditable(false);
    }

    private void setupEventHandlers()  {
        ok.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textArea.clear();
                String[] eingabe = textField.getText().split(":");
                int count = eingabe.length;
                switch (count){
                    case 4:
                        try {
                            textArea.appendText("CD " + String.valueOf(new CD(eingabe[0], Double.parseDouble(eingabe[1]), Integer.parseInt(eingabe[2]), Boolean.parseBoolean(eingabe[3]))));
                        } catch (WertNegativ e) {
                            e.printStackTrace();
                        }
                        break;
                    case 5:
                        try {
                            textArea.appendText("DVD " + String.valueOf(new DVD(eingabe[0], Double.parseDouble(eingabe[1]), Integer.parseInt(eingabe[2]), Boolean.parseBoolean(eingabe[3]), eingabe[4].charAt(0))));
                        } catch (WertNegativ e) {
                            e.printStackTrace();
                        }
                        break;

                }

            }
        });

        clear.setOnAction(new EventHandler<>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                textField.clear();
            }
        });
    }
}
