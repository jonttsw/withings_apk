package com.withings.ecg.live;

import com.withings.ecg.model.LiveEcgData;
import com.withings.ecg.model.SignalMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.w implements ym0.p<LiveEcgData, SignalMeta, k0> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ c f38698a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar) {
        super(2);
        this.f38698a = cVar;
    }

    @Override // ym0.p
    public final k0 invoke(LiveEcgData liveEcgData, SignalMeta signalMeta) {
        LiveEcgData liveEcgData2 = liveEcgData;
        SignalMeta signalMeta2 = signalMeta;
        kotlin.jvm.internal.u.j(liveEcgData2, "liveEcgData");
        kotlin.jvm.internal.u.j(signalMeta2, "signalMeta");
        return c.i0(this.f38698a, liveEcgData2, signalMeta2);
    }
}
