package view;
import java.text.SimpleDateFormat;
import java.util.Locale;

import com.google.gson.Gson;

import manejador.Manejador;
import model.Currently;
import model.Daily;
import model.Data;
import model.Result;

public class Prueba {
	public static void main(String[] args) {
		Manejador manejador= new Manejador("https://api.darksky.net/forecast/21259f9de3537b4f719c53580fa39c3a/39.8710026,-4.0251675?lang=es&exclude=minutely,hourly,alerts,flags");
		Result result = manejador.getResult();
		Currently currently = result.getCurrently();
		Daily daily = result.getDaily();
		System.out.println("Datos Actuales:\n");
		System.out.println(currently.getSummary()+"\n");
		System.out.println(currently.getIcon()+"\n");
		System.out.println(currently.getPrecipProbability()+"\n");
		System.out.println(currently.getTemperature()+"\n");
		System.out.println("Pronostico próximos días:\n");
		System.out.println("-------------------------\n");
		for (Data data: daily.getData()) {
			System.out.println(timeSpanToDate(data.getTime())+"\n");
			System.out.println(data.getSummary()+"\n");
			System.out.println(data.getIcon()+"\n");
			System.out.println(data.getPrecipProbability()+"\n");
			System.out.println(data.getTemperatureMax()+"\n");
			System.out.println(data.getTemperatureMin()+"\n");
			System.out.println("---------------------------------------\n");
		}
		String jsonString = new Gson().toJson(result);
		System.out.println(jsonString);
	}
	private static String timeSpanToDate(long ts) {
	    SimpleDateFormat df = new SimpleDateFormat("dd MMM yyyy", Locale.getDefault());
	    return(df.format(ts*1000));
	}
}
