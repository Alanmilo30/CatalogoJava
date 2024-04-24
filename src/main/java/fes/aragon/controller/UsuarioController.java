package fes.aragon.controller;

import fes.aragon.modelo.Usuarios;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.*;
import java.util.ArrayList;

public class UsuarioController {

    @FXML
    private Button btnGuardar;

    @FXML
    private Button btnImagen;

    @FXML
    private TextField txtApellidoPaterno;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtNombre;


    @FXML
    void accionAbrirImagen(ActionEvent event) {

    }
    private ArrayList<Usuarios> usuarios = new ArrayList<>();

    public class Serializador {

        public static void guardarUsuarios(ArrayList<Usuarios> usuarios, String rutaArchivo) throws IOException {
            try (FileOutputStream fos = new FileOutputStream(rutaArchivo);
                 ObjectOutputStream oos = new ObjectOutputStream(fos)) {
                oos.writeObject(usuarios);
            }
        }
    }

    @FXML
    void accionGuardarUsuario(ActionEvent event) {
        String nombre = txtNombre.getText();
        String apellidoPaterno = txtApellidoPaterno.getText();
        String correo = txtCorreo.getText();

        Usuarios usuario = new Usuarios(nombre, apellidoPaterno, correo);

        usuarios.add(usuario);

        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido Paterno: " + usuario.getApellidoPaterno());
        System.out.println("Correo: " + usuario.getCorreo());
        String rutaArchivo = "usuarios.txt";

        try {
            File archivo = new File(rutaArchivo);
            FileWriter escritor = new FileWriter(archivo, true);
            escritor.write("Nombre: " + nombre + "\n");
            escritor.write("Apellido Paterno: " + apellidoPaterno + "\n");
            escritor.write("Correo: " + correo + "\n\n");

            txtNombre.clear();
            txtApellidoPaterno.clear();
            txtCorreo.clear();

            System.out.println("Usuario guardado en el archivo: " + rutaArchivo);
            escritor.close();
        } catch (IOException e) {
            System.err.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}

