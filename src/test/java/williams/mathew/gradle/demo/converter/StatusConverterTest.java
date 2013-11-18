package williams.mathew.gradle.demo.converter;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import williams.mathew.gradle.demo.model.PayloadStatus;
import williams.mathew.gradle.demo.model.Status;

import static org.testng.AssertJUnit.assertEquals;


public class StatusConverterTest {
    private StatusConverter statusConverter;

    @BeforeMethod
    public void setUp() throws Exception {
        statusConverter = new StatusConverter();

    }

    @Test
    public void shouldConvertAllNecessaryFields() throws Exception {
        int statusCode = 200;
        String statusMessage = "OK";
        Status expectedStatus = new Status(statusCode, statusMessage);

        PayloadStatus actualStatus = statusConverter.toPayload(expectedStatus);

        assertEquals(expectedStatus.getStatusCode(), actualStatus.getStatusCode());
        assertEquals(expectedStatus.getStatusMessage(), actualStatus.getStatusMessage());
    }
}
