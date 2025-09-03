package cisc191.sdmesa.edu;

public interface Chargeable extends Movable {
    int getCharge();

    void chargeTo(int charge);
}
