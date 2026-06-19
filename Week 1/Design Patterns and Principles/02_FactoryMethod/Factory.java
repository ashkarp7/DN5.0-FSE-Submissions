
interface  Document{
    void createDocument();
}

class WordDocument implements Document{
    public void createDocument(){
        System.out.println("Word Document created");
    }
}

class PdfDocument implements Document{
    public void createDocument(){
        System.out.println("Pdf Document created");
    }
}

class ExcelDocument implements Document{
    public void createDocument(){
        System.out.println("Excel Document created");
    }
}

class DocumentFactory{
    public Document getDocument(String s){
        if(s.equals("Word")){
            return new WordDocument();
        }
        else if(s.equals("Pdf")){
            return new PdfDocument();
        }
        else if(s.equals("Excel")){
            return new ExcelDocument();
        }
        else{
            return null;
        }
    }
}
class Main {
    public static void main(String[] args) {
        DocumentFactory f = new DocumentFactory();
        Document p = f.getDocument("Pdf");
        Document e = f.getDocument("Excel");
        Document w = f.getDocument("Word");
        p.createDocument();
        e.createDocument();
        w.createDocument();
    }
}
