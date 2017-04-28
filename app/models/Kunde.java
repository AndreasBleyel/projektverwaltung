package models;

import java.util.HashMap;

public class Kunde extends Person {

    private String anschrift;
    private HashMap<String, Projekt> auftraggeberVon;

    public Kunde(Integer id, String vorname, String nachname, String eMail, String anschrift) {
        super(id, vorname, nachname, eMail);
        setAnschrift(anschrift);
    }

    public Kunde(Integer id, String vorname, String nachname, String eMail, String anschrift, Projekt auftraggeberVon) {
        super(id, vorname, nachname, eMail);
        setAnschrift(anschrift);
        weiseProjektzu(auftraggeberVon);
    }

    public void weiseProjektzu(Projekt projekt) {
        auftraggeberVon.put(projekt.getId(), projekt);
    }

    public void trenneProjektVonKunde(Projekt projekt) {
        auftraggeberVon.remove(projekt.getId());
    }

    public String getAnschrift() {
        return anschrift;
    }

    public void setAnschrift(String anschrift) {
        this.anschrift = anschrift;
    }

}