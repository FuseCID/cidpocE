package org.fuse.cidpoc.test;

import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Item.Capability;
import org.fuse.cidpoc.Item.Requirement;
import org.fuse.cidpoc.b.B;
import org.fuse.cidpoc.d.D;
import org.fuse.cidpoc.e.E;
import org.junit.Assert;
import org.junit.Test;

public class ETest {

    @Test
    public void testStatus() throws Exception {
        
        Item item = new E();
        item.transitiveStatus();
        
        List<Item> deps = item.getDependencies();
        Assert.assertEquals(2, deps.size());
        Item depB = deps.get(0);
        Item depD = deps.get(1);
        Assert.assertEquals("B-" + Item.getVersion(B.class), depB.getVName());
        Assert.assertEquals("D-" + Item.getVersion(D.class), depD.getVName());
        
        Capability cap = item.getCapability();
        Assert.assertEquals("E", cap.getName());
        Assert.assertEquals(0, cap.getValue());
        
        List<Requirement> reqs = item.getRequirements();
        Assert.assertEquals(2, reqs.size());
        Requirement reqB = reqs.get(0);
        Requirement reqD = reqs.get(1);
        Assert.assertTrue(reqB.matches(depB.getCapability()));
        Assert.assertTrue(reqD.matches(depD.getCapability()));

        String version = Item.getVersion(item.getClass());
        Assert.assertEquals("E-" + version, item.getVName());
        Assert.assertEquals("is satisfied", item.getStatus());
    }
}
