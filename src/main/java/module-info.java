module com.datasoft.proyectoestudiantefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.datasoft.proyectoestudiantefx to javafx.fxml;
    exports com.datasoft.proyectoestudiantefx;
    exports modelo;
    opens modelo to javafx.fxml;
}