class BankAccount {
    private int balance = 100;

    // Synchronized method (thread-safe)
    public synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(name + " cannot withdraw. Insufficient balance.");
        }
    }

    // Non-synchronized method (not thread-safe)
    public void withdrawAsync(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing " + amount);
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(name + " cannot withdraw. Insufficient balance.");
        }
    }
}

class SyncVsAsynchDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Threads using synchronized method
        Thread t1 = new Thread(() -> account.withdraw("Thread-1", 60));
        Thread t2 = new Thread(() -> account.withdraw("Thread-2", 60));

        // Threads using non-synchronized method
        Thread t3 = new Thread(() -> account.withdrawAsync("Thread-3", 60));
        Thread t4 = new Thread(() -> account.withdrawAsync("Thread-4", 60));

        System.out.println("=== Using Synchronized ===");
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("\n=== Using Asynchronized ===");
        t3.start();
        t4.start();
    }
}
