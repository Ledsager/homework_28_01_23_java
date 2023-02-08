package org.example;

import org.example.controllers.UserController;
import org.example.model.FileOperation;
import org.example.model.FileOperationImpl;
import org.example.model.Repository;
import org.example.model.RepositoryFile;
import org.example.utils.Validate;
import org.example.views.ViewUser;

public class Main {

    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}
