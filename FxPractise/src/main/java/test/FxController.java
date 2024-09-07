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

    private Test test;

    @FXML
    public void initialize() {
        test = new Test();
    }

    @FXML
    void click(ActionEvent event) {
        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊

        // 清空之前的結果
        result.clear();

        // 打印 allChar 列表的內容
        System.out.println("All characters: " + test.getcards());

        // 遍歷所有抽卡結果，並將其附加到 TextArea
        for (String all : test.getcards()) {
            result.appendText(all + "\n");
        }

    }
}
