package Project2;

public class BSTNode {
	PhoneBook data;
	BSTNode left;
	BSTNode right;
	
	public BSTNode(PhoneBook p)
	{
		data=p;
		left=null;
		right=null;
	}
	
	public BSTNode insert(BSTNode root,PhoneBook p) 
	{
		if(root==null) 
		{
			root=new BSTNode(p);
            return root;
        }
        int result=p.Name.compareTo(root.data.Name);
        if (result<0)
            root.left = insert(root.left, p);
        else if (result > 0)
            root.right = insert(root.right, p);
        return root;
    }
	public void Inorder()
	{
		if(left !=null)
			left.Inorder();
		System.out.println(data.Name + " " + data.Number + " " + data.Email );
		if(right != null)
			right.Inorder();
	}
	public void search(String n) {
		if (data.Name.contains(n))
			System.out.println("Name:" + data.Name + " Email:" + data.Email + "  Number:" + data.Number);
		if (data.Name.compareTo(n) >= 0 && left != null)
			left.search(n);
		if (data.Name.compareTo(n) <= 0 && right != null)
			right.search(n);
		if (right == null && left == null)
			return;
	}
	
	public PhoneBook minimum(BSTNode root) 
	{		
			if (root.left == null)
				return root.data;
			else
				return minimum(root.left);
	}

	public PhoneBook maximum(BSTNode root) 
	{
			if (root.right == null)
				return root.data;
			else
				return maximum(root.right);
	}
}
