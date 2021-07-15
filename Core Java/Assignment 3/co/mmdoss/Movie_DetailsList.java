package co.mmdoss;

import java.util.ArrayList;
import java.util.ListIterator;

class Movie_details{
	private String mov_Name;
	private String lead_actor;
	private String lead_actress;
	private String genre;
	public Movie_details(String mov_Name, String lead_actor, String lead_actress, String genre) {
		super();
		this.mov_Name = mov_Name;
		this.lead_actor = lead_actor;
		this.lead_actress = lead_actress;
		this.genre = genre;
	}
	public String getMov_Name() {
		return mov_Name;
	}
	public void setMov_Name(String mov_Name) {
		this.mov_Name = mov_Name;
	}
	public String getLead_actor() {
		return lead_actor;
	}
	public void setLead_actor(String lead_actor) {
		this.lead_actor = lead_actor;
	}
	public String getLead_actress() {
		return lead_actress;
	}
	public void setLead_actress(String lead_actress) {
		this.lead_actress = lead_actress;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public String toString() {
		return "Movie_details [mov_Name=" + mov_Name + ", lead_actor=" + lead_actor + ", lead_actress=" + lead_actress
				+ ", genre=" + genre + "]";
	}
	
}

public class Movie_DetailsList{
	private static ArrayList<Movie_details> list=new ArrayList<>();
	public static void add_movie(Movie_details m) {
		list.add(m);		
	}
	public static void remove_movie(Movie_details m) {
		list.remove(m);		
	}
	public static void remove_AllMovies() {
		list.clear();
	}
	public static ArrayList<Movie_details> find_movie_By_mov_Name(String name) {
		
		ArrayList<Movie_details> result=new ArrayList<>();
		boolean flag=false;
		Movie_details m=null;
		
		ListIterator<Movie_details> iter=list.listIterator();
		
		while(iter.hasNext()) {
			m=iter.next();
			if(m.getMov_Name().equals(name)) {
				flag=true;
				result.add(m);
			}
		}
		
		if(flag==false)
			return null;
		else
			return result;
	}
	
	public static ArrayList<Movie_details> find_movie_By_Genre(String genre) {
		
		ArrayList<Movie_details> result=new ArrayList<>();
		boolean flag=false;
		Movie_details m=null;
		
		ListIterator<Movie_details> iter=list.listIterator();
		
		while(iter.hasNext()) {
			m=iter.next();
			if(m.getGenre().equals(genre)) {
				flag=true;
				result.add(m);
			}
		}
		
		if(flag==false)
			return null;
		else
			return result;
	}
	
	public static void sort(String field) {
		switch (field) {
		case "mov_Name":
			list.sort((o1, o2)
                    -> o1.getMov_Name().compareTo(
                        o2.getMov_Name()));
			break;
		case "genre":
			list.sort((o1, o2)
                    -> o1.getGenre().compareTo(
                        o2.getGenre()));
			break;
		case "lead_actor":
			list.sort((o1, o2)
                    -> o1.getLead_actor().compareTo(
                        o2.getLead_actress()));
			break;
		case "lead_actress":
			list.sort((o1, o2)
                    -> o1.getLead_actress().compareTo(
                        o2.getLead_actress()));
			break;
		default:
			System.out.println("Invalid field input");
		}
	}
	public static void view_list() {
		for (Movie_details movie_details : list) {
			System.out.println(movie_details);
		}
	}
}
