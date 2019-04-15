package com.ideotic.edioticideas.aaya;

import android.app.DialogFragment;
import android.speech.tts.TextToSpeech;

/**
 * Created by nayem on 16-05-2017.
 */
public class IsSpeaking extends Thread{
    TextToSpeech textToSpeech;
    DialogFragment d;
    public IsSpeaking(TextToSpeech textToSpeech, DialogFragment d) {
        this.textToSpeech = textToSpeech;
        this.d = d;
    }

    @Override
    public void run() {
        super.run();

        do {
            try {
                IsSpeaking.this.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }while (textToSpeech.isSpeaking());
        d.dismiss();
    }
}
