package pattern;

import java.util.Arrays;
import java.util.Observable;

/**
 * Created by nicolaiemig on 03.04.17.
 * Sonst ist nichts zu sagen
 */
class Model extends Observable {

    private static Model instance;
    private static String[] fruchtListe;
    private static String[] originalFruchtListe;
    private Controller controller;

    private Model(){
        //System.err.println("Singleton! Keine Objekte hiervon erzeugen. Verwenden Sie getInstance()");
    }

    static Model getInstance() {
        if (Model.instance == null){
            Model.instance = new Model();
        }
        originalFruchtListe = new String[]{"Apfel", "Birne", "Ananas", "Banane", "Kotzfrucht"};
        fruchtListe = Arrays.copyOf(originalFruchtListe, originalFruchtListe.length);
        return Model.instance;
    }

    String getValues() {
        String returnString = "";
        StringBuilder sb = new StringBuilder();
        for (String frucht : fruchtListe){
            sb.append(frucht);
            sb.append("\n");
        }
        return sb.toString();
    }

    void add(String value) {
        // Neues Array erzeugen (muss ja um 1 größer sein)
        String[] neueFruchtListe = Arrays.copyOf(fruchtListe, fruchtListe.length+1);
        neueFruchtListe[neueFruchtListe.length-1] = value;
        fruchtListe = neueFruchtListe;
        changed();
    }

    void reset() {
        fruchtListe = Arrays.copyOf(originalFruchtListe,originalFruchtListe.length);
        changed();
    }

    void addController(Controller controller) {
    }

    private void changed(){
    }


}
