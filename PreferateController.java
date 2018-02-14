package carti;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class PreferateController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ies;

    @FXML
    void ies(ActionEvent event) {
    	Stage stage = (Stage) ies.getScene().getWindow();
		stage.hide();
    }

    @FXML
    void initialize() {

    }
}
