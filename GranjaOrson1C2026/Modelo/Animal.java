package Modelo;

import java.util.List;

public abstract class Animal {
    protected List<Accion> habilidades;

    public Animal(List<Accion> habilidadesAnimal){
        this.habilidades = habilidadesAnimal;
    }

    public abstract void usarHabilidad(int habilidad,int veces);
    public abstract int calcularEnergia();



}
