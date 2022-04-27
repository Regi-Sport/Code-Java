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
			
			// Afficher toutes les compétitions en cours //
			String sql2 = "SELECT * FROM competition WHERE DATE_DEBUT < (SELECT date(now())) AND (SELECT date(now())) < DATE_FIN";
			
			ArrayList<Competitions> Competition_EC = new ArrayList<Competitions>();
			
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
			String sql = "SELECT * FROM competition WHERE DATE_DEBUT > (SELECT date(now()))";
			
			ArrayList<Competitions> Competition_AV = new ArrayList<Competitions>();
			
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
			
			int len1 = Competition_AV.size();
			for (int i = 0; i < len1; i++)
			{
				Competitions o = Competition_AV.get(i);
				o.Afficher();
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Afficher toutes les compétitions à venir //
			String sql3 = "SELECT * FROM competition WHERE DATE_FIN < (SELECT date(now()))";
			
			ArrayList<Competitions> Competition_F = new ArrayList<Competitions>();
			
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
			
			int len2 = Competition_F.size();
			for (int i = 0; i < len2; i++)
			{
				Competitions o = Competition_F.get(i);
				o.Afficher();
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			// Modifier Compétitions //
			
			ArrayList<Competitions> Competitions = new ArrayList<Competitions>();
			
			int id = 1 /*textField.getText()*/; // Récuperer
			String sql4 = "SELECT * FROM competition WHERE ID_COMPETITION="+id+";";
			
			rs = st.executeQuery(sql4);
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
				Competitions.add(u);
			}
			
			
			// Affichage des compétitions //
			
			System.out.println();
			int len3 = Competitions.size();
			for (int i = 0; i < len3; i++)
			{
				Competitions o = Competitions.get(i);
				o.Afficher();
			}
			
/*#####################################################################################################################################################################################################################################################*/
			
			// Modifier une compétition //
			
			String sql5 = "SELECT * FROM competition WHERE ID_SPORT="+id+";";
			rs = st.executeQuery(sql5);
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
								
				ID_S = 0/*textField.getText()*/;
				libelle_C = ""/*textField.getText()*/;
				date_D = ""/*textField.getText()*/;
				date_F = ""/*textField.getText()*/;
				prix = ""/*textField.getText()*/;
				win = ""/*textField.getText()*/;
				nb = 0/*textField.getText()*/;
				lieu = ""/*textField.getText()*/;
				
				String sql6 = "UPDATE competitions SET ID_SPORT="+ID_S+"LIBELLE_C="+libelle_C+", DATE_DEBUT="+date_D+", DATE_FIN="+date_F+", RECOMPENSE="+prix+", VAINQUEUR="+win+", NB_PARTICIPANTS="+nb+", LIEU="+lieu+" WHERE ID_COMPETITION="+id+"";
				/*st.executeUpdate(sql6);*/
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Voir les inscrits dans une competition //
			
			System.out.println();
			String sql7 = "SELECT equipe.*, personne.* FROM equipe, competition, inscrire, personne WHERE inscrire.ID_EQUIPE=equipe.ID_EQUIPE AND inscrire.ID_COMPETITION=competition.ID_COMPETITION AND inscrire.ID_PERSONNE=personne.ID_PERSONNE AND competition.ID_COMPETITION="+id+";";
			rs = st.executeQuery(sql7);
			while (rs.next())
			{
				// Pour une Personne //
				
				int ID_P = rs.getInt("ID_Personne");
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_P = rs.getString("NOM_P");
				String prenom = rs.getString("PRENOM");
				int age = rs.getInt("AGE");
				String date_N = rs.getString("DATE_NAISSANCE");
				
				// Pour une Equipe //
				
				String nom_E = rs.getString("NOM_E");
				int effectif = rs.getInt("EFFECTIF");
				String nom_coach = rs.getString("NOM_COACH");
				String ville = rs.getString("VILLE");
				
				// Personne //
				
				int id_E = 0/*textField.getText()*/;
				String bb = "";
				String b = "SELECT Nom_E FROM personne, equipe WHERE personne.ID_EQUIPE=equipe.ID_EQUIPE AND equipe.ID_EQUIPE="+id_E+";";
				rs = st.executeQuery(b);
				while (rs.next())
				{
					bb = rs.getString("Nom_E");
				}
				
				Personne u = new Personne(ID_P, bb, nom_P, prenom, age, date_N);
				u.Afficher();
				
				// Equipe //
				
				System.out.println();
				Equipe y = new Equipe(ID_E, nom_E, effectif, nom_coach, ville);
				y.Afficher();
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Suppression d'un inscrit dans une competition //
			
			// Pour une Équipe inscrite //
			String sql8 = "DELETE FROM pratiquer WHERE ID_EQUIPE="+id+";";
			/*rs = st.executeQuery(sql8);*/
			
			// Pour une Personne inscrite //
			String sql9 = "DELETE FROM pratiquer WHERE ID_PERSONNE="+id+";";
			/*rs = st.executeQuery(sql9);*/
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Suppression d'une competition //
			
			String sql10 = "DELETE FROM competition WHERE ID_COMPETITION="+id+";";
			/*rs = st.executeQuery(sql10);*/
			
			
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
			String sql11 = "INSERT INTO competition VALUES("+id_C+", "+id_S+", "+libelle_C+", "+date_D+", "+date_F+", "+prix+", "+win+", "+nb+", "+lieu+");";
			/* rs = st.executeQuery(sql11); */
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Delete une compétition //
			
			String sql12 = "DELETE FROM competition WHERE ID_COMPETITION="+id+";";
			/*rs = st.executeQuery(sql12);*/
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			
			// EQUIPE :
			
			
			// Afficher les Détails d'une Equipe //
			
			String nom_e = ""/*textField.getText()*/;
			String sport = ""/*textField.getText()*/;
			
			// Par Rapport au Nom //
			
			String sql13 = "SELECT * FROM equipe WHERE NOM_E="+nom_e+";";
			/*rs = st.executeQuery(sql13);*/
			while (rs.next())
			{
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_E = rs.getString("NOM_E");
				int effectif = rs.getInt("EFFECTIF");
				String nom_coach = rs.getString("NOM_COACH");
				String ville = rs.getString("VILLE");
				
				Equipe y = new Equipe(ID_E, nom_E, effectif, nom_coach, ville);
				y.Afficher();
			}
			
			// Par Rapport au Sport //
			
			String sql14 = "SELECT equipe.* FROM equipe, sport, pratiquer WHERE pratiquer.ID_SPORT=sport.ID_SPORT AND pratiquer.ID_EQUIPE=equipe.ID_EQUIPE AND LIBELLE_S="+sport+";";
			/*rs = st.executeQuery(sql14);*/
			while (rs.next())
			{
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_E = rs.getString("NOM_E");
				int effectif = rs.getInt("EFFECTIF");
				String nom_coach = rs.getString("NOM_COACH");
				String ville = rs.getString("VILLE");
				
				Equipe y = new Equipe(ID_E, nom_E, effectif, nom_coach, ville);
				y.Afficher();
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Modifier une Equipe //
			
			String sql15 = "SELECT * FROM equipe WHERE ID_EQUIPE="+id+";";
			rs = st.executeQuery(sql15);
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
				
				ID_E = 0 /*textField.getText()*/;
				nom_E = ""/*textField.getText()*/;
				eff = 0 /*textField.getText()*/;
				nom_C = ""/*textField.getText()*/;
				ville = ""/*textField.getText()*/;
				
				String sql16 = "UPDATE equipe SET ID_EQUIPE="+ID_E+", NOM_E="+nom_E+", EFFECTIF="+eff+", NOM_COACH="+nom_C+", VILLE="+ville+" WHERE ID_EQUIPE="+id+"";
				/*st.executeUpdate(sql16);*/
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Afficher les membres d'une equipe //
			
			id = 2;
			System.out.println();
			String sql17 = "SELECT personne.* FROM personne, equipe WHERE personne.ID_EQUIPE=equipe.ID_EQUIPE AND equipe.ID_EQUIPE="+id+";";
			rs = st.executeQuery(sql17);
			while (rs.next())
			{
				int ID_P = rs.getInt("ID_PERSONNE");
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_P = rs.getString("NOM_P");
				String prenom = rs.getString("PRENOM");
				int age = rs.getInt("AGE");
				String date_N = rs.getString("DATE_NAISSANCE");
				
				System.out.println(ID_P);
				System.out.println(ID_E);
				System.out.println(nom_P);
				System.out.println(prenom);
				System.out.println(age);
				System.out.println(date_N);
				
				
				// Ajouter un membre dans une equipe //
				
				ID_E = 0/*textField.getText()*/;
				System.out.println();
				String sql18 = "UPDATE personne SET ID_PERSONNE="+ID_P+", ID_EQUIPE="+ID_E+", Nom_P="+nom_P+", PRENOM="+prenom+", AGE="+age+", DATE_NAISSANCE="+date_N+";";
				/*st.executeUpdate(sql18);*/
				
				
				// Delete un Membre dans une Equipe//
				
				String sql19 = "UPDATE personne SET ID_PERSONNE="+ID_P+", ID_EQUIPE=null, Nom_P="+nom_P+", PRENOM="+prenom+", AGE="+age+", DATE_NAISSANCE="+date_N+";";
				/*st.executeUpdate(sql19);*/
			}
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Delete une Equipe //
			
			String sql20 = "DELETE FROM equipe WHERE ID_EQUIPE="+id+";";
			/*rs = st.executeQuery(sql20);*/
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Ajouter une Equipe //
			
			System.out.println();
			String id_E = ""/*textField.getText()*/;
			String nom_E = ""/*textField.getText()*/;
			int eff = 0/*textField.getText()*/;
			String nom_C = ""/*textField.getText()*/;
			String ville = ""/*textField.getText()*/;
			String sql21 = "INSERT INTO equipe VALUES("+id_E+", "+nom_E+", "+eff+", "+nom_C+", "+ville+");";
			/* rs = st.executeQuery(sql21); */
			
			
/*#####################################################################################################################################################################################################################################################*/
			
			
			// Personnes Details //
			
			System.out.println();
			String nom_p = ""/*textField.getText()*/;
			sport = ""/*textField.getText()*/;
			
			// Par Rapport au Nom //
			
			String sql22 = "SELECT * FROM personne WHERE NOM_E="+nom_p+";";
			/*rs = st.executeQuery(sql22);*/
			while (rs.next())
			{
				int ID_P = rs.getInt("ID_PERSONNE");
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_P = rs.getString("NOM_P");
				String prenom = rs.getString("PRENOM");
				int age = rs.getInt("AGE");
				String date_N = rs.getString("DATE_NAISSANCE");
				
				Personne y = new Personne(ID_P, ID_E, nom_P, prenom, age, date_N);
				y.Afficher1();
			}
			
			// Par Rapport au Sport //
			
			String sql23 = "SELECT personne.* FROM personne, sport, pratiquer WHERE pratiquer.ID_SPORT=sport.ID_SPORT AND pratiquer.ID_PERSONNE=personne.ID_PERSONNE AND LIBELLE_S="+sport+";";
			/*rs = st.executeQuery(sql23);*/
			while (rs.next())
			{
				int ID_P = rs.getInt("ID_PERSONNE");
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_P = rs.getString("NOM_P");
				String prenom = rs.getString("PRENOM");
				int age = rs.getInt("AGE");
				String date_N = rs.getString("DATE_NAISSANCE");
				
				Personne y = new Personne(ID_P, ID_E, nom_P, prenom, age, date_N);
				y.Afficher1();
			}
			
			// Par Rapport a sa presence dans une Equipe //
			
			String sql24 = "SELECT * FROM personne WHERE ID_EQUIPE IS NOT NULL;";
			rs = st.executeQuery(sql24);
			while (rs.next())
			{
				int ID_P = rs.getInt("ID_PERSONNE");
				int ID_E = rs.getInt("ID_EQUIPE");
				String nom_P = rs.getString("NOM_P");
				String prenom = rs.getString("PRENOM");
				int age = rs.getInt("AGE");
				String date_N = rs.getString("DATE_NAISSANCE");
				
				Personne y = new Personne(ID_P, ID_E, nom_P, prenom, age, date_N);
				y.Afficher1();
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
