package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EcgDetailsFragment.kt */
/* loaded from: classes3.dex */
public final class m0 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<o2>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b0 f38264a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(b0 b0Var) {
        super(1);
        this.f38264a = b0Var;
    }

    @Override // ym0.l
    public final LiveData<o2> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        CoroutineDispatcher io2 = Dispatchers.getIO();
        b0 b0Var = this.f38264a;
        return androidx.lifecycle.e1.b(androidx.lifecycle.e1.c(androidx.lifecycle.h.a(io2, new g0(heartSignalMeasurement2, b0Var, null), 2), new k0(b0Var, heartSignalMeasurement2)), new l0(b0Var, heartSignalMeasurement2));
    }
}
