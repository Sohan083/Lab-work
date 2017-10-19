
public class Animal {

	public static void main(String[] args) {
		Animal a;
		Insects insect=new Insects();
        Land lan=new Land();
        Water wat=new Water();
        Birds bird=new Birds();
        Variadic v=new Variadic();
        v.vari(1,2,3,4,5); 
        bird.dosomething(wat);
        //bird.check();
        a=bird;
        a.check();
        
	}
	public void dosomething(Animal a)
	{
		 try
	        {
	        	if(a instanceof Oviparous)
	        	{
	        		if(a instanceof Birds)
	        		{
	        			System.out.println("This is a Bird\n");
	        		}
	        		else if(a instanceof Insects)
	        		{
	        			System.out.println("This is an Insect\n");
	        		}
	        	}
	        	else if(a instanceof Mammal)
	        	{
	        		if(a instanceof Land)
	        		{
	        			System.out.println("This is a Land\n");
	        		}
	        		else if(a instanceof Water)
	        		{
	        			System.out.println("This is a Water\n");
	        		}
	        	}
	        }
	        catch(Exception e)
	        {
	        	System.out.println("Exeption occured\n");
	        }
	}
	public void check()
	{
		System.out.println("This is an Animal\n");
	}

}
