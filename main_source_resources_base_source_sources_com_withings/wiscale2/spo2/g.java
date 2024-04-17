package com.withings.wiscale2.spo2;

import com.withings.vasistas.model.Vasistas;
/* compiled from: SpO2MeasuresListActivity.kt */
/* loaded from: classes5.dex */
final class g extends kotlin.jvm.internal.w implements ym0.l<Vasistas, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f61678a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final Boolean invoke(Vasistas vasistas) {
        boolean z5;
        Vasistas vasistas2 = vasistas;
        kotlin.jvm.internal.u.j(vasistas2, "vasistas");
        Integer spo2Quality = vasistas2.getSpo2Quality();
        kotlin.jvm.internal.u.g(spo2Quality);
        if (spo2Quality.intValue() >= 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        return Boolean.valueOf(z5);
    }
}
