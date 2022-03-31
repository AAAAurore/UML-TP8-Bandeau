package test;

import bandeau.Bandeau;

import java.util.ArrayList;
import java.util.List;

public class Scenario {
    Bandeau myBandeau;
    List<Effets> listEffets = new ArrayList<Effets>();

    public void ajouterEffet(Bandeau bd, Effets eff, int rep){
        this.myBandeau = bd;
        for(int i = 0; i < rep; i++){
            listEffets.add(eff);
        }
    }

    public void demarrerScenario(Bandeau bd){
        for(Effets eff : listEffets){
            eff.demarrerEffet(bd);
            bd.sleep(1000);
        }
    }

    public Scenario(List<Effets> lE){
        this.listEffets = lE;
    }
}
