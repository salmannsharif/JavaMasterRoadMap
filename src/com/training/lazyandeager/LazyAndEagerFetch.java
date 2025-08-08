package com.training.lazyandeager;

public class LazyAndEagerFetch {
    public static void main(String[] args) {

        /**The chatgpt link - https://chatgpt.com/share/6836c967-1484-8006-b8c7-e50daec9f861*/

        /**
         * 🔁 What is Eager Fetching and Lazy Fetching?
         * When you fetch a main object (like an Employee), sometimes it has a related object (like Department).
         * You can tell JPA when to load those related objects:
         *
         * 🔹 Eager Fetching
         * Related data is loaded immediately when the main object is fetched.
         *
         * It's like: "Bring everything now."
         *
         * 🔹 Lazy Fetching
         * Related data is loaded only when you ask for it.
         *
         * It's like: "Bring only the main thing now. If I need more, I’ll ask later."
         *
         * 📦 Example
         * Let’s say:
         *
         * java
         * Copy
         * Edit
         * @Entity
         * public class Employee {
         *     @Id
         *     private Long id;
         *     private String name;
         *
         *     @ManyToOne(fetch = FetchType.EAGER) // or LAZY
         *     private Department department;
         * }
         * java
         * Copy
         * Edit
         * @Entity
         * public class Department {
         *     @Id
         *     private Long id;
         *     private String name;
         * }
         *
         * Now in a repository:
         *
         * java
         * Copy
         * Edit
         * Employee emp = employeeRepository.findById(1L).get();
         * System.out.println(emp.getName()); // This always works
         *
         * System.out.println(emp.getDepartment().getName());
         * If FetchType.EAGER → Department is already loaded, no problem.
         *
         * If FetchType.LAZY → Department is not loaded yet. If you're outside of a transaction, you'll get LazyInitializationException.
         *
         * 🔁 What is @Transactional?
         * @Transactional ensures that all code inside the method runs inside a single database transaction.
         *
         * Also, for Lazy fetching, this helps! Because JPA needs an open session (inside a transaction) to load the lazy data.
         *
         * 👇 Example with @Transactional
         * java
         * Copy
         * Edit
         * @Service
         * public class EmployeeService {
         *
         *     @Autowired
         *     private EmployeeRepository employeeRepository;
         *
         *     @Transactional
         *     public void printEmployee() {
         *         Employee emp = employeeRepository.findById(1L).get();
         *         System.out.println(emp.getName());
         *
         *         // Lazy fetch will work because we're inside a @Transactional method
         *         System.out.println(emp.getDepartment().getName());
         *     }
         * }
         * If you don’t use @Transactional and use FetchType.LAZY, it might crash when accessing getDepartment().getName() because the session is already closed.
         *
         * 🧠 In Short:
         * Feature	                EAGER	                            LAZY
                Load related data	                        Immediately	Only when accessed
         *      Performance	May slow if data is large	    Faster if related data is not needed
         *      Needs @Transactional?	No	                Yes, if accessing related data
         *
         * If you want, I can show real code from a GitHub project or simulate one in your style. Just let me know 😊
         *
         * Want me to continue with a mini working example or you're good so far?
         *
         *
         *
         *
         *
         *
         *
         * You said:
         *     @OneToOne(cascade = CascadeType.ALL)
         * // What is this line explain in one line
         *
         *
         * ChatGPT said:
         * @OneToOne(cascade = CascadeType.ALL) means a one-to-one relationship, and any operation (save, update, delete) done on the parent entity will also be done on the related entity automatically.
         *
         *
         *
         *
         *
         *
         *
         * You said:
         * What is acid explain in simple term if possible create a small code for that better uderstand
         *
         *
         * ChatGPT said:
         * Of course, Salman! Let’s explain ACID in very simple terms first, then I’ll show a small code-like example to make it clear 💡
         *
         * 🔠 What is ACID?
         * ACID stands for:
         *
         * Letter	Meaning	Simple Explanation
         * A	Atomicity	All steps in a task must succeed or none at all. (All or nothing)
         * C	Consistency	Data must be correct before and after the transaction. (No bad data)
         * I	Isolation	Transactions should not affect each other. (Work separately)
         * D	Durability	Once saved, the data must stay saved. (Even after crash)
         *
         * 💡 Real-Life Example:
         * Let’s say you're transferring ₹1000 from Account A to Account B.
         *
         * 🔁 ACID Flow:
         * Atomicity: If debit from A works but credit to B fails, rollback both.
         *
         * Consistency: Total money before and after should be the same.
         *
         * Isolation: If 2 people transfer money at the same time, each transfer should be handled safely.
         *
         * Durability: If transfer is done and system crashes, the change must be saved.
         *
         * 🧪 Simple Code Example in Spring Boot Style
         * java
         * Copy
         * Edit
         * @Service
         * public class BankService {
         *
         *     @Autowired
         *     private AccountRepository accountRepo;
         *
         *     @Transactional
         *     public void transfer(Long fromId, Long toId, int amount) {
         *         Account from = accountRepo.findById(fromId).get();
         *         Account to = accountRepo.findById(toId).get();
         *
         *         from.setBalance(from.getBalance() - amount);  // debit
         *         to.setBalance(to.getBalance() + amount);      // credit
         *
         *         accountRepo.save(from);
         *         accountRepo.save(to);
         *
         *         // If anything fails, everything rolls back (Atomicity)
         *     }
         * }
         * ✅ Atomic: Both debit and credit happen together or rollback.
         *
         * ✅ Consistent: Total money stays same.
         *
         * ✅ Isolated: Other transfers run in isolation.
         *
         * ✅ Durable: Once committed, it stays.
         *
         * Let me know if you want to see this with actual database setup or with test cases too. Shall I show a small working model of this?
         *
         *
         *
         *
         *
         *
         *
         * You said:
         * Give me a small para for explaining what is acid
         *
         *
         * ChatGPT said:
         * Sure, here's a simple and short paragraph to explain ACID:
         *
         * ACID is a set of properties in databases that ensure reliable and safe transactions. It stands for Atomicity, Consistency, Isolation, and Durability. Atomicity means all steps in a transaction must complete successfully or none at all. Consistency ensures the data remains valid before and after the transaction. Isolation means each transaction works independently without affecting others. Durability guarantees that once a transaction is completed, the changes are permanently saved even if the system crashes.
         */


        /**
         * The @Transactional annotation in Spring is used to manage transactions automatically — ensuring atomicity, consistency, and rollback on failure. It’s especially useful when you’re doing multiple database operations that must succeed or fail together.
         *
         * ✅ Simple Explanation
         * @Transactional tells Spring: “Treat this method as a single database transaction. If any part fails, roll everything back.”
         *
         * 🧠 Where it’s used:
         * Multiple save, update, or delete operations
         *
         * Complex business logic that spans several DAO/repo calls
         *
         * Rollback on error or exception
         *
         * ✅ Real Example
         * Let’s say you’re transferring money between two accounts.
         *
         * 🧾 Entity: Account
         * java
         * Copy
         * Edit
         * @Entity
         * public class Account {
         *     @Id
         *     private Long id;
         *     private String name;
         *     private double balance;
         *
         *     // getters/setters
         * }
         * 🗂️ Repository
         * java
         * Copy
         * Edit
         * public interface AccountRepository extends JpaRepository<Account, Long> {}
         * 💼 Service using @Transactional
         * java
         * Copy
         * Edit
         * @Service
         * public class AccountService {
         *
         *     @Autowired
         *     private AccountRepository accountRepository;
         *
         *     @Transactional
         *     public void transferMoney(Long fromId, Long toId, double amount) {
         *         Account from = accountRepository.findById(fromId).orElseThrow();
         *         Account to = accountRepository.findById(toId).orElseThrow();
         *
         *         from.setBalance(from.getBalance() - amount);
         *         to.setBalance(to.getBalance() + amount);
         *
         *         accountRepository.save(from);
         *         accountRepository.save(to);
         *
         *         // Uncomment this to simulate failure
         *         // if (true) throw new RuntimeException("Simulated failure");
         *     }
         * }
         * ⚠️ Without @Transactional
         * If an exception occurs after debiting but before crediting, you lose money.
         *
         * The debit is committed, but the credit never happens.
         *
         * ✅ With @Transactional
         * Spring detects failure and rolls back both operations.
         *
         * Ensures data integrity.
         *
         * 🔄 Summary
         * Feature	Description
         * Rollback	Automatic rollback on exceptions
         * Atomicity	All DB changes succeed or none
         * Annotation Scope	Method-level or class-level
         * Checked Exceptions	No rollback unless configured manually
         */

    }
}
