package com.withings.common.compose.component;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ExpandableText.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.common.compose.component.ExpandableTextKt$ExpandableText$3$3$1", f = "ExpandableText.kt", l = {84, 90}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class a1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f33365a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ k1.r0<Boolean> f33366b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ m0.b<Float, m0.m> f33367c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ k1.r0<Float> f33368d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(k1.r0<Boolean> r0Var, m0.b<Float, m0.m> bVar, k1.r0<Float> r0Var2, qm0.d<? super a1> dVar) {
        super(2, dVar);
        this.f33366b = r0Var;
        this.f33367c = bVar;
        this.f33368d = r0Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new a1(this.f33366b, this.f33367c, this.f33368d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((a1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f33365a;
        k1.r0<Float> r0Var = this.f33368d;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    r0Var.setValue(new Float(0.0f));
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                r0Var.setValue(new Float(-180.0f));
            }
        } else {
            nm0.l.b(obj);
            if (this.f33366b.getValue().booleanValue()) {
                Float f11 = new Float(-180.0f);
                m0.p1 d11 = m0.k.d(250, 0, m0.c0.c(), 2);
                this.f33365a = 1;
                if (m0.b.f(this.f33367c, f11, d11, null, this, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                r0Var.setValue(new Float(-180.0f));
            } else {
                Float f12 = new Float(0.0f);
                m0.p1 d12 = m0.k.d(250, 0, m0.c0.c(), 2);
                this.f33365a = 2;
                if (m0.b.f(this.f33367c, f12, d12, null, this, 12) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                r0Var.setValue(new Float(0.0f));
            }
        }
        return nm0.y.f85009a;
    }
}
