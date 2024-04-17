package com.withings.common.compose.component;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Buttons.kt */
/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0.a0 f33938a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f33939b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f33940c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ long f33941d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ ButtonSize f33942e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ l2 f33943f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f33944g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ int f33945h;

    /* renamed from: i  reason: collision with root package name */
    final /* synthetic */ int f33946i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r0.a0 a0Var, String str, boolean z5, long j5, ButtonSize buttonSize, l2 l2Var, int i11, int i12, int i13) {
        super(2);
        this.f33938a = a0Var;
        this.f33939b = str;
        this.f33940c = z5;
        this.f33941d = j5;
        this.f33942e = buttonSize;
        this.f33943f = l2Var;
        this.f33944g = i11;
        this.f33945h = i12;
        this.f33946i = i13;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f33945h | 1);
        l2 l2Var = this.f33943f;
        int i11 = this.f33944g;
        l.d(this.f33938a, this.f33939b, this.f33940c, this.f33941d, this.f33942e, l2Var, i11, aVar, g11, this.f33946i);
        return nm0.y.f85009a;
    }
}
