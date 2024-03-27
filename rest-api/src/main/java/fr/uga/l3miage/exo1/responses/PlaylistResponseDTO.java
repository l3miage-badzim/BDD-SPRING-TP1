package fr.uga.l3miage.exo1.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.Duration;
import java.util.Set;

@Data
@Schema(description = "Représente une playlist")
public class PlaylistResponseDTO {

    @Schema(description = "nom de la playlist")
    private String name;

    @Schema(description = "description de la playlist")
    private String description;

    @Schema(description = "durée totale de la playlist")
    private Duration totalDuration;

    @Schema(description = "La liste des sons dans la playlist")
    private Set<SongResponseDTO> songEntities;
}
