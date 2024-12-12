package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static int MagicSquare(int count){
		boolean chicken = true;
		int spud = 1;
		int squre = 1;
		
					for(int i = 2; count > 0; i++ ){
						if(spud == squre*squre){
							if(count==1){
							return spud;
							}
							System.out.println(spud);
							count--;
						}
						if(spud> squre*squre){
							squre++;
						}
						spud = spud +i;
					}
		return spud;
	}
	
}
