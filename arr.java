package week12;
import java.util.ArrayList;
import java.util.Iterator;



public class Arr
{
    public static void main(String[] args)
    {
        ArrayList <Integer>marks=new ArrayList();
        System.out.println(marks.isEmpty());
        //adding an element
        marks.add(80);
        marks.add(90);
        marks.add(76);
        System.out.println(marks);
        marks.add(2,85);
        System.out.println(marks);
        //checking if arraylist is empty
        System.out.println(marks.isEmpty());
        
        //finding the length or size
        System.out.println(marks.size());
        
        //removing an element
        
        marks.remove(0);
        System.out.println(marks);
        //accessing an element
        System.out.println(marks.get(1));
        
        //setting a new value
        
        marks.set(0,88);
        System.out.println(marks);
        
        //check if value is in the arraylist
        
        System.out.println(marks.contains(88));
        
        
        
        //check the index of the value
        System.out.println(marks.indexOf(80));
        
        //traversing an arraylist
        
        for(int mark: marks)
        {
            System.out.println(mark);       
        }
        
        // iterator for traversing
        
        Iterator<Integer> itr=marks.iterator();
        
        while(itr.hasNext())
        {
            int mark=itr.next();
            
            System.out.println(mark);
        }
        
        
    }
}
