package com.mschmidl.javafx.exercises;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class KeyboardApplication extends Application {

    private static final int widthWhite = 20;
    private static final int lengthWhite = 150;
    private static final int widthBlack = 15;
    private static final int lengthBlack = 100;

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        ObservableList<Node> children = root.getChildren();

        children.add(createRectangle(0, 0, 2000, 2000, Color.GRAY, Color.TRANSPARENT));

        //TODO create a keayboard with 52 white and 36 black key

        Scene scene = new Scene(root);
        stage.setTitle("Chess board");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.show();
    }

    private void addWithOffset(ObservableList<Node> children, Node node) {
        node.setTranslateX(50);
        node.setTranslateY(50);
        children.add(node);
    }

    private Rectangle createRectangle(int x, int y, int width, int height, Color fillColor, Color strokeColor) {
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.setStroke(strokeColor);
        rectangle.setFill(fillColor);
        return rectangle;
    }

    public static void main(String[] args) {
        launch();
    }
}