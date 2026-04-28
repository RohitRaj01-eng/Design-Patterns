void main() {
    DocumentService proxyDocumentService=new ProxyDocumentService("System", Role.ADMIN);
    proxyDocumentService.read();
}
