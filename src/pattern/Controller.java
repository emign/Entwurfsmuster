package pattern;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML TextField tfEintrag;
    @FXML TextArea ta0;
    Model model = new Model();

    @FXML public void initialize(){
        refreshAnzeige();
    }

    @FXML public void einfuegenPressed(){
        model.add(tfEintrag.getText());
        refreshAnzeige();
    }

    @FXML public void resetPressed(){
        model.reset();
        refreshAnzeige();
    }

    private void refreshAnzeige(){
        ta0.setText(model.getValues());
    }


}
