package fr.uga.l3miage.exo1.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.Duration;

@Data
@Schema(description = "La representation d'un son")
public class SongResponseDTO {
    @Schema(description = "Le titre du son")
    private String title;
    @Schema(description = "La durée du son")
    private Duration duration;
    @Schema(description = "L'album lié à ce son")
    private AlbumResponseDTO albumEntity;
    @Schema(description = "L'artiste qui a crée la chanson")
    private ArtisteResponseDTO artisteEntity;
}
