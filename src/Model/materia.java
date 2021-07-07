package Model;

/**
 *
 * @author eduardo
 */
public class materia {
    private String siglaMateria;
    private String nomeMateria;
    private int nCreditosMateria;
    private int periodo;
    private boolean concluido;
    private int bloqueado;

    public String getSigla() {
        return siglaMateria;
    }

    public void setSigla(String sigla) {
        this.siglaMateria = sigla;
    }

    public String getNomeMateria() {
        return nomeMateria;
    }

    public void setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getnCreditosMateria() {
        return nCreditosMateria;
    }

    public void setnCreditosMateria(int nCreditosMateria) {
        this.nCreditosMateria = nCreditosMateria;
    }

    public boolean isConcluido() {
        return concluido;
    }

    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }

    public int getBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(int bloqueado) {
        this.bloqueado = bloqueado;
    }

}
