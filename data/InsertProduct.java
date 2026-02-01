package data;
import model.Product;
import java.util.ArrayList;

public class InsertProduct {

    private ArrayList<Product> items = new ArrayList<>();
    private int id = 1;

    public void addItem(String category,String name,int quantity,double importPrice,int importDate,double exportPrice,int expiredDate) {
        items.add(new Product(id,category,name,quantity,importPrice,importDate,exportPrice,expiredDate));
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

    public void increaseItemByValue(int id,int value){
       for (int i = 0; i < items.size(); i++) {
            if (items.get(i).id== id) {
                items.get(i).quantity+=value;
                break;
            }
        }
    }
    public void decreaseItemByValue(int id,int value){
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
                    System.out.println("Item's quantity is 0");
                    break;
                }
            }
        }
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}
