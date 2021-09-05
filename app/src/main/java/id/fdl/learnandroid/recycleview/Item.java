package id.fdl.learnandroid.recycleview;

import android.Manifest;

import java.security.acl.Permission;
import java.util.ArrayList;

public class Item {


    /*
    "ACCESS_FINE_LOCATION","ACCESS_COARSE_LOCATION"
            ,"READ_CONTACTS", "WRITE_CONTACTS", "CAMERA", "CALL_PHONE", "ANSWER_PHONE_CALLS"
            , "SEND_SMS", "RECEIVE_SMS", "READ_SMS", "READ_EXTERNAL_STORAGE", "WRITE_EXTERNAL_STORAGE"
     */

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static ArrayList<Item> generateItemList(){
        ArrayList<Item> itemList = new ArrayList<>();

        Item item = new Item();
        item.setName(Manifest.permission.ACCESS_FINE_LOCATION);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.ACCESS_COARSE_LOCATION);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.READ_CONTACTS);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.WRITE_CONTACTS);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.CAMERA);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.CALL_PHONE);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.ANSWER_PHONE_CALLS);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.SEND_SMS);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.RECEIVE_SMS);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.READ_SMS);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.READ_EXTERNAL_STORAGE);
        itemList.add(item);
        item = new Item();
        item.setName(Manifest.permission.WRITE_EXTERNAL_STORAGE);
        itemList.add(item);

        return itemList;
    }
}
