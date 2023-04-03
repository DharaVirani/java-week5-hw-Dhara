package javaprograms;

import java.util.*;

/**
 * 10. Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

public class Program_10_TrainLines {

    public static void main(String[] args) {

//        Using map to store tube line as a key and the stations it passes through as a value
        Map<String, List<String>> trainLines = new HashMap<>();
        trainLines.put("Bakerloo", Arrays.asList("Elephant & Castle", "Waterloo", "Charing Cross", "Oxford Circus","Baker Street", "Marlyebone"));
        trainLines.put("Central", Arrays.asList("Notting Hill", "Oxford Circus", "Tottenham Court", "Holborn", "Bank" ));
        trainLines.put("Circle", Arrays.asList("Victoria", "Embankment", "Westminster", "St James's Park", "Victoria"));
        trainLines.put("District", Arrays.asList("Earl's Court", "South Kensington", "Victoria", "St James Park", "Westminster"));
        trainLines.put("Hammersmith & City", Arrays.asList("Hammersmith", "Shepherd's Bush Market", "Paddington"));
        trainLines.put("Jubilee", Arrays.asList("Baker Street", "Bond Street", "Green Park", "Westminster", "Marlybone"));
        trainLines.put("Metropolitan", Arrays.asList("Moorgate", "Barbican", "Liverpool Street", "Aldgate", "Baker Street"));
        trainLines.put("Northern", Arrays.asList("Stockwell", "Kennington", "Waterloo", "Charing Cross", "Leicester Square", "London Bridge"));
        trainLines.put("Piccadilly", Arrays.asList("South Kensington", "Knightsbridge", "Piccadilly Circus", "Leicester Square", "Covent Garden"));
        trainLines.put("Victoria", Arrays.asList("Vauxhall", "Pimlico", "Victoria", "Green Park", "Oxford Circus"));

//        Scanner declaration to read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of Zone 1 station: ");
        String station1 = scanner.nextLine();
        System.out.println("Enter the name of Zone 1 station to reach destination: ");
        String station2 = scanner.nextLine();
        scanner.close();


//      to find tube lines pass through both stations

        ArrayList <String> lines = new ArrayList<>();
        for(String line : trainLines.keySet()){  //to find the key values key set is used
           if(trainLines.get(line).contains(station1) && trainLines.get(line).contains(station2)){
               lines.add(line);
           }
        }

//        Print the result
        if(lines.isEmpty()){
            System.out.println("No tube lines pass through both stations.");
        }else {
            System.out.println("The following train lines pass through both stations: ");
            for(String line: lines){
                System.out.println(line);
            }
        }




    }

}
