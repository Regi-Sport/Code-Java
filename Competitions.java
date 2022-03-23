package RegiSport;

public class Competitions
{
	private int Id_Competition;
	private int Id_Sport;
	private String Libelle_C;
	private String Date_Debut;
	private String Date_Fin;
	private String Recompense;
	private String Vainqueur;
	private int Nb_Participants;
	private String Lieu;
	
	
	//Constructeur de la competition
	public Competitions(int id_Competition, int id_Sport, String libelle_C,
			String date_Debut, String date_Fin, String recompense, String vainqueur,
			int nb_Participants, String lieu)
	{
		this.Id_Competition = id_Competition;
		this.Id_Sport = id_Sport;
		this.Libelle_C = libelle_C;
		this.Date_Debut = date_Debut;
		this.Date_Fin = date_Fin;
		this.Recompense = recompense;
		this.Vainqueur = vainqueur;
		this.Nb_Participants = nb_Participants;
		this.Lieu = lieu;
	}
	
	
	//Constructeur vide de la competition
	public Competitions()
	{
		this.Id_Competition = 0;
		this.Id_Sport = 0;
		this.Libelle_C = "";
		this.Date_Debut = "";
		this.Date_Fin = "";
		this.Recompense = "";
		this.Vainqueur = "";
		this.Nb_Participants = 0;
		this.Lieu = "";
	}
	
	
	// Méthode permettant d'afficher les informations d'une compétition //
	
	public void Afficher()
	{
		System.out.print(Id_Competition+"  ");
		System.out.print(Id_Sport+"  ");
		System.out.print(Libelle_C+"  ");
		System.out.print(Date_Debut+"  ");
		System.out.print(Date_Fin+"  ");
		System.out.print(Recompense+"  ");
		System.out.print(Vainqueur+"  ");
		System.out.print(Nb_Participants+"  ");
		System.out.println(Lieu);
	}
	
	
	//Génération des Get et Set
	public int getId_Competition() {
		return Id_Competition;
	}
	
	public void setId_Competition(int id_Competition) {
		Id_Competition = id_Competition;
	}
	
	public int getId_Sport() {
		return Id_Sport;
	}
	
	public void setId_Sport(int id_Sport) {
		Id_Sport = id_Sport;
	}
	
	public String getLibelle_C() {
		return Libelle_C;
	}
	
	public void setLibelle_C(String libelle_C) {
		Libelle_C = libelle_C;
	}
	
	public String getDate_Debut() {
		return Date_Debut;
	}
	
	public void setDate_Debut(String date_Debut) {
		Date_Debut = date_Debut;
	}
	
	public String getDate_Fin() {
		return Date_Fin;
	}
	
	public void setDate_Fin(String date_Fin) {
		Date_Fin = date_Fin;
	}
	
	public String getRecompense() {
		return Recompense;
	}
	
	public void setRecompense(String recompense) {
		Recompense = recompense;
	}
	
	public String getVainqueur() {
		return Vainqueur;
	}
	
	public void setVainqueur(String vainqueur) {
		Vainqueur = vainqueur;
	}
	
	public int getNb_Participants() {
		return Nb_Participants;
	}
	
	public void setNb_Participants(int nb_Participants) {
		Nb_Participants = nb_Participants;
	}
	
	public String getLieu() {
		return Lieu;
	}
	
	public void setLieu(String lieu) {
		Lieu = lieu;
	}
	
}
