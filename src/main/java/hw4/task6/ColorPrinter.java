package hw4.task6;

public class ColorPrinter extends Printer {
    public ColorPrinter(String manufacturer, String model, int tonerLevelBlack, int tonerLevelBlue, int tonerLevelMagenta, int tonerLevelYellow) {
        super(manufacturer, model, tonerLevelBlack, tonerLevelBlue, tonerLevelMagenta, tonerLevelYellow);
    }

    @Override
    public void print(int pages, String color, boolean isDuplex) {
        int genericTonerLevel = 0;
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
    }

    @Override
    public void fillUp(int tonerVolume, String color) {
        int genericTonerLevel = 0;
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
    }

    public static void main(String[] args) {
        ColorPrinter myColorPrinter = new ColorPrinter("HP", "Q3000", 100, 100, 100, 100);
        System.out.println(myColorPrinter);
        myColorPrinter.print(10, "black", true);
        System.out.println(myColorPrinter);
        myColorPrinter.fillUp(5, "black");
        System.out.println(myColorPrinter);
    }
}
