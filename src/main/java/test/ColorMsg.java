package test;

import bandeau.Bandeau;

import java.awt.Color;

public class ColorMsg extends Effets {
    Color color;

    @Override
    public void demarrerEffet(Bandeau bd){
        bd.setForeground(color);
    }

    public ColorMsg(Bandeau bd, Color cMsg){
        super("ColorMsg", "Changer la couleur du message.");
        this.color = cMsg;
    }
}
