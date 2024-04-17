package com.withings.location.repository.ws.model;

import kotlin.Metadata;
/* compiled from: GpsLocationSerializer.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0002\u001a\u0016\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\u0007"}, d2 = {"reduceDecimal", "", "", "reduceGpsDecimal", "round", "decimal", "", "android_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GpsLocationSerializerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final double reduceDecimal(float f11) {
        return round(f11, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double reduceGpsDecimal(double d11) {
        return round(d11, 6);
    }

    private static final double round(double d11, int i11) {
        return Math.pow(10.0d, -i11) * Math.rint(Math.pow(10.0d, i11) * d11);
    }

    static /* synthetic */ double round$default(double d11, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return round(d11, i11);
    }
}
