public class Codigo {
    private String lCodigo;
    private String comments;
    private boolean complete;

    public Codigo(String lCodigo, String comments, boolean complete){
        this.lCodigo=lCodigo;
        this.comments=comments;
        this.complete=complete;
    }

    public String getlCodigo() {
        return lCodigo;
    }

    public void setlCodigo(String lCodigo) {
        this.lCodigo = lCodigo;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }

    public void showInfo() {
        System.out.println("Lineeas de Codigo: "+ lCodigo);
        System.out.println("Comentarios: "+ comments);
        System.out.println("Completo: "+ complete);
    }
}
