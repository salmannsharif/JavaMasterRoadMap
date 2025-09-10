package com.training.type;

public class BeanType {
    /**
     * In Spring, a "bean" refers to an object that is instantiated, assembled, and managed by the Spring IoC
     * (Inversion of Control) container. The "type" of a bean primarily refers to its scope,
     * which dictates its lifecycle and how instances of that bean are created and managed within
     * the application context.
     *
     *
     * There are several types of bean scopes in Spring:
     * Singleton (Default Scope):
     * Only one instance of the bean is created per Spring IoC container.
     * This single instance is shared across all requests and references within the application.
     * It is the most common and default scope for Spring beans.
     *
     * Prototype:
     * A new instance of the bean is created each time it is requested from the Spring IoC container.
     * This ensures that each consumer of the bean receives a unique instance.
     *
     * Request:
     * A single bean instance is created for the lifecycle of a single HTTP request.
     * Each HTTP request will have its own instance of the bean.
     * This scope is only valid in the context of a web-aware Spring ApplicationContext.
     *
     * Session:
     * A single bean instance is created for the lifecycle of an HTTP session.
     * This means one instance per user session.
     * This scope is only valid in the context of a web-aware Spring ApplicationContext.
     *
     * Application:
     * A single bean instance is created for the entire lifecycle of the ServletContext.
     * This is similar to a singleton but within the scope of the web application's ServletContext.
     * This scope is only valid in the context of a web-aware Spring ApplicationContext.
     *
     * WebSocket:
     * A single bean instance is created for the lifecycle of a WebSocket.
     * This scope is specific to WebSocket applications.
     * Defining Bean Scopes:
     * You can specify the scope of a bean using the @Scope annotation in conjunction with @Bean or component annotations like @Component, @Service, etc.
     * Java
     *
     * import org.springframework.context.annotation.Bean;
     * import org.springframework.context.annotation.Configuration;
     * import org.springframework.context.annotation.Scope;
     *
     * @Configuration
     * public class AppConfig {
     *
     *     @Bean
     *     @Scope("singleton") // Explicitly defining singleton scope (default)
     *     public MySingletonBean mySingletonBean() {
     *         return new MySingletonBean();
     *     }
     *
     *     @Bean
     *     @Scope("prototype") // Defining prototype scope
     *     public MyPrototypeBean myPrototypeBean() {
     *         return new MyPrototypeBean();
     *     }
     *
     *     // Example for web-aware scopes (requires a web application context)
     *     // @Bean
     *     // @Scope("request")
     *     // public MyRequestScopedBean myRequestScopedBean() {
     *     //     return new MyRequestScopedBean();
     *     // }
     * }
     */
}
