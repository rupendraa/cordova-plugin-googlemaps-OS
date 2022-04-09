package plugin.google.maps;

import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

public class AsyncSetOptionsResult {
    int MAP_TYPE_ID;
    CameraPosition cameraPosition;
    LatLngBounds cameraBounds;
    double cameraPadding;
    String styles;
}
