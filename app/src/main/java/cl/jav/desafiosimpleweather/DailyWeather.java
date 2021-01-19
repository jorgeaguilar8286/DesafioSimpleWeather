package cl.jav.desafiosimpleweather;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

public class DailyWeather {
    private String ciudad;
    private String fecha;
    private String temperatura;
    private Drawable imagenClima;

    public DailyWeather(String ciudad, String fecha, String temperatura, Drawable imagenClima) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.temperatura = temperatura;
        this.imagenClima = imagenClima;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public Drawable getImagenClima() {
        return imagenClima;
    }

    public void setImagenClima(Drawable imagenClima) {
        this.imagenClima = imagenClima;
    }

    @Override
    public String toString() {
        return "DailyWeather{" +
                "ciudad='" + ciudad + '\'' +
                ", fecha='" + fecha + '\'' +
                ", temperatura='" + temperatura + '\'' +
                ", imagenClima=" + imagenClima +
                '}';
    }
}
