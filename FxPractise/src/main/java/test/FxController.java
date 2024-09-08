package test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

public class FxController {

    @FXML
    private TextArea result;

    @FXML
    private Button take;

    @FXML
    private Button takeFor1;

    private Test test;

    @FXML
    public void initialize() {
        test = new Test();
    }

    @FXML
    void clickFor10(ActionEvent event) {
        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊

        // 清空之前的結果
        result.clear();

        // 打印 allChar 列表的內容
        System.out.println("All characters: " + test.getcards10());

        // 遍歷所有抽卡結果，並將其附加到 TextArea
        for (String all : test.getcards10()) {
            result.appendText(all + "\n");
        }

    }
    @FXML
    void clickFor1(ActionEvent event) {
        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊

        // 清空之前的結果
        result.clear();

        // 打印 allChar 列表的內容
        System.out.println("All characters: " + test.getcard());

        // 遍歷所有抽卡結果，並將其附加到 TextArea
        for (String all : test.getcard()) {
            result.appendText(all + "\n");
        }
    }
}
