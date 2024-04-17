package com.withings.common.compose.component;

import com.withings.common.compose.component.z4;
import kotlinx.coroutines.CancellableContinuation;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ToastHost.kt */
/* loaded from: classes3.dex */
public final class y4 extends kotlin.jvm.internal.w implements ym0.a<nm0.y> {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ z4.a f34978a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(z4.a aVar) {
        super(0);
        this.f34978a = aVar;
    }

    @Override // ym0.a
    public final nm0.y invoke() {
        CancellableContinuation cancellableContinuation;
        CancellableContinuation cancellableContinuation2;
        z4.a aVar = this.f34978a;
        cancellableContinuation = aVar.f34997f;
        if (cancellableContinuation.isActive()) {
            cancellableContinuation2 = aVar.f34997f;
            cancellableContinuation2.resumeWith(ToastResult.f33346b);
        }
        aVar.f().invoke();
        return nm0.y.f85009a;
    }
}
