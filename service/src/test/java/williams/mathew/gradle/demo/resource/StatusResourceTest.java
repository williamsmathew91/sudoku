package williams.mathew.gradle.demo.resource;

import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import williams.mathew.gradle.demo.converter.StatusConverter;
import williams.mathew.gradle.demo.data.model.Status;
import williams.mathew.gradle.demo.service.StatusService;
import williams.mathew.gradle.demo.web.model.PayloadStatus;

import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.AssertJUnit.assertEquals;


public class StatusResourceTest {
	private StatusResource statusResource;
	
	@Mock
	private StatusService statusServiceMock;
	
	@BeforeMethod
	public void setup() {
		initMocks(this);
		
		statusResource = new StatusResource(new StatusConverter(), statusServiceMock);
	}
	
	@Test
	public void shouldReturn200ReadyWhenServiceOK() {
        int statusCode = 200;
        String statusMessage = "OK";
        Status status = new Status(statusCode, statusMessage);

        when(statusServiceMock.getStatus()).thenReturn(status);

        PayloadStatus pStatus = statusResource.getStatus();

        assertEquals(statusCode, pStatus.getStatusCode());
        assertEquals(statusMessage, pStatus.getStatusMessage());
    }
	
	
}
