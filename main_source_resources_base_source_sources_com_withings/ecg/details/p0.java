package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class p0 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38286a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(b0 b0Var) {
        super(1);
        this.f38286a = b0Var;
    }

    @Override // ym0.l
    public final LiveData<Boolean> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new o0(heartSignalMeasurement, this.f38286a, null), 2);
    }
}
