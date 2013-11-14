package williams.mathew.gradle.demo.resource;

import static org.mockito.Mockito.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import williams.mathew.gradle.demo.service.StatusService;


public class StatusResourceTest {
	private StatusResource statusResource;
	
	@Mock
	private StatusService statusServiceMock;
	
	@BeforeMethod
	public void setup() {
		initMocks(this);
		
		statusResource = new StatusResource();
	}
	
	@Test
	public void shouldReturn200ReadyWhenServiceOK() {
	}
	
	
}
