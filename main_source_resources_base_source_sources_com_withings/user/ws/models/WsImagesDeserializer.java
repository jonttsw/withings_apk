package com.withings.user.ws.models;

import androidx.camera.camera2.internal.v1;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.withings.user.core.models.WsImages;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: WsImagesDeserializer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/user/ws/models/WsImagesDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lcom/withings/user/core/models/WsImages;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsImagesDeserializer implements JsonDeserializer<WsImages> {
    @Override // com.google.gson.JsonDeserializer
    public final WsImages deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
        u.j(json, "json");
        u.j(typeOfT, "typeOfT");
        u.j(context, "context");
        if (!json.isJsonObject()) {
            return null;
        }
        return new WsImages(v1.r0(json, "32x32", null), v1.r0(json, "64x64", null), v1.r0(json, "128x128", null), v1.r0(json, "256x256", null), v1.r0(json, "512x512", null));
    }
}
