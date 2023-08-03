package carros;

public class txl extends toyota {
    private String Color;
    private String Placa;

    public txl(String color, String placa) {
        Color = color;
        Placa = placa;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    @Override
    public void mover() {

    }
}