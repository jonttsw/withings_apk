package com.withings.sharing.datasharing.sendinvitation;

import androidx.compose.material3.m8;
import k1.r0;
/* compiled from: ShareMethodScreen.kt */
/* loaded from: classes4.dex */
final class i0 extends kotlin.jvm.internal.w implements ym0.l<Throwable, nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m8 f44218a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ r0<Boolean> f44219b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(m8 m8Var, r0<Boolean> r0Var) {
        super(1);
        this.f44218a = m8Var;
        this.f44219b = r0Var;
    }

    @Override // ym0.l
    public final nm0.y invoke(Throwable th2) {
        if (!this.f44218a.k()) {
            this.f44219b.setValue(Boolean.FALSE);
        }
        return nm0.y.f85009a;
    }
}
