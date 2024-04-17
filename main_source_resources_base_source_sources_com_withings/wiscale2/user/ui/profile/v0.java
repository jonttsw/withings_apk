package com.withings.wiscale2.user.ui.profile;

import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$updateUserInfo$2", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_WRONGDEVICEID, ConstantsWs.WS_STATUS_WRONGBATTERYLVL}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super User>, Object> {

    /* renamed from: a  reason: collision with root package name */
    User f62090a;

    /* renamed from: b  reason: collision with root package name */
    m70.f f62091b;

    /* renamed from: c  reason: collision with root package name */
    s0 f62092c;

    /* renamed from: d  reason: collision with root package name */
    User f62093d;

    /* renamed from: e  reason: collision with root package name */
    int f62094e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ User f62095f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ m70.f f62096g;

    /* renamed from: h  reason: collision with root package name */
    final /* synthetic */ s0 f62097h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(User user, m70.f fVar, s0 s0Var, qm0.d<? super v0> dVar) {
        super(2, dVar);
        this.f62095f = user;
        this.f62096g = fVar;
        this.f62097h = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        return new v0(this.f62095f, this.f62096g, this.f62097h, dVar);
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super User> dVar) {
        return ((v0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f0  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r11.f62094e
            java.lang.String r2 = "edit_profile"
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2a
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L16
            com.withings.user.User r0 = r11.f62090a
            nm0.l.b(r12)
            goto Lf1
        L16:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1e:
            com.withings.user.User r1 = r11.f62093d
            com.withings.wiscale2.user.ui.profile.s0 r4 = r11.f62092c
            m70.f r6 = r11.f62091b
            com.withings.user.User r7 = r11.f62090a
            nm0.l.b(r12)
            goto L90
        L2a:
            nm0.l.b(r12)
            com.withings.user.User r1 = r11.f62095f
            java.lang.String r12 = r1.i()
            java.lang.String r6 = "getEmail(...)"
            kotlin.jvm.internal.u.i(r12, r6)
            java.lang.CharSequence r12 = dp0.j.i0(r12)
            java.lang.String r12 = r12.toString()
            m70.f r6 = r11.f62096g
            java.lang.String r7 = r6.f()
            if (r7 == 0) goto L51
            java.lang.CharSequence r7 = dp0.j.i0(r7)
            java.lang.String r7 = r7.toString()
            goto L52
        L51:
            r7 = r5
        L52:
            boolean r12 = kotlin.jvm.internal.u.e(r12, r7)
            com.withings.wiscale2.user.ui.profile.s0 r7 = r11.f62097h
            if (r12 != 0) goto L94
            java.lang.String r12 = r6.f()
            if (r12 == 0) goto L69
            java.lang.CharSequence r12 = dp0.j.i0(r12)
            java.lang.String r12 = r12.toString()
            goto L6a
        L69:
            r12 = r5
        L6a:
            r1.Q(r12)
            r70.b r12 = com.withings.wiscale2.user.ui.profile.s0.F0(r7)
            p70.a r12 = r12.withSyncContext(r2)
            long r8 = r1.q()
            java.lang.String r10 = r1.i()
            r11.f62090a = r1
            r11.f62091b = r6
            r11.f62092c = r7
            r11.f62093d = r1
            r11.f62094e = r4
            java.lang.Object r12 = r12.h(r8, r10, r11)
            if (r12 != r0) goto L8e
            return r0
        L8e:
            r4 = r7
            r7 = r1
        L90:
            r12 = r1
            r1 = r7
            r7 = r4
            goto L95
        L94:
            r12 = r1
        L95:
            java.lang.String r4 = r6.i()
            r12.a0(r4)
            java.lang.String r4 = r6.n()
            r12.p0(r4)
            com.withings.common.compose.component.input.Gender r4 = r6.k()
            int r4 = r4.d()
            r12.c0(r4)
            com.withings.common.compose.component.input.AdvancedGender r4 = r6.a()
            java.lang.String r4 = r4.d()
            r12.G(r4)
            com.withings.common.compose.component.input.Pronoun r4 = r6.p()
            java.lang.String r4 = r4.d()
            r12.D0(r4)
            org.joda.time.DateTime r4 = new org.joda.time.DateTime
            java.lang.Long r8 = r6.d()
            r4.<init>(r8)
            r12.H(r4)
            int r4 = r6.h()
            r12.X(r4)
            q70.j r4 = com.withings.wiscale2.user.ui.profile.s0.A0(r7)
            com.withings.user.core.models.User r12 = o70.a.d(r12)
            r11.f62090a = r1
            r11.f62091b = r5
            r11.f62092c = r5
            r11.f62093d = r5
            r11.f62094e = r3
            java.lang.Object r12 = r4.c(r12, r2, r11)
            if (r12 != r0) goto Lf0
            return r0
        Lf0:
            r0 = r1
        Lf1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.v0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
