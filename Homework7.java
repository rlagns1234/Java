public class Homework7 {
    public static void main(String[] args) {
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T720DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);
        while (inkjet.print());
        while (laser.print());
    }
}

abstract class Printer{
    String model;
    int printedCount;
    int availableCount;

    Printer(String model, int charge){
        this.model = model;
        this.availableCount = charge;
    }

    abstract public boolean print();
}

class InkjetPrinter extends Printer{
    InkjetPrinter(String model, int charge){
        super(model, charge);
    }

    @Override
    public boolean print() {
        if(availableCount == 0){
            System.out.println(model+": "+printedCount+1+"매째 인쇄 실패 - 잉크 부족.");
        } else if(availableCount >= 1) {
            printedCount++; availableCount--;
            return true;
        }
        return false;
    }
}

class LaserPrinter extends Printer{
    LaserPrinter(String model, int charge){
        super(model, charge);
    }

    @Override
    public boolean print() {
        if(availableCount == 0){
            System.out.println(model+": "+printedCount+1+"매째 인쇄 실패 - 토너 부족.");
        } else if(availableCount >= 1) {
            printedCount++; availableCount--;
            return true;
        }
        return false;
    }
}