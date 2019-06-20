package es.uvigo.esei.sgvilar.berest.services;


import es.uvigo.esei.sgvilar.berest.entities.DocumentEntity;
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


    public List<DocumentEntity> matchDocuments(List<DocumentEntity> documents) {
        List<DocumentEntity> toret = new ArrayList<>();
        for (DocumentEntity doc : documents) {
            toret.add(documentRepository.findByExternalId(doc.getExternalId()));
        }
        return toret;
    }
}
