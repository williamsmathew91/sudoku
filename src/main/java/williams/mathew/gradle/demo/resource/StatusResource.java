package williams.mathew.gradle.demo.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import williams.mathew.gradle.demo.model.PayloadStatus;

@Path("/status")
public class StatusResource{

	@GET
	public PayloadStatus getStatus() {
		return null;
	}
}
