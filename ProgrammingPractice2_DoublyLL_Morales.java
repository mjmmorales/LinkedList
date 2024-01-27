/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Morales;

/**
 *
 * @author mj
 */
import java.util.Random;

public class ProgrammingPractice2_DoublyLL_Morales {

    public static void main(String[] args) {
        
        DoublyLinkedList list = new DoublyLinkedList();
        
        Random r = new Random();
        for (int i = 0; i < 100000; i++) {
            int newValue;
            boolean isUnique;
            do {
                newValue = r.nextInt(200000);
                isUnique = true;
                DataItemChild current = list.Head.getNext();
                while (current != list.Tail) {
                    if (current.getItem() == newValue) {
                        isUnique = false;
                        break;
                    }
                    current = current.getNext();
                }
            } while (!isUnique);

            DataItemChild newItem = new DataItemChild(newValue);
            list.insert(newItem);
        }
            
        // print the 100K random numbers
        System.out.print(list.numofItems() + " number of items.");
        list.PrintList();
        System.out.println();
        
        // update the values by adding 2
        DataItemChild current = list.Head.getNext();
        while (current != list.Tail) {
            current.setItem(current.getItem() + 2);
            current = current.getNext();
        }
        
        // print the updated list
        System.out.print("Updated List after adding 2 to each value:");
        list.PrintList();
        System.out.println();
        
        // delete half of the data items
        int itemsToDelete = list.numofItems() / 2;
        for (int i = 0; i < itemsToDelete; i++) {
            list.delete(0);
        }

        // Print the list after deleting half of the data items
        System.out.print("List after deleting half of the data items:");
        list.PrintList();

    }
}
