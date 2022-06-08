public class Notify {
    private String precioLLamadas;
    private String promociones;
    private String premios;
    private String noticia;
    private String tipoDeNotificacion;

    public Notify(String precioLLamadas, String promociones, String premios, String noticia, String tipoDeNotificacion) {
        this.precioLLamadas = precioLLamadas;
        this.promociones = promociones;
        this.premios = premios;
        this.noticia = noticia;
        this.tipoDeNotificacion = tipoDeNotificacion;
    }

    public String getPrecioLLamadas() {
        return precioLLamadas;
    }

    public void setPrecioLLamadas(String precioLLamadas) {
        this.precioLLamadas = precioLLamadas;
    }

    public String getPromociones() {
        return promociones;
    }

    public void setPromociones(String promociones) {
        this.promociones = promociones;
    }

    public String getPremios() {
        return premios;
    }

    public void setPremios(String premios) {
        this.premios = premios;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public String getTipoDeNotificacion() {
        return tipoDeNotificacion;
    }

    public void setTipoDeNotificacion(String tipoDeNotificacion) {
        this.tipoDeNotificacion = tipoDeNotificacion;
    }

    public void showInfo1(){
        System.out.println("<---Notificacion--->");
        System.out.println("Premios: " + premios);
        System.out.println("Promociones: " + promociones);
    }
    public void showInfo2(){
        System.out.println("<---Notificacion--->");
        System.out.println("Noticia: " + noticia);
    }

    public void showInfo3(){
        System.out.println("<---Notificacion--->");
        System.out.println("Precio de llamadas: " + precioLLamadas);
        System.out.println("Promociones: " + promociones);
        System.out.println("Premios: " + premios);
        System.out.println("Noticia: " + noticia);
    }

    public void showInfo4(){
        System.out.println("<---Notificacion--->");
        System.out.println("Promociones: " + promociones);
        System.out.println("Noticia: " + noticia);
    }

    public void showInfo5(){
        System.out.println("<---Notificacion--->");
        System.out.println("Precio de llamadas: " + precioLLamadas);
        System.out.println("Premios: " + premios);
    }
}
