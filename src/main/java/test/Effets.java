package test;

import javax.swing.*;

import bandeau.Bandeau;

public abstract class Effets extends JPanel {
    protected String nomEffet;
    protected String descriptionEffet;

    public abstract void demarrerEffet(Bandeau bandeau);

    public Effets(String nom, String description){
        this.nomEffet = nom;
        this.descriptionEffet = description;
    }
}
