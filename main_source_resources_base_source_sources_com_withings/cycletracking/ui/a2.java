package com.withings.cycletracking.ui;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class a2 extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l f35496a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f35497b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(z1 z1Var, List list) {
        super(1);
        this.f35496a = z1Var;
        this.f35497b = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        return this.f35496a.invoke(this.f35497b.get(num.intValue()));
    }
}
