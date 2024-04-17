package com.withings.wiscale2.heart.afib;

import com.withings.wiscale2.heart.afib.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: AFibMonthViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibMonthViewModel$datumsForMonthGraph$1$1", f = "AFibMonthViewModel.kt", l = {45}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class i0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends rs.e>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57170a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57171b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0 f57172c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ h0.a f57173d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(h0 h0Var, h0.a aVar, qm0.d<? super i0> dVar) {
        super(2, dVar);
        this.f57172c = h0Var;
        this.f57173d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        i0 i0Var = new i0(this.f57172c, this.f57173d, dVar);
        i0Var.f57171b = obj;
        return i0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends rs.e>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((i0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        DateTime dateTime;
        DateTime dateTime2;
        h0.b bVar;
        ky.a aVar;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57170a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var = (androidx.lifecycle.h0) this.f57171b;
            ArrayList arrayList = new ArrayList();
            h0 h0Var2 = this.f57172c;
            dateTime = h0Var2.f57161b;
            int maximumValue = dateTime.dayOfMonth().getMaximumValue();
            if (1 <= maximumValue) {
                int i12 = 1;
                while (true) {
                    dateTime2 = h0Var2.f57161b;
                    DateTime withDayOfMonth = dateTime2.withDayOfMonth(i12);
                    bVar = h0Var2.f57163d;
                    kotlin.jvm.internal.u.g(withDayOfMonth);
                    Iterator<T> it = this.f57173d.c().iterator();
                    while (true) {
                        aVar = null;
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (((ky.d) obj2).c().getDayOfMonth() == i12) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    ky.d dVar = (ky.d) obj2;
                    if (dVar != null) {
                        aVar = ah.m.h(dVar);
                    }
                    arrayList.add(bVar.d1(withDayOfMonth, aVar));
                    if (i12 == maximumValue) {
                        break;
                    }
                    i12++;
                }
            }
            this.f57170a = 1;
            if (h0Var.emit(arrayList, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
