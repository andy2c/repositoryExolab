package it.condominio.test;

import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.Ruoli_delegaCRUD;
import it.condominio.exception.MaxLengthError;
import it.condominio.exception.RequiredFieldError;
import it.condominio.exception.UniqueFieldError;
import it.condominio.model.Ruoli_delega;

public class Ruoli_delegaTest {

	public static void main(String[] args) {
		Ruoli_delega test = new Ruoli_delega();
		Ruoli_delegaCRUD crud = new Ruoli_delegaCRUD();
		Ruoli_delega model = new Ruoli_delega(3,"mmmm");
		List<Ruoli_delega> list = new ArrayList<Ruoli_delega>();
		
//		crud.insert(model);
//		crud.update(model);
		
		
//		crud.delete(3);
		
//		test = crud.find(2);
		
//		System.out.println(test.toString());
		
		list = crud.findAll();
//		for(Ruoli_delega r : list)
//			System.out.println(r.toString());
		
//		
//		try {
//			crud.insert(model);
//		} catch (RequiredFieldError e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (MaxLengthError e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (UniqueFieldError e) {
//			System.out.println(e.getDescription(e));
//		}
//		
		
		
		
		
		
		
		
		
		
		
	}

}
