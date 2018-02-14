package carti;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class DespreAplicatieController {

	@FXML
	private ResourceBundle resources;

	@FXML
	private Button binchide;

	@FXML
	private URL location;

	@FXML
	void iesire(ActionEvent event) {
		Stage stage = (Stage) binchide.getScene().getWindow();
		stage.hide();
	}

	@FXML
	void initialize() {

	}
}
