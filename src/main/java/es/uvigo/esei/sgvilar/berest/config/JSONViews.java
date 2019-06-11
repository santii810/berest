package es.uvigo.esei.sgvilar.berest.config;

import lombok.experimental.UtilityClass;

@UtilityClass
public class JSONViews {
    public interface ServerAndServicesView extends ServerView, TypeView {
    }

    public interface PredictionRequestsView {
    }

    public interface UsersFullView extends UsersView {
    }

    public interface UsersView {
    }

    public interface PredictionView extends ServerView, TypeView, UsersView {
    }

    public interface ServerView {
    }

    public interface TypeView {
    }

//    public interface Complete extends ServerAndServicesView {]
}
