package com.lastjavafxtest;

import com.lastjavafxtest.ScrapingBarClass;
import javafx.fxml.FXML;


import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.SwipeEvent;
import javafx.scene.layout.VBox;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.CompletableFuture;

public class SecondaryController implements Initializable {

    @FXML public TableView<ScrapingBarClass> resultsView;
    @FXML private MenuBar topMenuBar;
    @FXML private VBox root;
    @FXML private TextField searchTextBox;
    @FXML private TextField nameTextBox;
    @FXML private Button searchButton;



    public void submitSearchButton(ActionEvent actionEvent) throws InterruptedException {
        System.out.println(searchTextBox.getText());
        System.out.println(nameTextBox.getText());


        Runnable scrapingBarClass = new ScrapingBarClass(searchTextBox.getText(),nameTextBox.getText());
        Thread threadScraper = new Thread(scrapingBarClass, "Thread 1");
        threadScraper.start();
        System.out.println("I have launch the thread");
        int i = 0;
        while(threadScraper.isAlive()) {
            i++;
            Thread.sleep(1000);
            if(i > 10){
                threadScraper.interrupt();
                System.out.println("interupted as i =" + i);
            }
        }


    }

    public void searchTimeSlider(SwipeEvent swipeEvent) {
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // topMenuBar.setFocusTraversable(true);
    }

    public void handleCloseAction(final ActionEvent actionEvent) {
        Platform.exit();
    }

    private void close() {
        System.out.println("You Click me!!");
    }


    public void inputSearchText(ActionEvent actionEvent) {


    }

    public void inputNameText(ActionEvent actionEvent) {

    }



}
