module com.lastjavafxtest {
    requires javafx.controls;
    requires javafx.fxml;
    requires selenium.chrome.driver;
    requires selenium.api;

    opens com.lastjavafxtest to javafx.fxml;
    exports com.lastjavafxtest;
}