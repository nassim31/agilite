package test.cucumber;

public class Weapon {
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private int rendement;
    private String wName;

    /**
     * Constructeur d'objets de classe Weapon
     */
    public Weapon(int rend,String name)
    {
        // initialisation des variables d'instance
        this.rendement=rend;
        this.wName=name;
    }

    public String getwName () {
        return wName;
    }

    public void setwName (String wName) {
        this.wName = wName;
    }

    // getter du rendement
    public int  getRendement(){
        return rendement;
    }

    public void  setRendement(int red){
        this.rendement=red;
    }

    @Override
    public String toString () {
        String msg=this.wName+"/"+rendement;
        return msg;
    }
}
