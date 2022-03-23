package RegiSport;

import java.sql.*;
import java.util.*;

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
		java.sql.ResultSet rs1 = null;
		
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
			String sql = "SELECT * FROM competition WHERE DATE_DEBUT > (SELECT date(now()))";
			
			/* Compétitions en Cours */
			String sql2 = "SELECT * FROM competition WHERE DATE_DEBUT < (SELECT date(now())) AND (SELECT date(now())) < DATE_FIN";
			
			/* Compétitions Terminés */
			String sql3 = "SELECT * FROM competition WHERE DATE_FIN < (SELECT date(now()))";
			
			/* Modifier Compétitions */
			String id = ""/*textField.getText()*/; // Récuperer 
			String sql4 = "SELECT NOM FROM competition WHERE ID_COMPETITION="+id;
			String sql5 = "SELECT ID_SPORT FROM competition WHERE ID_COMPETITION="+id;
			String sql6 = "SELECT DATE_DEBUT FROM competition WHERE ID_COMPETITION="+id;
			String sql7 = "SELECT DATE_FIN FROM competition WHERE ID_COMPETITION="+id;
			String sql8 = "SELECT PRIX FROM competition WHERE ID_COMPETITION="+id;
			String sql9 = "SELECT VAINQUEUR FROM competition WHERE ID_COMPETITION="+id;
			String sql10 = "SELECT PARTICIPANTS FROM competition WHERE ID_COMPETITION="+id;
			String sql11 = "SELECT LIEU FROM competitio` WHERE ID_COMPETITION="+id;
			String sql12 = "SELECT PAYS FROM competition WHERE ID_COMPETITION="+id;
			
			
			
			
			
			// Afficher toutes les compétitions en cours //
			
			ArrayList<Competitions> Competition_EC = new ArrayList<Competitions>();
			ArrayList<Competitions> Competition_AV = new ArrayList<Competitions>();
			ArrayList<Competitions> Competition_F = new ArrayList<Competitions>();
			
			rs = st.executeQuery(sql2);
			while (rs.next())
			{
				int ID_C = rs.getInt("ID_COMPETITION");
				int ID_S = rs.getInt("ID_SPORT");
				String libelle_C = rs.getString("LIBELLE_C");
				String date_D = rs.getString("DATE_DEBUT");
				String date_F = rs.getString("DATE_FIN");
				String prix = rs.getString("RECOMPENSE");
				String win = rs.getString("Vainqueur");
				int nb = rs.getInt("NB_PARTICIPANTS");
				String lieu = rs.getString("LIEU");
				
				
				// Essaie de print libelle_sport au lieu de id_sport //
				
				/*String a = "SELECT LIBELLE_S FROM competition, sport WHERE competition.ID_SPORT=sport.ID_SPORT AND ID_SPORT="+ID_S+";";
				rs = st.executeQuery(a);
				while (rs.next())
				{
					String aa = rs.getString("LIBELLE_S");
					System.out.println(aa);
				}*/
				
				Competitions u = new Competitions(ID_C, ID_S, libelle_C, date_D, date_F, prix, win, nb, lieu);
				Competition_EC.add(u);
			}
			
			
			// Affichage des compétitions //
			
			int len = Competition_EC.size();
			for (int i = 0; i < len; i++)
			{
				Competitions o = Competition_EC.get(i);
				o.Afficher();
			}
			
			
			
			// Afficher toutes les compétitions à venir //
			
			rs = st.executeQuery(sql);
			while (rs.next())
			{
				int ID_C = rs.getInt("ID_COMPETITION");
				int ID_S = rs.getInt("ID_SPORT");
				String libelle_C = rs.getString("LIBELLE_C");
				String date_D = rs.getString("DATE_DEBUT");
				String date_F = rs.getString("DATE_FIN");
				String prix = rs.getString("RECOMPENSE");
				String win = rs.getString("Vainqueur");
				int nb = rs.getInt("NB_PARTICIPANTS");
				String lieu = rs.getString("LIEU");
			
				Competitions u = new Competitions(ID_C, ID_S, libelle_C, date_D, date_F, prix, win, nb, lieu);
				Competition_AV.add(u);
			}
			
			
			// Affichage des compétitions //
			
			System.out.println();
			int len1 = Competition_AV.size();
			for (int i = 0; i < len; i++)
			{
				Competitions o = Competition_AV.get(i);
				o.Afficher();
			}
			
			
			// Afficher toutes les compétitions à venir //
			
			rs = st.executeQuery(sql3);
			while (rs.next())
			{
				int ID_C = rs.getInt("ID_COMPETITION");
				int ID_S = rs.getInt("ID_SPORT");
				String libelle_C = rs.getString("LIBELLE_C");
				String date_D = rs.getString("DATE_DEBUT");
				String date_F = rs.getString("DATE_FIN");
				String prix = rs.getString("RECOMPENSE");
				String win = rs.getString("Vainqueur");
				int nb = rs.getInt("NB_PARTICIPANTS");
				String lieu = rs.getString("LIEU");
				
				Competitions u = new Competitions(ID_C, ID_S, libelle_C, date_D, date_F, prix, win, nb, lieu);
				Competition_F.add(u);
			}
			
			
			// Affichage des compétitions //
			
			System.out.println();
			int len2 = Competition_F.size();
			for (int i = 0; i < len; i++)
			{
				Competitions o = Competition_F.get(i);
				o.Afficher();
			}
			
			
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
