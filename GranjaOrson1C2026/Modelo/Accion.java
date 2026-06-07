package Modelo;

public abstract class Accion {
    protected int costo;
    protected int movimientoDisponible;


    public Accion(int costo , int cantidadMovimientos){
        this.costo = costo;
        this.movimientoDisponible = cantidadMovimientos ;

    }

    public abstract void accion(int veces);
    public abstract int calcularEnergia();
}