package com.training.docker;

// Class to represent a Docker service configuration
class DockerService {
    private String name;
    private String dockerfile;
    private String image;
    private String mavenProfile;

    public DockerService(String name, String dockerfile, String image, String mavenProfile) {
        this.name = name;
        this.dockerfile = dockerfile;
        this.image = image;
        this.mavenProfile = mavenProfile;
    }

    public String getName() {
        return name;
    }

    public String getDockerfile() {
        return dockerfile;
    }

    public String getImage() {
        return image;
    }

    public String getMavenProfile() {
        return mavenProfile;
    }

    // Generate a docker-compose.yml service entry as a string
    public String toComposeEntry(String ecrRepo, String tagVersion) {
        return String.format(
                "  %s:\n" +
                        "    build:\n" +
                        "      context: ../\n" +
                        "      dockerfile: %s\n" +
                        "      args:\n" +
                        "      - PROFILE=%s\n" +
                        "    image: \"%s/%s:%s\"\n",
                name, dockerfile, mavenProfile, ecrRepo, image, tagVersion
        );
    }
}

public class DockerClass {
    public static void main(String[] args) {
        /**
         * Dockerfile: A file that contains instructions to build a Docker image,
         * defining how to set up an application (e.g., install dependencies, copy files).
         *
         * docker-compose.yml: A file that defines multiple Docker containers (services),
         * their configurations, and how they work together (e.g., networking, volumes).
         */

        System.out.println("Generating Docker Compose configuration for FedNow services...\n");

        // Simulate environment variables for ECR repository and version tag
        String ecrRepo = "066853093552.dkr.ecr.us-east-2.amazonaws.com";
        String tagVersion = "v1.0";
        String mavenProfile = "dev"; // Simulating MAVEN_PROFILE

        // Define FedNow services
        DockerService[] services = {
                new DockerService("fednow", "./docker/Dockerfile-fednow", "fednow-service", mavenProfile),
                new DockerService("fednow-connector", "./docker/Dockerfile-fednow-connector", "fednow-connector-service", mavenProfile),
                new DockerService("fednow-configs", "./docker/Dockerfile-fednow-configs", "fednow-configs-service", mavenProfile)
        };

        // Generate docker-compose.yml content
        StringBuilder composeContent = new StringBuilder();
        composeContent.append("# Generated docker-compose.yml for FedNow\n");
        composeContent.append("services:\n");

        for (DockerService service : services) {
            composeContent.append(service.toComposeEntry(ecrRepo, tagVersion));
        }

        // Print the generated docker-compose.yml content
        System.out.println("Generated docker-compose.yml content:");
        System.out.println(composeContent.toString());

        // Simulate a basic check for MAVEN_PROFILE
        if (mavenProfile == null || mavenProfile.isEmpty()) {
            System.out.println("Warning: MAVEN_PROFILE is not set. Build might fail.");
        } else {
            System.out.println("MAVEN_PROFILE is set to: " + mavenProfile);
            System.out.println("Ready to build and deploy FedNow services with Docker Compose!");
        }
    }
}