package com.company;

public class TV extends Electronics {
    private int width;
    private int height;
    private int thickness;
    private boolean wifi;
    private boolean androidTV;
    private boolean hdmi;
    private boolean usb;

    public TV(String name, String brand, String model, String madeIn,
              int width, int height, int thickness,
              boolean wifi, boolean androidTV, boolean hdmi, boolean usb) {
        super(name, brand, model, madeIn);
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.wifi = wifi;
        this.androidTV = androidTV;
        this.hdmi = hdmi;
        this.usb = usb;
    }

    public TV(String name, String brand, String model,
              int width, int height, int thickness,
              boolean wifi, boolean androidTV, boolean hdmi, boolean usb) {
        super(name, brand, model);
        this.width = width;
        this.height = height;
        this.thickness = thickness;
        this.wifi = wifi;
        this.androidTV = androidTV;
        this.hdmi = hdmi;
        this.usb = usb;
    }

    private String isWifi(boolean wifi) {
        if (wifi) {
            return "Support";
        } else {
            return "Not Support";
        }
    }

    private String isAndroid(boolean androidTV) {
        if (androidTV) {
            return "Support";
        } else {
            return "Not Support";
        }
    }

    private String ishdmi(boolean hdmi) {
        if (hdmi) {
            return "Support";
        } else {
            return "Not Support";
        }
    }

    private String isUsb(boolean usb) {
        if (usb) {
            return "Support";
        } else {
            return "Not Support";
        }
    }

    @Override
    public void print() {
        if (getMadeIn() == null) {
            System.out.println("TV:\t\t\t\t\t" + getName() +
                    "\n\tBrand:\t\t\t\t" + getBrand() +
                    "\n\tModel:\t\t\t\t" + getModel() +
                    "\n\tWidth:\t\t\t\t" + width +
                    "\n\tHeight:\t\t\t\t" + height +
                    "\n\tThickness:\t\t\t" + thickness +
                    "\n\tWi-Fi:\t\t\t\t" + isWifi(wifi) +
                    "\n\tAndroid TV:\t\t\t" + isAndroid(androidTV) +
                    "\n\tHDMI:\t\t\t\t" + ishdmi(hdmi) +
                    "\n\tUSB:\t\t\t\t" + isUsb(usb));
        } else {
            System.out.println("TV:\t\t\t\t\t" + getName() +
                    "\n\tBrand:\t\t\t\t" + getBrand() +
                    "\n\tModel:\t\t\t\t" + getModel() +
                    "\n\tMade in:\t\t\t" + getMadeIn() +
                    "\n\tWidth:\t\t\t\t" + width +
                    "\n\tHeight:\t\t\t\t" + height +
                    "\n\tThickness:\t\t\t" + thickness +
                    "\n\tWi-Fi:\t\t\t\t" + isWifi(wifi) +
                    "\n\tAndroid TV:\t\t\t" + isAndroid(androidTV) +
                    "\n\tHDMI:\t\t\t\t" + ishdmi(hdmi) +
                    "\n\tUSB:\t\t\t\t" + isUsb(usb));
        }

    }
}
