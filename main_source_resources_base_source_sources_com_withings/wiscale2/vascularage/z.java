package com.withings.wiscale2.vascularage;

import com.withings.common.compose.component.Status;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jj0.a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.Interval;
import org.joda.time.LocalDate;
import z70.a;
/* compiled from: VascularAgeQuarterFragment.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeQuarterFragment$VascularAgeQuarterViewModel$diagnostic$1$1", f = "VascularAgeQuarterFragment.kt", l = {ConstantsWs.WS_STATUS_WRONGFW, ConstantsWs.WS_STATUS_ACCOUNTACTIVATIONERROR}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class z extends kotlin.coroutines.jvm.internal.i implements ym0.p<androidx.lifecycle.h0<jj0.a>, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62562a;

    /* renamed from: b  reason: collision with root package name */
    int f62563b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f62564c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ fy.p f62565d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ User f62566e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ DateTime f62567f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ nm0.j<List<ky.d>, List<ky.d>> f62568g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(fy.p pVar, User user, DateTime dateTime, nm0.j<List<ky.d>, List<ky.d>> jVar, qm0.d<? super z> dVar) {
        super(2, dVar);
        this.f62565d = pVar;
        this.f62566e = user;
        this.f62567f = dateTime;
        this.f62568g = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        z zVar = new z(this.f62565d, this.f62566e, this.f62567f, this.f62568g, dVar);
        zVar.f62564c = obj;
        return zVar;
    }

    @Override // ym0.p
    public final Object invoke(androidx.lifecycle.h0<jj0.a> h0Var, qm0.d<? super nm0.y> dVar) {
        return ((z) create(h0Var, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i11;
        androidx.lifecycle.h0 h0Var;
        ky.a aVar;
        Object a11;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i12 = this.f62563b;
        User user = this.f62566e;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f62562a;
            h0Var = (androidx.lifecycle.h0) this.f62564c;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            androidx.lifecycle.h0 h0Var2 = (androidx.lifecycle.h0) this.f62564c;
            long q11 = user.q();
            i11 = ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT;
            int[] iArr = {ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT};
            this.f62564c = h0Var2;
            this.f62562a = ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT;
            this.f62563b = 1;
            Object a12 = fy.p.a(this.f62565d, q11, null, iArr, this, 54);
            if (a12 == coroutineSingletons) {
                return coroutineSingletons;
            }
            h0Var = h0Var2;
            obj = a12;
        }
        ky.d dVar = (ky.d) obj;
        if (dVar != null) {
            aVar = ly.a.d(i11, dVar);
        } else {
            aVar = null;
        }
        List<ky.d> allVascularAges = this.f62568g.c();
        DateTime date = this.f62567f;
        kotlin.jvm.internal.u.j(date, "date");
        kotlin.jvm.internal.u.j(user, "user");
        kotlin.jvm.internal.u.j(allVascularAges, "allVascularAges");
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : allVascularAges) {
            ky.d dVar2 = (ky.d) obj2;
            kotlin.jvm.internal.u.j(dVar2, "<this>");
            if (new Interval(date, a3.g.x(date)).contains(new DateTime(dVar2.c()))) {
                arrayList.add(obj2);
            }
        }
        if (allVascularAges.isEmpty() && aVar != null) {
            a11 = new a.C1135a(((int) aVar.f()) & 255, (((int) aVar.f()) & ConstantsWs.MEASURE_COUNT_REACHED_VALUE_MASK_MAX) >> 8);
        } else if (arrayList.isEmpty()) {
            Status.Icon icon = Status.Icon.f33327a;
            a11 = new jj0.a(C1987R.color.statusUndefined, C1987R.string.vascular_age_result_emptyState_title, C1987R.string.vascular_age_detail_empty_description);
        } else {
            ArrayList arrayList2 = new ArrayList(kotlin.collections.x.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ky.d dVar3 = (ky.d) it.next();
                Instant instant = dVar3.c().toInstant();
                kotlin.jvm.internal.u.i(instant, "toInstant(...)");
                arrayList2.add(new z70.b(instant, ly.a.f(ConstantsWs.MEASURE_TYPE_VASCULAR_AGE, dVar3)));
            }
            a80.b bVar = new a80.b(new a80.c());
            LocalDate localDate = user.f().toLocalDate();
            kotlin.jvm.internal.u.i(localDate, "toLocalDate(...)");
            z70.a b10 = bVar.b(arrayList2, localDate);
            if (b10 == null) {
                b10 = a.b.f110146a;
            }
            a11 = jj0.b.a(b10);
        }
        this.f62564c = null;
        this.f62563b = 2;
        if (h0Var.emit(a11, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return nm0.y.f85009a;
    }
}
