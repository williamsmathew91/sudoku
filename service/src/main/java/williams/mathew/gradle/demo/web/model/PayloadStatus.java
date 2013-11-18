package williams.mathew.gradle.demo.web.model;

public class PayloadStatus {
	private int statusCode;
	private String statusMessage;
	
	public PayloadStatus(int statusCode, String statusMessage) {
		this.statusCode = statusCode;
		this.statusMessage = statusMessage;
	}
	
	public int getStatusCode() {
		return statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}	
}
