package data;
import model.Makeitem;

public class InsertData{
    private Makeitem[] items;
    public InsertData(){
        items = new Makeitem[3];
        items[0] = new MakeItem(1, "Apple", 10);
        items[1] = new MakeItem(2, "Milk", 5);
        items[2] = new MakeItem(3, "Bread", 7);
    }
    public MakeItem[] getItems() {
        return items;
    }
}