public class Inimigo extends Prototype{
    private int vida = 80;
    private int defesa = 80; 
    private int danoCausado = 40;  


    @Override
    public Prototype clone(){
        System.out.println("clonou " + Inimigo.class);
        Inimigo novo  = new  Inimigo();
        novo.setVida(this.vida);
        novo.setDanoCausado(this.danoCausado);
        novo.setDefesa(this.defesa);
        return novo;
    }
    

    public void Caracteristicas(){
        System.out.println("Vida:"+ this.vida + "\nDefesa:" + this.defesa + "\nDano:" + this.danoCausado);
    }

    public int getVida() {
        return vida;
    }



    public void setVida(int vida) {
        this.vida = vida;
    }



    public int getDefesa() {
        return defesa;
    }



    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getDanoCausado() {
        return danoCausado;
    }



    public void setDanoCausado(int danoCausado) {
        this.danoCausado = danoCausado;
    }

}