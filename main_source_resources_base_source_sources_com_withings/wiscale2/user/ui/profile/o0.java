package com.withings.wiscale2.user.ui.profile;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$resetUserBirthdate$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_TWITTERROR, ConstantsWs.WS_STATUS_WRONGPUBLICKEY}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class o0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62008a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ s0 f62009b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ User f62010c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ m70.f f62011d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(User user, m70.f fVar, s0 s0Var, qm0.d dVar) {
        super(2, dVar);
        this.f62009b = s0Var;
        this.f62010c = user;
        this.f62011d = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new o0(this.f62010c, this.f62011d, this.f62009b, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((o0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        LocalDate birthDate;
        q70.j jVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
        int i11 = this.f62008a;
        s0 s0Var = this.f62009b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    nm0.l.b(obj);
                    return nm0.y.f85009a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nm0.l.b(obj);
        } else {
            nm0.l.b(obj);
            SharedFlow<com.withings.user.core.models.User> c12 = s0Var.c1();
            this.f62008a = 1;
            obj = FlowKt.first(c12, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        com.withings.user.core.models.User user = (com.withings.user.core.models.User) obj;
        if (user != null && (birthDate = user.getBirthDate()) != null) {
            DateTime dateTimeAtStartOfDay = birthDate.toDateTimeAtStartOfDay(DateTimeZone.UTC);
            User user2 = this.f62010c;
            user2.H(dateTimeAtStartOfDay);
            this.f62011d.u(new Long(user2.f().getMillis()));
            jVar = s0Var.f62049j;
            com.withings.user.core.models.User d11 = o70.a.d(user2);
            this.f62008a = 2;
            if (jVar.c(d11, "edit_profile_reset_birthdate", this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return nm0.y.f85009a;
    }
}
