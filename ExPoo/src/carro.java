import java.lang.String;
public class carro {
   private int id;
   private String fabricante;
   private String modelo;
   private int anofabricacao;
   private String cor;
   private String nPlaca;
   private int nchassi;
   private Float motor;
   private String kilometragem;
   private String qtdePortas;

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

   public int getAnofabricacao() {
      return anofabricacao;
   }

   public void setAnofabricacao(int anofabricacao) {
      this.anofabricacao = anofabricacao;
   }

   public String getCor() {
      return cor;
   }

   public void setCor(String cor) {
      this.cor = cor;
   }

   public String getnPlaca() {
      return nPlaca;
   }

   public void setnPlaca(String nPlaca) {
      this.nPlaca = nPlaca;
   }

   public int getNchassi() {
      return nchassi;
   }

   public void setNchassi(int nchassi) {
      this.nchassi = nchassi;
   }

   public Float getMotor() {
      return motor;
   }

   public void setMotor(Float motor) {
      this.motor = motor;
   }

   public String getKilometragem() {
      return kilometragem;
   }

   public void setKilometragem(String kilometragem) {
      this.kilometragem = kilometragem;
   }

   public String getQtdePortas() {
      return qtdePortas;
   }

   public void setQtdePortas(String qtdePortas) {
      this.qtdePortas = qtdePortas;
   }

   public double getPeso() {
      return peso;
   }

   public void setPeso(double peso) {
      this.peso = peso;
   }

   private double peso;

}