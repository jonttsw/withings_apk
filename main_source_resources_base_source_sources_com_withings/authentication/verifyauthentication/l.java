package com.withings.authentication.verifyauthentication;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AuthBottomSheetDialog.kt */
/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32681a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<nm0.y> f32682b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f32683c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ym0.a<nm0.y> aVar, ym0.a<nm0.y> aVar2, int i11) {
        super(2);
        this.f32681a = aVar;
        this.f32682b = aVar2;
        this.f32683c = i11;
    }

    @Override // ym0.p
    public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
        num.intValue();
        int g11 = ah.o.g(this.f32683c | 1);
        o.b(this.f32681a, this.f32682b, aVar, g11);
        return nm0.y.f85009a;
    }
}
