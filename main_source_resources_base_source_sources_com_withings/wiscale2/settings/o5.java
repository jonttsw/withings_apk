package com.withings.wiscale2.settings;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class o5 extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l f60228a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f60229b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(n5 n5Var, List list) {
        super(1);
        this.f60228a = n5Var;
        this.f60229b = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        return this.f60228a.invoke(this.f60229b.get(num.intValue()));
    }
}
