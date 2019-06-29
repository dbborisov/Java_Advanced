package fxGames;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.awt.*;

public class HelenaAbduction2D extends Application {
    private Pane root = new Pane();

    private Parent createContend() {
        root.setPrefSize(600, 300);
        return root;
    }

    @Override
    public void start(Stage stage) throws Exception {

        stage.setScene(new Scene(createContend()));
        stage.show();
    }

    private static class Sprite extends Rectangle {
        boolean dead = false;
        final String type;

        Sprite(int x, int y, int w, int h, String type, Color color) {
            super(w, h, color);

            this.type = type;
            setTranslateX(x);
            setTranslateY(y);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
