package hw4.task6;

public class ColorPrinter extends Printer {
    public ColorPrinter(String manufacturer, String model, int tonerLevelBlack, int tonerLevelBlue, int tonerLevelMagenta, int tonerLevelYellow) {
        super(manufacturer, model, tonerLevelBlack, tonerLevelBlue, tonerLevelMagenta, tonerLevelYellow);
    }

    @Override
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

    @Override
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

    public static void main(String[] args) {
        ColorPrinter myColorPrinter = new ColorPrinter("HP", "Q3000", 100, 100, 100, 100);
        System.out.println(myColorPrinter);
        myColorPrinter.print(10, Color.MAGENTA, true);
        System.out.println(myColorPrinter);
        myColorPrinter.fillUp(5, Color.MAGENTA);
        System.out.println(myColorPrinter);
    }
}
