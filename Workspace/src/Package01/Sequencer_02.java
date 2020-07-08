/*
 *  Can I play all the notes in sequence from the lowest to the highest???
 *  
 *  1. SEQUENCER
 *  
 *  2. ALBUM = SEQUENCE
 *  
 *  3. TRACK = SONG
 *  
 *  4. EVENT 
 */

package Package01;

import javax.sound.midi.*;
import java.util.ArrayList;

public class Sequencer_02 {

	public static void main(String[] args) {
		Sequencer_02 sequencer_02 = new Sequencer_02();
		sequencer_02.play();
	}
	
	ArrayList<MidiEvent> myNoteSequence = new ArrayList();
	
	void play(){
		try{
			Sequencer sequencer = MidiSystem.getSequencer();
			sequencer.open();
			
			Sequence sequence = new Sequence(Sequence.PPQ,4);
			
			for (int i=1; i<=4;i++){
				Track track = sequence.createTrack();
				System.out.println("New Track Created");
				int beat = 0;
				
				ShortMessage chooseInstrument = new ShortMessage();
				chooseInstrument.setMessage(192,1,60,0);
				MidiEvent changeInstrument = new MidiEvent(chooseInstrument,1);
				myNoteSequence.add(changeInstrument);
				track.add(changeInstrument);
				
				for (int j = 40; j<=60; j++){
					beat++;
					ShortMessage a = new ShortMessage();
					a.setMessage(144,1,j,100);
					MidiEvent noteOn = new MidiEvent(a,beat);
					myNoteSequence.add(noteOn);
					track.add(noteOn);
					
					ShortMessage b = new ShortMessage();
					b.setMessage(128,1,j,100);
					MidiEvent noteOff = new MidiEvent(b,beat+1);
					myNoteSequence.add(noteOff);
					track.add(noteOff);
				}

			}
			sequencer.setSequence(sequence);
			
			sequencer.start();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
