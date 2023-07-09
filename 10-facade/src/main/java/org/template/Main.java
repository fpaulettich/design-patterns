package org.template;

import org.template.structure.VideoConversionFacade;

import java.io.File;

/**
 * Example of Facade pattern design.
 * Credits to <a href="https://refactoring.guru/design-patterns/facade/java/example#lang-features">Refactoring Guru</a> for the example.
 */
public class Main {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }
}
