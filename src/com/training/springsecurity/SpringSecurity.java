package com.training.springsecurity;

public class SpringSecurity {
    public static void main(String[] args) {
        /**
         *
         * Spring Security is a powerful and flexible framework in the Spring ecosystem designed to
         * secure Java applications. It addresses authentication (who you are) and authorization
         * (what you are allowed to do) and integrates seamlessly with Spring applications.
         * Below is a comprehensive overview of Spring Security concepts, divided into key topics:
         *
         * 1. Core Concepts
         *
         * 1.1 Authentication
         *
         * Definition: The process of verifying the identity of a user.
         *
         * Components:
         *
         *      AuthenticationManager: The main entry point for authentication requests.
         *
         *      Authentication: Represents the current user's authentication state.
         *
         *      UserDetailsService: Interface for loading user-specific data for authentication.
         *
         * 1.2 Authorization
         *
         * Definition: Granting access to resources based on roles/permissions.
         *
         * Components:
         *
         *      AccessDecisionManager: Makes authorization decisions.
         *
         *      GrantedAuthority: Represents a role or permission assigned to a user.
         *
         * 2. Filter Chain
         *
         * SecurityFilterChain: Intercepts requests and applies security rules.
         *
         * Common Filters:
         *
         *      UsernamePasswordAuthenticationFilter: Handles form-based login.
         *
         *      BasicAuthenticationFilter: Supports Basic Authentication.
         *
         *      JwtAuthenticationFilter: Custom filter for JWT-based authentication.
         *
         * 3. Authentication Mechanisms
         *
         * 3.1 Form-Based Login
         *
         *      Login page with username and password fields.
         *
         *      Configured using http.formLogin().
         *
         * 3.2 Basic Authentication
         * Encodes credentials in the HTTP header.
         *
         * Configured using http.httpBasic().
         *
         * 3.3 OAuth2 Login
         * Social login via providers like Google, Facebook, or GitHub.
         *
         * Configured with http.oauth2Login().
         *
         * 3.4 JWT (JSON Web Tokens)
         * Stateless authentication using signed tokens.
         *
         * Requires custom filters for handling token creation and validation.
         *
         * 4. Authorization Techniques
         * 4.1 Role-Based Access Control (RBAC)
         * Uses roles like ROLE_USER, ROLE_ADMIN.
         *
         * Example: @PreAuthorize("hasRole('ADMIN')").
         *
         * 4.2 Method-Level Security
         * Secures service methods.
         *
         * Annotations:
         *
         * @PreAuthorize: Pre-check before method execution.
         *
         * @PostAuthorize: Post-check after method execution.
         *
         * 4.3 URL-Based Security
         * Secures endpoints.
         *
         * Example:
         *
         *
         * http.authorizeRequests()
         *     .antMatchers("/admin/**").hasRole("ADMIN")
         *     .anyRequest().authenticated();
         *
         * 4.4 Domain Object Security
         * Fine-grained security at the object level (e.g., ACL).
         *
         * 5. Key Components
         * 5.1 UserDetailsService
         * Loads user-specific data for authentication.
         *
         * 5.2 PasswordEncoder
         * Encrypts passwords for secure storage.
         *
         * Common encoders:
         *
         * BCryptPasswordEncoder
         *
         * NoOpPasswordEncoder (Not recommended for production).
         *
         * 5.3 SecurityContext
         * Stores authentication details for the current user.
         *
         * Example: SecurityContextHolder.getContext().getAuthentication().
         *
         * 6. Advanced Features
         * 6.1 CSRF (Cross-Site Request Forgery) Protection
         * Enabled by default in Spring Security.
         *
         * Protects against malicious form submissions.
         *
         * 6.2 CORS (Cross-Origin Resource Sharing)
         * Allows sharing resources between different origins.
         *
         * Configured using http.cors().
         *
         * 6.3 Session Management
         * Controls user session behavior.
         *
         * Options:
         *
         * Session timeout.
         *
         * Preventing concurrent sessions.
         *
         * 6.4 Remember-Me Functionality
         * Persistent login with a cookie.
         *
         * 6.5 Security with Spring Boot
         * Auto-configuration simplifies setup:
         *
         * Default login page.
         *
         * Default UserDetailsService.
         *
         * 7. Common Use Cases
         * 7.1 API Security
         * Protecting REST APIs using:
         *
         * Basic Authentication.
         *
         * JWT tokens.
         *
         * 7.2 OAuth2 Authorization Server
         * Implements an OAuth2.0 server for issuing access tokens.
         *
         * 7.3 Single Sign-On (SSO)
         * Integrates with third-party identity providers.
         *
         * 8. Best Practices
         * Always encode passwords using a secure PasswordEncoder.
         *
         * Use HTTPS for secure communication.
         *
         * Enable CSRF protection for web applications.
         *
         * Use environment variables to manage sensitive data (e.g., client secrets, tokens).
         *
         * Regularly update Spring Security to avoid vulnerabilities.
         *
         * 9. Example Project Configuration
         * Sample Configuration for Basic Security
         *
         * @Configuration
         * @EnableWebSecurity
         * public class SecurityConfig extends WebSecurityConfigurerAdapter {
         *
         *     @Override
         *     protected void configure(HttpSecurity http) throws Exception {
         *         http.authorizeRequests()
         *             .antMatchers("/public/**").permitAll()
         *             .antMatchers("/admin/**").hasRole("ADMIN")
         *             .anyRequest().authenticated()
         *             .and()
         *             .formLogin()
         *             .and()
         *             .httpBasic();
         *     }
         *
         *     @Bean
         *     @Override
         *     protected UserDetailsService userDetailsService() {
         *         User user1 = User.withUsername("user")
         *                 .password(passwordEncoder().encode("password"))
         *                 .roles("USER")
         *                 .build();
         *         User admin = User.withUsername("admin")
         *                 .password(passwordEncoder().encode("admin"))
         *                 .roles("ADMIN")
         *                 .build();
         *         return new InMemoryUserDetailsManager(user1, admin);
         *     }
         *
         *     @Bean
         *     public PasswordEncoder passwordEncoder() {
         *         return new BCryptPasswordEncoder();
         *     }
         * }
         *
         *
         * 1. Authentication
         * Example of a Custom AuthenticationManager:
         * @Configuration
         * public class CustomAuthManagerConfig extends AuthenticationManagerConfigurer {
         *
         *     @Bean
         *     public AuthenticationManager authManager(HttpSecurity http) throws Exception {
         *         return http.getSharedObject(AuthenticationManagerBuilder.class)
         *             .inMemoryAuthentication()
         *             .withUser("user").password("{noop}password").roles("USER")
         *             .and()
         *             .withUser("admin").password("{noop}admin").roles("ADMIN")
         *             .and()
         *             .build();
         *     }
         * }
         *
         *
         * 2. Authorization
         * Example of Role-Based URL Security:
         *
         * @Configuration
         * @EnableWebSecurity
         * public class RoleBasedConfig extends WebSecurityConfigurerAdapter {
         *     @Override
         *     protected void configure(HttpSecurity http) throws Exception {
         *         http.authorizeRequests()
         *             .antMatchers("/admin/**").hasRole("ADMIN")
         *             .antMatchers("/user/**").hasAnyRole("USER", "ADMIN")
         *             .antMatchers("/public/**").permitAll()
         *             .anyRequest().authenticated()
         *             .and()
         *             .formLogin().defaultSuccessUrl("/home", true);
         *     }
         * }
         *
         *
         * 3. Filter Chain
         * Custom Filter Implementation:
         *
         * @Component
         * public class CustomFilter extends OncePerRequestFilter {
         *     @Override
         *     protected void doFilterInternal(HttpServletRequest request,
         *                                     HttpServletResponse response,
         *                                     FilterChain filterChain) throws ServletException, IOException {
         *         String token = request.getHeader("Authorization");
         *         // Process the token here
         *         filterChain.doFilter(request, response);
         *     }
         * }
         *
         * @Configuration
         * public class FilterChainConfig extends SecurityFilterChain {
         *     @Bean
         *     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         *         http.addFilterBefore(new CustomFilter(), UsernamePasswordAuthenticationFilter.class)
         *             .authorizeRequests()
         *             .anyRequest().authenticated();
         *         return http.build();
         *     }
         * }
         *
         *
         * 4. OAuth2 Login
         * Example Configuration:
         *
         * @Configuration
         * @EnableWebSecurity
         * public class OAuth2Config extends WebSecurityConfigurerAdapter {
         *
         *     @Override
         *     protected void configure(HttpSecurity http) throws Exception {
         *         http.oauth2Login()
         *             .defaultSuccessUrl("/home", true)
         *             .and()
         *             .authorizeRequests()
         *             .anyRequest().authenticated();
         *     }
         * }
         *
         *
         * 5. JWT Authentication
         * Filter Implementation:
         *
         * @Component
         * public class JwtFilter extends OncePerRequestFilter {
         *
         *     @Override
         *     protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
         *         String token = request.getHeader("Authorization");
         *         if (token != null && validateToken(token)) {
         *             SecurityContextHolder.getContext().setAuthentication(getAuthentication(token));
         *         }
         *         chain.doFilter(request, response);
         *     }
         *
         *     private boolean validateToken(String token) {
         *         // Token validation logic
         *         return true;
         *     }
         *
         *     private Authentication getAuthentication(String token) {
         *         // Return user authentication details from token
         *         return null; // Replace with actual logic
         *     }
         * }
         *
         *
         * 6. CSRF Protection
         * Default Configuration:
         *
         * @Configuration
         * @EnableWebSecurity
         * public class CSRFConfig extends WebSecurityConfigurerAdapter {
         *     @Override
         *     protected void configure(HttpSecurity http) throws Exception {
         *         http.csrf().enable()  // Enable CSRF protection
         *             .authorizeRequests()
         *             .anyRequest().authenticated();
         *     }
         * }
         *
         *
         * 7. Remember-Me Functionality
         * Implementation Example:
         *
         * @Configuration
         * public class RememberMeConfig extends WebSecurityConfigurerAdapter {
         *     @Override
         *     protected void configure(HttpSecurity http) throws Exception {
         *         http.rememberMe()
         *             .key("uniqueAndSecret")
         *             .tokenValiditySeconds(86400); // 1 day
         *     }
         * }
         *
         *
         * 8. Password Encoding
         * Using BCryptPasswordEncoder:
         *
         * @Bean
         * public PasswordEncoder passwordEncoder() {
         *     return new BCryptPasswordEncoder();
         * }
         *
         *
         * 9. API Security (JWT)
         * Example Secure Controller:
         *
         * @RestController
         * @RequestMapping("/api")
         * public class ApiController {
         *
         *     @GetMapping("/secure")
         *     public ResponseEntity<String> secureEndpoint() {
         *         return ResponseEntity.ok("This is a secured endpoint");
         *     }
         * }
         *
         * 10. Full Minimal Configuration
         * Application Security Configuration:
         * java
         * Copy
         * Edit
         * @Configuration
         * @EnableWebSecurity
         * public class SecurityConfig extends WebSecurityConfigurerAdapter {
         *
         *     @Override
         *     protected void configure(HttpSecurity http) throws Exception {
         *         http.authorizeRequests()
         *             .antMatchers("/public/**").permitAll()
         *             .anyRequest().authenticated()
         *             .and()
         *             .formLogin()
         *             .and()
         *             .logout()
         *             .and()
         *             .csrf();
         *     }
         *
         *     @Bean
         *     public PasswordEncoder passwordEncoder() {
         *         return new BCryptPasswordEncoder();
         *     }
         * }
         *
         *
         *
         *
         */
    }
}
