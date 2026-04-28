public class ProxyDocumentService implements DocumentService{
    private DocumentService realDocumentService;
    private final String documentName;
    private final Role role;


    public ProxyDocumentService(String documentName, Role role) {
        this.documentName=documentName;
        this.role=role;
    }

    @Override
    public void read() {
        if(role!=Role.ADMIN)throw new SecurityException("Access denied!");
        if(realDocumentService==null){
            realDocumentService=new RealDocumentService(documentName);
        }
        realDocumentService.read();
    }
}
