package com.po.fxpractise;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("FxController.fxml"));
        Parent root = fxmlLoader.load();  // 加載 FXML 文件中的佈局和元件

        Scene scene = new Scene(root, 600, 400);  // 可以設置窗口大小等屬性
        stage.setScene(scene);  // 將場景設置到 Stage（窗口）
        stage.setTitle("抽卡模擬器");  // 設置窗口標題
        stage.show();  // 顯示窗口
    }

    public static void main(String[] args) {
        launch();
    }
}