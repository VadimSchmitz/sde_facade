package app;

public class HomeCinemaOn {

    boolean on = true;

    public void startMovie(boolean on) {
        if(on){
            PopcornPopper popper = new PopcornPopper("Popcorn Popper");
            popper.on();
            popper.pop();

            TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
            lights.dim(0);

            Screen screen = new Screen("Theater Screen");
            screen.down();

            Amplifier amp = new Amplifier("Top-O-Line Amplifier");
            amp.on();

            DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
            dvd.play("dora");

            Projector projector = new Projector("Top-O-Line Projector", dvd);
            projector.on();
            projector.wideScreenMode();

            dvd.setSurroundAudio();
            amp.setVolume(5);
            dvd.on();
            dvd.play(1);
        }
    }
}
