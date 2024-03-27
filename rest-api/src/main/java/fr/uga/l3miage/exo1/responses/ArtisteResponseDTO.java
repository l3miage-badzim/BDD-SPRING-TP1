package fr.uga.l3miage.exo1.responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
@Schema(description = "Représente un Artiste")
public class ArtisteResponseDTO {

    private String name;

    private String biography;

    @Schema(description = "Genre musical de l'artiste")
    private String genreMusical;
}
