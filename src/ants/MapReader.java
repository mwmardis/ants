package ants;

import java.io.File;
import java.io.IOException;

import ants.enums.Terrain;

public class MapReader {

    public Terrain[][] readMap(String fileName) throws IOException {
        return this.readMap(new File(fileName));
    }

    public Terrain[][] readMap(File file) {
        // YOUR CODE HERE
        return null;
    }


}
