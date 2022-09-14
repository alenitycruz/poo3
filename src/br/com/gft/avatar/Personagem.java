package br.com.gft.avatar;

public abstract class Personagem {
    //ATRIBUTOS
    protected String nome;
    protected Integer vida = 0;
    protected Integer mana = 0;
    protected Float xp = 0.0f;
    protected Integer inteligencia = 0;
    protected Integer forca = 0;
    protected Integer level = 0;

    public static int inst;


    //GETTERS E SETTERS


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getVida() {
        return vida;
    }

    public void setVida(Integer vida) {
        this.vida = vida;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Float getXp() {
        return xp;
    }

    public void setXp(Float xp) {
        this.xp = xp;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }


    //CONSTRUTOR
    public Personagem() {}

    public Personagem(String nome, Integer vida, Integer mana, Float xp, Integer inteligencia, Integer forca, Integer level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
        inst++;
    }

    //POLIMORFISMO
    public abstract void lvlUp();

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + this.nome + '\'' +
                ", vida=" + this.vida +
                ", mana=" + this.mana +
                ", xp=" + this.xp +
                ", inteligencia=" + this.inteligencia +
                ", forca=" + this.forca +
                ", level=" + this.level +
                '}';
    }
}
