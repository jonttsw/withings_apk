package com.withings.wiscale2.healthsync.google.fit;

import com.google.android.gms.fitness.data.DataPoint;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
/* compiled from: SyncSleepWithFit.kt */
/* loaded from: classes5.dex */
final class f extends w implements ym0.l<DataPoint, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f56444a = new w(1);

    @Override // ym0.l
    public final Boolean invoke(DataPoint dataPoint) {
        boolean z5;
        DataPoint it = dataPoint;
        u.j(it, "it");
        if (c.b(it) != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
