class Main
{
    private static Document[] tiposDocumentos = {
            new PDFDocument(),
            new HTMLDocument(),
            new UnknownDocument()
    };

    public static void main(String[] args)
    {
        for (Document documento : tiposDocumentos) {
            documento.print();
        }
    }
}

interface Document {
    void print();
}

class PDFDocument implements Document {
    public void print() {
        System.out.println("Printing PDF");
    }
}

class HTMLDocument implements Document {
    public void print() {
        System.out.println("Printing HTML");
    }
}

class UnknownDocument implements Document {
    public void print() {
        System.out.println("Unknown format");
    }
}