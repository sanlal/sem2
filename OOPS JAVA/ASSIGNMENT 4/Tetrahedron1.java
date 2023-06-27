import java.util.Scanner;

public class Tetrahedron1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] vertices = new double[4][3];
        
        // Read the vertices of the tetrahedron from the user
        System.out.println("Enter the coordinates of the 4 vertices of the tetrahedron:");
        for (int i = 0; i < vertices.length; i++) {
            System.out.printf("Enter the x, y, and z coordinates of vertex %d: ", i);
            vertices[i][0] = scanner.nextDouble();
            vertices[i][1] = scanner.nextDouble();
            vertices[i][2] = scanner.nextDouble();
        }
        
        // Define the triangles of the tetrahedron by specifying the vertex indices
        int[][] triangles = {
            {0, 1, 2},  // triangle 0
            {0, 1, 3},  // triangle 1
            {1, 2, 3},  // triangle 2
            {0, 2, 3}   // triangle 3
        };
        
        // Print the vertices of the tetrahedron
        System.out.println("Vertices:");
        for (int i = 0; i < vertices.length; i++) {
            System.out.printf("v%d = (%f, %f, %f)\n", i, vertices[i][0], vertices[i][1], vertices[i][2]);
        }
        
        // Print the triangles of the tetrahedron
        System.out.println("Triangles:");
        for (int i = 0; i < triangles.length; i++) {
            System.out.printf("t%d = (%d, %d, %d)\n", i, triangles[i][0], triangles[i][1], triangles[i][2]);
        }
        
        scanner.close();
    }
}
