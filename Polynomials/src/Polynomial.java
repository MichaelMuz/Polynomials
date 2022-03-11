import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Polynomial 
{

	private LinkedList<Term> list;
	
	public Polynomial(Term term)
	{
		list = new LinkedList<Term>();
		list.add(term);
	}
	
	public Polynomial()
	{
		list = new LinkedList<Term>();
	}
	
	public void add(Polynomial other)
	{
		ListIterator<Term> iter = list.listIterator();
		ListIterator<Term> iter2 = other.getList().listIterator();
		
		while(iter2.hasNext())
		{
			
			Term t=iter2.next();
			boolean hasAdded=false;
			
			
			while(iter.hasNext())
			{	
				Term t2=iter.next();
				
				if(t.getExpo()==t2.getExpo())
				{
					t2.setCo(t2.getCo()+t.getCo());
					hasAdded=true;
					break;
				}
			}
			
			
			if(!hasAdded)
			{
				list.addLast(t);
			}
			
		}
		Collections.sort(list);
	}
	
	public Polynomial multiply(Polynomial other)
	{
		Polynomial poly = new Polynomial();
		ListIterator<Term> iter = list.listIterator();
		ListIterator<Term> iter2 = other.list.listIterator();
		
		
		while(iter.hasNext())
		{
			Term t=iter.next();
			
			while(iter2.hasNext())
			{
				Term t2=iter2.next();
				int c=t.getCo()*t2.getCo();
				int e=t.getExpo()+t2.getExpo();
				poly.add(new Polynomial(new Term(c,e)));
			}
			
			iter2 = other.list.listIterator();
			
		}
		
		return poly;
	}

	public String toString()
	{
		
		ListIterator<Term> iter = list.listIterator();
		String t=iter.next().toString();
		
		while(iter.hasNext())
		{
			t+="+"+iter.next();
		}
		return t;
	}
	
	public LinkedList<Term> getList() 
	{
		return list;
	}
		
}


