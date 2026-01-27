package data;
import model.Makeitem;
import java.util.ArrayList;

public class InsertData {

    private ArrayList<Makeitem> items = new ArrayList<>();
    private int id = 1;

    public void addItem(String name, int quantity,double importPrice,double exportPrice) {
        items.add(new Makeitem(id, name, quantity,importPrice,exportPrice));
        id++;
    }

    public void deleteItem(int id){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).id== id) {
                items.remove(i);
                id--;
                break;
            }
        }
    }

    public void increaseItem(int id,int value){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).id== id) {
                items.get(i).quantity+=value;
                break;
            }
        }
    }
    public void decreaseItem(int id,int value){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).id== id) {
                if (items.get(i).quantity>=value){
                    items.get(i).quantity-=value;
                    break;
                }else if(items.get(i).quantity==0){
                    System.out.println("Item is zero");
                }else{
                    System.out.println("Item's quantity < Decrease");
                }
            }
        }
    }


    public ArrayList<Makeitem> getItems() {
        return items;
    }
}
