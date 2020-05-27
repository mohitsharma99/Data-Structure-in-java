import java.util.*;

//It is a node which contain data and right and left pointer
class Node{                
    int data;
    Node left, right;
}

// This class perform all operations
class BST{

   //This fuction print tree
   void inorder(Node node)
   {
       if (node != null)
       {

           inorder(node.left);

           inorder(node.right);
           System.out.print(node.data + " ");
       }
   }

    // This function create first node when tree is empty
    public Node createNewNode(int k)
    {
        Node a = new Node();
        a.data = k;
        a.left = null;
        a.right = null;
        return a;
    }

    //This function insert the data in tree
    public Node insert(Node node, int val)
    {
      if(node == null)
          return createNewNode(val);
      if(val<node.data)
          node.left = insert(node.left, val);
      else
          node.right=insert(node.right, val);

        return node;

    }


}

//It is main class.
class BinaryTree{
public static void main(String[] args)
{
    BST a = new BST();
    Node root =null;
 
   int[] arr =new int[]{5,3,7,8,2,4,6,11}; //It is elements which is inserted in tree
   int n = arr.length;

    for(int i=0; i<n; i++)
    root= a.insert(root, arr[i]);  // create tree

     a.inorder(root);    //to print tree
}
}