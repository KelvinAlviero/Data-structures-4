import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Calling the class

        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();

        //Outputting stuff
        while (true) {
            System.out.println("Choose an option");
            System.out.println("1.Add");
            System.out.println("2.Show");
            System.out.println("3.Remove");
            System.out.println("4.Length");
            System.out.println("5.Check");
            System.out.println("6.Quit");

            int option = scanner.nextInt();

            //options
            switch (option) {
                case 1:
                    System.out.println("Now adding, type 'done' to stop");
                    while (true) {
                        String name = scanner.nextLine();
                        if (name.equals("done")) {
                            break;
                        }
                        linkedList.add(name);
                    }

                case 2:
                    System.out.println("Who's next?");
                    System.out.println(linkedList.get(1) +" is next");

                    break;
                case 3:
                    System.out.println("Who you gonna remove?");
                    break;
                case 4:
                    System.out.println("Length check");
                    System.out.println(linkedList.toArray().length + "People");
                    break;
                case 5:
                    System.out.println("Who we checking on?");
                    while(true){
                        System.out.print("Please enter name: ");
                        String name = scanner.nextLine();
                        int position = linkedList.indexOf(name);
                        if (position != -1) {
                            // Calculate the number of names in front of the inputted name
                            int namesInFront = position;

                            // Display the position and number of names in front of the inputted name
                            System.out.println("Position of " + name + ": " + position);
                            System.out.println("Number of names in front of " + name + ": " + namesInFront);
                        } else {
                            System.out.println(name + " not found in the list.");
                            break;
                        }
                    }
                    break;
                case 6:
                    System.out.println("6");
                    scanner.close();
                    return;
                default:
                    System.out.println("WHAT IS THAT?");
            }


        }
    }
}