package com.withings.ecg.details;

import com.withings.ecg.details.g;
/* compiled from: Fragment.kt */
/* loaded from: classes3.dex */
public final class w extends kotlin.jvm.internal.w implements ym0.a<Long> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g.e f38349a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(g.e eVar) {
        super(0);
        this.f38349a = eVar;
    }

    @Override // ym0.a
    public final Long invoke() {
        return Long.valueOf(yq.b.c(this.f38349a.f38215b, "ecgId"));
    }
}
