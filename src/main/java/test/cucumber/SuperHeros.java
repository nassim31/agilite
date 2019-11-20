package test.cucumber;

import java.awt.*;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SuperHeros {

        // variables d'instance - remplacez l'exemple qui suit par le vôtre
        // les attributs de ma classe
        private int lifePoints;
        private int power;
        private List<Weapon> arm= new ArrayList<Weapon>();
        private int choosen=0;

        //mes getters

        public int getLifePoints(){
            return this.lifePoints;
        }

        public int getPower(){
            return this.power;
        }

        public List<Weapon> getArm() {
			return arm;
		}

		// my setters
        public void setLifePoints(int lp){
            this.lifePoints+=lp;
        }

        public void setPower(int pUp){
            this.power+=pUp;
        }

        // Constructor of my Class

        public SuperHeros( int lifePoints,int power )
        {
            this.lifePoints=lifePoints;
            this.power=power;
            this.arm.add(new Weapon(1,"Default"));
        }
        public SuperHeros( int lifePoints,int power,Weapon wep )
        {
            this.lifePoints=lifePoints;
            this.power=power;
            this.arm.add(new Weapon(1,"Default"));
            this.arm.add(wep);
            this.choosen++;
        }
        // check if he is still alive
        public boolean isAlive (){
            return lifePoints>0;
        }


        public Boolean usethis(int choose){
                if(choose<arm.toArray().length && choose>0){
                    choosen=choose;
                    return true;
            }else {
                    return false;
                }
        }
        public int getPowerWithWeapon(){
            return arm.get(choosen).getRendement()*power;
        }
        public void attack(SuperHeros ennemi){
            int lp =  arm.get(choosen).getRendement()*power;
            ennemi.setLifePoints(-lp);
        }
        //Weapons list
    public String viewWeapons(){
     String tmp ="";
        for (Weapon l: arm) {
           tmp+=l.toString();
        }
    return tmp;
    }

    public void  addWeepon(Weapon tmp){
            this.arm.add(tmp);
    }
    

    }

