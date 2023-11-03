public class Homework5 {
    public static void main(String[] args) {
        PersonalComputer personalComputer = new PersonalComputer();
        personalComputer.turnOn();
    }
}

class PersonalComputer{
    Computer computer = new Computer();
    Monitor monitor = new Monitor();

    public void turnOn(){
        computer.turnOn();
        monitor.turnOn();
        computer.printInfo();
        monitor.printInfo();
    }
}

class Computer{
    private String cpu = "Core i7";
    private String memory = "32GB";
    private String hd = "2TB";
    private String color = "White";
    private String power = "700W";

    public void printInfo(){
        System.out.println("The spec of the computer");
        System.out.println("\tCPU: "+this.cpu);
        System.out.println("\tMemory: "+this.memory);
        System.out.println("\tHDD: "+this.hd);
        System.out.println("\tColor: "+this.color);
        System.out.println("\tPower: "+this.power);
    }

    public void turnOn(){
        System.out.println("Turning on the computer.");
    }
}

class Monitor{
    private String monitorSize = "32 inch";
    private String color = "Black";
    private String power = "45W";
    public void printInfo(){
        System.out.println("The spec of the monitor");
        System.out.println("\tSize: "+this.monitorSize);
        System.out.println("\tcolor: "+this.color);
        System.out.println("\tPower: "+this.power);
    }
    public void turnOn(){
        System.out.println("Turning on the monitor.");
    }
}
