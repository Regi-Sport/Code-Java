import java.sql.*;

public class main
{
	
	public static void main(String[] args)
	{
		
		// Préparation et Accès à la base de données
		
		String url= "jdbc:mysql://127.0.0.1:3306/regisport";
		String login = "root";
		String passwd="";
		java.sql.Connection cn = null;
		java.sql.Statement st = null;
		java.sql.ResultSet rs = null;
		
		try
		{
			//Chargement du Driver
			Class.forName("com.mysql.jdbc.Driver");
			
			//Connexion
			cn = DriverManager.getConnection(url,login,passwd);
			/*DriverManager.getConnection(url,login,passwd);*/
			
			//Statement
			st = cn.createStatement();
			
			
			
			
			// Requête : 
			
			/* Compétitions à Venir */
			String sql = "SELECT * FROM `competition` WHERE DATE_DEBUT > (SELECT date(now()))";
			
			/* Compétitions en Cours */
			String sql2 = "SELECT * FROM `competition` WHERE DATE_DEBUT < (SELECT date(now())) AND (SELECT date(now())) < DATE_FIN";
			
			/* Compétitions Terminés */
			String sql3 = "SELECT * FROM `competition` WHERE DATE_FIN < (SELECT date(now()))";
			
			/* Modifier Compétitions */
			String id = ""/*textField.getText()*/;
			String sql4 = "SELECT NOM FROM `competition` WHERE ID_COMPETITION="+id;
			String sql5 = "SELECT ID_SPORT FROM `competition` WHERE ID_COMPETITION="+id;
			String sql6 = "SELECT DATE_DEBUT FROM `competition` WHERE ID_COMPETITION="+id;
			String sql7 = "SELECT DATE_FIN FROM `competition` WHERE ID_COMPETITION="+id;
			String sql8 = "SELECT PRIX FROM `competition` WHERE ID_COMPETITION="+id;
			String sql9 = "SELECT VAINQUEUR FROM `competition` WHERE ID_COMPETITION="+id;
			String sql10 = "SELECT PARTICIPANTS FROM `competition` WHERE ID_COMPETITION="+id;
			String sql11 = "SELECT LIEU FROM `competition` WHERE ID_COMPETITION="+id;
			String sql12 = "SELECT PAYS FROM `competition` WHERE ID_COMPETITION="+id;
			
			
			
			
			/*rs = st.executeQuery(sql);
			while (rs.next())
			{
				int id = rs.getInt("ID_SPORT");
				String libelle = rs.getString("LIBELLE_S");
			}*/
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
			}
			
		}
	}

}
