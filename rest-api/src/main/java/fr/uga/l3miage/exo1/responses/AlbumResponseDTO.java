package fr.uga.l3miage.exo1.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;
import java.util.Set;

@Data
@Schema(description = "La representation d'un album")
public class AlbumResponseDTO {
    @Schema(description = "Le title de l'album")
    private String title;
    @Schema(description = "L'année de sortie de l'album")
    private Date releaseYear;

    @Schema(description = "La liste des sons de l'album")
    private final Set<SongResponseDTO> songEntities;
    @Schema(description = "L'artiste qui a crée l'album")
    private ArtisteResponseDTO artisteEntity;
}
