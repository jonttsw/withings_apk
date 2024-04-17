package com.withings.ecg.heartsound;

import com.withings.ecg.heartsound.d;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d.f f38490a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d.f fVar) {
        super(0);
        this.f38490a = fVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(yq.b.c(this.f38490a.f38451b, "signalId"));
    }
}
