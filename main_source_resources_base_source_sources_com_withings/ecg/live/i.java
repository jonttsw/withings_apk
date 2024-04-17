package com.withings.ecg.live;

import com.withings.ecg.live.c;
import com.withings.ecg.model.SignalMeta;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.s implements ym0.l<SignalMeta, c.a> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Object obj) {
        super(1, obj, c.class, "onSignalMetaChanged", "onSignalMetaChanged(Lcom/withings/ecg/model/SignalMeta;)Lcom/withings/ecg/live/EcgViewModel$EcgSignalStartedData;", 0);
    }

    @Override // ym0.l
    public final c.a invoke(SignalMeta signalMeta) {
        return c.y0((c) this.receiver, signalMeta);
    }
}
