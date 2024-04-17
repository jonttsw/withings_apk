package com.withings.ecg.live;

import androidx.lifecycle.LiveData;
import com.withings.ecg.model.LiveEcgMeasurementRepository;
import com.withings.ecg.model.SignalMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.w implements ym0.a<LiveData<SignalMeta>> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f38695a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c cVar) {
        super(0);
        this.f38695a = cVar;
    }

    @Override // ym0.a
    public final LiveData<SignalMeta> invoke() {
        LiveEcgMeasurementRepository liveEcgMeasurementRepository;
        liveEcgMeasurementRepository = this.f38695a.f38637j;
        return liveEcgMeasurementRepository.getLiveSignalMeta();
    }
}
