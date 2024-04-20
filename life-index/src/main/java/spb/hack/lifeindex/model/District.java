package spb.hack.lifeindex.model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;

@Data
public class District {
    private String name;
    private Long id;
    private ArrayList<District> neighbors;

    public District(String name, Long id) {
        this.name = name;
        this.id = id;
        ArrayList<District> neighbors = new ArrayList<>();
        // beginner binning, for districts that needs to be binned
        // for now just null
        // TODO: add binning instead of null
        this.neighbors = null;
    }
}
