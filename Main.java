public class Main {
    
    public static void main(String[] args){
        State st = new State();
        st.facil();
        st.medio();
        st.dificil();
  
        
        Inimigo inimigo = new Inimigo();
        colocaBot(inimigo);
        colocaBot(inimigo);
        inimigo.Caracteristicas();
    }

    public static void colocaBot(Prototype objeto){
        Prototype prototipo = objeto.clone();
    }
}
