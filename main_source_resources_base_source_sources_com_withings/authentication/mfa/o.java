package com.withings.authentication.mfa;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ResolveMultiFactorActivity.kt */
/* loaded from: classes3.dex */
public final class o extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ResolveMultiFactorActivity f31750a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f31751b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f31752c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(ResolveMultiFactorActivity resolveMultiFactorActivity, String str, int i11) {
        super(2);
        this.f31750a = resolveMultiFactorActivity;
        this.f31751b = str;
        this.f31752c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f31752c | 1);
        ResolveMultiFactorActivity.B3(this.f31750a, this.f31751b, aVar, g11);
        return nm0.y.f85009a;
    }
}
