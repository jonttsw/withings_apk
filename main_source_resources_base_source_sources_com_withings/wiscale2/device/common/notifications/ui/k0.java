package com.withings.wiscale2.device.common.notifications.ui;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class k0 extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.p f52934a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ List f52935b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(ym0.p pVar, List list) {
        super(1);
        this.f52934a = pVar;
        this.f52935b = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        int intValue = num.intValue();
        return this.f52934a.invoke(Integer.valueOf(intValue), this.f52935b.get(intValue));
    }
}
