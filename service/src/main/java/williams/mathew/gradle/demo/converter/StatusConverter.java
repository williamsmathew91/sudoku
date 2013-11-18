package williams.mathew.gradle.demo.converter;


import williams.mathew.gradle.demo.data.model.Status;
import williams.mathew.gradle.demo.web.model.PayloadStatus;

public class StatusConverter {
    public PayloadStatus toPayload(Status status) {
        return new PayloadStatus(status.getStatusCode(), status.getStatusMessage());
    }

}
