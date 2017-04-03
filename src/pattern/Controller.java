package pattern;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer{

    @FXML TextField tfEintrag;
    @FXML TextArea ta0;
    Model model =  Model.getInstance();


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

    @Override
    public void update(Observable o, Object arg) {
    }


}
