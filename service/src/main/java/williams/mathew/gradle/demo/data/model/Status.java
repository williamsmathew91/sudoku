package williams.mathew.gradle.demo.data.model;

public class Status {
    private int statusCode;
    private String statusMessage;

    public Status(int statusCode, String statusMessage) {
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
