package com.withings.details.height;

import androidx.compose.material.DismissValue;
import androidx.compose.material.m8;
import androidx.compose.material.z1;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: HeightListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.details.height.HeightListActivity$DeletableCell$2$2$1", f = "HeightListActivity.kt", l = {221}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f36607a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ z1 f36608b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(z1 z1Var, qm0.d<? super h> dVar) {
        super(2, dVar);
        this.f36608b = z1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new h(this.f36608b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((h) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.f76214a;
        int i11 = this.f36607a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f36607a = 1;
            z1 z1Var = this.f36608b;
            z1Var.getClass();
            Object i12 = m8.i(z1Var, DismissValue.f4833a, this);
            if (i12 != obj2) {
                i12 = nm0.y.f85009a;
            }
            if (i12 == obj2) {
                return obj2;
            }
        }
        return nm0.y.f85009a;
    }
}
