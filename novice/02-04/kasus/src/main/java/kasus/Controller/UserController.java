package kasus.Controller;

import kasus.Model.User;
import kasus.View.UserView;

public class UserController {

    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void setUserUsername(String username) {
        model.setUsername(username);
    }

    public String getUserUsername() {
        return model.getUsername();
    }

    public void setUserPassword(String password) {
        model.setPassword(password);
    }

    public String getUserPassword() {
        return model.getPassword();
    }

    public void updateView() {
        view.printUserTable(model.getUsername(), model.getPassword());
    }
}