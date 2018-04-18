package Chapter16.exercise4;

import java.util.NoSuchElementException;

/*
Write a method called lastIndexOf that accepts an integer value as a parameter and that returns the index in the
list of the last occurrence of that value, or 1 if the value is not found in the list. For example, if a variable list
stores the values [1, 18, 2, 7, 18, 39, 18, 40], then the call of list.lastIndexOf(18) should return 6.
If the call had instead been list.lastIndexOf(3), the method would return –1.
 */
public class Exercise4 {
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

    public Exercise4()
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
