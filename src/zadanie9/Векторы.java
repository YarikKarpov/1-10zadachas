package zadanie9;
public class Векторы {
    private double x1, y1, z1;
    private double x2, y2, z2;


    public Векторы(double x1, double y1, double z1, double x2, double y2, double z2) {
        this.x1 = x1;
        this.y1 = y1;
        this.z1 = z1;
        this.x2 = x2;
        this.y2 = y2;
        this.z2 = z2;
    }

    public double[] getVectorCoordinates() {
        return new double[]{x2 - x1, y2 - y1, z2 - z1};
    }

    public Векторы add(Векторы other) {
        double[] v1 = this.getVectorCoordinates();
        double[] v2 = other.getVectorCoordinates();

        return new Векторы(0, 0, 0, v1[0] + v2[0], v1[1] + v2[1], v1[2] + v2[2]);
    }


    public Векторы subtract(Векторы other) {
        double[] v1 = this.getVectorCoordinates();
        double[] v2 = other.getVectorCoordinates();

        return new Векторы(0, 0, 0, v1[0] - v2[0], v1[1] - v2[1], v1[2] - v2[2]);
    }

    public double dotProduct(Векторы other) {
        double[] v1 = this.getVectorCoordinates();
        double[] v2 = other.getVectorCoordinates();

        return v1[0] * v2[0] + v1[1] * v2[1] + v1[2] * v2[2];
    }

    public double length() {
        double[] v = this.getVectorCoordinates();
        return Math.sqrt(v[0] * v[0] + v[1] * v[1] + v[2] * v[2]);
    }
    public double cosineAngle(Векторы other) {
        double dotProd = this.dotProduct(other);
        return dotProd / (this.length() * other.length());
    }

    @Override
    public String toString() {
        return "Вектор (" + x1 + ", " + y1 + ", " + z1 + ") to (" + x2 + ", " + y2 + ", " + z2 + ")";
    }

    public static void main(String[] args) {
        Векторы v1 = new Векторы(1, 2, 3, 4, 5, 6);
        Векторы v2 = new Векторы(0, 0, 0, 1, 1, 1);

        Векторы sum = v1.add(v2);
        Векторы difference = v1.subtract(v2);
        double dotProd = v1.dotProduct(v2);
        double lengthV1 = v1.length();
        double cosAngle = v1.cosineAngle(v2);

        System.out.println("Вектор 1: " + v1);
        System.out.println("Вектор 2: " + v2);
        System.out.println("Сумма: " + sum);
        System.out.println("Разница: " + difference);
        System.out.println("Скалярное произведение: " + dotProd);
        System.out.println("Длина вектора 1: " + lengthV1);
        System.out.println("Косинус угла между векторами 1 и 2: " + cosAngle);
    }
}
