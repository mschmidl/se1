package com.mschmidl.javafx.exercises.fishandsharks;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class FishAndSharksApplication extends Application {

    private final int gridSize = 100;

    private GridPane gridPane;

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        ObservableList<Node> children = root.getChildren();

        //TODO add gridPane
        gridPane = initGridPane();

        Scene scene = new Scene(root);
        stage.setTitle("Fish and Sharks");
        stage.setScene(scene);
        stage.show();

        /*GameLoopTimer gameLoopTimer = new GameLoopTimer() {
            @Override
            public void tick(float secondsSinceLastFrame) {
                simulate();
            }
        };
        gameLoopTimer.start();*/
    }

    private GridPane initGridPane() {
        GridPane gridPane = new GridPane();
        for (int i = 0; i < gridSize; i++) {
            ColumnConstraints columnConstraints = new ColumnConstraints();
            columnConstraints.setPercentWidth(100.0 / gridSize);
            gridPane.getColumnConstraints().add(columnConstraints);

            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPercentHeight(100.0 / gridSize);
            gridPane.getRowConstraints().add(rowConstraints);
        }
        return gridPane;
    }

    private void simulate() {
        //TODO
    }

    private void handleFish(int row, int col, Fish fish) {
        //TODO
    }

    private void handleShark(int row, int col, Shark shark) {
        //TODO
    }

    private Creature getGridContentInDirection(int row, int col, Direction direction) {
        //TODO
        return null;
    }

    private void setGridContentInDirection(int row, int col, Direction direction, Creature creature) {
        //TODO
    }

    public static void main(String[] args) {
        launch();
    }
}