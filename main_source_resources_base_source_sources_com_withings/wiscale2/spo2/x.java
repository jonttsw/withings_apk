package com.withings.wiscale2.spo2;

import androidx.lifecycle.h0;
import com.withings.library.authentication.api.ConstantsWs;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: SpO2MeasuresListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.spo2.Spo2MeasuresViewModel$spo2Measures$1$1", f = "SpO2MeasuresListActivity.kt", l = {ConstantsWs.MEASURE_TYPE_MENSTRUATION_DURATION, 192}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class x extends kotlin.coroutines.jvm.internal.i implements ym0.p<h0<List<? extends ky.d>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    n f61702a;

    /* renamed from: b  reason: collision with root package name */
    int f61703b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f61704c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ y f61705d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, qm0.d<? super x> dVar) {
        super(2, dVar);
        this.f61705d = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        x xVar = new x(this.f61705d, dVar);
        xVar.f61704c = obj;
        return xVar;
    }

    @Override // ym0.p
    public final Object invoke(h0<List<? extends ky.d>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((x) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        n nVar;
        fy.l lVar;
        DateTime dateTime;
        Object c11;
        h0 h0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f61703b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            n nVar2 = this.f61702a;
            h0Var = (h0) this.f61704c;
            nm0.l.b(obj);
            nVar = nVar2;
            c11 = obj;
        } else {
            nm0.l.b(obj);
            h0 h0Var2 = (h0) this.f61704c;
            nVar = n.f61682a;
            y yVar = this.f61705d;
            lVar = yVar.f61707b;
            long q11 = yVar.getUser().q();
            Long l5 = new Long(yVar.f61706a);
            dateTime = yVar.f61710e;
            this.f61704c = h0Var2;
            this.f61702a = nVar;
            this.f61703b = 1;
            c11 = fy.l.c(lVar, q11, l5, new Long(dateTime.getMillis()), false, new int[]{54}, this, 16);
            if (c11 == coroutineSingletons) {
                return coroutineSingletons;
            }
            h0Var = h0Var2;
        }
        n nVar3 = n.f61682a;
        nVar.getClass();
        ArrayList c12 = n.c((List) c11, false);
        this.f61704c = null;
        this.f61702a = null;
        this.f61703b = 2;
        if (h0Var.emit(c12, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
