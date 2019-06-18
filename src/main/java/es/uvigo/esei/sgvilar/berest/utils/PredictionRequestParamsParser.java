package es.uvigo.esei.sgvilar.berest.utils;

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
@Setter
public class PredictionRequestParamsParser {
    public Map<String, String> documents;
    public List<String> types;
    public String expired;
}
