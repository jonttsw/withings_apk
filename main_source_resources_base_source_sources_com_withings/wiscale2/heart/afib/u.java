package com.withings.wiscale2.heart.afib;

import java.util.Comparator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* compiled from: AFibMeasuresListActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibMeasuresViewModel$afibMeasure$1$1", f = "AFibMeasuresListActivity.kt", l = {101, 101}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class u extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<List<? extends ky.d>>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57244a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57245b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ v f57246c;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(Long.valueOf(new DateTime(((ky.d) t12).c()).getMillis()), Long.valueOf(new DateTime(((ky.d) t11).c()).getMillis()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, qm0.d<? super u> dVar) {
        super(2, dVar);
        this.f57246c = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u uVar = new u(this.f57246c, dVar);
        uVar.f57245b = obj;
        return uVar;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<List<? extends ky.d>> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((u) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.Comparator] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        boolean z5;
        boolean z11;
        boolean z12;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57244a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (androidx.lifecycle.h0) this.f57245b;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f57245b;
            v vVar = this.f57246c;
            z5 = vVar.f57261h;
            z11 = vVar.f57262i;
            z12 = vVar.f57263j;
            this.f57245b = h0Var;
            this.f57244a = 1;
            obj = v.f0(vVar, z5, z11, z12, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        List D0 = kotlin.collections.x.D0((Iterable) obj, new Object());
        this.f57245b = null;
        this.f57244a = 2;
        if (h0Var.emit(D0, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
