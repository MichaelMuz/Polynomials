public class Term implements Comparable
{

	private int Co, Expo;

	public Term(int Co, int Expo)
	{
		this.Co=Co;
		this.Expo=Expo;
	}
	
	public int getCo() 
	{
		return Co;
	}

	public int getExpo() 
	{
		return Expo;
	}
	
	public void setCo(int Co) 
	{
		this.Co = Co;
	}

	public void setExpo(int Expo) 
	{
		this.Expo = Expo;
	}
	
	//compares expo
	public int compareTo(Object other) 
	{
		if(other instanceof Term)
		{
			return Co-((Term)other).getExpo();
		}
		return 0;
	}
	
	//output back
	public String toString()
	{
		if(Expo==0)
		{
			return Co+" ";					
		}
		else
		 {
			return Co+"x^"+Expo;
		}
	}
}
