package RegiSport;

import java.sql.*;

public class main {

	public static void main(String[] args)
	{
		
		//ACCES A NOTRE BASE DE DONNEES
		String url= "jdbc:mysql://127.0.0.1:3306/regi'sport";
		String login = "root";
		String passwd="";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		
		try
		{
			//Etape 1 : Chargement du driver
			Class.forName("com.mysql.jdbc.Driver");
			
			
			//Etape 2 : rÃ©cupÃ©ration de la connexion
			cn = DriverManager.getConnection(url,login,passwd);
			//DriverManager.getConnection(url,login,passwd);
			
			
			//Etape 3: CrÃ©ation d'un statement
			st = cn.createStatement();
			
			
			//Etape 5 : Execution RequÃªte Avec retour rÃ©sultat
			String sql2 = "insert into sport(id_sport,libelle_s) values(1,'azerty');";
			st.executeUpdate(sql2);
			
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				cn.close();
				st.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			})
				aze
				zaswdxdsw
			
		}
	}

}
