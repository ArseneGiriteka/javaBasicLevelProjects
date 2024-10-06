import javax.sound.midi.*;

public class MusicTestOne{
    public void play() {
        try{
            Sequencer player = MidiSystem.getSequencer();
            player.open();

            Sequence seq = new Sequence(Sequence.PPQ,4);

            Track t = seq.createTrack();

            ShortMessage a = new ShortMessage();
            a.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(a, 3);
            t.add(noteOn);

            ShortMessage b = new ShortMessage();
            b.setMessage(128, 1, 44,100);
            MidiEvent noteOff = new MidiEvent(b, 16);
            t.add(noteOff);

            player.setSequence(seq);
            player.start();

        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }

    public static void main(String[] args) {
        MusicTestOne music = new MusicTestOne();
        music.play();
    }
}