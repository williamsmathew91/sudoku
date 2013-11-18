package williams.mathew.gradle.demo.converter;

import williams.mathew.gradle.demo.model.PayloadStatus;
import williams.mathew.gradle.demo.model.Status;

public class StatusConverter {
    public PayloadStatus toPayload(Status status) {
        return new PayloadStatus(status.getStatusCode(), status.getStatusMessage());
    }

}
