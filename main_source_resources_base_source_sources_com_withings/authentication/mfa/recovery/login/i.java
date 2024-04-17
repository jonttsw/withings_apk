package com.withings.authentication.mfa.recovery.login;

import com.withings.common.compose.component.input.InputFieldType;
import fk.d0;
import k1.r0;
import kotlin.jvm.internal.w;
import nm0.y;
import ym0.p;
/* compiled from: RecoveryCodeInput.kt */
/* loaded from: classes3.dex */
final class i extends w implements p<androidx.compose.runtime.a, Integer, y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ r0<InputFieldType> f31868a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(r0<InputFieldType> r0Var) {
        super(2);
        this.f31868a = r0Var;
    }

    @Override // ym0.p
    public final y invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        if ((num.intValue() & 11) == 2 && aVar2.h()) {
            aVar2.C();
        } else {
            d0.a(this.f31868a, 0L, aVar2, 6, 2);
        }
        return y.f85009a;
    }
}
