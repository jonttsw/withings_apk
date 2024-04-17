package com.withings.common.compose.component;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollableTabRow.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.ScrollableTabData$onLaidOut$1$1", f = "ScrollableTabRow.kt", l = {ConstantsWs.WS_STATUS_WRONGMFGID}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class l3 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34044a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ m3 f34045b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ int f34046c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(m3 m3Var, int i11, qm0.d<? super l3> dVar) {
        super(2, dVar);
        this.f34045b = m3Var;
        this.f34046c = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new l3(this.f34045b, this.f34046c, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((l3) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n0.z0 z0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f34044a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            z0Var = this.f34045b.f34069a;
            m0.p1 b10 = q3.b();
            this.f34044a = 1;
            if (z0Var.j(this.f34046c, b10, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
