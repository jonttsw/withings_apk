package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SegmentedControl.kt */
/* loaded from: classes3.dex */
public final class c4 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ d2.r1 f33558a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ long f33559b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f33560c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f33561d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f33562e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(int i11, int i12, long j5, androidx.compose.ui.e eVar, d2.r1 r1Var) {
        super(2);
        this.f33558a = r1Var;
        this.f33559b = j5;
        this.f33560c = eVar;
        this.f33561d = i11;
        this.f33562e = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33561d | 1);
        d4.d(g11, this.f33562e, this.f33559b, aVar, this.f33560c, this.f33558a);
        return nm0.y.f85009a;
    }
}
