package es.uvigo.esei.sgvilar.berest.services;

import es.uvigo.esei.sgvilar.berest.entities.DocumentEntity;
import es.uvigo.esei.sgvilar.berest.entities.DocumentProviderEntity;
import es.uvigo.esei.sgvilar.berest.repositories.DocumentProviderRepository;
import es.uvigo.esei.sgvilar.berest.repositories.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DocumentService {
    @Autowired
    private DocumentRepository documentRepository;
    @Autowired
    private DocumentProviderRepository documentProviderRepository;


    public DocumentEntity save(DocumentEntity document) {
        return documentRepository.save(document);
    }

    public Iterable<DocumentEntity> saveNotExistents(List<DocumentEntity> documents) {
        List<DocumentEntity> savedDocuments = new ArrayList<>();
        for (DocumentEntity doc : documents) {
            if (!documentRepository.existsByExternalId(doc.getExternalId())) {

                if (doc.getDocumentProvider().getId() == null) {
                    String providerName = doc.getDocumentProvider().getName();
                    DocumentProviderEntity documentProvider = documentProviderRepository.getByName(providerName);
                    doc.setDocumentProvider(documentProvider);
                    System.out.println(documentProvider.getId());
                } else {
                    savedDocuments.add(documentRepository.save(doc));
                }
            }
        }
        return savedDocuments;
    }

}
