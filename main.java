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
			
			
			
			// COMPETITION : 
			
			
			/* Afficher Compétitions à Venir */
			String sql = "SELECT * FROM competition WHERE DATE_DEBUT > (SELECT date(now()))";
			
			/* Afficher Compétitions en Cours */
			String sql2 = "SELECT * FROM competition WHERE DATE_DEBUT < (SELECT date(now())) AND (SELECT date(now())) < DATE_FIN";
			
			/* Afficher Compétitions Terminés */
			String sql3 = "SELECT * FROM competition WHERE DATE_FIN < (SELECT date(now()))";
			
			/* Modifier Compétitions */
			int id = 1/*textField.getText()*/; // Récuperer
			String sql4 = "SELECT NOM FROM competition WHERE ID_COMPETITION="+id;
			String sql5 = "SELECT ID_SPORT FROM competition WHERE ID_COMPETITION="+id;
			String sql6 = "SELECT DATE_DEBUT FROM competition WHERE ID_COMPETITION="+id;
			String sql7 = "SELECT DATE_FIN FROM competition WHERE ID_COMPETITION="+id;
			String sql8 = "SELECT PRIX FROM competition WHERE ID_COMPETITION="+id;
			String sql9 = "SELECT VAINQUEUR FROM competition WHERE ID_COMPETITION="+id;
			String sql10 = "SELECT PARTICIPANTS FROM competition WHERE ID_COMPETITION="+id;
			String sql11 = "SELECT LIEU FROM competitio` WHERE ID_COMPETITION="+id;
			String sql12 = "SELECT PAYS FROM competition WHERE ID_COMPETITION="+id;
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
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
				String aa = "";
				
				
				// Essaie de print libelle_sport au lieu de id_sport //
				String a = "SELECT LIBELLE_S FROM competition, sport WHERE competition.ID_SPORT=sport.ID_SPORT AND sport.ID_SPORT="+ID_S+";";
				rs = st.executeQuery(a);
				while (rs.next())
				{
					aa = rs.getString("LIBELLE_S");
				}
				
				
				Competitions u = new Competitions(ID_C, aa, libelle_C, date_D, date_F, prix, win, nb, lieu);
				Competition_EC.add(u);
			}
			
			
			// Affichage des compétitions //
			
			int len = Competition_EC.size();
			for (int i = 0; i < len; i++)
			{
				Competitions o = Competition_EC.get(i);
				o.Afficher();
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
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
				String aa = "";
				
				
				// Essaie de print libelle_sport au lieu de id_sport //
				String a = "SELECT LIBELLE_S FROM competition, sport WHERE competition.ID_SPORT=sport.ID_SPORT AND sport.ID_SPORT="+ID_S+";";
				rs = st.executeQuery(a);
				while (rs.next())
				{
					aa = rs.getString("LIBELLE_S");
				}
				
				
				Competitions u = new Competitions(ID_C, aa, libelle_C, date_D, date_F, prix, win, nb, lieu);
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
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
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
				String aa = "";
				
				
				// Essaie de print libelle_sport au lieu de id_sport //
				String a = "SELECT LIBELLE_S FROM competition, sport WHERE competition.ID_SPORT=sport.ID_SPORT AND sport.ID_SPORT="+ID_S+";";
				rs = st.executeQuery(a);
				while (rs.next())
				{
					aa = rs.getString("LIBELLE_S");
				}
				
				
				Competitions u = new Competitions(ID_C, aa, libelle_C, date_D, date_F, prix, win, nb, lieu);
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
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Modifier une compétition //
			
			System.out.println();
			String sql13 = "SELECT * FROM competition WHERE ID_SPORT="+id+";";
			rs = st.executeQuery(sql13);
			while (rs.next())
			{
				int ID_C = rs.getInt("ID_COMPETITION");
				int ID_S = rs.getInt("ID_SPORT");
				String libelle_C = rs.getString("LIBELLE_C");
				String date_D = rs.getString("DATE_DEBUT");
				String date_F = rs.getString("DATE_FIN");
				String prix = rs.getString("RECOMPENSE");
				String win = rs.getString("VAINQUEUR");
				int nb = rs.getInt("NB_PARTICIPANTS");
				String lieu = rs.getString("LIEU");
				
				System.out.println(libelle_C);
				System.out.println(date_D);
				System.out.println(date_F);
				System.out.println(prix);
				System.out.println(win);
				System.out.println(nb);
				System.out.println(lieu);
				
				ID_S = 0/*textField.getText()*/;
				libelle_C = ""/*textField.getText()*/;
				date_D = ""/*textField.getText()*/;
				date_F = ""/*textField.getText()*/;
				prix = ""/*textField.getText()*/;
				win = ""/*textField.getText()*/;
				nb = 0/*textField.getText()*/;
				lieu = ""/*textField.getText()*/;
				
				String sql14 = "UPDATE competitions SET ID_SPORT="+ID_S+"LIBELLE_C="+libelle_C+", DATE_DEBUT="+date_D+", DATE_FIN="+date_F+", RECOMPENSE="+prix+", VAINQUEUR="+win+", NB_PARTICIPANTS="+nb+", LIEU="+lieu+" WHERE ID_COMPETITION="+id+"";
				/*rs = st.executeQuery(sql14);*/
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Voir les inscrits dans une competition //
			
			System.out.println();
			String sql15 = "SELECT equipe.*, personne.* FROM equipe, competition, inscrire, personne WHERE inscrire.ID_EQUIPE=equipe.ID_EQUIPE AND inscrire.ID_COMPETITION=competition.ID_COMPETITION AND inscrire.ID_PERSONNE=personne.ID_PERSONNE AND competition.ID_COMPETITION="+id+";";
			rs = st.executeQuery(sql15);
			while (rs.next())
			{
				int ID_P = rs.getInt("ID_Personne");
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_P = rs.getString("NOM_P");
				String prenom = rs.getString("PRENOM");
				int age = rs.getInt("AGE");
				String date_N = rs.getString("DATE_NAISSANCE");
				
				String nom_E = rs.getString("NOM_E");
				int effectif = rs.getInt("EFFECTIF");
				String nom_coach = rs.getString("NOM_COACH");
				String ville = rs.getString("VILLE");
				
				int id_E = 0/*textField.getText()*/;
				String bb = "";
				String b = "SELECT Nom_E FROM personne, equipe WHERE personne.ID_EQUIPE=equipe.ID_EQUIPE AND equipe.ID_EQUIPE="+id_E+";";
				rs = st.executeQuery(b);
				while (rs.next())
				{
					bb = rs.getString("LIBELLE_S");
				}
				
				Personne u = new Personne(ID_P, bb, nom_P, prenom, age, date_N);
				u.Afficher();
				
				Equipe y = new Equipe(ID_E, nom_E, effectif, nom_coach, ville);
				y.Afficher();
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Suppression d'un inscrit dans une competition //
			
			System.out.println();
			String sql19 = "DELETE FROM pratiquer WHERE ID_EQUIPE="+id+";";
			/*rs = st.executeQuery(sql19);*/
			String sql20 = "DELETE FROM pratiquer WHERE ID_PERSONNE="+id+";";
			/*rs = st.executeQuery(sql20);*/
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Suppression d'une competition //
			
			System.out.println();
			String sql16 = "DELETE FROM competition WHERE ID_COMPETITION="+id+";";
			/*rs = st.executeQuery(sql16);*/
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Ajouter une competition //
			
			System.out.println();
			String id_C = ""/*textField.getText()*/;
			String id_S = ""/*textField.getText()*/;
			String libelle_C = ""/*textField.getText()*/;
			String date_D = ""/*textField.getText()*/;
			String date_F = ""/*textField.getText()*/;
			String prix = ""/*textField.getText()*/;
			String win = ""/*textField.getText()*/;
			int nb = 0/*textField.getText()*/;
			String lieu = ""/*textField.getText()*/;
			String sql17 = "INSERT INTO competition VALUES("+id_C+", "+id_S+", "+libelle_C+", "+date_D+", "+date_F+", "+prix+", "+win+", "+nb+", "+lieu+");";
			/* rs = st.executeQuery(sql15); */
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Delete une compétition //
			
			System.out.println();
			String sql18 = "DELETE FROM competition WHERE ID_COMPETITION="+id+";";
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			
			// EQUIPE :
			
			
			// Afficher les Détails d'une Equipe //
			
			System.out.println();
			String nom_e = ""/*textField.getText()*/; 
			String sport = ""/*textField.getText()*/;
			String sql21 = "SELECT * FROM equipe WHERE NOM_E="+nom_e+";";
			String sql22 = "SELECT equipe.* FROM equipe, sport, pratiquer WHERE pratiquer.ID_SPORT=sport.ID_SPORT AND pratiquer.ID_EQUIPE=equipe.ID_EQUIPE AND LIBELLE_S="+sport+";";
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Modifier une Equipe //
			
			System.out.println();
			String sql23 = "SELECT * FROM equipe WHERE ID_EQUIPE="+id+";";
			rs = st.executeQuery(sql23);
			while (rs.next())
			{
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_E = rs.getString("NOM_E");
				int eff = rs.getInt("EFFECTIF");
				String nom_C = rs.getString("NOM_COACH");
				String ville = rs.getString("VILLE");
				
				System.out.println(ID_E);
				System.out.println(nom_E);
				System.out.println(eff);
				System.out.println(nom_C);
				System.out.println(ville);
				
				ID_E = 0/*textField.getText()*/;
				nom_E = ""/*textField.getText()*/;
				eff = 0/*textField.getText()*/;
				nom_C = ""/*textField.getText()*/;
				ville = ""/*textField.getText()*/;
				
				String sql24 = "UPDATE equipe SET ID_EQUIPE="+ID_E+", NOM_E="+nom_E+", EFFECTIF="+eff+", NOM_COACH="+nom_C+", VILLE="+ville+" WHERE ID_EQUIPE="+id+"";
				/*rs = st.executeQuery(sql24);*/
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Afficher les membres d'une equipe //
			
			System.out.println();
			String sql25 = "SELECT personne.* FROM personne, equipe WHERE personne.ID_EQUIPE=equipe.ID_EQUIPE AND ID_EQUIPE="+id+";";
			/*rs = st.executeQuery(sql25);*/
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Ajouter un membre dans une equipe //
			
			System.out.println();
			String sql26 = "";
			
			
			
			
			
			
			
			
			
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
