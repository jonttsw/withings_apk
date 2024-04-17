package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class h0 extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.p f52914a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f52915b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ym0.p pVar, List list) {
        super(1);
        this.f52914a = pVar;
        this.f52915b = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.f52914a.invoke(Integer.valueOf(intValue), this.f52915b.get(intValue));
    }
}
