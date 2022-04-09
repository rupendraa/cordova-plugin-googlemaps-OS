package plugin.google.maps;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Polygon;

import org.json.JSONObject;

import java.util.ArrayList;

public class MetaPolygon  {
    Polygon polygon;
    private String id;
    LatLngBounds bounds;
    ArrayList<LatLng> path;
    ArrayList<ArrayList<LatLng>> holePaths;
    JSONObject properties;
    boolean isClickable = true;
    boolean isVisible = true;

    public MetaPolygon(String id) {
        this.id = id;
    }
    public String getId() {
        return this.id;
    }

}
