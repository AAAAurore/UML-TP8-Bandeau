package test;

import bandeau.Bandeau;

import java.awt.Color;

public class ColorAP extends Effets {
    Color color;

    @Override
    public void demarrerEffet(Bandeau bd){
        bd.setBackground(color);
    }

    public ColorAP(Bandeau bd, Color cA){
        super("ColorAP", "Changer la couleur de l'arrière-plan.");
        this.color = cA;
    }
}
