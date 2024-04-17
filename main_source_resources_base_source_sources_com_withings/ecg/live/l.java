package com.withings.ecg.live;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.LiveEcgData;
import com.withings.ecg.model.LiveEcgMeasurementRepository;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.a<LiveData<LiveEcgData>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f38694a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(c cVar) {
        super(0);
        this.f38694a = cVar;
    }

    @Override // ym0.a
    public final LiveData<LiveEcgData> invoke() {
        LiveEcgMeasurementRepository liveEcgMeasurementRepository;
        liveEcgMeasurementRepository = this.f38694a.f38637j;
        return liveEcgMeasurementRepository.getLiveData();
    }
}
