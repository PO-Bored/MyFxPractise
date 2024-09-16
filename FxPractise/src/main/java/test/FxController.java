package test;

import com.sun.jdi.Value;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import model.GameCharacter;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

import java.util.List;

public class FxController {

    @FXML
    private TextArea result;

    @FXML
    private TextArea allResult;

    @FXML
    private Button takeFor10;

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

    @FXML
    private Button reset;
    private Test test;
    private Integer totalDrawn;


    @FXML
    public void initialize() {
        test = new Test();
        totalDrawn = 0;
    }


    @FXML
    void clickFor10(ActionEvent event) {
        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊

        // 清空之前的結果
        result.clear();

        totalDrawn += 10;

        allResult.appendText("第" + String.valueOf(totalDrawn - 9) + "~" + String.valueOf(totalDrawn) + "抽" + "\n");

        List<GameCharacter> cards = test.getcards10();  // 獲取 10 張卡片的列表

        // 創建一個 Timeline 來逐步顯示每個結果
        Timeline timeline = new Timeline();
        for (int i = 0; i < cards.size(); i++) {
            GameCharacter card = cards.get(i);
            // 使用 KeyFrame 來控制每隔 0.5 秒顯示一個結果
            KeyFrame keyFrame = new KeyFrame(Duration.seconds(i * 0.025), e -> {
                result.appendText(card + "\n");
                allResult.appendText(card + "\n");
            });
            timeline.getKeyFrames().add(keyFrame);
        }

        // 啟動 Timeline
        timeline.play();

        // 更新其他數據
        ssrquantity.setText(String.valueOf(test.getSsrQty()));
        srquantity.setText(String.valueOf(test.getSrQty()));
        rquantity.setText(String.valueOf(test.getrQty()));
        quantity.setText(String.valueOf(test.getQuantity()));
    }

//    @FXML
//    void clickFor10(ActionEvent event) {
//        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊
//
//        // 清空之前的結果
//        result.clear();
//
//        totalDrawn+=10;
//
//        allResult.appendText("第"+String.valueOf(totalDrawn-9)+"~"+String.valueOf(totalDrawn)+"抽"+"\n");
//
//        // 遍歷所有抽卡結果，並將其附加到 TextArea
//        for (GameCharacter all : test.getcards10()) {
//            result.appendText(all + "\n");
//            allResult.appendText(all + "\n");
//        }
//        System.out.println("結束");
//
//
//        ssrquantity.setText(String.valueOf(test.getSsrQty()));
//        srquantity.setText(String.valueOf(test.getSrQty()));
//        rquantity.setText(String.valueOf(test.getrQty()));
//        quantity.setText(String.valueOf(test.getQuantity()));
//
//    }


    @FXML
    void clickFor1(ActionEvent event) {
        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊

        // 清空之前的結果
        result.clear();

        totalDrawn+=1;

        allResult.appendText("第"+String.valueOf(totalDrawn)+"抽"+"\n");

        // 遍歷所有抽卡結果，並將其附加到 TextArea
        for (GameCharacter all : test.getcard()) {
            result.appendText(all + "\n");
            allResult.appendText(all + "\n");
        }
        quantity.setText(String.valueOf(test.getQuantity()));
        ssrquantity.setText(String.valueOf(test.getSsrQty()));
        srquantity.setText(String.valueOf(test.getSrQty()));
        rquantity.setText(String.valueOf(test.getrQty()));

    }


    @FXML
    void resetAll(ActionEvent event) {
        test.reset();
        ssrquantity.setText(String.valueOf(test.getSsrQty()));
        srquantity.setText(String.valueOf(test.getSsrQty()));
        rquantity.setText(String.valueOf(test.getrQty()));
        quantity.setText(String.valueOf(test.getQuantity()));
        result.clear();
        allResult.clear();
    }

    @FXML
    void firstSSR(ActionEvent event) {
        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊

        // 清空之前的結果
        result.clear();

        List<GameCharacter> first= test.firstSsr();

        allResult.appendText("第" + (totalDrawn+1)+ "~");
        totalDrawn+=first.size();
        allResult.appendText(totalDrawn + "抽"+"\n");
        // 創建一個 Timeline 來逐步顯示每個結果

        Timeline timeline = new Timeline();
        for (int i = 0; i < first.size(); i++) {
            GameCharacter card = first.get(i);
            // 使用 KeyFrame 來控制每隔 0.5 秒顯示一個結果
            KeyFrame keyFrame = new KeyFrame(Duration.seconds(i * 0.025), e -> {
                result.appendText(card + "\n");
                allResult.appendText(card + "\n");
            });
            timeline.getKeyFrames().add(keyFrame);
        }

        // 啟動 Timeline
        timeline.play();

        // 更新其他數據
        ssrquantity.setText(String.valueOf(test.getSsrQty()));
        srquantity.setText(String.valueOf(test.getSrQty()));
        rquantity.setText(String.valueOf(test.getrQty()));
        quantity.setText(String.valueOf(test.getQuantity()));
    }

//    @FXML
//    void firstSSR(ActionEvent event) {
//        System.out.println("Button Clicked");  // 檢查按鈕是否被點擊
//
//        // 清空之前的結果
//        result.clear();
//
//        List<GameCharacter> first= test.firstSsr();
//
//        allResult.appendText("第" + (totalDrawn+1)+ "~");
//        totalDrawn+=first.size();
//        allResult.appendText(totalDrawn + "抽"+"\n");
//
//
//        // 遍歷所有抽卡結果，並將其附加到 TextArea
//        for (GameCharacter all : first) {
//
//            result.appendText(all + "\n");
//            allResult.appendText(all + "\n");
//        }
//        System.out.println("結束");
//
//
//        ssrquantity.setText(String.valueOf(test.getSsrQty()));
//        srquantity.setText(String.valueOf(test.getSrQty()));
//        rquantity.setText(String.valueOf(test.getrQty()));
//        quantity.setText(String.valueOf(test.getQuantity()));
//    }
}
