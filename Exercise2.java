package Chapter16;

import java.util.NoSuchElementException;

public class Exercise2
{
    /*
          Write a method called max that returns the maximum value in a list of integers. If the list is empty, it should throw a
        NoSuchElementException.
     */

    public static ListNode front;

    public static void main(String[] args)
    {

        addNodeToList(0,9);
        addNodeToList(1,1);
        addNodeToList(2,9);
        addNodeToList(3,3);
        addNodeToList(4,2);
        addNodeToList(5,3);
        addNodeToList(6,12);
        addNodeToList(7,3);
        addNodeToList(8,4);
        addNodeToList(9,1);

        System.out.println(max());
    }

    public static int max()
    {
        int max = 0;

        if(front == null)
        {
            throw new NoSuchElementException();
        }

        for (ListNode current = front; current != null; current = current.next)
        {
            max++;
        }

        return max;
    }

    private static void addNodeToList(int index, int value)
    {
        if(index == 0)
        {
            front = new ListNode(value, front);
        }
        else
        {
            ListNode current = front;
            for (int i = 0; i < index-1 ; i++)
            {
                current = current.next;
            }
            current.next = new ListNode(value,current.next);
        }
    }
}
