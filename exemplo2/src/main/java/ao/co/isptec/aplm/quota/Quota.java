package ao.co.isptec.aplm.quota;

public class Quota {

    private Long id;
    private String autor;
    private String texto;

    public void setId(Long id) {
        this.id = id;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Autor: " + autor + " | Texto: " + texto;
    }


    public static void main(String[] args) {
        Quota q = new Quota();
        q.setId(new Long(1));
        q.setAutor("Joao Costa");
        q.setTexto("Deus é vida.");

        System.out.println(q);
    }
}