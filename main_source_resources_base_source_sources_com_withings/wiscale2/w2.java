package com.withings.wiscale2;

import com.withings.library.measure.MeasuresGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: ShareWithMyDoctor.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.ShareWithMyDoctorViewModel$measureGroups$1$1", f = "ShareWithMyDoctor.kt", l = {123, 122}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class w2 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends MeasuresGroup>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62892a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f62893b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ DateTime f62894c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t2 f62895d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(DateTime dateTime, t2 t2Var, qm0.d<? super w2> dVar) {
        super(2, dVar);
        this.f62894c = dateTime;
        this.f62895d = t2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        w2 w2Var = new w2(this.f62894c, this.f62895d, dVar);
        w2Var.f62893b = obj;
        return w2Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends MeasuresGroup>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((w2) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        Object b10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62892a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f62893b;
            b10 = obj;
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f62893b;
            long millis = this.f62894c.getMillis();
            t2 t2Var = this.f62895d;
            long millis2 = DateTime.now().getMillis();
            Long l5 = new Long(millis);
            Long l6 = new Long(millis2);
            this.f62893b = h0Var;
            this.f62892a = 1;
            b10 = t2Var.g0().b(t2Var.getUser().q(), l5, l6, true, false, new int[]{9, 10}, this);
            if (b10 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ArrayList f11 = hy.g.f((List) b10);
        this.f62893b = null;
        this.f62892a = 2;
        if (h0Var.emit(f11, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
