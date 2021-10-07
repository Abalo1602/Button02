package com.example.button02;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){

        //Creamos el VBox, damos espaciado entre sus elementos y con el borde.
        VBox vbox= new VBox();
        vbox.setSpacing(20);
        vbox.setPadding(new Insets(20,40,30,20));
        vbox.setAlignment (Pos.CENTER);

        Button button1 = new Button("Botón 1");
        Button button2 = new Button("Botón 2");
        Button button3 = new Button("Botón 3");

        button1.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        button2.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);
        button3.setMaxSize(Double.MAX_VALUE,Double.MAX_VALUE);

        vbox.getChildren().addAll(button1, button2, button3);

        Scene scene = new Scene(vbox, 300,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}