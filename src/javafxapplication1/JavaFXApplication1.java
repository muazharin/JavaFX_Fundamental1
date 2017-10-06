/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author zharin
 */
public class JavaFXApplication1 extends Application {
    
    int a=0;
    int b=0;
    
    @Override
    public void start(Stage primaryStage) {
        //Inisialisasi label dan button
        Label textJudul = new Label("Court Counter");
        Label textTimA = new Label("Team A");
        Label textTimB = new Label("Team B");
        Label vs = new Label("vs");
        Label angkaTimA = new Label("0");
        Label angkaTimB = new Label("0");
        Button plusTigaA = new Button("+3 Point");
        Button plusDuaA = new Button("+2 Point");
        Button plusTigaB = new Button("+3 Point");
        Button plusDuaB = new Button("+2 Point");
        Button reset = new Button("RESET");
        
        //membuat id untuk label-label yang ingin diatur khusus
        textJudul.setId("Judul");
        angkaTimA.setId("TimA");
        angkaTimB.setId("TimB");
        
        //memaksimalkan lebar value pada label dan button
        textJudul.setMaxWidth(Double.MAX_VALUE);
        plusTigaA.setMaxWidth(Double.MAX_VALUE);
        plusTigaB.setMaxWidth(Double.MAX_VALUE);
        plusDuaA.setMaxWidth(Double.MAX_VALUE);
        plusDuaB.setMaxWidth(Double.MAX_VALUE);
        reset.setMaxWidth(Double.MAX_VALUE);
        //textJudul.setStyle("-fx-color: blue;");
        
        //mengatur alignment label judul agar ke tengah
        textJudul.setAlignment(Pos.CENTER);
        reset.setAlignment(Pos.CENTER);
        
        //proses yg akan terjadi jika tombol +3 untuk tim A ditekan
        plusTigaA.setOnAction((ActionEvent event) -> {
            a=a+3;
            angkaTimA.setText(""+a);
        });
        
        //proses yg akan terjadi jika tombol +2 untuk tim A ditekan
        plusDuaA.setOnAction((ActionEvent event) -> {
            a=a+2;
            angkaTimA.setText(""+a);
        });
        
        //proses yg akan terjadi jika tombol +3 untuk tim B ditekan
        plusTigaB.setOnAction((ActionEvent event) -> {
            b=b+3;
            angkaTimB.setText(""+b);
        });
        
        //proses yg akan terjadi jika tombol +2 untuk tim B ditekan
        plusDuaB.setOnAction((ActionEvent event) -> {
            b=b+2;
            angkaTimB.setText(""+b);
        });
        
        //proses yg akan terjadi jika tombol reset ditekan
        reset.setOnAction((ActionEvent event) -> {
            a=0;
            b=0;
            angkaTimB.setText(""+b);
            angkaTimA.setText(""+a);
        });
        
        GridPane grid = new GridPane();
        //mengatur agar label menjadi align center pada grid
        GridPane.setHalignment(textTimA, HPos.CENTER);
        GridPane.setHalignment(textTimB, HPos.CENTER);
        GridPane.setHalignment(angkaTimA, HPos.CENTER);
        GridPane.setHalignment(angkaTimB, HPos.CENTER);
        
        grid.setId("pane");
        //grid.setGridLinesVisible(true);
        grid.setPadding(new Insets(15, 15, 15, 15));
        grid.setVgap(15);
        grid.setHgap(15);
        grid.setAlignment(Pos.TOP_CENTER);
        grid.add(textJudul, 1, 0, 9, 1);
        grid.add(textTimA, 0, 3);
        grid.add(textTimB, 10, 3);
        grid.add(vs, 5, 3);
        grid.add(angkaTimA, 0, 5);
        grid.add(angkaTimB, 10, 5);
        grid.add(plusTigaA, 0, 8);
        grid.add(plusDuaA, 0, 9);
        grid.add(plusTigaB, 10, 8);
        grid.add(plusDuaB, 10, 9);
        grid.add(reset, 1, 12, 9, 1);
        
        
        Scene scene = new Scene(grid, 500, 645);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(JavaFXApplication1.class.getResource("style.css").toExternalForm());
        primaryStage.setTitle("CountCourt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
}
