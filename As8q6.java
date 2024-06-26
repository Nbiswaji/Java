package Biswajit.Java;
import java.util.Random;
class SharedResource {
    private int generatedNumber;
    private boolean isNumberGenerated = false;
    private int evenCount = 0;
    public synchronized void produce() {
        if (isNumberGenerated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Random rand = new Random();
        generatedNumber = rand.nextInt(100) + 1;
        System.out.println("Producer generated: " + generatedNumber);

        isNumberGenerated = true;
        notify();
    }
    public synchronized void consume() {
        if (!isNumberGenerated) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (generatedNumber % 2 == 0) {
            evenCount++;
        }
        System.out.println("Consumer checked: " + generatedNumber);
        isNumberGenerated = false;
        notify();
    }
    public int getEvenCount() {
        return evenCount;
    }
}
class Producer implements Runnable {
    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }
     public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.produce();
        }
    }
}

class Consumer implements Runnable {
    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }
    public void run() {
        for (int i = 0; i < 10; i++) {
            sharedResource.consume();
        }
        System.out.println("Total number of even numbers received: " + sharedResource.getEvenCount());
    }
}

public class As8q6{
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();
    }
}