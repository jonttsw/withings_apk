package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.fitness.data.DataPoint;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: GoogleFitMapping.kt */
/* loaded from: classes5.dex */
final class d extends w implements ym0.l<DataPoint, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final d f56442a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(DataPoint dataPoint) {
        DataPoint it = dataPoint;
        u.j(it, "it");
        String appPackageName = it.getDataSource().getAppPackageName();
        boolean z5 = false;
        if (appPackageName != null) {
            z5 = dp0.j.R(appPackageName, "com.withings", false);
        }
        return Boolean.valueOf(z5);
    }
}
