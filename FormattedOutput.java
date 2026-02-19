public class FormattedOutput {
  
  public static void main(String[] args) {
    String name = "Alice";
    int age = 30;
    double height = 1.75;

    // Using printf for formatted output
    System.out.printf("Name: %s, Age: %d, Height: %.2f meters%n", name, age, height);

    // Using String concatenation for formatted output
    String concatenatedString = "Name: " + name + ", Age: " + age + ", Height: " + String.format("%.2f", height) + " meters";
    System.out.println(concatenatedString);

    // Using StringBuilder for formatted output
    StringBuilder stringBuilder = new StringBuilder();  
    stringBuilder.append("Name: ").append(name).append(", Age: ").append(age).append(", Height: ").append(String.format("%.2f", height)).append(" meters");
    System.out.println(stringBuilder.toString());

    
    // Using String.format for formatted output
    String formattedString = String.format("Name: %s, Age: %d, Height: %.2f meters", name, age, height);
    System.out.println(formattedString);

  }

}
