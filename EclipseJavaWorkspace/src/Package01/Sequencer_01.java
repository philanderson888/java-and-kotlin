package Package01;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequencer;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.*;

public class Sequencer_01 {

	public static void main(String[] args) {
		Sequencer_01 sequencer_01 = new Sequencer_01();
		sequencer_01.play();
	}
	void play(){
		try{
			Sequencer sequencer = MidiSystem.getSequencer(); 
			sequencer.open();
			
			Sequence sequence = new Sequence(Sequence.PPQ,4);
			
			Track track = sequence.createTrack();
			
			ShortMessage a = new ShortMessage();
			a.setMessage(144,1,44,100);
			MidiEvent noteOn = new MidiEvent(a,1);
			track.add(noteOn);
			

			ShortMessage c = new ShortMessage();
			c.setMessage(156,2,68,110);
			MidiEvent note1 = new MidiEvent(c,1);
			track.add(note1);
			
			ShortMessage b = new ShortMessage();
			b.setMessage(128,1,44,100);
			MidiEvent noteOff = new MidiEvent(b,16);
			track.add(noteOff);
			
			sequencer.setSequence(sequence);
			
			sequencer.start();
			
			
		}
		
		catch(MidiUnavailableException e){
			e.printStackTrace();
		}
		
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
