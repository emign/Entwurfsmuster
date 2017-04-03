package pattern;

import java.util.Arrays;

/**
 * Created by nicolaiemig on 03.04.17.
 */
public class Model {
    private String[] fruchtListe;
    private String[] originalFruchtListe = new String[]{"Apfel", "Birne", "Ananas", "Banane", "Kotzfrucht"};

    public Model(){
        this.reset();
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
    }

    public void reset(){
        fruchtListe = originalFruchtListe;
    }


}
