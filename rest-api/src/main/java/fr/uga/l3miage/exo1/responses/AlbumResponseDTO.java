package fr.uga.l3miage.exo1.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Date;

@Data
@Schema(description = "Représente un album")
public class AlbumResponseDTO {

    @Schema(description = "Titre de l'album")
    private String title;

    @Schema(description = "Année de sortie de l'album")
    private Date releaseYear;

    @Schema(description = "Artiste qui a crée cet album")
    private ArtisteResponseDTO artisteEntity;
}
