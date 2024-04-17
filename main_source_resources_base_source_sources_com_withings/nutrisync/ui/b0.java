package com.withings.nutrisync.ui;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: VitaminCScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.nutrisync.ui.VitaminCScreenKt$DatavizSectionsContent$1$1$1", f = "VitaminCScreen.kt", l = {223}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class b0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f43217a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f43218b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b0(ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar, qm0.d<? super b0> dVar) {
        super(2, dVar);
        this.f43218b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new b0(this.f43218b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((b0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f43217a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f43217a = 1;
            if (this.f43218b.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
