import static org.junit.Assert.*;
import org.junit.runner.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCase1 {
	
	VotingAge v;
	votingAgeService vas;
	@Before
	public void setUp() {
		v=new VotingAge();	
		vas=Mockito.mock(votingAgeService.class);   //Mocking the VotingAgeService for fetching age from database
		v.setVas(vas);
		v.setName("Alex");
		System.out.println("Before testing");
	}
	@Test
	public void testVoting() {
		System.out.println("tested voting age successfully");
		assertTrue(v.testAge(19));
	}
	@Test
	public void testRequired() {
		Mockito.when(vas.fetchAge(v.getName())).thenReturn(15);  //Returning the requested age as 15
		assertEquals(3,v.requiredAge());                         //Checking the desired output
		System.out.println("Mocked successfully");		
	}
	@After
	public void tearDown() {
		System.out.println("After testing");
	}

}
