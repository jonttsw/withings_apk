package com.withings.wiscale2.vascularage;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: VascularAgeViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.vascularage.VascularAgeViewModel$pwvMeasureGroup$1", f = "VascularAgeViewModel.kt", l = {ConstantsWs.MEASURE_TYPE_VHD_RESULT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.i implements ym0.q<User, Boolean, qm0.d<? super List<? extends ky.a>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62243a;

    /* renamed from: b  reason: collision with root package name */
    /* synthetic */ User f62244b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ boolean f62245c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ r0 f62246d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(r0 r0Var, qm0.d<? super a1> dVar) {
        super(3, dVar);
        this.f62246d = r0Var;
    }

    @Override // ym0.q
    public final Object invoke(User user, Boolean bool, qm0.d<? super List<? extends ky.a>> dVar) {
        boolean booleanValue = bool.booleanValue();
        a1 a1Var = new a1(this.f62246d, dVar);
        a1Var.f62244b = user;
        a1Var.f62245c = booleanValue;
        return a1Var.invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        iy.e eVar;
        Object b10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62243a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
                b10 = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            User user = this.f62244b;
            if (this.f62245c) {
                eVar = this.f62246d.f62442c;
                this.f62243a = 1;
                b10 = iy.e.b(eVar, user.getId(), 91, null, null, new int[]{8}, true, false, false, this, 668);
                if (b10 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                return kotlin.collections.i0.f76187a;
            }
        }
        Iterable<ky.d> iterable = (Iterable) b10;
        ArrayList arrayList = new ArrayList(kotlin.collections.x.y(iterable, 10));
        for (ky.d dVar : iterable) {
            arrayList.add(ly.a.d(91, dVar));
        }
        return arrayList;
    }
}
