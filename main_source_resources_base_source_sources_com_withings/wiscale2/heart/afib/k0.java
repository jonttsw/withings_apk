package com.withings.wiscale2.heart.afib;

import com.withings.user.User;
import com.withings.wiscale2.heart.afib.h0;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AFibMonthViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.heart.afib.AFibMonthViewModel$measures$1", f = "AFibMonthViewModel.kt", l = {32, 34, 36}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class k0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<h0.a>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f57189a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f57190b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ h0 f57191c;

    /* compiled from: Comparisons.kt */
    /* loaded from: classes5.dex */
    public static final class a<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t11, T t12) {
            return pm0.a.b(((ky.d) t12).c(), ((ky.d) t11).c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(h0 h0Var, qm0.d<? super k0> dVar) {
        super(2, dVar);
        this.f57191c = h0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        k0 k0Var = new k0(this.f57191c, dVar);
        k0Var.f57190b = obj;
        return k0Var;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<h0.a> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((k0) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.Comparator] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        androidx.lifecycle.h0 h0Var;
        User user;
        fy.o oVar;
        DateTime dateTime;
        DateTime dateTime2;
        boolean z5;
        List list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f57189a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        nm0.l.b(obj);
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                h0Var = (androidx.lifecycle.h0) this.f57190b;
                nm0.l.b(obj);
                list = (List) obj;
            } else {
                h0Var = (androidx.lifecycle.h0) this.f57190b;
                nm0.l.b(obj);
                list = (List) obj;
            }
        } else {
            nm0.l.b(obj);
            h0Var = (androidx.lifecycle.h0) this.f57190b;
            h0 h0Var2 = this.f57191c;
            user = h0Var2.f57160a;
            oVar = h0Var2.f57164e;
            l lVar = new l(user, oVar);
            dateTime = h0Var2.f57161b;
            long millis = hn.a.q(dateTime).plusMillis(1).getMillis();
            dateTime2 = h0Var2.f57161b;
            long millis2 = hn.a.q(dateTime2).plusMonths(1).getMillis();
            z5 = h0Var2.f57162c;
            if (z5) {
                this.f57190b = h0Var;
                this.f57189a = 1;
                obj = lVar.d(new AFibType[]{AFibType.f57108b, AFibType.f57109c}, millis, millis2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = (List) obj;
            } else {
                AFibType aFibType = AFibType.f57110d;
                this.f57190b = h0Var;
                this.f57189a = 2;
                obj = lVar.c(aFibType, millis, millis2, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                list = (List) obj;
            }
        }
        List D0 = kotlin.collections.x.D0(list, new Object());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : D0) {
            Integer num = new Integer(new DateTime(((ky.d) obj2).c()).getDayOfMonth());
            Object obj3 = linkedHashMap.get(num);
            if (obj3 == null) {
                obj3 = com.google.android.gms.internal.mlkit_common.a.d(linkedHashMap, num);
            }
            ((List) obj3).add(obj2);
        }
        h0.a aVar = new h0.a(linkedHashMap.size(), D0.size(), D0);
        this.f57190b = null;
        this.f57189a = 3;
        if (h0Var.emit(aVar, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
