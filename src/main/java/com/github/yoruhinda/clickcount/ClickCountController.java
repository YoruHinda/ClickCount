package com.github.yoruhinda.clickcount;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ClickCountController {

    private int clickCountNumber = 0;
    @FXML
    private Label clickNumber;

    @FXML
    protected void onHelloButtonClick() {
        clickCountNumber += 1;
        clickNumber.setText("Click Number: " + clickCountNumber);
    }
}