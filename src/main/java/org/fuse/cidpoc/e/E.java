package org.fuse.cidpoc.e;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.Utils;
import org.fuse.cidpoc.b.B;
import org.fuse.cidpoc.d.D;

public class E extends Item {

    @Override
    public Capability getCapability() {
        return Utils.getCapability(E.class);
    }

    @Override
    public List<Requirement> getRequirements() {
        return Utils.getRequirements(E.class);
    }

    @Override
    public List<Item> getDependencies() {
        Item[] deps = new Item[] { new B(), new D() };
        return Arrays.asList(deps);
    }
}
