package com.withings.notifications.ui;

import android.graphics.Bitmap;
import ha.a;
/* compiled from: NotificationUiMapper.kt */
/* loaded from: classes4.dex */
public final class r implements ja.c {
    @Override // ja.c
    public final String getCacheKey() {
        return "maxSizeTransformation";
    }

    @Override // ja.c
    public final Object transform(Bitmap bitmap, ha.e eVar, qm0.d<? super Bitmap> dVar) {
        ha.a d11 = eVar.d();
        if (d11 instanceof a.C1023a) {
            int i11 = ((a.C1023a) d11).f70335a;
            ha.a c11 = eVar.c();
            if (c11 instanceof a.C1023a) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i11, ((a.C1023a) c11).f70335a, true);
                kotlin.jvm.internal.u.i(createScaledBitmap, "createScaledBitmap(...)");
                return createScaledBitmap;
            }
            return bitmap;
        }
        return bitmap;
    }
}
