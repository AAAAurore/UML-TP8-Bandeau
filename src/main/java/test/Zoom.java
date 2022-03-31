package test;

import bandeau.Bandeau;

import java.awt.Font;

public class Zoom extends Effets {    
    public void demarrerEffet(Bandeau bd){
        String name = super.getFont().getName();
        int style = super.getFont().getStyle();
        for (int i = 5; i < 60; i += 5) {
            bd.setFont(new Font(name, style, 5 + i));
            bd.sleep(100);
        }
    }

    public Zoom(Bandeau bd){
        super("Zoom", "Faire zoomer le message.");
        bd.getFont();
    }
}
