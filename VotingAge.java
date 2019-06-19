import java.util.List;

public class VotingAge {
	
	public String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	votingAgeService vas;
	
	public votingAgeService getVas() {
		return vas;
	}

	public void setVas(votingAgeService vas) {
		this.vas = vas;
	}

		public boolean testAge(int age)
	{
		return (age>=18);
	}
	public int requiredAge()
	{
		 int age=vas.fetchAge(this.name);
		 return 18-age;
	}
	
}
