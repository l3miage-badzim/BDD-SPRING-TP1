package fr.uga.l3miage.exo1.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.Duration;

@Data
@Schema(description = "Représente un son")
public class SongResponseDTO {

    @Schema(description = "Title du son")
    private String title;

    @Schema(description = "Durée du son")
    private Duration duration;

    @Schema(description = "Album lié à ce son")
    private AlbumResponseDTO albumEntity;

    @Schema(description = "Artiste qui a crée ce son")
    private ArtisteResponseDTO artisteEntity;

}
