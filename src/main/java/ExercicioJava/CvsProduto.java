package ExercicioJava;

public class CvsProduto {
    private String nome;
    private Double precoUnitario;
    private Integer quantidade;

    public CvsProduto() {
    }

    public CvsProduto(String nome, Double precoUnitario, Integer quantidade) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
        this.quantidade = quantidade;
    }

    public double calcularValorTotal(){
        return precoUnitario * quantidade;
    }

    @Override
    public String toString() {
        return nome + "," +  calcularValorTotal();
    }

}
