import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(new Point(1, 2), 4, 6));
        shapes.add(new Square(new Point(0, 0), 5));
        shapes.add(new Circle(new Point(3, 3), 2.5));
        shapes.add(new Rectangle(new Point(-2, -1), 3, 7));

        System.out.println("Số hình đã tạo: " + Shape.getShapeCount());

        System.out.println("\nDanh sách các hình:");
        for (Shape s : shapes) {
            System.out.println("- " + s.getInfo());
        }

        // 3️⃣ Danh sách tâm điểm
        System.out.println("\nDanh sách tâm điểm:");
        for (Shape s : shapes) {
            System.out.println("- " + s.getCenterPoint());
        }
    }
}
