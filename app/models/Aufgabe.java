package models;

public class Aufgabe {

    private String id;
    private String beschreibung;
    private float dauer;
    private float kosten;
    private Projekt zuProjekt;


    public Aufgabe(String id, String beschreibung, float dauer, Projekt zuProjekt, float kosten) {
        setId(id);
        setBeschreibung(beschreibung);
        setDauer(dauer);
        setZuProjekt(zuProjekt);
        setKosten(kosten);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public float getDauer() {
        return dauer;
    }

    public void setDauer(float dauer) {
        this.dauer = dauer;
    }

    public Projekt getZuProjekt() {
        return zuProjekt;
    }

    public void setZuProjekt(Projekt zuProjekt) {
        this.zuProjekt = zuProjekt;
    }

    public float getKosten() {
        return kosten;
    }

    public void setKosten(float kosten) {
        this.kosten = kosten;
    }
}