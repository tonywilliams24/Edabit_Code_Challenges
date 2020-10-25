package mathCryptographyEtc.LengthOf3dLineSegment;

public class Challenge {
    public static double lineLength(int[][] point) {

        // Distance between 3D points formula:
        // d = ((x2 - x1)^2 + (y2 - y1)^2 + (z2 - z1)^2)^1/2

        int x = (point[1][0] - point[0][0]);
        int y = (point[1][1] - point[0][1]);
        int z  = (point[1][2] - point[0][2]);
        return Math.sqrt((x*x + y*y + z*z));
    }
}
