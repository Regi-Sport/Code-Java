package RegiSport;

public class Inscrire
{
	private int Id_Equipe;
	private int Id_Competition;
	private int Id_Personne;
	
	
	//Constructeur Inscrire
	public Inscrire(int id_Equipe, int id_Competition, int id_Personne)
	{
		this.Id_Equipe = id_Equipe;
		this.Id_Competition = id_Competition;
		this.Id_Personne = id_Personne;
	}
	
	
	//Constructeur vide Inscrire
	public Inscrire()
	{
		this.Id_Equipe = 0;
		this.Id_Competition = 0;
		this.Id_Personne = 0;
	}


	
	//Génération des Get et Set
	public int getId_Equipe() {
		return Id_Equipe;
	}


	public void setId_Equipe(int id_Equipe) {
		Id_Equipe = id_Equipe;
	}


	public int getId_Competition() {
		return Id_Competition;
	}


	public void setId_Competition(int id_Competition) {
		Id_Competition = id_Competition;
	}


	public int getId_Personne() {
		return Id_Personne;
	}


	public void setId_Personne(int id_Personne) {
		Id_Personne = id_Personne;
	}
	
}
