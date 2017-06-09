package org.fuse.cidpoc.test;

import org.fuse.cidpoc.a.Item;
import org.fuse.cidpoc.a.Utils;
import org.fuse.cidpoc.e.E;
import org.junit.Assert;
import org.junit.Test;

public class ETest {

    @Test
    public void testStatus() throws Exception {
        
        Item item = new E();
        item.transitiveStatus();
        
        String version = Utils.getVersion(item.getClass());
        String status = Utils.getStatus(item.getClass());
        Assert.assertEquals("E-" + version + " is " + status, item.getMessage());
    }
}
