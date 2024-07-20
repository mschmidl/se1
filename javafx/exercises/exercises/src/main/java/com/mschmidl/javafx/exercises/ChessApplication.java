package com.mschmidl.javafx.exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class ChessApplication extends Application {

    private static final int fieldSize = 40;

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        ObservableList<Node> children = root.getChildren();

        //TODO add drawing a chess board that fits the canvas

        Rectangle rectangle = createRectangle(0, 0, fieldSize * 8, fieldSize * 8, Color.TRANSPARENT);
        rectangle.setStroke(Color.BLACK);
        addWithOffset(children, rectangle);

        Scene scene = new Scene(root);
        stage.setTitle("Chess board");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    private void addWithOffset(ObservableList<Node> children, Node node) {
        node.setTranslateX(200);
        node.setTranslateY(200);
        children.add(node);
    }

    private Rectangle createRectangle(int x, int y, int width, int height, Color color) {
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setFill(color);
        return rectangle;
    }

    public static void main(String[] args) {
        launch();
    }
}