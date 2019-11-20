package test.cucumber;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

class SuperHerosTest {

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test SuperHerosTest
     */
    public SuperHerosTest () {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp () // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        SuperHeros venom = new SuperHeros(20,10);
        SuperHeros venom2 = new SuperHeros(20,10,new Weapon(10, "excalibur") );
    }

    @Test
    public void isAliveTest () {
        SuperHeros venom = new SuperHeros(20, 10);
        assertEquals(venom.isAlive(), true);
    }

    @Test
    public void attackWithWeaponTest () {
        SuperHeros venom = new SuperHeros(20, 10, new Weapon(3,"lol"));
        assertEquals(venom.getPowerWithWeapon(), 30);
    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown () // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }



    @Test
    void usethis () {
        SuperHeros venom2 = new SuperHeros(20,10,new Weapon(10, "excalibur") );
        Assert.assertEquals(true, venom2.usethis(1));
        Assert.assertEquals(false, venom2.usethis(6));
    }

    @Test
    void viewWeapons () {
        SuperHeros venom2 = new SuperHeros(20,10 );
        Assert.assertEquals("this is it", "Default/1", venom2.viewWeapons());
    }

    @Test
    void addWeepon () {
        SuperHeros venom2 = new SuperHeros(20,10 );
       venom2.addWeepon(new Weapon(1, "lol"));
        Assert.assertEquals("this is it", "Default/1lol/1", venom2.viewWeapons());

    }
}
