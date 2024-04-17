package com.withings.details.height;

import java.util.List;
/* compiled from: LazyDsl.kt */
/* loaded from: classes3.dex */
public final class n extends kotlin.jvm.internal.w implements ym0.l<Integer, Object> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f36622a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List list) {
        super(1);
        this.f36622a = list;
    }

    @Override // ym0.l
    public final Object invoke(Integer num) {
        this.f36622a.get(num.intValue());
        return null;
    }
}
