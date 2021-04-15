package it.condominio.exception;

public class RequiredFieldError  extends FieldError {
	public RequiredFieldError(String field) {
		super(field);
	}
	
}