package Bridge_2;

public class Program {
    public static void main(String[] args) {
        Renderer mobile = new MobileRenderer();
        Renderer desktop = new DesktopRenderer();

        Document pdfMobile = new PDFDocument(mobile);
        Document wordDesktop = new WordDocument(desktop);
        Document markdownMobile = new MarkdownDocument(mobile);
        Document pdfDesktop = new PDFDocument(desktop);

        pdfMobile.display();         // Hiển thị PDF trên Mobile
        wordDesktop.display();       // Hiển thị Word trên Desktop
        markdownMobile.display();    // Hiển thị Markdown trên Mobile
        pdfDesktop.display();        // Hiển thị PDF trên Desktop
    }
}
