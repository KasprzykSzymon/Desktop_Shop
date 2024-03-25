module com.example.rtv_shop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.rtv_shop to javafx.fxml;
    exports com.example.rtv_shop;
}
