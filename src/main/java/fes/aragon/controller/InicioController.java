package fes.aragon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

import java.io.IOException;

public class InicioController {

    @FXML
    private Button bntArchivo;

    @FXML
    private Button bntRacionales;

    @FXML
    private Button bntUsuarios;


    @FXML
    private BorderPane btpPrincipal;

    @FXML
    void abrirArchivo(ActionEvent event) {
        try {
            Contenido contenido = new Contenido("/fes/aragon/xml/archivo.fxml");
            btpPrincipal.setCenter(contenido);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void abrirRacionales(ActionEvent event) {
        try {
            Contenido contenidoRacional = new Contenido("/fes/aragon/xml/racional.fxml");
            btpPrincipal.setCenter(contenidoRacional);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @FXML
    void accionAbrirUsuarios(ActionEvent event) {
        try {
            Contenido contenidoRacional = new Contenido("/fes/aragon/xml/usuario.fxml");
            btpPrincipal.setCenter(contenidoRacional);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}









