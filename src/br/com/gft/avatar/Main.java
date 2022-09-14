package br.com.gft.avatar;



import static br.com.gft.avatar.Personagem.inst;

public class Main {
    public static void main(String[] args) {


        Guerreiro g1 = new Guerreiro("Fernando", 1,1,2.5f, 1, 1, 1);

        Mago m1 = new Mago("Roberto", 1, 1, 1.5f, 1, 1, 1);



        m1.lvlUp();
        m1.attack();
        m1.aprenderMagia();
        m1.aprenderMagia();
        m1.aprenderMagia();


        g1.lvlUp();
        g1.aprenderHabilidade();


        System.out.println(m1);
        System.out.println(g1);


        System.out.println(m1.getMagia());
        System.out.println(g1.getHabilidade());
        System.out.println("Quantidade de Personagens" + Personagem.inst);



    }
}
