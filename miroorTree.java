public class miroorTree {
    static class Node{
        int val;
        Node left;
        Node right;
    }
    static miroorTree.Node createNode (int val){
        Node newNode = new Node();
        newNode.left= null;
        newNode.right=null;
        newNode.val= val;
        return newNode;
    }

    static void Inorder(Node root){
        if(root== null){
            return;
        }
        Inorder(root.left);
        System.out.println(root.val);
        Inorder(root.right);
    }

    static Node mirrorify(Node root){
        if(root== null){
            return null;
        }
            Node mirror = createNode(root.val);
            mirror.right = mirrorify(root.left);
            mirror.left= mirrorify(root.right);
        return mirror;
    }

    public static  void main(String[] args){
        Node root= createNode(6);
        root.right=createNode(7);
        root.left=createNode(2);
        root.left.left=createNode(1);
        root.left.right=createNode(4);

        System.out.println("before mirrorify: ");
        Inorder(root);
        System.out.println("After mirrorify: ");
        Node mirroredroot=mirrorify(root);
        Inorder(mirroredroot);
        
    }
    
}
