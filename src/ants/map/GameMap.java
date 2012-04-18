package ants.map;

import java.util.List;
import java.util.Map;

public interface GameMap {

    /**
     * @return the item at the given location.
     */
    public MapItem getItem(Location loc);

    /**
     * @return the list of items at the given locations.
     */
    public List<MapItem> getItems(List<Location> locs);

    /**
     * @param loc  the center location.
     * @param side half the length of a side of the bounding box.
     * @return a map of location to items.
     */
    public Map<Location, MapItem> getItemsWithinBox(Location loc,
                                                    int side);

    /**
     * @param loc    the center location.
     * @param radius the length of the encompassing radius. > 0
     * @return a map of location to items.
     */
    public Map<Location, MapItem> getItemsWithinRadius(Location loc,
                                                       int radius);

}
