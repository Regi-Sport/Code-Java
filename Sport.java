package RegiSport;

public class Sport
{
	private int Id_Sport;
	private String Libelle_S;
	
	public Sport(int id_Sport, String libelle_S)
	{
		this.Id_Sport = id_Sport;
		this.Libelle_S = libelle_S;
	}
	
	
	// Méthode permettant d'afficher les informations d'un sport //
	
	public void Afficher()
	{
		System.out.print(Id_Sport+"  ");
		System.out.println(Libelle_S);
	}

	
	//Génération des Get et Set
	public int getId_Sport() {
		return Id_Sport;
	}

	public void setId_Sport(int id_Sport) {
		Id_Sport = id_Sport;
	}

	public String getLibelle_S() {
		return Libelle_S;
	}

	public void setLibelle_S(String libelle_S) {
		Libelle_S = libelle_S;
	}
	
}
