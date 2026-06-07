package Modelo;

public class Nadar extends Accion {

    public Nadar(int costo ,int cantidadMovimientos){
        super(costo,cantidadMovimientos);

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
