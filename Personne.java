package RegiSport;

public class Personne extends Equipe
{
	private int Id_Personne;
	private String Nom_P;
	private String Prenom;
	private int Age;
	private String Date_Naissance;
	
	
	//Constructeur Personne
	public Personne(int id_Personne, int Id_Equipe, String nom_P, String prenom,
			int age, String date_Naissance)
	{
		super(Id_Equipe);
		this.Id_Personne = id_Personne;
		this.Nom_P = nom_P;
		this.Prenom = prenom;
		this.Age = age;
		this.Date_Naissance = date_Naissance;
	}
	
	public Personne(int id_Personne, String Nom_E, String nom_P, String prenom,
			int age, String date_Naissance)
	{
		super(Nom_E);
		this.Id_Personne = id_Personne;
		this.Nom_P = nom_P;
		this.Prenom = prenom;
		this.Age = age;
		this.Date_Naissance = date_Naissance;
	}
	
	
	//Constructeur vide Personne
	public Personne()
	{
		this.Id_Personne = 0;
		this.Nom_P = "";
		this.Prenom = "";
		this.Age = 0;
		this.Date_Naissance = "";
	}
	
	
	// Méthode permettant d'afficher les informations d'une personne //
	
	public void Afficher()
	{
		System.out.print(Id_Personne+"  ");
		System.out.print(Nom_E+"  ");
		System.out.print(Nom_P+"  ");
		System.out.print(Prenom+"  ");
		System.out.print(Age+"  ");
		System.out.println(Date_Naissance);
	}
	
	public void Afficher1()
	{
		System.out.print(Id_Personne+"  ");
		System.out.print(Id_equipe+"  ");
		System.out.print(Nom_P+"  ");
		System.out.print(Prenom+"  ");
		System.out.print(Age+"  ");
		System.out.println(Date_Naissance);
	}


	//Génération des Get et Set
	public int getId_Personne() {
		return Id_Personne;
	}

	public void setId_Personne(int id_Personne) {
		Id_Personne = id_Personne;
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
