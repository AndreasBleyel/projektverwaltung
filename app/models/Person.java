package models;

public abstract class Person {

    private Integer id;

    public String vorname;

    public String nachname;

    private String eMail;

    public Person(Integer id, String vorname, String nachname, String eMail) {
        setId(id);
        setVorname(vorname);
        setNachname(nachname);
        seteMail(eMail);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}