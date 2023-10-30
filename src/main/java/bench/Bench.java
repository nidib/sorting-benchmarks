package bench;

import sorter.Sorter;
import utils.ListGenerator;
import utils.Timer;

import java.util.Comparator;

public class Bench {
    static final ListGenerator list = new ListGenerator(10000);

    public static void main(String[] args) throws Exception {
        // Bubble
        Timer.calculate("Bubble [Random]", Bench::bubbleRandom, 10);
        Timer.calculate("Bubble [Asc]", Bench::bubbleAsc, 10);
        Timer.calculate("Bubble [Desc]", Bench::bubbleDesc, 10);

        // Selection
        Timer.calculate("Selection [Random]", Bench::selectionRandom, 10);
        Timer.calculate("Selection [Asc]", Bench::selectionAsc, 10);
        Timer.calculate("Selection [Desc]", Bench::selectionDesc, 10);

        // Quick
        Timer.calculate("Quick [Random]", Bench::quickRandom, 10);
        Timer.calculate("Quick [Asc]", Bench::quickAsc, 10);
        Timer.calculate("Quick [Desc]", Bench::quickDesc, 10);

        // Insertion
        Timer.calculate("Insertion [Random]", Bench::insertionRandom, 10);
        Timer.calculate("Insertion [Asc]", Bench::insertionAsc, 10);
        Timer.calculate("Insertion [Desc]", Bench::insertionDesc, 10);

        // Merge
        Timer.calculate("Merge [Random]", Bench::mergeRandom, 10);
        Timer.calculate("Merge [Asc]", Bench::mergeAsc, 10);
        Timer.calculate("Merge [Desc]", Bench::mergeDesc, 10);
    }

    // Bubble
    public static Void bubbleRandom() {
        Sorter.bubble(list.getList(), Comparator.reverseOrder());

        return null;
    }

    public static Void bubbleAsc() {
        Sorter.bubble(list.getListAsc(), Comparator.reverseOrder());

        return null;
    }

    public static Void bubbleDesc() {
        Sorter.bubble(list.getListDesc(), Comparator.reverseOrder());

        return null;
    }

    // Selection
    public static Void selectionRandom() {
        Sorter.selection(list.getList());

        return null;
    }

    public static Void selectionAsc() {
        Sorter.selection(list.getListAsc());

        return null;
    }

    public static Void selectionDesc() {
        Sorter.selection(list.getListDesc());

        return null;
    }

    // Quick
    public static Void quickRandom() {
        Sorter.quick(list.getList());

        return null;
    }

    public static Void quickAsc() {
        Sorter.quick(list.getListAsc());

        return null;
    }

    public static Void quickDesc() {
        Sorter.quick(list.getListDesc());

        return null;
    }

    // Insertion
    public static Void insertionRandom() {
        Sorter.insertion(list.getList());

        return null;
    }

    public static Void insertionAsc() {
        Sorter.insertion(list.getListAsc());

        return null;
    }

    public static Void insertionDesc() {
        Sorter.insertion(list.getListDesc());

        return null;
    }

    // Merge
    public static Void mergeRandom() {
        Sorter.merge(list.getList());

        return null;
    }

    public static Void mergeAsc() {
        Sorter.merge(list.getListAsc());

        return null;
    }

    public static Void mergeDesc() {
        Sorter.merge(list.getListDesc());

        return null;
    }
}
