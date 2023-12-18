/*
                                      @Program: 28
     	Write a java program to generate multiple threads using runnable interface.
 */

public class Q28_multiple_threads {
   
    public static void main(String[] args) {
        PlayVideo v = new PlayVideo();
        Thread video = new Thread(v);
        video.start();
        PlayMusic m = new PlayMusic();
        Thread music = new Thread(m);
        music.start();
        ProgressBar p = new ProgressBar();
        Thread progressBar = new Thread(p);
        progressBar.start();
        Timer t = new Timer();
        Thread timer = new Thread(t);
        timer.start();
    }
}
class PlayVideo implements Runnable{
    public void run(){
        System.out.println("Playing Video");
    }
}
class PlayMusic implements Runnable{
    public void run(){
        System.out.println("Playing Music");
    }
}
class ProgressBar implements Runnable{
    public void run(){
        System.out.println("Progress bar is executing");
    }
}
class Timer implements Runnable{
    public void run(){
        System.out.println("timer is executing");
    }
}

/*
 *   Output:
 *   Playing Video
 *   Playing Music
 *   Progress bar is executing
 *   timer is executing
 */