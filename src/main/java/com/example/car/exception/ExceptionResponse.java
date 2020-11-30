package com.example.car.exception;

public class ExceptionResponse {
private String errorMessage;
private String url;
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public String getUrl() {
	return url;
}
public void setUrl(String url) {
	this.url = url;
}
@Override
public String toString() {
	return " [errorMessage=" + errorMessage +","+ "\n" + 
              "url=" + url + "]";
}

}
