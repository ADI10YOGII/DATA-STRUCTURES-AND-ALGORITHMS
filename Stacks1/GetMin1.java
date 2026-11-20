package leet.Stacks;

import java.util.Stack;

class MinStack1
{
    Stack<Integer> st = new Stack<>();
    Stack<Integer> min = new Stack<>();

    // Constructor
    public MinStack1()
    {
        // Nothing to initialize
    }

    // Push element
    public void push(int value)
    {
        if (st.size() == 0)
        {
            st.push(value);
            min.push(value);
        }
        else
        {
            st.push(value);

            if (min.peek() < value)
            {
                min.push(min.peek());
            }
            else
            {
                min.push(value);
            }
        }
    }

    // Pop element
    public void pop()
    {
        if (!st.isEmpty())
        {
            st.pop();
            min.pop();
        }
    }

    // Return top element
    public int top()
    {
        return st.peek();
    }

    // Return minimum element
    public int getMin()
    {
        return min.peek();
    }
}

class GetMin1
{
    public static void main(String[] args)
    {
        MinStack1 obj = new MinStack1();

        obj.push(5);
        obj.push(3);
        obj.push(7);
        obj.push(2);

        System.out.println("Top Element: " + obj.top());      // 2
        System.out.println("Minimum: " + obj.getMin());       // 2

        obj.pop();

        System.out.println("After Pop");
        System.out.println("Top Element: " + obj.top());      // 7
        System.out.println("Minimum: " + obj.getMin());       // 3

        obj.pop();

        System.out.println("After Pop");
        System.out.println("Top Element: " + obj.top());      // 3
        System.out.println("Minimum: " + obj.getMin());       // 3

        obj.push(1);

        System.out.println("After Push 1");
        System.out.println("Top Element: " + obj.top());      // 1
        System.out.println("Minimum: " + obj.getMin());       // 1
    }
}