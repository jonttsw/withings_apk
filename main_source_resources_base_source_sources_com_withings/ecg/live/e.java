package com.withings.ecg.live;

import com.withings.ecg.model.LiveEcgData;
import com.withings.ecg.model.SignalMeta;
/* compiled from: LiveEcgActivity.kt */
/* loaded from: classes3.dex */
final class e extends kotlin.jvm.internal.w implements ym0.l<nm0.o<LiveEcgData, SignalMeta, Long>, Long> {

    /* renamed from: a  reason: collision with root package name */
    public static final e f38660a = new kotlin.jvm.internal.w(1);

    @Override // ym0.l
    public final Long invoke(nm0.o<LiveEcgData, SignalMeta, Long> oVar) {
        Long l5;
        nm0.o<LiveEcgData, SignalMeta, Long> oVar2 = oVar;
        LiveEcgData a11 = oVar2.a();
        SignalMeta b10 = oVar2.b();
        long longValue = oVar2.c().longValue();
        Long l6 = null;
        if (b10 != null) {
            l5 = Long.valueOf(b10.getTotalSize());
        } else {
            l5 = null;
        }
        if (a11 != null) {
            l6 = Long.valueOf(a11.getIndex());
        }
        Long l11 = (Long) cr.a.a(new nm0.j(l5, l6), new d(longValue));
        if (l11 != null) {
            longValue = l11.longValue();
        }
        return Long.valueOf(longValue);
    }
}
