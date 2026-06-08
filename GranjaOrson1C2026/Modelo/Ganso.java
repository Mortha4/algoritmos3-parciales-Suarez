package Modelo;

import java.util.List;

public class Ganso extends Animal{
    public Ganso(List<Accion> habilidadesAnimal) {
        super(habilidadesAnimal);
    }

    @Override
    public void usarHabilidad(int habilidad, int veces) {

    }

    @Override
    public int calcularEnergia() {
        return 0;
    }
}
