import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;

public class NettyController implements Initializable {

    public Button send;
    public ListView<String> listView;
    public TextField text;
    private NettyNetwork network;

    public void sendCommand(ActionEvent actionEvent) {
        network.sendMessage(Arrays.asList(text.getText()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        network = NettyNetwork.getInstance();
    }
}
