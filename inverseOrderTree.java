import java.util.*;

class Node {
    Node right;
    Node left;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Tree {
    public ArrayList<Integer> inverseOrderTree(Node root) {
            ArrayList<Integer> result = new ArrayList<>();
            if (root == null) {
                return result;
            }
            Queue <Node> queue = new LinkedList<>();
            queue.add(root); 
        Stack<Integer> stack= new Stack<>();
       
        while(!queue.isEmpty()){
            Node current= queue.poll();
            stack.push(current.data);

            if(current.right!=null){
                queue.add(current.right);
            }
            if(current.left!=null){
                queue.add(current.left);
            }
        }
        while(!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;
    }
    public static void main(String Args[]){
        Node root= new Node(6);
        root.right= new Node(7);
        root.left= new Node(4);
        root.left.left= new Node(3);
        root.left.right= new Node(5);

        Tree tree= new Tree();
        ArrayList<Integer> result= tree.inverseOrderTree(root);
        System.out.println("updated elements are : "+ result);

    }
    
}