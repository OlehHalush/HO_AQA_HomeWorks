package hw4.task6;

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
    public Printer(String manufacturer, String model, int tonerLevelBlack, int tonerLevelBlue, int tonerLevelMagenta, int tonerLevelYellow) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.tonerLevelBlack = tonerLevelBlack;
        this.tonerLevelBlue = tonerLevelBlue;
        this.tonerLevelMagenta = tonerLevelMagenta;
        this.tonerLevelYellow = tonerLevelYellow;
        this.printedPages = 0;
    }

    public void print(int pages, Color color, boolean isDuplex) {
        int genericTonerLevel = 0;
        switch (color) {
            case BLACK:
                genericTonerLevel = getTonerLevelBlack();
                setTonerLevelBlack(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                break;
            case BLUE:
                genericTonerLevel = getTonerLevelBlue();
                setTonerLevelBlue(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                break;
            case MAGENTA:
                genericTonerLevel = getTonerLevelMagenta();
                setTonerLevelMagenta(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                break;
            case YELLOW:
                genericTonerLevel = getTonerLevelYellow();
                setTonerLevelYellow(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                break;
            default:
                System.out.println("Such color is not supported by this printer.");
        }
    }

    protected int printGenericColorPages(int pages, boolean isDuplex, int genericTonerLevel) {
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
    public void fillUp(int tonerVolume, Color color) {
        int genericTonerLevel = 0;
        switch (color) {
            case BLACK:
                genericTonerLevel = getTonerLevelBlack();
                setTonerLevelBlack(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                break;
            case BLUE:
                genericTonerLevel = getTonerLevelBlue();
                setTonerLevelBlue(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                break;
            case MAGENTA:
                genericTonerLevel = getTonerLevelMagenta();
                setTonerLevelMagenta(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                break;
            case YELLOW:
                genericTonerLevel = getTonerLevelYellow();
                setTonerLevelYellow(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                break;
            default:
                System.out.println("Such toner doesn't exist");

        }
    }

    protected int fillUpGenericColorToner(int tonerVolume, int genericTonerLevel) {
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

    @Override
    public String toString() {
        return "Printer{" +
                "tonerLevelBlack=" + tonerLevelBlack +
                ", tonerLevelMagenta=" + tonerLevelMagenta +
                ", tonerLevelYellow=" + tonerLevelYellow +
                ", tonerLevelBlue=" + tonerLevelBlue +
                ", printedPages=" + printedPages +
                '}';
    }

    public static void main(String[] args) {
        Printer myPrinter = new Printer("HP", "Q3000", 100, 100, 100, 100);
        System.out.println(myPrinter);
        myPrinter.print(10, Color.YELLOW, true);
        System.out.println(myPrinter);
        myPrinter.fillUp(5, Color.YELLOW);
        System.out.println(myPrinter);
    }
}
