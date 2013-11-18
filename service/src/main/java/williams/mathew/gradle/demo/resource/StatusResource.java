package williams.mathew.gradle.demo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import williams.mathew.gradle.demo.converter.StatusConverter;
import williams.mathew.gradle.demo.service.StatusService;
import williams.mathew.gradle.demo.web.model.PayloadStatus;

@Path("/status")
public class StatusResource{
    private StatusConverter statusConverter;
    private StatusService statusService;

    public StatusResource(StatusConverter statusConverter, StatusService statusService) {
        this.statusConverter = statusConverter;
        this.statusService = statusService;
    }

    @GET
	public PayloadStatus getStatus() {
        return statusConverter.toPayload(statusService.getStatus());
	}
}
