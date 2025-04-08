package mil.java.theme;

public class ColorTheme {
    public ColorTheme(BlackAndWhite bw) {
        System.out.println("ColorTheme constructor is running...");
        bw.displayContrast();
    }

    public void showUsage() {
        System.out.println("This theme is often used in classic designs and newspapers.");
    }
}
