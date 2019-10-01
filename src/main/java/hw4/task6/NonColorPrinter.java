package hw4.task6;

public class NonColorPrinter extends Printer {
    public NonColorPrinter(String manufacturer, String model, int tonerLevelBlack, int tonerLevelBlue, int tonerLevelMagenta, int tonerLevelYellow) {
        super(manufacturer, model, tonerLevelBlack, tonerLevelBlue, tonerLevelMagenta, tonerLevelYellow);
    }

    @Override
    public void print(int pages, String color, boolean isDuplex) {
        switch (color.toLowerCase()) {
            case "black":
                int genericTonerLevel = getTonerLevelBlack();
                setTonerLevelBlack(printGenericColorPages(pages, isDuplex, genericTonerLevel));
                break;
            default:
                System.out.println("Such color is not supported by this printer.");
        }
    }

    @Override
    public void fillUp(int tonerVolume, String color) {
        switch (color.toLowerCase()) {
            case "black":
                int genericTonerLevel = getTonerLevelBlack();
                setTonerLevelBlack(fillUpGenericColorToner(tonerVolume, genericTonerLevel));
                break;
            default:
                System.out.println("This printer supports only black toner");
        }
    }

    public static void main(String[] args) {
        NonColorPrinter myNonColorPrinter = new NonColorPrinter("HP", "Q3000", 100, 100, 100, 100);
        System.out.println(myNonColorPrinter);
        myNonColorPrinter.print(10, "black", true);
        System.out.println(myNonColorPrinter);
        myNonColorPrinter.fillUp(5, "black");
        System.out.println(myNonColorPrinter);
    }
}


