package com.training.docker.dockerpushtohub;

public class DockerPushCommand {

    // docker build -t yourImageName:tag . -> This command will build the docker image.
    // docker run -p 8080:8080 yourImageName:tag -> This command will run the docker image.

    /**
     * 🔁 1. Rebuild the Docker Image
     * Make sure you're in the root folder of your Spring Boot app (where the Dockerfile is).
     *
     * docker build -t yourusername/yourappname:latest .
     * Replace yourusername/yourappname with your actual image name.
     *
     * 🔄 2. Tag the Updated Image (Optional if already tagged)
     *
     * docker tag yourusername/yourappname:latest yourusername/yourappname:v2
     * If you want to keep versions (v1, v2, etc.), you can add a tag like v2. Otherwise, continue using latest.
     *
     * 📤 3. Push the Updated Image to Docker Hub
     *
     * docker push yourusername/yourappname:latest
     * Or, if using a version tag:
     *
     * docker push yourusername/yourappname:v2
     * 🧪 4. Run Updated Image Locally to Test (Optional)
     *
     * docker run -p 8080:8080 yourusername/yourappname:latest
     * Or with version tag:
     *
     *
     * docker run -p 8080:8080 yourusername/yourappname:v2
     */

    /**
     * 📦 Additional Useful Docker Commands:
     *
     * docker images                      // List all local Docker images
     * docker ps                          // Show running containers
     * docker ps -a                       // Show all containers (running + stopped)
     * docker stop <container_id>         // Stop a running container
     * docker rm <container_id>           // Remove a stopped container
     * docker rmi <image_id>              // Remove a local Docker image
     * docker exec -it <container_id> bash // Enter into running container (bash shell)
     * docker logs <container_id>         // View logs of a container
     * docker volume ls                   // List all volumes
     * docker network ls                  // List all networks
     * docker system prune -a             // Remove all unused images, containers, volumes
     * docker-compose up                  // Run containers from docker-compose.yml
     * docker-compose down                // Stop and remove containers created by docker-compose
     * docker pull <image_name>           // Pull an image from Docker Hub
     * docker login                       // Authenticate with Docker Hub
     * docker logout                      // Logout from Docker Hub
     */
}
