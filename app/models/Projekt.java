package models;

import java.util.HashMap;

public class Projekt {

  private String bezeichnung;
  private String id;

  private HashMap<String, Aufgabe> zugehoerigeAufgaben;
  private Kunde zuKunde;

  public Projekt(String bezeichnung, String id, HashMap aufgaben, Kunde zuKunde) {
    setBezeichnung(bezeichnung);
    setId( id);
    setZugehoerigeAufgaben(aufgaben);
    setZuKunde(zuKunde);
  }

  public Projekt(String bezeichnung, String id, Kunde zuKunde) {
    setBezeichnung(bezeichnung);
    setId( id);
    setZuKunde(zuKunde);
  }


  public void aufgabeZuProjektHinzufuegen(Aufgabe aufgabe){
    zugehoerigeAufgaben.put(aufgabe.getId(),aufgabe);
  }

  public void aufgabeVonProjektEntfernen(Aufgabe aufgabe){
    zugehoerigeAufgaben.remove(aufgabe.getId());
  }

  public void setZugehoerigeAufgaben(HashMap<String, Aufgabe> zugehoerigeAufgaben) {
    this.zugehoerigeAufgaben = zugehoerigeAufgaben;
  }

  public String getBezeichnung() {
    return bezeichnung;
  }

  public void setBezeichnung(String bezeichnung) {
    this.bezeichnung = bezeichnung;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Kunde getZuKunde() {
    return zuKunde;
  }

  public void setZuKunde(Kunde zuKunde) {
    this.zuKunde = zuKunde;
  }
}