package plugin.google.maps;

import com.google.android.gms.maps.model.TileOverlay;

import org.json.JSONObject;

public class MetaTileOverlay {
    private String id;
    JSONObject properties;
    TileOverlay tileOverlay;
    PluginTileProvider tileProvider;

    public MetaTileOverlay(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }
}
