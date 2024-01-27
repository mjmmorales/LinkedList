/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Morales;

/**
 *
 * @author mj
 */
public class DataItem {

    private int data;

    DataItem() {
        data = 0;
    }

    DataItem(int d) {
        data = d;
    }

    DataItem(DataItem Item) {
        data = Item.data;
    }

    public void copyDataItem(DataItem Item) {
        this.data = Item.data;
    }

    public void setItem(int data) {
        this.data = data;
    }

    public DataItem getDataItem() {
        return this;
    }

    public int getItem() {
        return data;
    }

    public boolean equal(DataItem Item) {
        return this.data == Item.data;
    }

    @Override
    public String toString() {
        return data + "";
    }
}
