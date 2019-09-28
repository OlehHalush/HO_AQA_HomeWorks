package HW4;

/*
6. Create a class and demonstrate proper encapsulation techniques
The class will be called Printer
It will simulate a real Computer printer
It should have fields for toner level, number of pages printed, and also whether its a duplex printer (capable of printing on both sides of the paper).
Add methods to fill up the toner (up to a maximum of 100%), another method to simulate printing a page(which should increase the number of pages printed).
Decide on the scope, whether to use constructors, and anything else you think is needed."
*/
public class Printer {
    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public boolean isColor() {
        return isColor;
    }

    public String getType() {
        return type;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public int getTonerLevelBlack() {
        return tonerLevelBlack;
    }

    public void setTonerLevelBlack(int tonerLevelBlack) {
        this.tonerLevelBlack = tonerLevelBlack;
    }

    public int getTonerLevelMagenta() {
        return tonerLevelMagenta;
    }

    public void setTonerLevelMagenta(int tonerLevelMagenta) {
        this.tonerLevelMagenta = tonerLevelMagenta;
    }

    public int getTonerLevelYellow() {
        return tonerLevelYellow;
    }

    public void setTonerLevelYellow(int tonerLevelYellow) {
        this.tonerLevelYellow = tonerLevelYellow;
    }

    public int getTonerLevelBlue() {
        return tonerLevelBlue;
    }

    public void setTonerLevelBlue(int tonerLevelBlue) {
        this.tonerLevelBlue = tonerLevelBlue;
    }

    //Only 2 types of printers will be available, colored and black-white
    public Printer(Boolean isColor) {
        if (isColor == true) {
            this.manufacturer = "Xerox";
            this.model = "QB3000";
            this.tonerLevelBlack = 100;
            this.tonerLevelBlue = 100;
            this.tonerLevelMagenta = 100;
            this.tonerLevelYellow = 100;
            this.isColor = true;
            this.isDuplex = true;
            this.type = "Laser";
            this.printedPages = 0;
        } else {
            this.manufacturer = "HP";
            this.model = "IQ0";
            this.tonerLevelBlack = 100;
            this.tonerLevelBlue = 0;
            this.tonerLevelMagenta = 0;
            this.tonerLevelYellow = 0;
            this.isColor = false;
            this.isDuplex = true;
            this.type = "Ink";
            this.printedPages = 0;
        }
    }

    public void print(int pages, String color, boolean isDuplex) {
        int genericTonerLevel = 0;
        if (isColor == true) {
            switch (color.toLowerCase()) {
                case "black":
                    genericTonerLevel = getTonerLevelBlack();
                    setTonerLevelBlack(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                    break;
                case "blue":
                    genericTonerLevel = getTonerLevelBlue();
                    setTonerLevelBlue(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                    break;
                case "magenta":
                    genericTonerLevel = getTonerLevelMagenta();
                    setTonerLevelMagenta(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                    break;
                case "yellow":
                    genericTonerLevel = getTonerLevelYellow();
                    setTonerLevelYellow(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                    break;
                default:
                    System.out.println("Such color is not supported by this printer.");
            }
        } else {
            switch (color.toLowerCase()) {
                case "black":
                    genericTonerLevel = getTonerLevelBlack();
                    setTonerLevelBlack(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                    break;
                default:
                    System.out.println("Such color is not supported by this printer.");
            }
        }
    }

    private int printGenericColorPages(int pages, boolean isDuplex, int genericTonerLevel) {
        if (genericTonerLevel == 0) {
            tonerIsEmpty();
            return 0;
        } else {
            int thisTimePrintedPages = 0;
            this.printedPages = getPrintedPages();
            while (pages != 0) {
                thisTimePrintedPages++;
                genericTonerLevel--;
                pages--;
                if (genericTonerLevel == 0) {
                    tonerIsEmpty();
                    break;
                }
                if (pages == 0) {
                    break;
                }
            }
            this.printedPages += countPrintedPages(isDuplex, thisTimePrintedPages);
        }
        return genericTonerLevel;
    }

    //Maximum toner level will be 100 which equals to 100 pages it can print
    public void fillUp(int tonerVolume, String color) {
        int genericTonerLevel = 0;
        if (isColor == true) {
            switch (color.toLowerCase()) {
                case "black":
                    genericTonerLevel = getTonerLevelBlack();
                    setTonerLevelBlack(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                    break;
                case "blue":
                    genericTonerLevel = getTonerLevelBlue();
                    setTonerLevelBlue(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                    break;
                case "magenta":
                    genericTonerLevel = getTonerLevelMagenta();
                    setTonerLevelMagenta(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                    break;
                case "yellow":
                    genericTonerLevel = getTonerLevelYellow();
                    setTonerLevelYellow(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                    break;
                default:
                    System.out.println("Such toner doesn't exist");
            }
        } else {
            switch (color.toLowerCase()) {
                case "black":
                    genericTonerLevel = getTonerLevelBlack();
                    setTonerLevelBlack(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                    break;
                default:
                    System.out.println("This printer supports only black toner");
            }
        }
    }

    private int fillUpGenericColorToner(int tonerVolume, int genericTonerLevel) {
        if (genericTonerLevel + tonerVolume <= 100) {
            genericTonerLevel += tonerVolume;
            if (genericTonerLevel == 100) {
                System.out.println("Toner is full.");
            }
            return genericTonerLevel;
        } else {
            genericTonerLevel = 100;
            System.out.println("Toner is already full. You provided too much.");
            return genericTonerLevel;
        }
    }

    private void tonerIsEmpty() {
        System.out.println("Sorry, this toner is empty. Fill it up to print.");
    }

    //If pages are printed as duplex we need to count 2 pages as 1 printed page
    private int countPrintedPages(boolean isDuplex, int pages) {
        if (isDuplex == true) {
            if (pages % 2 == 1) {
                pages++;
                this.printedPages += pages / 2;
                return this.printedPages;
            } else {
                this.printedPages += pages / 2;
                return this.printedPages;
            }
        } else {
            this.printedPages += pages;
            return this.printedPages;
        }
    }

    public static void main(String[] args) {
        Printer pr = new Printer(true);
        System.out.println("================Start level of toners.================");
        System.out.println("Black toner level: " + pr.getTonerLevelBlack());
        System.out.println("Blue toner level: " + pr.getTonerLevelBlue());
        System.out.println("Magenta toner level: " + pr.getTonerLevelMagenta());
        System.out.println("Yellow toner level: " + pr.getTonerLevelYellow());
        System.out.println("================Level of toners after printing.================");
        pr.print(10, "magenta", false);
        System.out.println("Printed pages: " + pr.getPrintedPages());
        System.out.println("Black toner level: " + pr.getTonerLevelBlack());
        System.out.println("Blue toner level: " + pr.getTonerLevelBlue());
        System.out.println("Magenta toner level: " + pr.getTonerLevelMagenta());
        System.out.println("Yellow toner level: " + pr.getTonerLevelYellow());
        System.out.println("================Level of toners after filling up.================");
        pr.fillUp(1, "magenta");
        System.out.println("Printed pages: " + pr.getPrintedPages());
        System.out.println("Black toner level: " + pr.getTonerLevelBlack());
        System.out.println("Blue toner level: " + pr.getTonerLevelBlue());
        System.out.println("Magenta toner level: " + pr.getTonerLevelMagenta());
        System.out.println("Yellow toner level: " + pr.getTonerLevelYellow());
    }
}
