package fes.aragon.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.shape.Path;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class RacionalController {

    @FXML
    private Button idAbrir;

    @FXML
    void accionAbrirRacional(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Seleccionar carpeta racional");
        File initialDirectory = new File("/home/starboyalan/IdeaProjects/Racional");
        fileChooser.setInitialDirectory(initialDirectory);
        File selectedDirectory = fileChooser.showOpenDialog(null);
    }

}






