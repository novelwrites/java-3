package concurrency;

class Reasoning extends Thread {
    //set up this class so it can become a valid thread. 
    public void run () {

        distinguish();

    }

    void distinguish(){
    //print to the console the difference between a thread and a process
        //print out you think will happen if you invoke the run() method of a thread as opposed to the start() method of a thread.

        System.out.println("A process is an executing instance of an application, whereas a thread is an executing unit that is part of the process.");

        System.out.println("From Geeks for Geeks: When a program calls the start() method, a new thread is created and then the run() method is executed. But if we directly call the run() method then no new thread will be created and run() method will be executed as a normal method call on the current calling thread itself and no multi-threading will take place.");


    }
}

