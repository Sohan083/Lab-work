
public class Variadic {
      public void vari(int ... n)
      {
    	  int sum=0;
    	  for(int i: n )
    	  {
    		  sum+=i;
    	  }
    	  System.out.println("Sum is: " +sum + "\n");
      }
}
