package com.withings.wiscale2.track.ws;

import com.google.gson.annotations.SerializedName;
import com.withings.manualLogging.data.webservice.healthAttribute.GetHealthAttributeResponse;
import com.withings.wiscale2.track.data.Track;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes5.dex */
public class GetTracksResponse {
    @SerializedName(GetHealthAttributeResponse.FIELD_HAS_MORE_NAME)
    public boolean hasMore;
    public int offset;
    @SerializedName("series")
    public List<Track> tracks = new ArrayList();
}
