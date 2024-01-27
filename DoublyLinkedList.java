/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList_Morales;

/**
 *
 * @author mj
 */
public class DoublyLinkedList {

    DataItemChild Head;
    DataItemChild Tail;
    int numofItems;

    DoublyLinkedList() {
        MakeEmpty();
    }

    public void MakeEmpty() {
        Head = new DataItemChild();
        Tail = new DataItemChild();
        numofItems = 0;
        Head.setNext(Tail);
        Head.setPrev(null);
        Tail.setPrev(Head);
        Tail.setNext(null);
    }

    public int numofItems() {
        return numofItems;
    }

    public void PrintList() {
        if (numofItems > 0) {
            DataItemChild navigate = Head.getNext();
            System.out.println();
            while (navigate != Tail) {
                System.out.print(navigate.getItem() + "\n ");
                navigate = navigate.getNext();
            }
            System.out.println();
        }
    }

    public int FindbyValue(DataItemChild dc) {
        if (numofItems > 0) {
            int x = 0, y = numofItems - 1;
            DataItemChild navigate1 = Head.getNext();
            DataItemChild navigate2 = Tail.getPrev();
            while (x <= y) {
                if (navigate1.equals(dc)) {
                    return x;
                }
                if (navigate2.equals(dc)) {
                    return y;
                }
                navigate1 = navigate1.getNext();
                navigate2 = navigate2.getPrev();
                x++;
                y--;
            }
            if (navigate1.getItem() == dc.getItem()) {
                return x;
            } else if (navigate2.getItem() == dc.getItem()) {
                return y;
            } else {
                return - 1;
            }
        }
        return - 1;
    }

    public DataItemChild findbyIndex(int loc) {
        if (numofItems > 0 && loc < numofItems) {
            int x = 0, y = numofItems - 1;
            DataItemChild navigate1 = Head.getNext();
            DataItemChild navigate2 = Tail.getPrev();
            while (navigate1 != navigate2) {
                if (x == loc) {
                    return navigate1;
                }
                if (y == loc) {
                    return navigate2;
                }
                navigate1 = navigate1.getNext();
                navigate2 = navigate2.getPrev();
                x++;
                y--;
            }

        }
        return null;
    }

    public boolean insert(DataItemChild newd, int loc) {
        DataItemChild navigate = findbyIndex(loc);

        if (navigate != null) {
            newd.setNext(navigate);
            newd.setPrev(navigate.getPrev());
            navigate.getPrev().setNext(newd);
            navigate.setPrev(newd);
            numofItems++;
            return true;
        }
        if (loc == numofItems) {
            newd.setNext(Tail);
            newd.setPrev(Tail.getPrev());
            Tail.getPrev().setNext(newd);
            Tail.setPrev(newd);
            numofItems++;
            return true;

        }
        return false;
    }

    public void insert(DataItemChild newd) {
        insert(newd, numofItems);
    }

    public void delete(int index) {
        DataItemChild temp = findbyIndex(index);

        temp.getNext().setPrev(temp.getPrev());
        temp.getPrev().setNext(temp.getNext());
    }

    public void delete(DataItemChild d) {
        int temp = FindbyValue(d);

        delete(temp);
    }

}

