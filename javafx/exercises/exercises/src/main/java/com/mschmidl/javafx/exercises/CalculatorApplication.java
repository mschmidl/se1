package com.mschmidl.javafx.exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Stack;

public class CalculatorApplication extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        ObservableList<Node> children = root.getChildren();

        //TODO add layout for calculator

        Scene scene = new Scene(root);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}