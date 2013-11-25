import java.util.*;
import java.lang.*;
public class GPTree {
	
	
	public TreeNode rootnode = new TreeNode(); //every tree should have at least a root node
	public GPTree()
	{
		rootnode = null;
	}
	
	String [] operators = {"+","-","*","/"};
	String [] operatants = {"1","2","3","4","5","6","7","8","9","10"};
	
	int index1,index2;
	Random generator = new Random();
	
	
	public void GenTree(TreeNode temp)
	{
		index1 = generator.nextInt(1);
		
		if (index1==1)
		{
			index2 = generator.nextInt(3);
			TreeNode newnode = new TreeNode(operators[index2]);
			temp = newnode;

				
				GenTree(rootnode.left);
				GenTree(rootnode.right);
				
		}
		else
		{
			index2 = generator.nextInt(10);
			TreeNode newnode = new TreeNode(operatants[index2]);
			temp = newnode;
			
			
		}
		
		
	}
	
	public boolean IsNumeric(String value)  
	{  
	  try  
	  {  
	    double d = Double.parseDouble(value);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return  false;  
	  }  
	  return true;  
	}
	
	public double ToDouble(String value)
	{
		double d = Double.parseDouble(value);
		return d;
	}
	
	public double EvaTree(TreeNode Temp)
	{
		double evaluation =0;
		
		if (IsNumeric(Temp.data)) evaluation = ToDouble (Temp.data);
		else
		{
			double leftvalue = EvaTree(Temp.left);
			double rightvalue = EvaTree(Temp.right);
			
			if (Temp.data.compareTo("+") == 0) evaluation = leftvalue + rightvalue;
			if (Temp.data.compareTo("-") == 0) evaluation = leftvalue - rightvalue;
			if (Temp.data.compareTo("*") == 0) evaluation = leftvalue * rightvalue;
			if (Temp.data.compareTo("/") == 0) evaluation = leftvalue / rightvalue;
			
			
		}
		
		return evaluation;
		
	}
	
	
	public void printTree(TreeNode temp)
	
	{
		if (temp.left!=null) printTree(temp.left);
		System.out.println(temp.data);
		printTree(temp.right);
	}
	



	
	
}

