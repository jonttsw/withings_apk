package com.withings.wiscale2.vascularage;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import gz.e1;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$getMissingMeasurementCount$1", f = "VascularAgeViewModel.kt", l = {ConstantsWs.WS_STATUS_MISSING}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class w0 extends kotlin.coroutines.jvm.internal.i implements ym0.q<List<? extends ky.a>, User, qm0.d<? super Integer>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62496a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ List f62497b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ User f62498c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0 f62499d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(r0 r0Var, qm0.d<? super w0> dVar) {
        super(3, dVar);
        this.f62499d = r0Var;
    }

    @Override // ym0.q
    public final Object invoke(List<? extends ky.a> list, User user, qm0.d<? super Integer> dVar) {
        w0 w0Var = new w0(this.f62499d, dVar);
        w0Var.f62497b = list;
        w0Var.f62498c = user;
        return w0Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        iy.e eVar;
        List list;
        Integer num;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62496a;
        r0 r0Var = this.f62499d;
        if (i11 != 0) {
            if (i11 == 1) {
                list = this.f62497b;
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            List list2 = this.f62497b;
            User user = this.f62498c;
            eVar = r0Var.f62442c;
            long id2 = user.getId();
            this.f62497b = list2;
            this.f62496a = 1;
            Object d11 = iy.e.d(eVar, id2, ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT, null, null, false, this, 188);
            if (d11 == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
            obj = d11;
        }
        ky.d dVar = (ky.d) obj;
        Integer num2 = null;
        int i12 = 0;
        if (dVar != null) {
            r0Var.getClass();
            int f11 = (int) ly.a.f(ConstantsWs.MEASURE_TYPE_VA_REACHED_COUNT, dVar);
            e1.a aVar = new e1.a(dVar.c(), f11 & 255, (f11 & ConstantsWs.MEASURE_COUNT_REACHED_VALUE_MASK_MAX) >> 8, false);
            num = new Integer(aVar.e() - aVar.f());
        } else {
            num = null;
        }
        if (list.isEmpty()) {
            num2 = num;
        }
        if (num2 != null) {
            i12 = num2.intValue();
        }
        return new Integer(i12);
    }
}
