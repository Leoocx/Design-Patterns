public class Main {
    public static void main(String[] args) {
        ThemeFactory darkTheme = new DarkThemeCreator();
        darkTheme.trocarTema();

        ThemeFactory whiteTheme = new WhiteThemeCreator();
        whiteTheme.trocarTema();

        ThemeFactory yellowTheme = new YellowThemeCreator();
        yellowTheme.trocarTema();
        
    }
}