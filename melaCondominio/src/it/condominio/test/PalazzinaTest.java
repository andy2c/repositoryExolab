package it.condominio.test;

import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.PalazzinaCRUD;
import it.condominio.model.Palazzina;

public class PalazzinaTest {

	public static void main(String[] args) {
		PalazzinaCRUD crud = new PalazzinaCRUD();
		Palazzina test = new Palazzina();
		Palazzina model = new Palazzina(4, "palazzoA23", "via Gioconda", "Milano", "Lombardia");
		List<Palazzina> list = new ArrayList<Palazzina>();
		
		test = crud.find(3);
	//	System.out.println(test.toString());
		list = crud.findAll();
		for(Palazzina p : list)
			System.out.println(p.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
