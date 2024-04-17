package com.withings.authentication.mfa.resolve.components;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: MfaInputCode.kt */
/* loaded from: classes3.dex */
final class d extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f32023a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ym0.a<y> aVar) {
        super(1);
        this.f32023a = aVar;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        bool.booleanValue();
        this.f32023a.invoke();
        return y.f85009a;
    }
}
