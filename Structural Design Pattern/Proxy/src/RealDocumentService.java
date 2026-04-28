public class RealDocumentService implements DocumentService{
    private final String documentName;

    public RealDocumentService(String documentName) {
        if (documentName == null || documentName.isBlank()) {
            throw new IllegalArgumentException("There is no document name provided");
        }
        this.documentName = documentName;
    }

    @Override
    public void read() {
        System.out.println(this.documentName + " is being read");
    }
}
