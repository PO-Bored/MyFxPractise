module com.po.fxpractise {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens test to javafx.fxml;
    opens com.po.fxpractise to javafx.fxml;
    exports com.po.fxpractise;
}