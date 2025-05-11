public abstract class ThemeFactory {

    protected abstract Theme mudarTema();

    public void trocarTema(){
        Theme theme = mudarTema();
        theme.trocarTema();
    }

}
