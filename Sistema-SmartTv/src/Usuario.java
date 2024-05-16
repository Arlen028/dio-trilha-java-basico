public class Usuario {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();

        System.out.println("A tv ligada ? " + smartTv.ligado);
        System.out.println("canal atual : " + smartTv.canal);
        System.out.println("volume atual : " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("novo status tv ligada ? " + smartTv.ligado);

        smartTv.aumentarVolume();
        System.out.println("volume atual : " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("volume atual : " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("canal atual : " + smartTv.canal);

        smartTv.mudarCanal(17);
        System.out.println("canal atual : " + smartTv.canal);

    }
}