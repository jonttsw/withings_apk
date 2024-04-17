package com.withings.ecg.details;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.HeartSignalMeasurement;
import kotlinx.coroutines.Dispatchers;
/* compiled from: EcgInReviewViewModel.kt */
/* loaded from: classes3.dex */
final class k1 extends kotlin.jvm.internal.w implements ym0.l<HeartSignalMeasurement, LiveData<Boolean>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ EcgInReviewViewModel f38252a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(EcgInReviewViewModel ecgInReviewViewModel) {
        super(1);
        this.f38252a = ecgInReviewViewModel;
    }

    @Override // ym0.l
    public final LiveData<Boolean> invoke(HeartSignalMeasurement heartSignalMeasurement) {
        return androidx.lifecycle.h.a(Dispatchers.getIO(), new j1(heartSignalMeasurement, this.f38252a, null), 2);
    }
}
