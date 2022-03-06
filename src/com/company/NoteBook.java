package com.company;

public class NoteBook extends Electronics {
    private Processor processor;
    private VideoGrapfics videoGrapfics;
    private OperationSystem operationSystem;
    private int ram;
    private int rom;

    public NoteBook(String name, String brand, String model, String madeIn,
                    Processor processor, VideoGrapfics videoGrapfics, OperationSystem operationSystem,
                    int ram, int rom) {
        super(name, brand, model, madeIn);
        this.processor = processor;
        this.videoGrapfics = videoGrapfics;
        this.operationSystem = operationSystem;
        this.ram = ram;
        this.rom = rom;
    }

    public NoteBook(String name, String brand, String model,
                    Processor processor, VideoGrapfics videoGrapfics, OperationSystem operationSystem,
                    int ram, int rom) {
        super(name, brand, model);
        this.processor = processor;
        this.videoGrapfics = videoGrapfics;
        this.operationSystem = operationSystem;
        this.ram = ram;
        this.rom = rom;
    }

    @Override
    public void print() {
        if (getMadeIn() == null) {
            System.out.println("Notebook:\t\t\t" + getName() +
                    "\n\tBrand:\t\t\t\t" + getBrand() +
                    "\n\tModel:\t\t\t\t" + getModel() +
                    "\n\tProcessor:\t\t\t" + processor +
                    "\n\tVideo Grapfics:\t\t" + videoGrapfics +
                    "\n\tOperation System:\t" + operationSystem +
                    "\n\tRAM:\t\t\t\t" + ram +
                    "\n\tROM:\t\t\t\t" + rom);
        } else{
            System.out.println("Notebook:\t\t\t" + getName() +
                    "\n\tBrand:\t\t\t\t" + getBrand() +
                    "\n\tModel:\t\t\t\t" + getModel() +
                    "\n\tMade in:\t\t\t" + getMadeIn() +
                    "\n\tProcessor:\t\t\t" + processor +
                    "\n\tVideo Grapfics:\t\t" + videoGrapfics +
                    "\n\tOperation System:\t" + operationSystem +
                    "\n\tRAM:\t\t\t\t" + ram +
                    "\n\tROM:\t\t\t\t" + rom);
        }
    }
}
