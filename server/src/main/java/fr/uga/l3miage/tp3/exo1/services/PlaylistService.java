package fr.uga.l3miage.tp3.exo1.services;

import fr.uga.l3miage.exo1.responses.PlaylistResponseDTO;
import fr.uga.l3miage.tp3.exo1.components.PlaylistComponent;
import fr.uga.l3miage.tp3.exo1.components.SongComponent;
import fr.uga.l3miage.tp3.exo1.exceptions.rest.AddingSongRestException;
import fr.uga.l3miage.tp3.exo1.exceptions.technicals.NotFoundPlaylistEntityException;
import fr.uga.l3miage.tp3.exo1.exceptions.technicals.NotFoundSongEntityException;
import fr.uga.l3miage.tp3.exo1.mappers.PlaylistMapper;
import fr.uga.l3miage.tp3.exo1.models.PlaylistEntity;
import fr.uga.l3miage.tp3.exo1.models.SongEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PlaylistService {
    private final PlaylistComponent playlistComponent;
    private final SongComponent songComponent;
    private final PlaylistMapper playlistMapper;

    public PlaylistResponseDTO addSongInPlaylist(String idPlaylist, String idSong)  {
        try {
            SongEntity songEntity = songComponent.getSongEntityById(idSong);
            PlaylistEntity playlistEntity = playlistComponent.addSong(idPlaylist, songEntity);
            return playlistMapper.toResponse(playlistEntity);
        } catch (NotFoundSongEntityException | NotFoundPlaylistEntityException e) {
            throw new AddingSongRestException(e.getMessage());
        }
    }

        public PlaylistResponseDTO getPlaylist(String name){
            try {
                return playlistMapper.toResponse(playlistComponent.getPlaylist(name));
            }
            catch (NotFoundPlaylistEntityException e) {
                throw new NotFoundPlaylistEntityException(e.getMessage());
            }
        }


}
