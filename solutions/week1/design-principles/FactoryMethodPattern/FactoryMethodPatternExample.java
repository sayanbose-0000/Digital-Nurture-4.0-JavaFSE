interface Document {
  void type();
}

abstract class WordDocument implements Document {}
abstract class PdfDocument implements Document {}
abstract class ExcelDocument implements Document {}

class WordDocumentConcrete extends WordDocument {
  @Override
  public void type() {
    System.out.println("This is a word document");
  }
}

class PdfDocumentConcrete extends PdfDocument {
  @Override
  public void type() {
    System.out.println("This is a Pdf document");
  }
}

class ExcelDocumentConcrete extends ExcelDocument {
  @Override
  public void type() {
    System.out.println("This is an Excel document");
  }
}

abstract class DocumentFactory {
  abstract Document createDocument();
}

class WordDocumentConcreteFactory extends DocumentFactory {
  @Override
  WordDocument createDocument() {
    System.out.println("Word Document Concrete");
    return new WordDocumentConcrete();
  }
}

class PdfDocumentConcreteFactory extends DocumentFactory {
  @Override
  PdfDocument createDocument() {
    System.out.println("Pdf Document Concrete");
    return new PdfDocumentConcrete();
  }
}

class ExcelDocumentConcreteFactory extends DocumentFactory {
  @Override
  ExcelDocument createDocument() {
    System.out.println("Excel Document Concrete");
    return new ExcelDocumentConcrete();
  }
}

class TestMain {
  public static void main(String[] args) {
    DocumentFactory wordFactory = new WordDocumentConcreteFactory();
    WordDocument wd = (WordDocument) wordFactory.createDocument();
    wd.type();

    DocumentFactory pdfFactory = new PdfDocumentConcreteFactory();
    PdfDocument pd = (PdfDocument) pdfFactory.createDocument();
    pd.type();

    DocumentFactory excelFactory = new ExcelDocumentConcreteFactory();
    ExcelDocument ed =(ExcelDocument) excelFactory.createDocument();
    ed.type();
  }
}

// Output
// ======

// User@bose /c/sayan/Digital-Nurture-4.0-JavaFSE/solutions/week1/FactoryMethodPattern
// $ javac FactoryMethodPatternExample.java 
// User@bose /c/sayan/Digital-Nurture-4.0-JavaFSE/solutions/week1/FactoryMethodPattern
// $ java TestMain
// Word Document Concrete
// This is a word document
// Pdf Document Concrete
// This is a Pdf document
// Excel Document Concrete
// This is an Excel document
