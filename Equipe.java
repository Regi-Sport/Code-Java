package RegiSport;

public class Equipe
{
	private int Id_equipe;
	private String Nom_E;
	private int Effectif;
	private String Nom_Coach;
	private String Ville;

	
	//Constructeur Equipe
	public Equipe(int id_equipe, String nom_E,
			int effectif, String nom_Coach, String ville)
	{
		this.Id_equipe = id_equipe;
		this.Nom_E = nom_E;
		this.Id_equipe = effectif;
		this.Nom_Coach = nom_Coach;
		this.Ville = ville;
	}
	
	
	//Constructeur vide Equipe
	public Equipe()
	{
		this.Id_equipe = 0;
		this.Nom_E = "";
		this.Id_equipe = 0;
		this.Nom_Coach = "";
		this.Ville = "";
	}

	
	
	//Génération des Get et Set
	public int getId_equipe() {
		return Id_equipe;
	}


	public void setId_equipe(int id_equipe) {
		Id_equipe = id_equipe;
	}


	public String getNom_E() {
		return Nom_E;
	}


	public void setNom_E(String nom_E) {
		Nom_E = nom_E;
	}


	public int getEffectif() {
		return Effectif;
	}


	public void setEffectif(int effectif) {
		Effectif = effectif;
	}


	public String getNom_Coach() {
		return Nom_Coach;
	}


	public void setNom_Coach(String nom_Coach) {
		Nom_Coach = nom_Coach;
	}


	public String getVille() {
		return Ville;
	}


	public void setVille(String ville) {
		Ville = ville;
	}
	
}
