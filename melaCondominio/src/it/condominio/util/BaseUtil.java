package it.condominio.util;

import java.util.ArrayList;
import java.util.List;

import it.condominio.crud.AppartamentoCRUD;
import it.condominio.crud.DelegaCRUD;
import it.condominio.crud.Filtro_delegaCRUD;
import it.condominio.crud.Filtro_riunioneCRUD;
import it.condominio.crud.PalazzinaCRUD;
import it.condominio.crud.Presenza_riunioneCRUD;
import it.condominio.crud.PreventivoCRUD;
import it.condominio.crud.ProblematicaCRUD;
import it.condominio.crud.RiunioneCRUD;
import it.condominio.crud.Ruoli_delegaCRUD;
import it.condominio.crud.RuoloCRUD;
import it.condominio.crud.SoluzioneCRUD;
import it.condominio.crud.StatoCRUD;
import it.condominio.crud.Storico_utenteCRUD;
import it.condominio.crud.Tipo_problematicaCRUD;
import it.condominio.crud.UtenteCRUD;
import it.condominio.crud.VotoCRUD;
import it.condominio.mapper.AppartamentoMapper;
import it.condominio.mapper.DelegaMapper;
import it.condominio.mapper.Filtro_delegaMapper;
import it.condominio.mapper.Filtro_riunioneMapper;
import it.condominio.mapper.PalazzinaMapper;
import it.condominio.mapper.Presenza_riunioneMapper;
import it.condominio.mapper.PreventivoMapper;
import it.condominio.mapper.ProblematicaMapper;
import it.condominio.mapper.RiunioneMapper;
import it.condominio.mapper.Ruoli_delegaMapper;
import it.condominio.mapper.RuoloMapper;
import it.condominio.mapper.SoluzioneMapper;
import it.condominio.mapper.StatoMapper;
import it.condominio.mapper.Storico_utenteMapper;
import it.condominio.mapper.Tipo_problematicaMapper;
import it.condominio.mapper.UtenteMapper;
import it.condominio.mapper.VotoMapper;
import it.condominio.model.Appartamento;
import it.condominio.model.Delega;
import it.condominio.model.Filtro_delega;
import it.condominio.model.Filtro_riunione;
import it.condominio.model.Palazzina;
import it.condominio.model.Presenza_riunione;
import it.condominio.model.Preventivo;
import it.condominio.model.Problematica;
import it.condominio.model.Riunione;
import it.condominio.model.Ruoli_delega;
import it.condominio.model.Ruolo;
import it.condominio.model.Soluzione;
import it.condominio.model.Stato;
import it.condominio.model.Storico_utente;
import it.condominio.model.Tipo_problematica;
import it.condominio.model.Utente;
import it.condominio.model.Voto;

public class BaseUtil {
	//         MODEL 
	public static Appartamento appartamento = new Appartamento();
	public static Delega delega = new Delega();
	public static Filtro_delega filtro = new Filtro_delega();
	public static Filtro_riunione filtro_riunione = new Filtro_riunione();
	public static Palazzina palazzina = new Palazzina();
	public static Presenza_riunione presenza_riunione = new Presenza_riunione();
	public static Preventivo preventivo = new Preventivo();
	public static Problematica problematica = new Problematica();
	public static Riunione riunione = new Riunione();
	public static Ruoli_delega ruoli_delega = new Ruoli_delega();
	public static Ruolo ruolo = new Ruolo();
	public static Soluzione soluzione = new Soluzione();
	public static Stato stato = new Stato();
	public static Storico_utente storico_utente = new Storico_utente();
	public static Tipo_problematica tipo_problematica = new Tipo_problematica();
	public static Utente utente = new Utente();
	public static Voto voto = new Voto();
	
	//      CRUD
	public static AppartamentoCRUD appartamento_crud = new AppartamentoCRUD();
	public static DelegaCRUD delega_crud = new DelegaCRUD();
	public static Filtro_delegaCRUD filtro_crud = new Filtro_delegaCRUD();
	public static Filtro_riunioneCRUD filtro_riunione_crud = new Filtro_riunioneCRUD();
	public static PalazzinaCRUD palazzina_crud = new PalazzinaCRUD();
	public static Presenza_riunioneCRUD presenza_riunione_crud = new Presenza_riunioneCRUD();
	public static PreventivoCRUD preventivo_crud = new PreventivoCRUD();
	public static ProblematicaCRUD problematica_crud = new ProblematicaCRUD();
	public static RiunioneCRUD riunione_crud = new RiunioneCRUD();
	public static Ruoli_delegaCRUD ruoli_delega_crud = new Ruoli_delegaCRUD();
	public static RuoloCRUD ruolo_crud = new RuoloCRUD();
	public static SoluzioneCRUD soluzione_crud = new SoluzioneCRUD();
	public static StatoCRUD stato_crud = new StatoCRUD();
	public static Storico_utenteCRUD storico_utente_crud = new Storico_utenteCRUD();
	public static Tipo_problematicaCRUD tipo_problematica_crud = new Tipo_problematicaCRUD();
	public static UtenteCRUD utente_crud = new UtenteCRUD();
	public static VotoCRUD voto_crud = new VotoCRUD();
	
	
	//      MAPPER
	public static AppartamentoMapper appartamento_mapper ;
	public static DelegaMapper delega_mapper;
	public static Filtro_delegaMapper filtro_mapper;
	public static Filtro_riunioneMapper filtro_riunione_mapper ;
	public static PalazzinaMapper palazzina_mapper ;
	public static Presenza_riunioneMapper presenza_riunione_mapper ;
	public static PreventivoMapper preventivo_mapper ;
	public static ProblematicaMapper problematica_mapper ;
	public static RiunioneMapper riunione_mapper ;
	public static Ruoli_delegaMapper ruoli_delega_mapper ;
	public static RuoloMapper ruolo_mapper ;
	public static SoluzioneMapper soluzione_mapper ;
	public static StatoMapper stato_mapper ;
	public static Storico_utenteMapper storico_utente_mapper ;
	public static Tipo_problematicaMapper tipo_problematica_mapper;
	public static UtenteMapper utente_mapper;
	public static VotoMapper voto_mapper;
	
	
	//    LIST 
	public static List<Appartamento> appartamento_list = new ArrayList<Appartamento>();
	public static List<Delega> delega_list = new ArrayList<Delega>();
	public static List<Filtro_delega> filtro_delega_list = new ArrayList<Filtro_delega>();
	public static List<Filtro_riunione> filtro_riunione_list = new ArrayList<Filtro_riunione>();
	public static List<Palazzina>palazzina_list = new ArrayList<Palazzina>();
	public static List<Presenza_riunione> presenza_riunione_list = new ArrayList<Presenza_riunione>();
	public static List<Preventivo> preventivo_list = new ArrayList<Preventivo>();
	public static List<Problematica> problematica_list = new ArrayList<Problematica>();
	public static List<Riunione> riunione_list = new ArrayList<Riunione>();
	public static List<Ruoli_delega> ruoli_delega_list = new ArrayList<Ruoli_delega>();
	public static List<Ruolo> ruolo_list = new ArrayList<Ruolo>();
	public static List<Soluzione> soluzione_list = new ArrayList<Soluzione>();
	public static List<Stato> stato_list = new ArrayList<Stato>();
	public static List<Storico_utente> storico_utente_list = new ArrayList<Storico_utente>();
	public static List<Tipo_problematica> tipo_problematica_list = new ArrayList<Tipo_problematica>();
	public static List<Utente> utente_list = new ArrayList<Utente>();
	public static List<Voto> voto_list = new ArrayList<Voto>();
	
	
}
