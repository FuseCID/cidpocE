package org.fuse.cidpoc.e;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.a.Item;
import org.fuse.cidpoc.c.C;
import org.fuse.cidpoc.d.D;

public class E implements Item {

    Item[] deps = new Item[] { new C(), new D() };

    @Override
    public List<Item> getDependecies() {
        return Arrays.asList(deps);
    }
}
