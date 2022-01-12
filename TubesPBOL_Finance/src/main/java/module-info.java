module com.example.tubespbol_finance {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires org.hibernate.orm.core;
    requires java.sql;


    opens com.example.tubespbol_finance to javafx.fxml;
    exports com.example.tubespbol_finance;
    exports com.example.tubespbol_finance.Controller;
    opens com.example.tubespbol_finance.Controller to javafx.fxml;
}