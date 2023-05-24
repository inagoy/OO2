package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Exporter extends VoorheesExporter{
	
	public String exportar(List<Socio> socios) {
		JSONArray sociosJSON = new JSONArray();
		for (Socio socio:socios) {
			JSONObject socioJSON = new JSONObject();
			socioJSON.put("nombre", socio.getNombre());
			socioJSON.put("email", socio.getEmail());
			socioJSON.put("legajo", socio.getLegajo());
			sociosJSON.add(socioJSON);
		}
		return sociosJSON.toJSONString();
	}
}
