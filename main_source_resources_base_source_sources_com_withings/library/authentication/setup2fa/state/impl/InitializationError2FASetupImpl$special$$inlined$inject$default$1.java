package com.withings.library.authentication.setup2fa.state.impl;

import androidx.compose.material.r3;
import com.withings.library.authentication.api.error.NetworkExceptionChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.w;
import pq0.b;
import ym0.a;
/* compiled from: KoinComponent.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0004\u0010\u0004\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "T", "invoke", "()Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class InitializationError2FASetupImpl$special$$inlined$inject$default$1 extends w implements a<NetworkExceptionChecker> {
    final /* synthetic */ a $parameters;
    final /* synthetic */ wq0.a $qualifier;
    final /* synthetic */ pq0.a $this_inject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InitializationError2FASetupImpl$special$$inlined$inject$default$1(pq0.a aVar, wq0.a aVar2, a aVar3) {
        super(0);
        this.$this_inject = aVar;
        this.$qualifier = aVar2;
        this.$parameters = aVar3;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.withings.library.authentication.api.error.NetworkExceptionChecker, java.lang.Object] */
    @Override // ym0.a
    public final NetworkExceptionChecker invoke() {
        yq0.a c11;
        pq0.a aVar = this.$this_inject;
        wq0.a aVar2 = this.$qualifier;
        a aVar3 = this.$parameters;
        if (aVar instanceof b) {
            c11 = ((b) aVar).a();
        } else {
            c11 = r3.c(aVar);
        }
        return c11.d(aVar3, q0.b(NetworkExceptionChecker.class), aVar2);
    }
}
