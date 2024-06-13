public class Car {
    private int speed;
    private int gear;
    private String wheel;
    private int cc;
    private String logo;
    private String engine;


    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setSpeed(int speed) {
        if (speed < 0){
            this.speed = 0;
            return;
        }
        if (speed > 0 && speed <= 30) {
            this.gear = 1;
            this.speed = speed;
        } else if (speed > 30 && speed <= 70) {
            this.gear = 2;
            this.speed = speed;
        } else if (speed > 70 && speed <= 120) {
            this.gear = 3;
            this.speed = speed;
        }
    }

    public void setCheck() {
        System.out.println(speed + "km/h");
        System.out.println(gear + "단");
    }
}
