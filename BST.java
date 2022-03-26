package Project2;

public class BST {
		BSTNode root=null;
		public void insert(PhoneBook p)
		{
			if(root==null) 
			{
				root=new BSTNode(p);
	        }
			root.insert(root,p);
		}
		public void Search(String S)
		{
			if(root==null)
				System.out.println("Not Found");
			else
				root.search(S);
		}
		
		public void Dislpay()
		{
			if(root == null)
				return;
			else
				root.Inorder();
		}
		public void Display_First() 
		{
			if(root==null)
				return;
			else
				System.out.println("First Contact: " +root.minimum(root).Name+" "+root.minimum(root).Number+" "+root.minimum(root).Email);
		}

		public void Display_Last() 
		{
			if (root==null)
				return;
			else
				System.out.println("Last Contact: " +root.maximum(root).Name+" "+root.maximum(root).Number+" "+root.maximum(root).Email);
		}
}
