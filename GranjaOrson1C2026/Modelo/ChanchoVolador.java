package Modelo;

import java.util.List;

public class ChanchoVolador extends Animal{
    private List<Accion> habilidades;

    public ChanchoVolador(List<Accion> habilidadesAnimal) {
        super(habilidadesAnimal);
    }


    @Override
    public void usarHabilidad(int habilidad, int veces) {
        habilidades.get(habilidad).accion(veces);

    }

    @Override
    public int calcularEnergia() {
        int energia=0;
        for (Accion habilidad: habilidades){
            energia += habilidad.calcularEnergia();
        }
        return energia;
    }
}
