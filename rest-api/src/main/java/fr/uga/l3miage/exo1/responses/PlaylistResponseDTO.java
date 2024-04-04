package fr.uga.l3miage.exo1.responses;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.time.Duration;
import java.util.Set;

@Data
@Schema(description = "La Représentation d'une playlist")
public class PlaylistResponseDTO {
    @Schema(description = "Le nom de la playlist")
    private String name;
    @Schema(description = "La description de la playlist")
    private String description;
    @Schema(description = "La durée total de la playlist")
    private Duration totalDuration;
    @Schema(description = "La liste des sons dans la playlist")
    private final Set<SongResponseDTO> songEntities;
}
