package com.withings.authentication.mfa.main.components;

import kotlin.jvm.internal.w;
import nm0.y;
/* compiled from: PhoneComponent.kt */
/* loaded from: classes3.dex */
final class i extends w implements ym0.l<Boolean, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f31704a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.a<y> f31705b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(ym0.a<y> aVar, ym0.a<y> aVar2) {
        super(1);
        this.f31704a = aVar;
        this.f31705b = aVar2;
    }

    @Override // ym0.l
    public final y invoke(Boolean bool) {
        if (bool.booleanValue()) {
            this.f31704a.invoke();
        } else {
            this.f31705b.invoke();
        }
        return y.f85009a;
    }
}
