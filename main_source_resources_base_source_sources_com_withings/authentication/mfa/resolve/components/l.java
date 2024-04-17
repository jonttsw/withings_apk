package com.withings.authentication.mfa.resolve.components;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: SelectFactorBottomSheet.kt */
/* loaded from: classes3.dex */
final class l extends w implements ym0.a<y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.l<com.withings.authentication.mfa.resolve.c, y> f32045a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.withings.authentication.mfa.resolve.c f32046b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l(ym0.l<? super com.withings.authentication.mfa.resolve.c, y> lVar, com.withings.authentication.mfa.resolve.c cVar) {
        super(0);
        this.f32045a = lVar;
        this.f32046b = cVar;
    }

    @Override // ym0.a
    public final y invoke() {
        this.f32045a.invoke(this.f32046b);
        return y.f85009a;
    }
}
