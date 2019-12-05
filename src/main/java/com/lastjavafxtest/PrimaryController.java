package com.lastjavafxtest;

import java.io.IOException;

import com.lastjavafxtest.App;
import javafx.fxml.FXML;


public class PrimaryController {

    @FXML
    public void switchToSecondary() throws IOException {
       App.setRoot("secondary");
    }
}
