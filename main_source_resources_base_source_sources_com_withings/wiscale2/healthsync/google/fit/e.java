package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.fitness.data.DataPoint;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: GoogleFitMapping.kt */
/* loaded from: classes5.dex */
final class e extends w implements ym0.l<DataPoint, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f56443a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(DataPoint dataPoint) {
        DataPoint it = dataPoint;
        u.j(it, "it");
        String appPackageName = it.getOriginalDataSource().getAppPackageName();
        boolean z5 = false;
        if (appPackageName != null) {
            z5 = dp0.j.R(appPackageName, "com.withings", false);
        }
        return Boolean.valueOf(z5);
    }
}
