package com.withings.ecg.details;

import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.library.ecg.EcgSignalType;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class v0 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    public static final v0 f38346a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final Boolean invoke(HeartSignalMeasurement heartSignalMeasurement) {
        HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        List W = kotlin.collections.x.W(EcgSignalType.DII_DIII, EcgSignalType.DII_DIII_FILTERED);
        kotlin.jvm.internal.u.g(heartSignalMeasurement2);
        return Boolean.valueOf(W.contains(androidx.collection.c.l(heartSignalMeasurement2)));
    }
}
