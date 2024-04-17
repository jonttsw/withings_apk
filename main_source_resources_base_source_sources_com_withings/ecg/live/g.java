package com.withings.ecg.live;

import com.withings.ecg.model.LiveEcgData;
import com.withings.ecg.model.SignalMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class g extends kotlin.jvm.internal.s implements ym0.q<xw.p<SignalMeta, LiveEcgData, k0>, SignalMeta, LiveEcgData, nm0.y> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public g(Object obj) {
        super(3, obj, c.class, "onSignalDataReceived", "onSignalDataReceived(Lcom/withings/lifecycle/TwoCombinedLiveData;Lcom/withings/ecg/model/SignalMeta;Lcom/withings/ecg/model/LiveEcgData;)V", 0);
    }

    @Override // ym0.q
    public final nm0.y invoke(xw.p<SignalMeta, LiveEcgData, k0> pVar, SignalMeta signalMeta, LiveEcgData liveEcgData) {
        xw.p<SignalMeta, LiveEcgData, k0> p02 = pVar;
        kotlin.jvm.internal.u.j(p02, "p0");
        c.t0((c) this.receiver, p02, signalMeta, liveEcgData);
        return nm0.y.f85009a;
    }
}
