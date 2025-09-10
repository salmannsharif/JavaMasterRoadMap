package com.training.mvc;

public class MvcArchitecture {

    /**
     * In Spring Boot, MVC stands for Model–View–Controller. It is an architectural pattern used to build
     * web applications by separating concerns (logic, UI, and data).
     *
     * 🔎 What is Spring MVC?
     *
     * Spring MVC is part of the Spring Web module, and in Spring Boot it comes auto-configured
     * when you add the dependency:
     *
     * <dependency>
     *     <groupId>org.springframework.boot</groupId>
     *     <artifactId>spring-boot-starter-web</artifactId>
     * </dependency>
     *
     *
     * This enables you to build REST APIs or web apps using MVC.
     *
     * 🏗️ How MVC works in Spring Boot?
     *
     * Model (M)
     *
     * Represents the data and business logic.
     *
     * Usually your Java classes, entities, DTOs, services.
     *
     * Example: Employee, Product, User.
     *
     * View (V)
     *
     * Represents the UI (what the user sees).
     *
     * In Spring Boot, views can be:
     *
     * JSP
     *
     * Thymeleaf
     *
     * FreeMarker
     *
     * Or just JSON responses (for REST APIs).
     *
     * Controller (C)
     *
     * Handles incoming requests from the user.
     *
     * Talks to the Model (services/data).
     *
     * Returns a View or Response back to the client.
     *
     * Annotated with @Controller (for UI) or @RestController (for APIs).
     *
     * 🔁 Request Flow in Spring MVC
     *
     * User sends a request → DispatcherServlet (Front Controller) receives it.
     *
     * DispatcherServlet forwards the request to the appropriate Controller.
     *
     * Controller processes the request (calls services, repositories, etc.).
     *
     * Controller returns data (Model) + name of the View.
     *
     * View Resolver picks the right HTML/JSP/Thymeleaf page.
     *
     * Response goes back to the client.
     *
     * ✅ Example in Spring Boot
     * @Controller
     * public class HomeController {
     *
     *     @GetMapping("/welcome")
     *     public String welcome(Model model) {
     *         model.addAttribute("message", "Hello Salman, Welcome to Spring MVC!");
     *         return "welcome"; // Thymeleaf template welcome.html
     *     }
     * }
     *
     *
     * Here:
     *
     * /welcome → request handled by controller
     *
     * Model carries data
     *
     * "welcome" → view page (welcome.html in templates/ folder)
     *
     * User sees "Hello Salman, Welcome to Spring MVC!"
     *
     * 👉 If you’re building REST APIs only, Spring Boot mostly skips the "View" and sends JSON as the response body using @RestController.
     */

}
