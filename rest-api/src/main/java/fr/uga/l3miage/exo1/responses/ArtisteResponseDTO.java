package fr.uga.l3miage.exo1.responses;

import fr.uga.l3miage.exo1.enums.GenreMusical;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.Set;

@Data
@Schema(description = "La représentation d'un artiste")
public class ArtisteResponseDTO {
    @Schema(description = "Le nom de l'artiste")
    private String name;
    @Schema(description = "La biography de l'artiste")
    private String biography;
    @Schema(description = "Le genre musical de l'album")
    private GenreMusical genreMusical;
    @Schema(description = "La liste des albums de l'artiste")
    private final Set<AlbumResponseDTO> albumEntities;
}
