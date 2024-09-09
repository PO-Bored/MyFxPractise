package test;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.GameCharacter;

public class FxController {

    @FXML
    private TextArea result;

    @FXML
    private Button take;

    @FXML
    private Button takeFor1;

    @FXML
    private TextField quantity;

    @FXML
    private TextField srquantity;

    @FXML
    private TextField ssrquantity;

    @FXML
    private TextField rquantity;


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

        // 遍歷所有抽卡結果，並將其附加到 TextArea
        for (GameCharacter all : test.getcards10()) {
            result.appendText(all + "\n");
        }
        System.out.println("結束");

        quantity.setText(String.valueOf(test.getQuantity()));
        ssrquantity.setText(String.valueOf(test.getSsrQty()));
        srquantity.setText(String.valueOf(test.getSrQty()));
        rquantity.setText(String.valueOf(test.getrQty()));
    }
    @FXML
    void clickFor1(ActionEvent event) {
        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊

        // 清空之前的結果
        result.clear();

        // 遍歷所有抽卡結果，並將其附加到 TextArea
        for (GameCharacter all : test.getcard()) {
            result.appendText(all + "\n");
        }
        quantity.setText(String.valueOf(test.getQuantity()));
        ssrquantity.setText(String.valueOf(test.getSsrQty()));
        srquantity.setText(String.valueOf(test.getSrQty()));
        rquantity.setText(String.valueOf(test.getrQty()));
    }
}
