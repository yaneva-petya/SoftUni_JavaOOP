package Exercise.CollectionHierarchy;

public class MyListImpl extends Collection implements Addable, AddRemovable, MyList{
    @Override
    public String remove() {
        String itemToRemove = this.items.get(0);
        this.items.remove(itemToRemove);
        return itemToRemove;
    }

    @Override
    public int add(String item) {
        this.items.add(0,item);
        return 0;
    }

    @Override
    public int getUsed() {
        return this.items.size();
    }
}
