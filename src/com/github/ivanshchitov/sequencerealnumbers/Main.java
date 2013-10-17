package com.github.ivanshchitov.sequencerealnumbers;

import java.io.FileNotFoundException;
import java.util.NoSuchElementException;

/**
 * The main class.
 *
 * @author Ivan Shchitov
 */
public final class Main {
    /**
     * Default constructor.
     */
    private Main() {
    }

    /**
     * Main function.
     *
     * @param args The command line arguments
     */
    public static void main(String[] args) {
        try {
            new SequenceAnalyzer(args);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error. Not input file. Enter the name input file.");
        } catch (FileNotFoundException e) {
            System.out.println("Error. Not this file name: " + args[0]
                    + ". Enter correct file name.");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error. You enter 0 as size of sequence.");
        } catch (NoSuchElementException e) {
            System.out.println("Error. Your input file is empty.");
        }
    }
}
