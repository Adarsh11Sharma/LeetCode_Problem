import java.util.ArrayList;
import java.util.Iterator;

public class IteratorLearning {
  public static void main(String[] args) {
    IteratorLearning ITR=new IteratorLearning ();

             FirstOccuranceString finder = new FirstOccuranceString(); // create object

    // Create an ArrayList of Strings
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    
    ArrayList<Integer> num=new ArrayList<Integer>();
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(4);
    num.add(5);
    Iterator<Integer> nums=num.iterator();
    
    while(nums.hasNext()){
    int n=nums.next();
    if(n==4){
    nums.remove();
    
    }
    else{System.out.println(n);
    
    }}
    
    
    Iterator<String> It=cars.iterator();
    
    while(It.hasNext()){
    System.out.println(It.next());
}
    // Get an iterator for the ArrayList
    Iterator<String> it = cars.iterator();

    // Iterate through the list using the iterator
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }
}