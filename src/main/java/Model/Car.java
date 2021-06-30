package Model;

public class Car {
    private String onOff;

    public void ligar(String on) {
        this.onOff = on;
    }
    public void desligar(String off) {
        this.onOff = off;
    }
    public void buzinar(String honk){
        this.onOff = honk;
    }

    @Override
    public String toString() {
        return
                "O carro esta " + onOff;
    }
}
