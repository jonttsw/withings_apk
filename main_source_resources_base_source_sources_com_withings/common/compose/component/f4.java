package com.withings.common.compose.component;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedControl.kt */
/* loaded from: classes3.dex */
public final class f4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List<String> f33791a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f33792b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ym0.l<Integer, nm0.y> f33793c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33794d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f33795e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ int f33796f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4(int i11, int i12, int i13, androidx.compose.ui.e eVar, List list, ym0.l lVar) {
        super(2);
        this.f33791a = list;
        this.f33792b = i11;
        this.f33793c = lVar;
        this.f33794d = eVar;
        this.f33795e = i12;
        this.f33796f = i13;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33795e | 1);
        d4.f(this.f33792b, g11, this.f33796f, aVar, this.f33794d, this.f33791a, this.f33793c);
        return nm0.y.f85009a;
    }
}
