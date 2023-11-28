class Car {
    //nitelikler
    String type;
    String model;
    String color;
    int speed;
    int speedLimit;

    Car(String model,int speed,String color){
        this.model=model;
        this.speed=speed;
        this.color=color;
        this.type="Sedan";
        this.speedLimit=180;
    }
    //davranışlar
    void increaseSpeed(int increment) {
        if ((this.speed + increment)<this.speedLimit) {
            this.speed += increment;
        }
    }

    void decreaseSpeed(int decrease) {
        if ((this.speed-decrease)> 0) {
            this.speed -= decrease;
        }
    }
    void printSpeed(){
        System.out.println(this.model+" Hızınız : "+this.speed);
    }
    void printInfo(){
        System.out.println("Model \t\t: "+this.model);
        System.out.println("Color \t\t: "+this.color);
        System.out.println("Type \t\t: "+this.type);
        System.out.println("Speed \t\t: "+this.speed);
        System.out.println("SpeedLimit\t: "+this.speedLimit);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");
    }
}