package com.withings.ecg.heartsound;

import androidx.lifecycle.LiveData;
import com.withings.ecg.details.o2;
import com.withings.ecg.model.HeartSignalMeasurement;
import kotlinx.coroutines.Dispatchers;
/* compiled from: HeartSoundDetailsFragment.kt */
/* loaded from: classes3.dex */
final class x extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<o2>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r f38556a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(r rVar) {
        super(1);
        this.f38556a = rVar;
    }

    @Override // ym0.l
    public final LiveData<o2> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new w(this.f38556a, heartSignalMeasurement, null), 2);
    }
}
