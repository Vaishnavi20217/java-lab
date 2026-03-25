class NotEligibleForEngineering extends RuntimeException
{
	NotEligibleForEngineering(String s) {
		super(s);
	}
}
	class NotEligibleForVJIT extends RuntimeException 
	{
      NotEligibleForVJIT(String s){
          super(s);
	}
	}
	public class TSEngineeringAdmission
	{
	public static void main(String[] args) 
	{
		try
		{
			int TSEAMCETscore = Integer.parseInt(args[0]);
			if (TSEAMCETscore < 50)	
			{
              throw new NotEligibleForEngineering("Sorry You are not Eligible for Engineering!");
			}
			else if (TSEAMCETscore < 70 && TSEAMCETscore <= 50)
			{
			throw new NotEligibleForVJIT("Not Eligible For VJIT");
			}
			else
			{
				System.out.println("Welcome to VJIT!");
		}
		}
		catch (NotEligibleForEngineering | NotEligibleForVJIT e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of code");
	}
}