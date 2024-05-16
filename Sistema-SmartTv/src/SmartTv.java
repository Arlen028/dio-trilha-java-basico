public class SmartTv {
    boolean ligado = false;
    int canal = 1;
    int volume = 12;

    public void aumentarVolume() {
        //volume = volume + 1; ou
        volume++;
    }
    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal (int novoCanal) {
        canal = novoCanal;
    }

    public void aumentarCanal () {
        canal++;
    }
    public void diminuirCanal () {
        canal--;
    }

    public void ligar() {
        ligado = true;
    }
    public void desligar() {
        ligado = false;
    }


}
