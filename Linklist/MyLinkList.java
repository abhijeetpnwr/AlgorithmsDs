import org.omg.CORBA.IdentifierHelper;

public class MyLinkList 
{
   static int size = 0;
   
   Node headnode;
   
   Node toTrackNode;
   
   public void add(Node n) 
   {
	  if(null==headnode)
	  {
		  headnode=n; //If it was a blank list, assing node as  ehadnode
	  }
	  
	  else
	  {
		  toTrackNode=headnode;  
		  while(toTrackNode.next!=null)
		  {
			  toTrackNode=toTrackNode.next;
		  }
		  
		  toTrackNode.next=n;	  
	  }
	  
	  size++;
	  
   }
   
   
   public int get(int index)
   {
	   int retrieveIndex = 0;
	   
	   if(index <0 || index > size-1)
	   {
		   return -1;
	   }
	   
	   toTrackNode = headnode;
	   
	   while(index!=retrieveIndex)
	   {
		   retrieveIndex=retrieveIndex+1;
		   toTrackNode=toTrackNode.next;
	   }
	   
	   if(toTrackNode==null)
	   {
		   return -1;
	   }
	   
	   return toTrackNode.data;
	   
	   
   }
   
   //To get size of the list
   public static int getSize() 
   {
	return size;
   }


   public void printLinkList()
   {
	   toTrackNode=headnode;
	   String st = ""; 
	   while(toTrackNode!=null)
	   {
		   st=st+"---->"+toTrackNode.data;
		   toTrackNode=toTrackNode.next;
	   }   
	   System.out.println(" "+st);
   }
   
   public void remove(int index)
   {
	   toTrackNode=headnode;
	   
	   while(toTrackNode!=null)
	   {
		  toTrackNode=toTrackNode.next;   
	   }
   }
   
   
}



class Node
{
 	 int data;
 	 Node next=null;
 	 
 	 public Node(int data)
 	 {
 		 this.data=data;
 		 next=null;
 	 }
 	 
 	 private  void addNext(Node n)
 	 {
 		 this.next=n; //So added next to node
 	 }
}
