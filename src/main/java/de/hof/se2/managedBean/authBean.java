/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Named;

/**
 *
 * @author Schmidbauer
 */
@Stateless
@LocalBean
@Named(value = "login")
public class authBean {

    @Current userDaten credentials;
    @PersistenceContext
    EntityManager em;

    public User user;

    public void login() {

        List<User> results = userDatabase.createQuery(
                "select u from Personen p where p.idPersonen=:username and u.Passwort=:password")
                .setParameter("username", credentials.getUsername())
                .setParameter("password", credentials.getPassword())
                .getResultList();

        if (!results.isEmpty()) {

            user = results.get(0);

        }

    }

    public void logout() {

        user = null;

    }

    public boolean isLoggedIn() {

        return user != null;

    }

    @Produces
    @LoggedIn
    User getCurrentUser() {

        return user;

    }
}