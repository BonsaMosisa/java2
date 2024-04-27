public class Kumsa {
    public static void main(String args[]) {
        // Check if there are any command-line arguments
        if (args.length > 0) {
            System.out.println("Command-line arguments:");
            // Loop through the args array and print each argument
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + i + ": " + args[i]);
            }
        } else {
            System.out.println("No command-line arguments provided.");
        }
    }
}
