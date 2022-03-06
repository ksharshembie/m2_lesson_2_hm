package com.company;

public class Main {
    public static void main(String[] args) {
        String[] className = {"Notebook","Vacuum Cleaner","TV"};
        Electronics[] objects = new Electronics[className.length];
        for (int i = 0; i < objects.length; i++) {
            objects[i] = createObject(className[i]);
            objects[i].print();
        }
    }

    public static Electronics createObject(String className) {
        Electronics object = new Electronics();
        switch (className) {
            case "Notebook":
                object = new NoteBook("Asus", "Asus", "Asus 14", "China",
                        Processor.INTEL_CORE_I5_8GEN, VideoGrapfics.INTEL_HD_Graphics_520, OperationSystem.WINDOWS, 8, 256);
                break;
            case "TV":
                object =  new TV("Xiaomi TV", "Xiaomi", "XIAOMI MI LED TV 4A",
                        "China", 733, 435, 180,
                        true, true, true, false);
                break;
            case "Vacuum Cleaner":
                object =  new VacuumCleaner("Vacuum Cleaner", "Beko", "VCO32801AR",
                        150, CleanerType.Classic, CleaningType.Dry);
                break;
        }
        return object;
    }
}

