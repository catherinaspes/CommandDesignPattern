public class StereoSystem {

    public void onStereoSystem(){
        System.out.println("Wieża jest włączona");
    }

    public void offStereoSystem(){
        System.out.println("Wieża jest wyłączona");
    }

    public void setCD(){
        System.out.println("Płyta CD jest ustawiona");
    }

    public void  setDVD(){
        System.out.println("Płyta DVD jest ustawiona");
    }

    public void setVolume(int volume){
        System.out.println("Głośność: "+volume);
    }
}
