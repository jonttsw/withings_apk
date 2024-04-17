package com.withings.vasistas.ws;

import com.google.gson.JsonArray;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.Metadata;
/* compiled from: WsVasistasSerializer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/google/gson/JsonArray;", "", "float", "Lnm0/y;", "addTruncatedFloat", "(Lcom/google/gson/JsonArray;F)V", "core-data-vasistas_release"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsVasistasSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void addTruncatedFloat(JsonArray jsonArray, float f11) {
        jsonArray.add(Float.valueOf(new BigDecimal(String.valueOf(f11)).setScale(3, RoundingMode.UP).floatValue()));
    }
}
