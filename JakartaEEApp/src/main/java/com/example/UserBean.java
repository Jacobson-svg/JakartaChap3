package com.example;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
@Named
@RequestScoped
public class UserBean {
private String nom;
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String direBonjour() {
return "Bonjour, " + nom + "!";
}
}