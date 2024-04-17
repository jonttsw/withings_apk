package com.withings.notifications.ui;

import java.util.ArrayList;
import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes4.dex */
public final class h0 extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l f42948a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f42949b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ym0.l lVar, ArrayList arrayList) {
        super(1);
        this.f42948a = lVar;
        this.f42949b = arrayList;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        return this.f42948a.invoke(this.f42949b.get(num.intValue()));
    }
}
