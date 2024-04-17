package com.withings.ecg.live;

import com.withings.ecg.model.SignalMeta;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class h extends kotlin.jvm.internal.w implements ym0.l<SignalMeta, Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f38683a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final Long invoke(SignalMeta signalMeta) {
        long j5;
        SignalMeta signalMeta2 = signalMeta;
        if (signalMeta2 != null) {
            j5 = signalMeta2.getDuration();
        } else {
            j5 = 21;
        }
        return Long.valueOf(j5);
    }
}
