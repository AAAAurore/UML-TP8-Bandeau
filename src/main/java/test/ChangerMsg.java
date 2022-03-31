package test;

import bandeau.Bandeau;

public class ChangerMsg extends Effets {
    String message;

    @Override
    public void demarrerEffet(Bandeau bd){
        bd.setMessage(message);
    }

    public ChangerMsg(Bandeau bd, String msg){
        super("ChangerMsg", "Changer le message.");
        this.message = msg;
    }
}
