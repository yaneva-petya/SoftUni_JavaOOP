package Exercise.CollectionHierarchy;

import java.util.*;


public abstract class Collection {
    private static final int MAX_SIZE=100;
    protected List<String> items;

    public Collection(){
        this.items=new ArrayList<>();
    }
}
