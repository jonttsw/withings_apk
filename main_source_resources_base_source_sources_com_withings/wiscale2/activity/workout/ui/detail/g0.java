package com.withings.wiscale2.activity.workout.ui.detail;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class g0 extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l f49195a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f49196b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(f0 f0Var, List list) {
        super(1);
        this.f49195a = f0Var;
        this.f49196b = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        return this.f49195a.invoke(this.f49196b.get(num.intValue()));
    }
}
