package data;
import model.Makeitem;
import java.util.ArrayList;

public class InsertData {

    private ArrayList<Makeitem> items = new ArrayList<>();
    private int id = 1;

    public void addItem(String name, int quantity) {
        items.add(new Makeitem(id, name, quantity));
        id++;
    }

    public void deleteItem(int id){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).id== id) {
                items.remove(i);
                break;
            }
        }
    }

    public void increaseItem(int id){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).id== id) {
                items.get(i).quantity++;
                break;
            }
        }
    }
    public void decreaseItem(int id){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).id== id) {
                if (items.get(i).quantity>0){
                    items.get(i).quantity--;
                    break;
                }else{
                    System.out.println("Item is zero");
                }
            }
        }
    }


    public ArrayList<Makeitem> getItems() {
        return items;
    }
}
