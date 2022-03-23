package RegiSport;

public class Pratiquer
{
	private int Id_Equipe;
	private int Id_Sport;
	private int Id_Personne;
	
	
	//Constructeur Pratiquer
	public Pratiquer(int id_Equipe, int id_Sport, int id_Personne)
	{
		this.Id_Equipe = id_Equipe;
		this.Id_Sport = id_Sport;
		this.Id_Personne = id_Personne;
	}
	
	
	//Constructeur vide Pratiquer
	public Pratiquer()
	{
		this.Id_Equipe = 0;
		this.Id_Sport = 0;
		this.Id_Personne = 0;
	}
	
	
	// Méthode permettant d'afficher les informations de pratiquer //
	
	public void Afficher()
	{
		System.out.print(Id_Equipe+"  ");
		System.out.print(Id_Sport+"  ");
		System.out.println(Id_Personne);
	}


	//Génération des Get et Set
	public int getId_Equipe() {
		return Id_Equipe;
	}

	public void setId_Equipe(int id_Equipe) {
		Id_Equipe = id_Equipe;
	}

	public int getId_Sport() {
		return Id_Sport;
	}

	public void setId_Sport(int id_Sport) {
		Id_Sport = id_Sport;
	}

	public int getId_Personne() {
		return Id_Personne;
	}

	public void setId_Personne(int id_Personne) {
		Id_Personne = id_Personne;
	}
	
}
