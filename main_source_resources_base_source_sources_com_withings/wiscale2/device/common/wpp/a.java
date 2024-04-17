package com.withings.wiscale2.device.common.wpp;

import fl.o;
import jq.c;
import kotlin.jvm.internal.u;
import ym0.p;
/* compiled from: LiveEcgMeasurementDelegate.kt */
/* loaded from: classes5.dex */
public final class a implements p<Integer, Long, Boolean> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f54137a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(o oVar) {
        this.f54137a = oVar;
    }

    @Override // ym0.p
    public final Boolean invoke(Integer num, Long l5) {
        int intValue = num.intValue();
        long longValue = l5.longValue();
        o oVar = this.f54137a;
        u.h(oVar, "null cannot be cast to non-null type com.withings.ecg.DeviceWithSignal");
        return Boolean.valueOf(((c) oVar).j(intValue, longValue));
    }
}
