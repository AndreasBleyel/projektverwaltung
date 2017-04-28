package models;

import java.util.HashMap;

public class Mitarbeiter extends Person {

    private String password;
    private HashMap<String, Aufgabe> bearbeiteteAufgaben;
    private HashMap<String, Float> arbeitszeitZuAufgabe;

    public Mitarbeiter(Integer id, String vorname, String nachname, String eMail, String password) {
        super(id, vorname, nachname, eMail);
        setPassword(password);
    }

    public Mitarbeiter(Integer id, String vorname, String nachname, String eMail, String password, Aufgabe bearbeiteteAufgaben) {
        super(id, vorname, nachname, eMail);
        setPassword(password);
        aufgabeZuMitarbeiterHinzufuegen(bearbeiteteAufgaben);
    }

    public void aufgabeZuMitarbeiterHinzufuegen(Aufgabe aufgabe) {
        bearbeiteteAufgaben.put(aufgabe.getId(), aufgabe);
    }

    public void aufgabeVonMitarbeiterTrennen(Aufgabe aufgabe) {
        bearbeiteteAufgaben.remove(aufgabe.getId());
        arbeitszeitZuAufgabe.remove(aufgabe.getId());
    }

    public void bucheArbeitszeitZuAufgabe(Aufgabe aufgabe, Float arbeitszeitInMinuten) {
        Float bisherigeArbeitszeit = 0f;

        if (arbeitszeitZuAufgabe.containsKey(aufgabe.getId())) {
            bisherigeArbeitszeit = arbeitszeitZuAufgabe.get(aufgabe.getId());
            arbeitszeitZuAufgabe.put(aufgabe.getId(), bisherigeArbeitszeit + arbeitszeitInMinuten);
        } else {
            arbeitszeitZuAufgabe.put(aufgabe.getId(), bisherigeArbeitszeit + arbeitszeitInMinuten);
        }
    }

    public void verringereArbeitszeitZuAufgabe(Aufgabe aufgabe, Float verringernUmInMinuten) {
        Float bisherigeArbeitszeit;

        if (arbeitszeitZuAufgabe.containsKey(aufgabe.getId())) {
            bisherigeArbeitszeit = arbeitszeitZuAufgabe.get(aufgabe.getId());
            arbeitszeitZuAufgabe.put(aufgabe.getId(), bisherigeArbeitszeit - verringernUmInMinuten);
        } else {
            //bisher keine AZ verbucht
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}