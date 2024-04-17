package com.withings.wiscale2.device.common.feature.ecg;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes5.dex */
public final class xa extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f52116a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xa(List list) {
        super(1);
        this.f52116a = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        this.f52116a.get(num.intValue());
        return null;
    }
}
