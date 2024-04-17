package com.withings.measure.detail.ui.screen;

import androidx.lifecycle.h0;
import com.withings.library.measure.MeasuresGroup;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import nm0.y;
/* compiled from: MeasureDetailViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.measure.detail.ui.screen.MeasureDetailPagerViewModelLegacy$groups$1$1", f = "MeasureDetailViewModel.kt", l = {46, 46}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class u extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<List<? extends MeasuresGroup>>, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f41798a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f41799b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ q f41800c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, qm0.d<? super u> dVar) {
        super(2, dVar);
        this.f41800c = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        u uVar = new u(this.f41800c, dVar);
        uVar.f41799b = obj;
        return uVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<List<? extends MeasuresGroup>> h0Var, qm0.d<? super y> dVar) {
        return ((u) create(h0Var, dVar)).invokeSuspend(y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f41798a;
        q qVar = this.f41800c;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    qVar.q0().postValue(Boolean.FALSE);
                    return y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (h0) this.f41799b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (h0) this.f41799b;
            qVar.q0().postValue(Boolean.TRUE);
            this.f41799b = h0Var;
            this.f41798a = 1;
            obj = BuildersKt__BuildersKt.runBlocking$default(null, new r(m70.i.b().i(qVar.i0()), qVar, null), 1, null);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        this.f41799b = null;
        this.f41798a = 2;
        if (h0Var.emit(obj, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        qVar.q0().postValue(Boolean.FALSE);
        return y.f85009a;
    }
}
