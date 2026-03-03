public class UC6StaticFunctions {

    // Method to generate O pattern
    public static String[] getO() {
        return new String[] {
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    // Method to generate P pattern
    public static String[] getP() {
        return new String[] {
            "PPPP ",
            "P   P",
            "PPPP ",
            "P    ",
            "P    "
        };
    }

    // Method to generate S pattern
    public static String[] getS() {
        return new String[] {
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        };
    }

    public static void main(String[] args) {

        // Calling static methods
        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        System.out.println("=== UC6 Banner Output ===");

        // Loop to print banner line by line
        for (int i = 0; i < o.length; i++) {
            System.out.println(o[i] + "   " + p[i] + "   " + s[i]);
        }
    }
}