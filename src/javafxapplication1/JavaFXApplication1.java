/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
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
        Label textJudul = new Label("SKOR");
        Label textTimA = new Label("Tim A");
        Label textTimB = new Label("Tim B");
        Label vs = new Label("vs");
        Label angkaTimA = new Label("0");
        Label angkaTimB = new Label("0");
        Button plusTigaA = new Button("+3");
        Button plusDuaA = new Button("+2");
        Button plusTigaB = new Button("+3");
        Button plusDuaB = new Button("+2");
        Button reset = new Button("RESET");
        textJudul.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 20) );
        vs.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 20) );
        textTimA.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 15) ); 
        textTimB.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 15) );
        angkaTimA.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 70) );
        angkaTimB.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 70) );
        reset.setFont(Font.font("Tahoma", FontWeight.BOLD, FontPosture.REGULAR, 20) );
        textJudul.setMaxWidth(Double.MAX_VALUE);
        plusTigaA.setMaxWidth(Double.MAX_VALUE);
        plusTigaB.setMaxWidth(Double.MAX_VALUE);
        plusDuaA.setMaxWidth(Double.MAX_VALUE);
        plusDuaB.setMaxWidth(Double.MAX_VALUE);
        reset.setMaxWidth(Double.MAX_VALUE);
        //textJudul.setStyle("-fx-border-color: blue;");
        textJudul.setAlignment(Pos.CENTER);
        reset.setAlignment(Pos.CENTER);
        
        plusTigaA.setOnAction((ActionEvent event) -> {
            a=a+3;
            angkaTimA.setText(""+a);
        });
        
        plusDuaA.setOnAction((ActionEvent event) -> {
            a=a+2;
            angkaTimA.setText(""+a);
        });
        
        plusTigaB.setOnAction((ActionEvent event) -> {
            b=b+3;
            angkaTimB.setText(""+b);
        });
        
        plusDuaB.setOnAction((ActionEvent event) -> {
            b=b+2;
            angkaTimB.setText(""+b);
        });
        
        reset.setOnAction((ActionEvent event) -> {
            a=0;
            b=0;
            angkaTimB.setText(""+b);
            angkaTimA.setText(""+a);
        });
        
        GridPane grid = new GridPane();
        //grid.setGridLinesVisible(true);
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);
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
        
        Scene scene = new Scene(grid, 450, 500) ;
        primaryStage.setTitle("CountCourt");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
