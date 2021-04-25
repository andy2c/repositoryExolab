package it.condominio.test;

import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.util.BaseUtil;

public class RuoloTest extends BaseUtil{

	public static void main(String[] args) {
	    ruolo.setNome("amministratore sto cazzo");
		try {
			ruolo_crud.insert(ruolo);
		} catch (RequiredFieldError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (MaxLengthError e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UniqueFieldError e) {
			System.out.println(e.getDescription(e));
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
