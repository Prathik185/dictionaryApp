package com.example.dictionary.models;

import java.util.List;

public class Meanings {
    String partofSpeech = "";
    List<Definitions> definitions = null;

    public String getPartofSpeech() {
        return partofSpeech;
    }

    public void setPartofSpeech(String partofSpeech) {
        this.partofSpeech = partofSpeech;
    }

    public List<Definitions> getDefinitions() {
        return definitions;
    }

    public void setDefinitions(List<Definitions> definitions) {
        this.definitions = definitions;
    }
}

