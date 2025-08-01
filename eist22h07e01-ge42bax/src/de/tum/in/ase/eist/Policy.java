package de.tum.in.ase.eist;

public class Policy {
    private Context context;

    public Policy(Context context) {
        this.context = context;
    }

    public void configure() {


        if (!context.isChaptersSortedByName()) {
            context.setSearchAlgorithm(new LinearSearch());

        } else {
            context.setSearchAlgorithm(new BinarySearch());

        }
    }


}
