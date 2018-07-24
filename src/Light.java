public class Light {

    String name;

    public Light(String name) {
        this.name = name;
    }

    public void turnOn() {

        System.out.println(name+" światło jest zapalone");
    }

    public void turnOff(){
        System.out.println(name+" światło jest zgaszone");
    }


}
