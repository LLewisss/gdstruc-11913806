package com.kyle;

public class Tree {

    private Node root;

    public void ins(int value)
    {
        if (root == null)
        {
            root = new Node(value);
        }
        else
        {
            root.ins(value);
        }
    }

    public void traverseInOrder()
    {
        if(root != null)
        {
            root.traverseInOrder();
        }
    }

    public Node get(int value)
    {
        if (root != null)
        {
            return root.get(value);
        }
        return null;
    }

    public Node getMin()
    {
        if(root != null)
        {
            return root.getMin();
        }
        return null;
    }

    public Node getMax()
    {
        if(root != null)
        {
            return root.getMax();
        }
        return null;
    }
}
