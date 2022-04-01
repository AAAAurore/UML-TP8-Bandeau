package test;

import bandeau.Bandeau;

import java.awt.Color;

public class ColorBackground extends Effets {
    Color color;

    @Override
    public void demarrerEffet(Bandeau bd){
        bd.setBackground(color);
    }

    public ColorBackground(Bandeau bd, Color cA){
        super("ColorBackground", "Changer la couleur de l'arrière-plan.");
        this.color = cA;
    }
}
