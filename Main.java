import java.util.Scanner;

class FarmerApp {

    public static String suggestCrop(String soilType, String season) {
        if (soilType.equalsIgnoreCase("loam")) {
            if (season.equalsIgnoreCase("spring")) {
                return "Wheat";
            } else if (season.equalsIgnoreCase("summer")) {
                return "Corn";
            } else if (season.equalsIgnoreCase("fall")) {
                return "Barley";
            } else if (season.equalsIgnoreCase("winter")) {
                return "Rye";
            }
        } else if (soilType.equalsIgnoreCase("clay")) {
            if (season.equalsIgnoreCase("spring")) {
                return "Rice";
            } else if (season.equalsIgnoreCase("summer")) {
                return "Soybeans";
            } else if (season.equalsIgnoreCase("fall")) {
                return "Oats";
            } else if (season.equalsIgnoreCase("winter")) {
                return "Wheat";
            }
        }
        return "No suitable crop found for the given soil type and season.";
    }

    public static String soilManagement(String soilType) {
        if (soilType.equalsIgnoreCase("loam")) {
            return "Loam soil management: Ensure proper drainage, add organic matter.";
        } else if (soilType.equalsIgnoreCase("clay")) {
            return "Clay soil management: Avoid compaction, improve drainage with organic material.";
        }
        return "No specific soil management tips available for the given soil type.";
    }

    public static String identifyDisease(String symptoms) {
        if (symptoms.equalsIgnoreCase("yellow leaves")) {
            return "Possible Disease: Nitrogen deficiency or Fungal infection.";
        } else if (symptoms.equalsIgnoreCase("wilting")) {
            return "Possible Disease: Bacterial wilt or Root rot.";
        } else if (symptoms.equalsIgnoreCase("spots on leaves")) {
            return "Possible Disease: Leaf spot or Rust.";
        }
        return "Disease not identified based on given symptoms.";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Farmer's Assistant Application!");

        System.out.println("Enter the soil type (Loam/Clay): ");
        String soilType = scanner.nextLine();

        System.out.println("Enter the season (Spring/Summer/Fall/Winter): ");
        String season = scanner.nextLine();

        String suggestedCrop = suggestCrop(soilType, season);
        System.out.println("Suggested Crop: " + suggestedCrop);

        String soilTips = soilManagement(soilType);
        System.out.println(soilTips);

        System.out.println("Enter the symptoms for disease identification (yellow leaves/wilting/spots on leaves): ");
        String symptoms = scanner.nextLine();

        String disease = identifyDisease(symptoms);
        System.out.println(disease);

        scanner.close();
    }
}