public class primo
{
	public static void main(String args[])
		{
			int var,div,boolo=0;
			for(var=1; var <=100; var++)
					{
						for(div=2; div<=Math.sqrt(var); div++)
							{
								if(var % div != 0)
								{
									boolo = 1;
								} else {
									boolo = 0;
									break;
								}
											
							}
						if(boolo == 1) 
							{
							System.out.println(var);
							}		
					}
		}
}			
				 
