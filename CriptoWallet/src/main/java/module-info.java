module com.empresa.criptowallet {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.empresa.criptowallet to javafx.fxml;
    exports com.empresa.criptowallet;
}
