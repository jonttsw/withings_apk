package com.withings.ecg.heartsound;

import androidx.lifecycle.h1;
import com.withings.ecg.model.HeartSignalMeasurement;
import com.withings.ecg.model.Signal;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class y extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f38559a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(r rVar) {
        super(1);
        this.f38559a = rVar;
    }

    @Override // ym0.l
    public final Boolean invoke(HeartSignalMeasurement heartSignalMeasurement) {
        Signal signal;
        String signalPath;
        HeartSignalMeasurement heartSignalMeasurement2 = heartSignalMeasurement;
        boolean z5 = false;
        if (heartSignalMeasurement2 != null && (signal = heartSignalMeasurement2.getSignal()) != null && (signalPath = signal.getSignalPath()) != null && signalPath.length() > 0) {
            z5 = true;
        }
        if (!z5) {
            r rVar = this.f38559a;
            rVar.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(rVar), Dispatchers.getIO(), null, new u(rVar, null), 2, null);
        }
        return Boolean.valueOf(z5);
    }
}
