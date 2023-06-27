public class Tetrahedron {
    
    // Define the vertices of the tetrahedron
    private static final double[][] VERTICES = {
        {-1, -1, -1},  // vertex 0
        { 1, -1,  1},  // vertex 1
        { 1,  1, -1},  // vertex 2
        {-1,  1,  1}   // vertex 3
    };
    
    // Define the triangles of the tetrahedron by specifying the vertex indices
    private static final int[][] TRIANGLES = {
        {0, 1, 2},  // triangle 0
        {0, 1, 3},  // triangle 1
        {1, 2, 3},  // triangle 2
        {0, 2, 3}   // triangle 3
    };
    
    public static void main(String[] args) {
        // Print the vertices of the tetrahedron
        System.out.println("Vertices:");
        for (int i = 0; i < VERTICES.length; i++) {
            System.out.printf("v%d = (%f, %f, %f)\n", i, VERTICES[i][0], VERTICES[i][1], VERTICES[i][2]);
        }
        
        // Print the triangles of the tetrahedron
        System.out.println("Triangles:");
        for (int i = 0; i < TRIANGLES.length; i++) {
            System.out.printf("t%d = (%d, %d, %d)\n", i, TRIANGLES[i][0], TRIANGLES[i][1], TRIANGLES[i][2]);
        }
    }
}
