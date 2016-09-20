package controller;

import javafx.IMainAppReceiver;
import javafx.MainFXApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import model.User;


public class WelcomeController implements IMainAppReceiver {
    @FXML
    private TextField UserName;

    @FXML
    private TextField PassWord;

    @FXML
    private Label Welcome;
    private User user = User.getDefaultUser();
    private MainFXApplication mainApplication;

    public void setMainApp(MainFXApplication mainApplication) {
        this.mainApplication = mainApplication;
    }

    public void Login(ActionEvent event) throws Exception {
        if (user.authenticate(UserName.getText(), PassWord.getText())) {
            mainApplication.loginComplete(user);
        } else {
            Welcome.setText("Login failed");
        }
    }






















}