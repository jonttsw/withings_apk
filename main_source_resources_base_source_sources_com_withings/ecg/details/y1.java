package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class y1 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<HeartSignalMeasurement>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a2 f38364a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(a2 a2Var) {
        super(1);
        this.f38364a = a2Var;
    }

    @Override // ym0.l
    public final LiveData<HeartSignalMeasurement> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new x1(heartSignalMeasurement, this.f38364a, null), 2);
    }
}
