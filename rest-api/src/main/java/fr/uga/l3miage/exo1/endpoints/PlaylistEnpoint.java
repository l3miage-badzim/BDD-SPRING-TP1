package fr.uga.l3miage.exo1.endpoints;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name="Gestion playlist", description = "Tous les endpoinds de gestion d'une playlist")
@RestController
@RequestMapping("/api/playlist")
public interface PlaylistEnpoint {
    //PlaylistResponseDTO addSongInPlaylist(@PathVariable(name = "idPlaylist")String idPlaylist, @RequestParam String idSong);
}
