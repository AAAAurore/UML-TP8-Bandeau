package test;

import bandeau.Bandeau;

import java.awt.Color;
import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        new Test().test();
    }

    public void test() {
        Bandeau bandeau = new Bandeau();
        ArrayList<Effets> le = new ArrayList<Effets>();
        Scenario sc = new Scenario(le);

        ChangerMsg cm = new ChangerMsg(bandeau, "Hello!");
        Zoom zo = new Zoom(bandeau);
        ChangerMsg cm2 = new ChangerMsg(bandeau, "How are you?");
        ColorAP cAP = new ColorAP(bandeau, Color.LIGHT_GRAY);
        ColorMsg cMsg = new ColorMsg(bandeau, Color.WHITE);
        Rotation ro = new Rotation(bandeau);
        ColorAP cAP2 = new ColorAP(bandeau, Color.YELLOW);
        ColorMsg cMsg2 = new ColorMsg(bandeau, Color.GREEN);
        DeZoom deZo = new DeZoom(bandeau);
        
        sc.ajouterEffet(bandeau, cm, 1);
        sc.ajouterEffet(bandeau, zo, 1);
        sc.ajouterEffet(bandeau, cm2, 1);
        sc.ajouterEffet(bandeau, cAP, 1);
        sc.ajouterEffet(bandeau, cMsg, 1);
        sc.ajouterEffet(bandeau, ro, 1);
        sc.ajouterEffet(bandeau, cAP2, 1);
        sc.ajouterEffet(bandeau, cMsg2, 1);
        sc.ajouterEffet(bandeau, deZo, 1);

        sc.demarrerScenario(bandeau);
        bandeau.close();
    }
}
