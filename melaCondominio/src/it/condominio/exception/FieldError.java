package it.condominio.exception;

public class FieldError extends Exception {

	private String field;

	public FieldError(String field) {
		super();
		this.field = field;
	}

	public String getDescription(Exception ex) {

		if(ex instanceof RequiredFieldError) {
			RequiredFieldError rq = (RequiredFieldError) ex;
			return "Il campo " + rq.getField()+ " è richiesto ";
		}
		if(ex instanceof MinLengthError) {
			MinLengthError rq = (MinLengthError) ex;
			return "Il campo "+rq.getField()+" deve essere minimo di "+rq.getMinLength()+" catatteri";
		}
		if(ex instanceof MaxLengthError) {
			MaxLengthError rq = (MaxLengthError) ex;
			return "Il campo " + rq.getField()+ " deve essere al massimo di "+ rq.getMaxLength()+ " caratteri";
		}
		if(ex instanceof UniqueFieldError) {
			UniqueFieldError rq = (UniqueFieldError) ex;
			return "Il campo " + rq.getField()+ " deve essere univoco";
		}
		if(ex instanceof FormatError) {
			FormatError rq = (FormatError) ex;
			return "Il campo " + rq.getField()+ " non è nel formato previsto";
		}
		if(ex instanceof InvalidEmail) {
			InvalidEmail rq = (InvalidEmail) ex;
			return "Il campo "+rq.getField()+" non soddisfa uno dei seguenti requisiti: finire con .it/.com , non avere spazi vuoti e possedere soltanto una @";	
		}
		if(ex instanceof InvalidPassword) {
			InvalidPassword rq = (InvalidPassword) ex;
			return "Il campo "+rq.getField()+" non soddisfa uno dei seguenti requisiti: non avere spazi vuoti , contenere almeno due valori alfanumerici";
		}
		
		return "";

	}

	public String getField() {
		return field;
	}
	
	
	
	
	
	
}
