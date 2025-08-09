public class TriangleDrawer {

    public static void drawTriangle() {
        int i = 0;
        int j;
        while (i< 5) {
            j = 0;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void main(String[] args) {
        drawTriangle();
    }

}
