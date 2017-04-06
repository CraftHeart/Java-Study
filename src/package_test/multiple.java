package package_test;


public class multiple {
	public 
		int i_;
		int j_;
	public multiple(int i,int j)
	{
		i_ = i;
		j_ = j;
	}
	public int multi(int i,int j)
	{
		return i*j;
	}
	
	public int get_ret()
	{
		return i_*j_;
	}
	
	public static void main(String[] args) {
		multiple m = new multiple(15,3);
		System.out.println(m.get_ret());
	}
}


