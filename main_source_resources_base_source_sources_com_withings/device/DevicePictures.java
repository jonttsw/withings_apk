package com.withings.device;

import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
/* compiled from: DevicePictures.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0010\u0010\u000b\u001a\f\u0012\b\u0012\u00060\u001bR\u00020\u001c0\u001a¢\u0006\u0004\b\u0018\u0010\u001dJ\u001e\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ(\u0010\f\u001a\u00020\u00002\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017¨\u0006 "}, d2 = {"Lcom/withings/device/DevicePictures;", "Ljava/io/Serializable;", "", "", "component1", "()Ljava/util/Map;", "variant", "getUrl", "(Ljava/lang/String;)Ljava/lang/String;", "", "(I)Ljava/lang/String;", "pictures", "copy", "(Ljava/util/Map;)Lcom/withings/device/DevicePictures;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "<init>", "(Ljava/util/Map;)V", "", "Lcom/withings/device/ws/DeviceProperties$Picture;", "Lcom/withings/device/ws/DeviceProperties;", "(Ljava/util/List;)V", "Companion", "a", "device-legacy_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DevicePictures implements Serializable {
    private static final String BASE_URL = "https://p4.withings.com/";
    public static final a Companion = new Object();
    private final Map<String, String> pictures;

    /* compiled from: DevicePictures.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    public DevicePictures(Map<String, String> map) {
        this.pictures = map;
    }

    private final Map<String, String> component1() {
        return this.pictures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicePictures copy$default(DevicePictures devicePictures, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            map = devicePictures.pictures;
        }
        return devicePictures.copy(map);
    }

    public final DevicePictures copy(Map<String, String> map) {
        return new DevicePictures(map);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DevicePictures) && u.e(this.pictures, ((DevicePictures) obj).pictures)) {
            return true;
        }
        return false;
    }

    public final String getUrl(String variant) {
        String str;
        u.j(variant, "variant");
        Map<String, String> map = this.pictures;
        if (map == null || (str = map.get(variant)) == null) {
            return null;
        }
        return "https://p4.withings.com/".concat(str);
    }

    public int hashCode() {
        Map<String, String> map = this.pictures;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public String toString() {
        Map<String, String> map = this.pictures;
        return "DevicePictures(pictures=" + map + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DevicePictures(java.util.List<? extends com.withings.device.ws.DeviceProperties.Picture> r5) {
        /*
            r4 = this;
            java.lang.String r0 = "pictures"
            kotlin.jvm.internal.u.j(r5, r0)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r0 = 10
            int r0 = kotlin.collections.x.y(r5, r0)
            int r0 = kotlin.collections.s0.h(r0)
            r1 = 16
            if (r0 >= r1) goto L16
            r0 = r1
        L16:
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L1f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L40
            java.lang.Object r0 = r5.next()
            com.withings.device.ws.DeviceProperties$Picture r0 = (com.withings.device.ws.DeviceProperties.Picture) r0
            java.lang.String r2 = r0.variant
            java.lang.String r0 = r0.uri
            nm0.j r3 = new nm0.j
            r3.<init>(r2, r0)
            java.lang.Object r0 = r3.c()
            java.lang.Object r2 = r3.d()
            r1.put(r0, r2)
            goto L1f
        L40:
            r4.<init>(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.DevicePictures.<init>(java.util.List):void");
    }

    public final String getUrl(int i11) {
        String str;
        Map<String, String> map = this.pictures;
        if (map == null || (str = map.get(String.valueOf(i11))) == null) {
            return null;
        }
        return "https://p4.withings.com/".concat(str);
    }
}
