package de.htw_berlin.fb4.collaborativeprose;

import de.htw_berlin.fb4.ossd.prose.ProseBuilder;

import de.htw_berlin.prose.SimpleWeatherSentence;
import de.htw_berlin.fb4.elise.SimpleSentence;


public class CollaborativeProse {

    public static void main(String[] args) {
        ProseBuilder builder = new ProseBuilder();

        // Register local sentence
        builder.register(new de.htw_berlin.fb4.proseapp_Shamanina.inplementations.SimpleSentence("Hallo"));

        // Register peer sentences
        builder.register(new SimpleWeatherSentence());
        builder.register(new SimpleSentence());

        // Output prose
        System.out.println(builder.get());
    }
}

