package RegiSport;

public class Personne
{
	private int Id_Personne;
	private int Id_Equipe;
	private String Nom_P;
	private String Prenom;
	private int Age;
	private String Date_Naissance;
	
	
	//Constructeur Personne
	public Personne(int id_Personne, int id_Equipe, String nom_P, String prenom,
			int age, String date_Naissance)
	{
		this.Id_Personne = id_Personne;
		this.Id_Equipe = id_Equipe;
		this.Nom_P = nom_P;
		this.Prenom = prenom;
		this.Age = age;
		this.Date_Naissance = date_Naissance;
	}
	
	
	//Constructeur vide Personne
	public Personne()
	{
		this.Id_Personne = 0;
		this.Id_Equipe = 0;
		this.Nom_P = "";
		this.Prenom = "";
		this.Age = 0;
		this.Date_Naissance = "";
	}


	//Génération des Get et Set
	public int getId_Personne() {
		return Id_Personne;
	}


	public void setId_Personne(int id_Personne) {
		Id_Personne = id_Personne;
	}


	public int getId_Equipe() {
		return Id_Equipe;
	}


	public void setId_Equipe(int id_Equipe) {
		Id_Equipe = id_Equipe;
	}


	public String getNom_P() {
		return Nom_P;
	}


	public void setNom_P(String nom_P) {
		Nom_P = nom_P;
	}


	public String getPrenom() {
		return Prenom;
	}


	public void setPrenom(String prenom) {
		Prenom = prenom;
	}


	public int getAge() {
		return Age;
	}


	public void setAge(int age) {
		Age = age;
	}


	public String getDate_Naissance() {
		return Date_Naissance;
	}


	public void setDate_Naissance(String date_Naissance) {
		Date_Naissance = date_Naissance;
	}
	
}
