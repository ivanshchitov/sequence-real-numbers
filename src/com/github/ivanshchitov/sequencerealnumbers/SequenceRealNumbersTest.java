package com.github.ivanshchitov.sequencerealnumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Test class for SequenceRealNumbers class.
 *
 * @author Ivan Shchitov
 */
public class SequenceRealNumbersTest {

    /**
     * Tests getMaximum() method.
     */
    @Test
    public void getMaximumTest() {
        SequenceRealNumbers sequenceTest = new SequenceRealNumbers();
        sequenceTest.add(1.0);
        sequenceTest.add(0.2);
        sequenceTest.add(3);
        assertEquals(
                Double.doubleToLongBits(3),
                Double.doubleToLongBits(sequenceTest.getMaximum())
        );
        System.out.println("Finished test on getMaximum() method.");
    }

    /**
     * Tests getMinimum() method.
     */
    @Test
    public void getMinimumTest() {
        SequenceRealNumbers sequenceTest = new SequenceRealNumbers();
        sequenceTest.add(1.0);
        sequenceTest.add(0.2);
        sequenceTest.add(3);
        assertEquals(
                Double.doubleToLongBits(0.2),
                Double.doubleToLongBits(sequenceTest.getMinimum())
        );
        System.out.println("Finished test on getMinimum() method.");
    }

    /**
     * Tests getAverage() method.
     */
    @Test
    public void getAverageTest() {
        SequenceRealNumbers sequenceTest = new SequenceRealNumbers();
        sequenceTest.add(1.0);
        sequenceTest.add(2);
        sequenceTest.add(3);
        assertEquals(
                Double.doubleToLongBits(2),
                Double.doubleToLongBits(sequenceTest.getAverage())
        );
        System.out.println("Finished test on getAverage() method.");
    }

    /**
     * Tests getMedian() method.
     */
    @Test
    public void getMedianTest() {
        evenSizeSequenceMedian();
        unevenSizeSequenceMedian();
    }

    /**
     * Checks the method with an even size of sequence.
     */
    private void evenSizeSequenceMedian() {
        SequenceRealNumbers sequenceTest = new SequenceRealNumbers();
        sequenceTest.add(1.0);
        sequenceTest.add(0.2);
        sequenceTest.add(3);
        sequenceTest.add(4);
        assertEquals(
                Double.doubleToLongBits(2),
                Double.doubleToLongBits(sequenceTest.getMedian())
        );
        System.out.println("Finished test on getMedian() method with even size.");
    }

    /**
     * Checks the method with an even size of sequence.
     */
    private void unevenSizeSequenceMedian() {
        SequenceRealNumbers sequenceTest = new SequenceRealNumbers();
        sequenceTest.add(1.0);
        sequenceTest.add(0.2);
        sequenceTest.add(3);
        assertEquals(
                Double.doubleToLongBits(1),
                Double.doubleToLongBits(sequenceTest.getMedian())
        );
        System.out.println("Finished test on getMedian() method with uneven size.");
    }

    /**
     * Tests getSize() method.
     */
    @Test
    public void getSizeTest() {
        SequenceRealNumbers sequenceTest = new SequenceRealNumbers();
        sequenceTest.add(1.0);
        sequenceTest.add(0.2);
        sequenceTest.add(3);
        assertEquals(
                Double.doubleToLongBits(3),
                Double.doubleToLongBits(sequenceTest.getSize())
        );
        System.out.println("Finished test on getSize() method.");
    }

    /**
     * Tests getElement() method.
     */
    @Test
    public void getElementTest() {
        SequenceRealNumbers sequenceTest = new SequenceRealNumbers();
        sequenceTest.add(1.0);
        sequenceTest.add(0.2);
        sequenceTest.add(3);
        assertEquals(
                Double.doubleToLongBits(3),
                Double.doubleToLongBits(sequenceTest.getElement(2))
        );
        System.out.println("Finished test on getElement() method.");
    }
}
