public class State {
    

    private DificuldadeState state = new DificuldadeInimigo();

    public void facil(){
        state.facil();
    }

    public void medio(){
        state.medio();
    }

    public void dificil(){
        state.dificil();
    }

   

    public DificuldadeState getState() {
        return state;
    }

    public void setState(DificuldadeState state) {
        this.state = state;
    }

    public void State() {
        this.state = state;
    }

}


