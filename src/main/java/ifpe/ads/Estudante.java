package ifpe.ads;

public class Estudante {
    private String nome;
    private String matricula;
    private String endereco;
    private int[] notas = new int[4];

    public Estudante(String nome, String matricula, String endereco, int[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.endereco = endereco;
        this.notas = notas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }

    public double media(int[] notas) {
        int total = 0;
        for (int nota : notas) {
            total += nota;
        }
        return (double) total / notas.length;
    }
}
