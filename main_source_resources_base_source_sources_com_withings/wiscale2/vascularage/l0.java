package com.withings.wiscale2.vascularage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeScreen.kt */
/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f62419a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z70.c f62420b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f62421c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Integer f62422d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f62423e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i11, z70.c cVar, boolean z5, Integer num, int i12) {
        super(2);
        this.f62419a = i11;
        this.f62420b = cVar;
        this.f62421c = z5;
        this.f62422d = num;
        this.f62423e = i12;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f62423e | 1);
        boolean z5 = this.f62421c;
        Integer num2 = this.f62422d;
        k0.j(this.f62419a, this.f62420b, z5, num2, aVar, g11);
        return nm0.y.f85009a;
    }
}
