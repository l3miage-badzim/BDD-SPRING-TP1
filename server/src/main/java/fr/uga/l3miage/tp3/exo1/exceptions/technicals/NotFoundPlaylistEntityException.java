package fr.uga.l3miage.tp3.exo1.exceptions.technicals;

public class NotFoundPlaylistEntityException extends Exception{
    public NotFoundPlaylistEntityException(String format) {
        super(format);
    }
}
