package com.withings.wiscale2.user.ui.profile;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.core.models.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$profileInfo$1", f = "EditProfileViewModel.kt", l = {130, ConstantsWs.MEASURE_TYPE_PAUSE}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class n0 extends kotlin.coroutines.jvm.internal.i implements ym0.s<User, l70.v, Double, Double, qm0.d<? super m70.m>, Object> {

    /* renamed from: a  reason: collision with root package name */
    boolean f62000a;

    /* renamed from: b  reason: collision with root package name */
    int f62001b;

    /* renamed from: c  reason: collision with root package name */
    /* synthetic */ Object f62002c;

    /* renamed from: d  reason: collision with root package name */
    /* synthetic */ Object f62003d;

    /* renamed from: e  reason: collision with root package name */
    /* synthetic */ Double f62004e;

    /* renamed from: f  reason: collision with root package name */
    /* synthetic */ Object f62005f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ s0 f62006g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(s0 s0Var, qm0.d<? super n0> dVar) {
        super(5, dVar);
        this.f62006g = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        User user;
        rf.a aVar;
        l70.v vVar;
        Double d11;
        Double d12;
        r70.a aVar2;
        boolean z5;
        Double d13;
        Double d14;
        l70.v vVar2;
        com.withings.user.User user2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62001b;
        s0 s0Var = this.f62006g;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    z5 = this.f62000a;
                    Double d15 = this.f62004e;
                    nm0.l.b(obj);
                    user2 = (com.withings.user.User) this.f62005f;
                    d13 = d15;
                    d14 = (Double) this.f62003d;
                    vVar2 = (l70.v) this.f62002c;
                    return new m70.m(user2, !((Boolean) obj).booleanValue(), !z5, d14, d13, vVar2);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d12 = (Double) this.f62005f;
            d11 = this.f62004e;
            vVar = (l70.v) this.f62003d;
            user = (User) this.f62002c;
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            user = (User) this.f62002c;
            l70.v vVar3 = (l70.v) this.f62003d;
            Double d16 = this.f62004e;
            Double d17 = (Double) this.f62005f;
            aVar = s0Var.f62045f;
            this.f62002c = user;
            this.f62003d = vVar3;
            this.f62004e = d16;
            this.f62005f = d17;
            this.f62001b = 1;
            Object a11 = aVar.a(this);
            if (a11 == coroutineSingletons) {
                return coroutineSingletons;
            }
            vVar = vVar3;
            obj = a11;
            d11 = d16;
            d12 = d17;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        com.withings.user.User e11 = o70.a.e(user);
        aVar2 = s0Var.f62052m;
        long id2 = user.getId();
        this.f62002c = vVar;
        this.f62003d = d11;
        this.f62004e = d12;
        this.f62005f = e11;
        this.f62000a = booleanValue;
        this.f62001b = 2;
        Object a12 = aVar2.a(id2, this);
        if (a12 == coroutineSingletons) {
            return coroutineSingletons;
        }
        z5 = booleanValue;
        d13 = d12;
        obj = a12;
        d14 = d11;
        vVar2 = vVar;
        user2 = e11;
        return new m70.m(user2, !((Boolean) obj).booleanValue(), !z5, d14, d13, vVar2);
    }

    @Override // ym0.s
    public final Object k(User user, l70.v vVar, Double d11, Double d12, qm0.d<? super m70.m> dVar) {
        n0 n0Var = new n0(this.f62006g, dVar);
        n0Var.f62002c = user;
        n0Var.f62003d = vVar;
        n0Var.f62004e = d11;
        n0Var.f62005f = d12;
        return n0Var.invokeSuspend(nm0.y.f85009a);
    }
}
