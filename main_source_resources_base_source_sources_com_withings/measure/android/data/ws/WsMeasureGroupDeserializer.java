package com.withings.measure.android.data.ws;

import com.google.gson.JsonDeserializer;
import com.withings.learnmore.adapter.LearnMoreManager;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import my.e;
/* compiled from: JsonConverters.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/withings/measure/android/data/ws/WsMeasureGroupDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Lmy/e;", "Lcom/google/gson/JsonObject;", LearnMoreManager.KEY_LEARN_MORE_JSON, "Lmy/e$a;", "deserializeWsMeasure", "(Lcom/google/gson/JsonObject;)Lmy/e$a;", "Lcom/google/gson/JsonElement;", "Ljava/lang/reflect/Type;", "typeOfT", "Lcom/google/gson/JsonDeserializationContext;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "deserialize", "(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Lmy/e;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class WsMeasureGroupDeserializer implements JsonDeserializer<e> {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final my.e.a deserializeWsMeasure(com.google.gson.JsonObject r12) {
        /*
            r11 = this;
            java.lang.String r0 = "type"
            com.google.gson.JsonElement r0 = r12.get(r0)
            int r2 = r0.getAsInt()
            java.lang.String r0 = "unit"
            com.google.gson.JsonElement r0 = r12.get(r0)
            int r3 = r0.getAsInt()
            java.lang.String r0 = "value"
            com.google.gson.JsonElement r0 = r12.get(r0)
            double r4 = r0.getAsDouble()
            java.lang.String r0 = "algo"
            com.google.gson.JsonElement r0 = r12.get(r0)
            r1 = 0
            if (r0 == 0) goto L3b
            boolean r6 = r0.isJsonNull()
            if (r6 != 0) goto L2e
            goto L2f
        L2e:
            r0 = r1
        L2f:
            if (r0 == 0) goto L3b
            int r0 = r0.getAsInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6 = r0
            goto L3c
        L3b:
            r6 = r1
        L3c:
            java.lang.String r0 = "appliver"
            com.google.gson.JsonElement r0 = r12.get(r0)
            if (r0 == 0) goto L58
            boolean r7 = r0.isJsonNull()
            if (r7 != 0) goto L4b
            goto L4c
        L4b:
            r0 = r1
        L4c:
            if (r0 == 0) goto L58
            int r0 = r0.getAsInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7 = r0
            goto L59
        L58:
            r7 = r1
        L59:
            java.lang.String r0 = "apppfmid"
            com.google.gson.JsonElement r0 = r12.get(r0)
            if (r0 == 0) goto L75
            boolean r8 = r0.isJsonNull()
            if (r8 != 0) goto L68
            goto L69
        L68:
            r0 = r1
        L69:
            if (r0 == 0) goto L75
            int r0 = r0.getAsInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r8 = r0
            goto L76
        L75:
            r8 = r1
        L76:
            java.lang.String r0 = "position"
            com.google.gson.JsonElement r0 = r12.get(r0)
            if (r0 == 0) goto L92
            boolean r9 = r0.isJsonNull()
            if (r9 != 0) goto L85
            goto L86
        L85:
            r0 = r1
        L86:
            if (r0 == 0) goto L92
            int r0 = r0.getAsInt()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r9 = r0
            goto L93
        L92:
            r9 = r1
        L93:
            java.lang.String r0 = "algo_params"
            com.google.gson.JsonElement r12 = r12.get(r0)
            if (r12 == 0) goto Lab
            boolean r0 = r12.isJsonNull()
            if (r0 != 0) goto La2
            goto La3
        La2:
            r12 = r1
        La3:
            if (r12 == 0) goto Lab
            java.lang.String r12 = r12.toString()
            r10 = r12
            goto Lac
        Lab:
            r10 = r1
        Lac:
            my.e$a r12 = new my.e$a
            r1 = r12
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.measure.android.data.ws.WsMeasureGroupDeserializer.deserializeWsMeasure(com.google.gson.JsonObject):my.e$a");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[LOOP:0: B:19:0x0091->B:21:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public my.e deserialize(com.google.gson.JsonElement r20, java.lang.reflect.Type r21, com.google.gson.JsonDeserializationContext r22) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.measure.android.data.ws.WsMeasureGroupDeserializer.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):my.e");
    }
}
