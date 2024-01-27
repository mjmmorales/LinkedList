/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Morales;

/**
 *
 * @author mj
 */
public class DataItemChild extends DataItem {
    
    DataItemChild next;
    DataItemChild previous;
    
    DataItemChild(){
        super();
        next = null;
        previous = null;
    }
    DataItemChild(int data) { //(short data)
        super(data);
        next = null;
        previous = null;
    }
    DataItemChild(int data, DataItemChild n, DataItemChild p){
        super(data);
        next = n;
        previous = p;
    }
    DataItemChild(DataItemChild dc){
        this.setItem(dc.getItem());
        next = dc.getNext();
        previous = dc.getPrev();
    }
    
    public void setNext(DataItemChild nextItem){
        next = nextItem;
    }
    public DataItemChild getNext(){
        return next;
    }
    public void setPrev(DataItemChild prevItem){
        previous = prevItem;
    }
    public DataItemChild getPrev(){
        return previous;
    }

}
