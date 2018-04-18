package Chapter16.exercise4;

import java.util.NoSuchElementException;

public class LinkedIntList
{
    /*
        Write a method called min that returns the minimum value in a list of integers. If the list is empty, it should throw a
        NoSuchElementException.
   */

    private ListNode front;


    //  Exercise 4 //////////////////////////////////////////////////////
    public int min() throws NoSuchElementException
    {
        if (this.front == null)
        {
            throw new NoSuchElementException();
        }
        else
        {
            ListNode current = this.front;
            int min = current.getData();

            while (current != null)
            {
                if (current.getData() < min) min = current.getData();
                current = current.next;
            }
            return min;
        }
    }
    ////////////////////////////////////////////////////////////////////

    public LinkedIntList()
    {
        this.front = null;
    }

    public void add(int value)
    {
        if(this.front == null)
            this.front = new ListNode(value);
        else
        {
            ListNode current = this.front;

            while (current.next != null)
            {
                current = current.next;
            }

            current.next = new ListNode(value);
        }
    }

    @Override
    public String toString()
    {
        if (this.front == null)
        {
            return "[]";
        }
        else
        {
            String result = "[" + front.getData();
            ListNode current = this.front.next;

            while (current != null)
            {
                result += ", " + current.getData();
                current = current.next;
            }
            result += "]";
            return result;
        }
    }
}
