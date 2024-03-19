import java.lang.String;
public class Caminhão {
    private int id;
    private String motor3;
    private String fabricante;
    private String modelo;
    private double anofabricacao;
    private String cor;
    private double nPlaca;
    private double nchassi;
    private String motor;
    private int kilometragem;
    private int qtdePortas;
    private String tipoCaminhao;
    private Float capacidadeCarga;
    private String tipoCarroceria;
    private String tipoCombustivel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getAnofabricacao() {
        return anofabricacao;
    }

    public void setAnofabricacao(double anofabricacao) {
        this.anofabricacao = anofabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getnPlaca() {
        return nPlaca;
    }

    public void setnPlaca(double nPlaca) {
        this.nPlaca = nPlaca;
    }

    public double getNchassi() {
        return nchassi;
    }

    public void setNchassi(double nchassi) {
        this.nchassi = nchassi;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public int getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(int qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public String getTipoCaminhao() {
        return tipoCaminhao;
    }

    public void setTipoCaminhao(String tipoCaminhao) {
        this.tipoCaminhao = tipoCaminhao;
    }

    public Float getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(Float capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipoCarroceria() {
        return tipoCarroceria;
    }

    public void setTipoCarroceria(String tipoCarroceria) {
        this.tipoCarroceria = tipoCarroceria;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
}