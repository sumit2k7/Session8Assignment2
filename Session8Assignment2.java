import java.util.*;
public class Session8Assignment2 {

	public static void main(String[] args) {
		 HashSet <String> newset = new HashSet <String>();
         
		   // populate hash set
		   newset.add("Learning"); 
		   newset.add("Easy");
		   newset.add("Simply");  
		      
		   // create an iterator
		   Iterator<String> iterator= newset.iterator(); 
		      
		   // check values
		   while (iterator.hasNext()){
		   System.out.println("Value: "+iterator.next() + " ");  
		   }

	}

}
