package com.withings.authentication.mfa.main.components;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: TotpComponent.kt */
/* loaded from: classes3.dex */
final class l extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f31715a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ym0.a<y> aVar) {
        super(1);
        this.f31715a = aVar;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        bool.booleanValue();
        this.f31715a.invoke();
        return y.f85009a;
    }
}
