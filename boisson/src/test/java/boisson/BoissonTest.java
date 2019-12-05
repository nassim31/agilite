package boisson;

import org.junit.Assert;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

public class BoissonTest {
	
	@Test
    public void effects() {
        Boisson a=new Boisson("potionvieee",10,15.2);
        Boisson b=new Boisson("potionforce",30,60.0);
        Boisson c=new Boisson("nada",20,30.0);
        Boisson d=new Boisson("blablabla",5,1.0);
        Assert.assertEquals("vie", a.effects());
        Assert.assertEquals("force", b.effects());
        Assert.assertEquals("nada", c.effects());
        Assert.assertEquals("nada", d.effects());
    }
}
