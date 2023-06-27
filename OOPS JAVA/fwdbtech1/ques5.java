public class ques5 {

    public static void main(String[] args) {
        
        // Check if the user has provided all three coefficients
        if (args.length != 3) {
            System.out.println("Please provide three coefficients a, b, and c.");
            return;
        }

        // Parse the coefficients as doubles
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check if the roots are real or complex
        if (discriminant < 0) {
            System.out.println("Roots are complex.");
            return;
        }

        // Calculate the roots
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

        // Print the roots
        System.out.println("Root 1: " + root1);
        System.out.println("Root 2: " + root2);
    }
}

