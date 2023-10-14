module codsoft.sujit.numberguessgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens codsoft.sujit.numberguessgame to javafx.fxml;
    exports codsoft.sujit.numberguessgame;
}