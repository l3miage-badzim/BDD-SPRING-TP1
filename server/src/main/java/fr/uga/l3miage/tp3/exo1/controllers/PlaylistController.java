package fr.uga.l3miage.tp3.exo1.controllers;

import fr.uga.l3miage.exo1.endpoints.PlaylistEnpoint;
import fr.uga.l3miage.tp3.exo1.services.PlaylistService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class PlaylistController implements PlaylistEnpoint {
    private final PlaylistService playlistService;
}