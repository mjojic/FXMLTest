package application;

import java.io.IOException;

import javafx.stage.*;
import javafx.scene.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.event.ActionEvent;

import javafx.scene.control.*;



public class Page1Controller
{
	@FXML
	Button press;
	
	@FXML
	public void pressed(ActionEvent event)
	{
		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Page2.fxml"));
			Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
			Scene scene = new Scene(fxmlLoader.load());
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}