module com.example.covertmoney {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.covertmoney to javafx.fxml;
    exports com.example.covertmoney;
}