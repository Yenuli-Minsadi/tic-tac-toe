module edu.tictactoe {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.tictactoe to javafx.fxml;
    exports edu.tictactoe;
    exports edu.tictactoe.controller;
}