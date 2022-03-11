public class Test 
{

	public static void main(String[] args)
	{
		
		   //4x+8x
			Polynomial a = new Polynomial(new Term(4,1));
			
			Polynomial b = new Polynomial(new Term(8,1));
			
			a.add(b);
			
			System.out.println(a);
		
		
		   //(2x+7)+3x
			Polynomial c = new Polynomial(new Term(2,1));
			c.add(new Polynomial(new Term(7,0)));
			
			Polynomial d = new Polynomial(new Term(3,1));
			
			c.add(d);
			
			System.out.println(c);
		
		
		   //(3x^2+2x)+(2x^2+3x+3)
			Polynomial e = new Polynomial(new Term(3,2));
			e.add(new Polynomial(new Term(2,1)));
			
			Polynomial f = new Polynomial(new Term(2,2));
			f.add(new Polynomial(new Term(3,1)));
			f.add(new Polynomial(new Term(3,0)));
			
			e.add(f);
			
			System.out.println(e);		
		
		
		   //2x^2*3x^3
			Polynomial g = new Polynomial(new Term(2,2));
			
			Polynomial h = new Polynomial(new Term(3,3));
			
			System.out.println(g.multiply(h));
		
		
		   //(3x^2+2x)(2x^2+3x+3)
			Polynomial i = new Polynomial(new Term(3,2));
			i.add(new Polynomial(new Term(2,1)));
			
			Polynomial j = new Polynomial(new Term(2,2));
			j.add(new Polynomial(new Term(3,1)));
			j.add(new Polynomial(new Term(3,0)));
			
			System.out.println(i.multiply(j));
		
	}
	
}



