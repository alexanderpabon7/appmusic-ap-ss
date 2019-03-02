package co.com.poli.appmusicapss.util;

public class Response {

	private Object responseBody;
	private String message;
	private int codeResponse;
	private boolean status;
	
	public Response() {
		codeResponse = 200;
		status = true;
	}

	public Object getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(Object responseBody) {
		this.responseBody = responseBody;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getCodeResponse() {
		return codeResponse;
	}

	public void setCodeResponse(int codeResponse) {
		this.codeResponse = codeResponse;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
