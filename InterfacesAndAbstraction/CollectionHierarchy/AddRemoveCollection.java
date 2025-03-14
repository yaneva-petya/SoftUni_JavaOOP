package Exercise.CollectionHierarchy;

public class AddRemoveCollection extends Collection implements Addable,AddRemovable{
    @Override
    public String remove() {
        String itemToRemove = this.items.get(this.items.size() - 1);
        this.items.remove(itemToRemove);
        return itemToRemove;
    }

    @Override
    public int add(String item) {
        this.items.add(0,item);
        return 0;
    }
}
