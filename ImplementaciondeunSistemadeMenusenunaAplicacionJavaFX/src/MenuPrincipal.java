import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuPrincipal extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Creamos la barra de menú
        MenuBar menuBar = new MenuBar();

        // Menú Archivo y sus elementos
        Menu fileMenu = new Menu("Archivo");
        MenuItem newMenuItem = new MenuItem("Nuevo");
        MenuItem openMenuItem = new MenuItem("Abrir");
        MenuItem saveMenuItem = new MenuItem("Guardar");
        MenuItem exitMenuItem = new MenuItem("Salir");
        fileMenu.getItems().addAll(newMenuItem, openMenuItem, saveMenuItem, new SeparatorMenuItem(), exitMenuItem);

        // Definimos acciones para los elementos del menú Archivo
        newMenuItem.setOnAction(event -> System.out.println("Nuevo archivo"));
        openMenuItem.setOnAction(event -> System.out.println("Abrir archivo"));
        saveMenuItem.setOnAction(event -> System.out.println("Guardar archivo"));
        exitMenuItem.setOnAction(event -> primaryStage.close());

        // Menú Editar y sus elementos
        Menu editMenu = new Menu("Editar");
        MenuItem cutMenuItem = new MenuItem("Cortar");
        MenuItem copyMenuItem = new MenuItem("Copiar");
        MenuItem pasteMenuItem = new MenuItem("Pegar");
        editMenu.getItems().addAll(cutMenuItem, copyMenuItem, pasteMenuItem);

        // Definimos acciones para los elementos del menú Editar
        cutMenuItem.setOnAction(event -> System.out.println("Cortar texto"));
        copyMenuItem.setOnAction(event -> System.out.println("Copiar texto"));
        pasteMenuItem.setOnAction(event -> System.out.println("Pegar texto"));

        // Menú Ayuda y sus elementos
        Menu helpMenu = new Menu("Ayuda");
        MenuItem aboutMenuItem = new MenuItem("Acerca de");
        helpMenu.getItems().add(aboutMenuItem);

        // Definimos acción para el elemento del menú Ayuda
        aboutMenuItem.setOnAction(event -> System.out.println("Acerca de la aplicación"));

        // Agregamos los menús a la barra de menú
        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);

        // Configuramos el layout de la escena con un BorderPane
        BorderPane root = new BorderPane();
        root.setTop(menuBar);
        root.setPadding(new Insets(10));

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Sistema de Menús JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
