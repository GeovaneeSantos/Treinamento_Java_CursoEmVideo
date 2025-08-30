/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package olamundojavafx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author Geovane
 */
public class FXMLDocumentController implements Initializable {
    // implements tambem é um recurso de poo, sendo interface
    @FXML
    //"o @FXML serve para idenificar os controles existentes no arquivo fxml
    private Label lblMensagem;
    // a label feita la no scenebuilder tem id "lblMensagem"
    private Button btnClick;
    // mesma coisa da label, o otao tem id "btnClick"
    @FXML
    private void clicouBotao(ActionEvent event) {
        lblMensagem.setText("Olá Mundo");
        //SetText muda o texto da label
    }
    // aqui cria-se uma função que analisa um evento, "clicouBotao", que é um evento atrelado ao botao "btnClick"
    //ele analisa a ocorrencia do evento e executa o bloco de comando
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
