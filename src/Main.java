public class Main {
    public static void main(String[] args) {
Printer printer = new Printer(25,true);
        System.out.println("initial page count = "+printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(5);
        System.out.println("pages printed was "+ pagesPrinted + " new total print count for "+printer.getPagesPrinted());
    pagesPrinted = printer.printPages(2);
        System.out.println("pages printed was "+ pagesPrinted + " new total print count for "+printer.getPagesPrinted());

    }
}
