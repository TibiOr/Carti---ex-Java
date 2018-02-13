package carti;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class PaginaPrincipalaController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private URL location;

	Stage autoriStage = new Stage();
	AutoriController ctrlautori;

	Stage cartiStage = new Stage();
	CartiController ctrlcarti;

	@FXML
	void autori(ActionEvent event) {
		autoriStage.showAndWait();
	}

	@FXML
	void carti(ActionEvent event) {
		cartiStage.showAndWait();
	}

	@FXML
	void info(ActionEvent event) {

	}

	@FXML
	void preferate(ActionEvent event) {

	}

	@FXML
	void initialize() {

		// fereastra autori

		try {
			// 1. incarc fisierul fxml
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Autori.fxml"));
			// 2. creez un container care va contine fereastra
			AnchorPane container = (AnchorPane) loader.load();
			// 3. preiau obiectul controller al ferestrei de dialog
			ctrlautori = loader.getController();
			// 4. impun titlul ferestrei adaugate
			autoriStage.setTitle("Alegeti autorul:");
			// 5. impun tipul ferestrei (modala sau nemodala)
			autoriStage.initModality(Modality.APPLICATION_MODAL);
			// 6. creez scena care contine interfata ferestrei
			Scene scena = new Scene(container);
			// 7. atasez obiectului infomasina (Stage) scena
			autoriStage.setScene(scena);
		} catch (IOException e) {
			// Exception gets thrown if the fxml file could not be loaded
			e.printStackTrace();
		}

		// fereastra carti

		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Carti.fxml"));
			AnchorPane container = (AnchorPane) loader.load();
			ctrlcarti = loader.getController();
			cartiStage.setTitle("Alegeti Cartea:");
			cartiStage.initModality(Modality.APPLICATION_MODAL);
			Scene scena = new Scene(container);
			cartiStage.setScene(scena);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
