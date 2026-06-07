package Modelo;

public class Volar extends Accion {


    public Volar(int costo, int cantidadMovimientos) {
        super(costo, cantidadMovimientos);
    }

    @Override
    public void accion(int veces) {
        movimientoDisponible -= veces;

    }

    @Override
    public int calcularEnergia() {
        return costo * movimientoDisponible ;
    }
}
