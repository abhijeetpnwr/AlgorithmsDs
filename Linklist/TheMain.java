
public class TheMain 
{
    public static void main(String args[]) 
    {
	   System.out.println("I will call the ink list method \n");	
	   
	    
	    MyLinkList linkListObj = new MyLinkList();
	    
	    Node n1 = new Node(5);
	    linkListObj.add(n1);
	    
	    Node n2 = new Node(6);
	    linkListObj.add(n2);
	 
	    
	    Node n3 = new Node(13);
	    linkListObj.add(n3);
	    
	    linkListObj.printLinkList();
	    System.out.println("Size of linklist is:"+linkListObj.size);
	    
	    System.out.println("index 2:"+linkListObj.get(1));
	    
	}

}

