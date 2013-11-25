import java.util.*;
import java.lang.*;

public class TreeNode {
	
	public String data; //can be an operator or operand
	public int ID;// use to track level
	public TreeNode left,right;

	
	//constructor
	public TreeNode(String input)
	{
		this.data = input;
		right = null;
		left = null;
		
		
	}
	public TreeNode()
	{
		this.data = null;
		right = null;
		left = null;
		
		
	}
	
	public int GetLevel()
	{
		double cal = Math.log10(ID) /Math.log10(2);
		return (int)cal;
	}
	
	//
	

	
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
	



}
