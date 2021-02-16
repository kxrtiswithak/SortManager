package com.sparta.kurtis.performance;

import com.sparta.kurtis.print.Printer;
import com.sparta.kurtis.sort.SortFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BinaryTreePerformanceTests extends PerformanceTests {

    @Override
    @BeforeEach
    public void sorter() {
        treeSorter = new SortFactory().getTreeSort("binary");
    }

    @Test
    @DisplayName("Sorted Number Array Add Elements")
    public void a1Test() {
        start = System.currentTimeMillis();
        treeSorter.addElements(sortedNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Sorted Number Array Add Elements: %dms%n", end - start);
    }

    @Test
    @DisplayName("Sorted Number Array Sort Asc")
    public void a2Test() {
        treeSorter.addElements(sortedNumArray);
        start = System.currentTimeMillis();
        treeSorter.getSortedTreeAsc();
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Sorted Number Array Sort Asc: %dms%n", end - start);
    }

    @Test
    @DisplayName("Sorted Number Array Sort Desc")
    public void a3Test() {
        treeSorter.addElements(sortedNumArray);
        start = System.currentTimeMillis();
        treeSorter.getSortedTreeDesc();
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Sorted Number Array Sort Desc: %dms%n", end - start);
    }

    @Test
    @DisplayName("Sorted Number Array Find Element")
    public void a4Test() {
        treeSorter.addElements(sortedNumArray);
        start = System.currentTimeMillis();
        treeSorter.findElement(sortedNumArray[sortedNumArray.length / 2]);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Sorted Number Array Find Element: %dms%n", end - start);
    }

    @Test
    @DisplayName("Small Number Array Add Elements")
    public void b1Test() {
        start = System.currentTimeMillis();
        treeSorter.addElements(smallNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Small Number Array Add Elements: %dms%n", end - start);
    }


    @Test
    @DisplayName("Small Number Array Sort Asc")
    public void b2Test() {
        treeSorter.addElements(smallNumArray);
        start = System.currentTimeMillis();
        treeSorter.getSortedTreeAsc();
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Small Number Array Sort Asc: %dms%n", end - start);
    }

    @Test
    @DisplayName("Small Number Array Sort Desc")
    public void b3Test() {
        treeSorter.addElements(smallNumArray);
        start = System.currentTimeMillis();
        treeSorter.getSortedTreeDesc();
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Small Number Array Sort Desc: %dms%n", end - start);
    }

    @Test
    @DisplayName("Small Number Array Find Element")
    public void b4Test() {
        treeSorter.addElements(smallNumArray);
        start = System.currentTimeMillis();
        treeSorter.findElement(smallNumArray[smallNumArray.length / 2]);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Small Number Array Find Element: %dms%n", end - start);
    }

    @Test
    @DisplayName("Big Number Array Add Elements")
    public void c1Test() {
        start = System.currentTimeMillis();
        treeSorter.addElements(bigNumArray);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Big Number Array Add Elements: %dms%n", end - start);
    }


    @Test
    @DisplayName("Big Number Array Sort Asc")
    public void c2Test() {
        treeSorter.addElements(bigNumArray);
        start = System.currentTimeMillis();
        treeSorter.getSortedTreeAsc();
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Big Number Array Sort Asc: %dms%n", end - start);
    }

    @Test
    @DisplayName("Big Number Array Sort Desc")
    public void c3Test() {
        treeSorter.addElements(bigNumArray);
        start = System.currentTimeMillis();
        treeSorter.getSortedTreeDesc();
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Big Number Array Sort Desc: %dms%n", end - start);
    }

    @Test
    @DisplayName("Big Number Array Find Element")
    public void c4Test() {
        treeSorter.addElements(bigNumArray);
        start = System.currentTimeMillis();
        treeSorter.findElement(bigNumArray[bigNumArray.length / 2]);
        end = System.currentTimeMillis();

        Printer.printPerformanceTestString("Big Number Array Find Element: %dms%n", end - start);
    }

}
