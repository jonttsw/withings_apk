package com.withings.wiscale2.profile;

import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.UserDetailsLabelLiveData$loadLastHeightFormattedValue$2", f = "ProfileViewModel.kt", l = {220}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class j1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super CharSequence>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59379a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i1 f59380b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f59381c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ jm.a f59382d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(i1 i1Var, User user, jm.a aVar, qm0.d<? super j1> dVar) {
        super(2, dVar);
        this.f59380b = i1Var;
        this.f59381c = user;
        this.f59382d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new j1(this.f59380b, this.f59381c, this.f59382d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super CharSequence> dVar) {
        return ((j1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        iy.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59379a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            eVar = this.f59380b.f59368f;
            long q11 = this.f59381c.q();
            this.f59379a = 1;
            obj = iy.e.d(eVar, q11, 4, null, null, false, this, 444);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ky.d dVar = (ky.d) obj;
        if (dVar != null) {
            return jm.a.c(this.f59382d, 4, ly.a.f(4, dVar), 0, 0, 60);
        }
        return "--";
    }
}
