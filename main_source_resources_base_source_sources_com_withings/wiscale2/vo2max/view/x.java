package com.withings.wiscale2.vo2max.view;

import java.util.List;
/* compiled from: Vo2MaxComparison.kt */
/* loaded from: classes5.dex */
final class x extends kotlin.jvm.internal.w implements ym0.a<Integer> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<String> f62852a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List<String> list) {
        super(0);
        this.f62852a = list;
    }

    @Override // ym0.a
    public final Integer invoke() {
        return Integer.valueOf(this.f62852a.size());
    }
}
