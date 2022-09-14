package br.com.gft.avatar;

import javax.swing.plaf.synth.SynthScrollBarUI;
import java.lang.reflect.Array;
import java.util.*;

public class Mago extends Personagem{
    //ATRIBUTOS
    private List<String> magia = new ArrayList<>();

    //constutor


    public Mago() {

    }


    public Mago(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca, Integer level) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
    }

    //GETTERS E SETTERS
    public List<String> getMagia() {
        return magia;
    }

    public void setMagia(List<String> magia) {
        this.magia = magia;
    }



    //POLIMORFISMO // Mago ao subir de nível possua um aumento maior nos atributos Mana e Inteligência
    @Override
    public void lvlUp() {
            super.setVida(getVida()+1);
            super.setXp(getXp()+1);
            super.setForca(getForca()+1);
            super.setMana(getMana()+5);
            super.setInteligencia(getInteligencia()+5);
            super.setLevel(getLevel()+1);

    }

    //METODOS
    public void attack(){
        Random random = new Random();

        int aleatorio = random.nextInt(300) + 1;

        super.setInteligencia((getInteligencia()*getLevel()) + aleatorio);

        System.out.println(super.getInteligencia());

    }

    public void aprenderMagia(){
        Scanner scan = new Scanner(System.in);
        String mag = scan.next();
        magia.add(mag);

    }




    //apresentacao

    @Override
    public String toString() {
        return "Mago{" +
                "nome='" + super.nome + '\'' +
                ", vida=" + super.vida +
                ", mana=" + super.mana +
                ", xp=" + super.xp +
                ", inteligencia=" + super.inteligencia +
                ", forca=" + super.forca +
                ", level=" + super.level +
                '}';
    }


}
