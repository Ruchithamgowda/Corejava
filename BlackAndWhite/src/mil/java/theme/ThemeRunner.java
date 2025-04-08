package mil.java.theme;

public class ThemeRunner {
    public static void main(String[] args) {
        BlackAndWhite bw = new BlackAndWhite();
        ColorTheme theme = new ColorTheme(bw);
        theme.showUsage();
    }
}
