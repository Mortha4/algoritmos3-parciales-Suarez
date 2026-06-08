package Modelo;

import java.util.List;

public class Pato extends Animal{



    public Pato(List<Accion> habilidadesAnimal) {
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
