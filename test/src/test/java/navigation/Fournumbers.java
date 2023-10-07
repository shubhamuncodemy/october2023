package navigation;

public class Fournumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=999,b=998,c=997,d=996;
		//int result;
		if(a>b)
		{
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(a);
				}
				else {
					System.out.println(d);
				}
			}
			else if(c>d) {
				System.out.println(c);
			}
			else {
				System.out.println(d);
			}
		}
		else if(b>c) {
			if(b>d) {
				System.out.println(b);
			}
			else {
				System.out.println(d);
			}
		}
		else if(c>d) {
			System.out.println(c);
		}
		else {
			System.out.println(d);
		}

	}

}
