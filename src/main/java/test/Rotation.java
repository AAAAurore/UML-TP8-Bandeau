package test;

import bandeau.Bandeau;

public class Rotation extends Effets {
    public void demarrerEffet(Bandeau bd){
        for (int i = 0; i <= 100; i++) {
            bd.setRotation(2 * Math.PI * i / 100);
            bd.sleep(100);
        }
    }

    public Rotation(Bandeau bd){
        super("Rotation", "Faire tourner le message.");
    }
}
