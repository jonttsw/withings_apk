package com.withings.cycletracking.ui;

import com.withings.library.authentication.api.ConstantsWs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: CycleTrackingDatavizScreen.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.cycletracking.ui.CycleTrackingDatavizScreenKt$CycleTrackingDatavizSectionsContent$1$1$1$1", f = "CycleTrackingDatavizScreen.kt", l = {ConstantsWs.WS_STATUS_WRONGTYPE}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35552a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ym0.l<qm0.d<? super nm0.y>, Object> f35553b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f1(ym0.l<? super qm0.d<? super nm0.y>, ? extends Object> lVar, qm0.d<? super f1> dVar) {
        super(2, dVar);
        this.f35553b = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new f1(this.f35553b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((f1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f35552a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            this.f35552a = 1;
            if (this.f35553b.invoke(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
