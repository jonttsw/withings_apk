package com.withings.webservices.legacy.withings.model;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
/* loaded from: classes4.dex */
public class ImagesP4Deserializer implements JsonDeserializer<ImagesP4> {
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.JsonDeserializer
    public ImagesP4 deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) throws JsonParseException {
        ImagesP4 imagesP4 = new ImagesP4();
        if (jsonElement.isJsonObject()) {
            imagesP4.image32 = v1.r0(jsonElement, "32x32", null);
            imagesP4.image64 = v1.r0(jsonElement, "64x64", null);
            imagesP4.image128 = v1.r0(jsonElement, "128x128", null);
            imagesP4.image256 = v1.r0(jsonElement, "256x256", null);
            imagesP4.image512 = v1.r0(jsonElement, "512x512", null);
        }
        return imagesP4;
    }
}
