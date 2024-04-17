package com.withings.wiscale2.profile;

import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: ProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.profile.UserDetailsLabelLiveData$loadLastWeightFormattedValue$2", f = "ProfileViewModel.kt", l = {208}, m = "invokeSuspend")
/* loaded from: classes5.dex */
final class k1 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super CharSequence>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f59384a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ i1 f59385b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f59386c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ jm.a f59387d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(i1 i1Var, User user, jm.a aVar, qm0.d<? super k1> dVar) {
        super(2, dVar);
        this.f59385b = i1Var;
        this.f59386c = user;
        this.f59387d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new k1(this.f59385b, this.f59386c, this.f59387d, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super CharSequence> dVar) {
        return ((k1) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        iy.e eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f59384a;
        if (i11 != 0) {
            if (i11 == 1) {
                nm0.l.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            nm0.l.b(obj);
            eVar = this.f59385b.f59368f;
            long q11 = this.f59386c.q();
            this.f59384a = 1;
            obj = iy.e.d(eVar, q11, 1, null, null, false, this, 444);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        ky.d dVar = (ky.d) obj;
        if (dVar != null) {
            return jm.a.c(this.f59387d, 1, ly.a.f(1, dVar), 0, 0, 60);
        }
        return "--";
    }
}
