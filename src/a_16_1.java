import java.util.LinkedList;

public class a_16_1
{
    /*Write a method called set that accepts an index and a value and sets the list’s element at that index to have the given
    value. You may assume that the index is between 0 (inclusive) and the size of the list (exclusive).*/

    //initiate standard variables
    private ListNode front;

    //too test the method
    public void run()
    {
        //I have made an add-method to ListNode
        addNodeToList(0,9);
        addNodeToList(1,1);
        addNodeToList(2,9);
        addNodeToList(3,3);
        addNodeToList(4,2);
        addNodeToList(5,3);

        set(3,7);
    }

    //sets/change the elements with index´s value
    public ListNode set(int index, int value)
    {
        ListNode current = front;

        //if the list is empty
        if (front == null)
        {
            return front;
        }

        //I use the for-loop to get the index, and an if-statement to set value
        for (int i = 0; i < index; i++)
        {
            //this if-statement stops the loop, because you enter a index above the length of list.
            if (current == null)
            {
                System.out.println("the index does not exist");
                return front;
            }
            if (i == index-1)
            {
                System.out.println("The value for index "+ index+ " now are: " + current.data);
                current.data = value;
                System.out.println("The value for index "+ index+ " is change to: " + current.data);
            }
            current = current.next;
        }


        return front;
    }

    //an add-method to ListNode that adds a value to the list
    public void addNodeToList(int index, int value)
    {
        //if index is 0, then add value to front
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        // else add a value to the end of list
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
