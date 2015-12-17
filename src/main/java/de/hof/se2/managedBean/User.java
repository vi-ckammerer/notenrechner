/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *Erzeugt einen User, der für die Session Persistent eingeloggt bleibt und in andere
 * BEans Injected werden kann.
 * @author Schmidbauer
 */
@Named(value = "user")
@RequestScoped
@LoggedIn
public class User{
    

    private int userId=0;
    private int rolle;
    private String password;
    private String vorname;
    private String nachname;
    
    /**
     * Holt vornamen des Benutzers
     * @return Vorname des BEnutzers
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Setzt vornamen des BEnutzers
     * @param vorname Vorname des BEnutzers
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Holt NAchnamen eines USers ab
     * @return Nachname eines BEnutzers
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * Setzt NAchname des Users auf den übergebenen String
     * @param nachname Nachname des Users
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * Welche Rolle hat der Benutzer? Admin, Student oder Professor
     * @return Rolle des Users
     */
    public int getRolle() {
        return rolle;
    }

    /**
     * Setzt Rolle auf den angegebenen Wert
     * @param rolle Integerwert der Rolle
     */
    public void setRolle(int rolle) {
        this.rolle = rolle;
    }

    /**
     * Holt Userid mit der sich der Benutzer eingeloggt hat
     * @return ID des Benutzers
     */
    public int getUserId() {
//        if (userId==0) return 1;
        return userId;
    }

    /**
     * Setzt die UserID auf den eingeloggten Benutzer
     * @param userId ID des eingeloggten USers
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Holt PAsswort des BEnutzers ab
     * @return Passwort des Users als String
     */
    public String getPassword() {
        return password;
    }

    /**
     * Setzt PAsswort auf das in der DB gespeicherte Password
     * @param password String des Passworts des Benutzers
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Erzeugt einen String mit sämtlichen Informationen des eingeloggten Users
     * @return String mit Infos über den USer
     */
    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", vorname=" + vorname + ", nachname=" + nachname + '}';
    }
    
    

}
