package org.fuse.cidpoc.e;

import java.util.Arrays;
import java.util.List;

import org.fuse.cidpoc.Item;
import org.fuse.cidpoc.b.B;
import org.fuse.cidpoc.d.D;

public class E extends Item {

    @Override
    public Capability getCapability() {
        return new Capability("E", 0);
    }

    @Override
    public List<Requirement> getRequirements() {
        Requirement[] reqs = new Requirement[] { new Requirement("B", 5, 8), new Requirement("D", 5, 8) };
        return Arrays.asList(reqs);
    }

    @Override
    public List<Item> getDependencies() {
        Item[] deps = new Item[] { new B(), new D() };
        return Arrays.asList(deps);
    }
}
