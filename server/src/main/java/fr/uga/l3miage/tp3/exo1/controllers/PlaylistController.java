package fr.uga.l3miage.tp3.exo1.controllers;

import fr.uga.l3miage.exo1.endpoints.PlaylistEnpoint;
import fr.uga.l3miage.exo1.responses.PlaylistResponseDTO;
import fr.uga.l3miage.tp3.exo1.services.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PlaylistController implements PlaylistEnpoint {
    private final PlaylistService playlistService;

    @Override
    public PlaylistResponseDTO getPlaylist(String name) {
        return playlistService.getPlaylist(name);
    }

    @Override
    public PlaylistResponseDTO addSongInPlaylist(String idPlaylist, String idSong) {
        return playlistService.addSongInPlaylist(idPlaylist, idSong);
    }
}
