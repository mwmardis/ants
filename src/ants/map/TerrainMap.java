package ants.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TerrainMap implements GameMap {

    private Terrain[][] data;

    public TerrainMap (int numRows, int numCols) {
        this.data = new Terrain[numRows][numCols];
    }

    /* (non-Javadoc)
     * @see ants.map.GameMap#getItem(ants.map.Location)
     */
    @Override
    public MapItem getItem(Location loc) {
        // TODO: handle cases where row, col are negative, or exceed numRows/Cols
        int row = loc.getRow();
        int col = loc.getCol();

        return this.data[row][col];
    }

    /* (non-Javadoc)
     * @see ants.map.GameMap#getItems(java.util.List)
     */
    @Override
    public List<MapItem> getItems(List<Location> locs) {
        List<MapItem> results = new ArrayList<MapItem>(locs.size());
        for (int i = 0; i < locs.size(); i++) {
            results.add(getItem(locs.get(i)));
        }

        return results;
    }

    /* (non-Javadoc)
     * @see ants.map.GameMap#getItemsWithinBox(ants.map.Location, int)
     */
    @Override
    public Map<Location, MapItem> getItemsWithinBox(Location loc, int side) {
        Map<Location, MapItem> results = new HashMap<Location, MapItem>((int) Math.pow((side * 2) + 1, 2));
        int cr = loc.getRow();
        int cc = loc.getCol();

        int tlr = cr - side;
        int tlc = cc - side;

        for (int row = tlr; row <= cr + side; row++) {
            for (int col = tlc; col <= cc + side; col++) {
                Location current = new Location(row, col);
                // boolean inside = isLocationWithinRadius(current, radius)
                // if (inside) {
                //     add it
                // otherwise, don't add it
                MapItem item = getItem(current);
                results.put(current, item);
            }
        }

        return results;
    }

    /* (non-Javadoc)
     * @see ants.map.GameMap#getItemsWithinRadius(ants.map.Location, int)
     */
    @Override
    public Map<Location, MapItem> getItemsWithinRadius(Location loc, int radius) {
        // TODO Auto-generated method stub
        //        or (int row = tlr; row <= cr + side; row++) {
        //            for (int col = tlc; col <= cc + side; col++) {
        //                Location current = new Location(row, col);
        //                // boolean inside = isLocationWithinRadius(current, radius)
        //                // if (inside) {
        //                //     add it
        //                // otherwise, don't add it
        //                MapItem item = getItem(current);
        //                results.put(current, item);
        //            }
        //        }
        return null;
    }

}
