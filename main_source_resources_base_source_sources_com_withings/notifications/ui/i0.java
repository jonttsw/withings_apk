package com.withings.notifications.ui;

import java.util.ArrayList;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class i0 extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l f42952a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f42953b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(g0 g0Var, ArrayList arrayList) {
        super(1);
        this.f42952a = g0Var;
        this.f42953b = arrayList;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        return this.f42952a.invoke(this.f42953b.get(num.intValue()));
    }
}
