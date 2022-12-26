class Node{
	int data;
	Node left,right;
	public Node(int data) {
		this.data=data;
		left=right=null;
	}
}
public class Traversal {
   Node root;
   Traversal(){
	   root=null;
   }
   public Traversal(int data){
	   root=new Node(data);
   }
   void preorder(Node node) {
	   if(node==null) {
		   return ;
	   }
    System.out.print(node.data+" ");
    preorder(node.left);
    preorder(node.right);
   }
   void postorder(Node node) {
	   if(node==null) {
		   return ;
	   }
    preorder(node.left);
    preorder(node.right);
    System.out.print(node.data+" ");
   }
   
   void inorder(Node node) {
	   if(node==null) {
		   return ;
	   }
    inorder(node.left);
    System.out.print(node.data+" ");
    inorder(node.right);
   }
   void preorder(){preorder(root);}
   void inorder(){ inorder(root);}
   void postorder(){postorder(root);}
	public static void main(String[] args) {
		Traversal t=new Traversal();
		t.root=new Node(1);
		t.root.left=new Node(2);
		t.root.left.left=new Node(3);
		t.root.left.right=new Node(4);
		t.root.right=new Node(5);
		System.out.println("Preorder traversal");
         t.preorder();
         System.out.println();
	    System.out.println("Inorder traversal");
	     t.inorder();
	     System.out.println();
        System.out.println("Postorder traversal");
		 t.postorder();
	}
}
