package pattern;

import java.util.Arrays;
import java.util.Observable;

/**
 * Created by nicolaiemig on 03.04.17.
 */
public class Model extends Observable{

    private Controller controller;
    private static Model instance;

    private static String[] fruchtListe;
    private  static String[] originalFruchtListe;

    private Model(){
        //System.err.println("Singleton! Keine Objekte hiervon erzeugen. Verwenden Sie getInstance()");
    }

    public static Model getInstance(){
        if (Model.instance == null){
            Model.instance = new Model();
        }
        originalFruchtListe = new String[]{"Apfel", "Birne", "Ananas", "Banane", "Kotzfrucht"};
        fruchtListe = Arrays.copyOf(originalFruchtListe, originalFruchtListe.length);
        return Model.instance;
    }

    public String getValues(){
        String returnString = "";
        StringBuilder sb = new StringBuilder();
        for (String frucht : fruchtListe){
            sb.append(frucht);
            sb.append("\n");
        }
        return sb.toString();
    }

    public void add(String value){
        // Neues Array erzeugen (muss ja um 1 größer sein)
        String[] neueFruchtListe = Arrays.copyOf(fruchtListe, fruchtListe.length+1);
        neueFruchtListe[neueFruchtListe.length-1] = value;
        fruchtListe = neueFruchtListe;
        changed();
    }

    public void reset(){
        fruchtListe = Arrays.copyOf(originalFruchtListe,originalFruchtListe.length);
        changed();
    }

    public void addController(Controller controller){
        this.controller = controller;
        addObserver(controller);
    }

    private void changed(){
        setChanged();
        notifyObservers();
    }


}
