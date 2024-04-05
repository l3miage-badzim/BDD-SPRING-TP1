package fr.uga.l3miage.exo1.endpoints;

import fr.uga.l3miage.exo1.errors.AddPlaylistErrorResponse;
import fr.uga.l3miage.exo1.requests.PlaylistCreationRequest;
import fr.uga.l3miage.exo1.responses.PlaylistResponseDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Tag(name="Gestion playlist", description = "Tous les endpoinds de gestion d'une playlist")
@RestController
@RequestMapping("/api/playlist")
public interface PlaylistEnpoint {

    @Operation(description = "ajouter un son a une playlist")
    @PatchMapping("/{idPlaylist}/add") // exemple d'appel /api/playlist/1/add?idSong=monSong ici idPlaylist = 1 && idSong = "monSong"
    @ApiResponse(responseCode = "200", description = "Le son à été ajouté à la playlist")
    @ApiResponse(responseCode = "404", description = "la playlist ou le son demandée n'a pas été trouvé",content = @Content(schema = @Schema(implementation = AddPlaylistErrorResponse.class),mediaType = MediaType.APPLICATION_JSON_VALUE))
    @ResponseStatus(HttpStatus.OK)
    PlaylistResponseDTO addSongInPlaylist(@PathVariable(name = "idPlaylist")String idPlaylist, @RequestParam String idSong);

    @Operation(description = "Récuperer une playlist")
    @GetMapping("/{idPlaylist}")
    @ApiResponse(responseCode = "200", description = "Le son à été trouvé")
    @ResponseStatus(HttpStatus.OK)
    PlaylistResponseDTO getPlaylist(@PathVariable(name = "idPlaylist")String idPlaylist);

    @Operation(description = "Création d'une playlist")
    @ApiResponse(responseCode = "201",description = "La Playlist à bien été créé")
    @ApiResponse(responseCode = "400",description = "La Playlist n'à pas bien été créé")
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/create")
    PlaylistResponseDTO createPlaylist(@RequestBody PlaylistCreationRequest playlistCreationRequest);
}
