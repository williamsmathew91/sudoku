package williams.mathew.gradle.demo.resource;

import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.testng.AssertJUnit.assertEquals;

import org.mockito.Mock;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import williams.mathew.gradle.demo.converter.StatusConverter;
import williams.mathew.gradle.demo.model.PayloadStatus;
import williams.mathew.gradle.demo.model.Status;
import williams.mathew.gradle.demo.service.StatusService;


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
