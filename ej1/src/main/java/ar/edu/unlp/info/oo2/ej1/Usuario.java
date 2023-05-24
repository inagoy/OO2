package ar.edu.unlp.info.oo2.ej1;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Twit> twits;
	
	public Usuario(String screenName){
		this.screenName= screenName;
		this.twits = new ArrayList<Twit>();
	}
	
	public String getScreenName() {
		return this.screenName;
	}
	
	public List<Twit> getTwitts(){
		return this.twits;
	}
	
}
