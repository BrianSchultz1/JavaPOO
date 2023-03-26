package provas.trabalhopoo;

import java.util.Random;

public class Carro {
    private int velocidade = 0;
    private int distancia = 0;
    private int distanciaMaxima = 10;
    private String nomeDoCarro;

    public int sortearVelocidade() {
        Random random = new Random();
        int velocidade = random.nextInt(2) + 1;
        return velocidade;
    }

    public void calcularDistancia(int velocidade) {
        this.distancia += velocidade;
    }

    public boolean verificarVencedor() {
        if (this.distancia >= this.distanciaMaxima) {
            return true;
        } else {
            return false;
        }
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public int getDistanciaMaxima() {
        return this.distanciaMaxima;
    }
    public void setDistanciaMaxima(int distanciaMaxima) {
        this.distanciaMaxima = distanciaMaxima;
    }
    public String getNomeDoCarro() {
        return this.nomeDoCarro;
    }
    public void setNomeDoCarro(String nomeDoCarro) {
        this.nomeDoCarro = nomeDoCarro;
    }
    public int getVelocidade() {
        return this.velocidade;
    }
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}
