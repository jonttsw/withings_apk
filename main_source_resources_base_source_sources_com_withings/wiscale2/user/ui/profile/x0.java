package com.withings.wiscale2.user.ui.profile;

import com.withings.account.core.model.Account;
import com.withings.account.core.repositories.AccountSessionRepository;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.user.core.models.User;
import java.io.File;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EditProfileViewModel.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$uploadPicture$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_NOSHARINGS}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class x0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f62111a;

    /* renamed from: b  reason: collision with root package name */
    private /* synthetic */ Object f62112b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ s0 f62113c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ User f62114d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ File f62115e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EditProfileViewModel.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.user.ui.profile.EditProfileViewModel$uploadPicture$1$1$1", f = "EditProfileViewModel.kt", l = {ConstantsWs.WS_STATUS_PROASSOCIATIONMISMATCH}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super User.Images>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f62116a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ s0 f62117b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.withings.user.User f62118c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ File f62119d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(s0 s0Var, com.withings.user.User user, File file, qm0.d<? super a> dVar) {
            super(2, dVar);
            this.f62117b = s0Var;
            this.f62118c = user;
            this.f62119d = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new a(this.f62117b, this.f62118c, this.f62119d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super User.Images> dVar) {
            return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            vf.c cVar;
            AccountSessionRepository accountSessionRepository;
            q70.d dVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f62116a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                s0 s0Var = this.f62117b;
                cVar = s0Var.f62043d;
                Account h11 = cVar.h();
                accountSessionRepository = s0Var.f62044e;
                String n11 = kg.a.b(accountSessionRepository, h11.i().b()).n();
                dVar = s0Var.f62050k;
                com.withings.user.core.models.User d11 = o70.a.d(this.f62118c);
                String path = this.f62119d.getPath();
                kotlin.jvm.internal.u.i(path, "getPath(...)");
                this.f62116a = 1;
                obj = dVar.b(d11, path, n11, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(s0 s0Var, com.withings.user.User user, File file, qm0.d<? super x0> dVar) {
        super(2, dVar);
        this.f62113c = s0Var;
        this.f62114d = user;
        this.f62115e = file;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        x0 x0Var = new x0(this.f62113c, this.f62114d, this.f62115e, dVar);
        x0Var.f62112b = obj;
        return x0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((x0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r12.f62111a
            r2 = 0
            com.withings.user.User r3 = r12.f62114d
            com.withings.wiscale2.user.ui.profile.s0 r4 = r12.f62113c
            r5 = 1
            if (r1 == 0) goto L20
            if (r1 != r5) goto L18
            java.lang.Object r0 = r12.f62112b
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            nm0.l.b(r13)     // Catch: java.lang.Throwable -> L16
            goto L3f
        L16:
            r13 = move-exception
            goto L46
        L18:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L20:
            nm0.l.b(r13)
            java.lang.Object r13 = r12.f62112b
            kotlinx.coroutines.CoroutineScope r13 = (kotlinx.coroutines.CoroutineScope) r13
            java.io.File r1 = r12.f62115e
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L42
            com.withings.wiscale2.user.ui.profile.x0$a r7 = new com.withings.wiscale2.user.ui.profile.x0$a     // Catch: java.lang.Throwable -> L42
            r7.<init>(r4, r3, r1, r2)     // Catch: java.lang.Throwable -> L42
            r12.f62112b = r13     // Catch: java.lang.Throwable -> L42
            r12.f62111a = r5     // Catch: java.lang.Throwable -> L42
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r6, r7, r12)     // Catch: java.lang.Throwable -> L42
            if (r1 != r0) goto L3d
            return r0
        L3d:
            r0 = r13
            r13 = r1
        L3f:
            com.withings.user.core.models.User$Images r13 = (com.withings.user.core.models.User.Images) r13     // Catch: java.lang.Throwable -> L16
            goto L4a
        L42:
            r0 = move-exception
            r11 = r0
            r0 = r13
            r13 = r11
        L46:
            nm0.k$a r13 = nm0.l.a(r13)
        L4a:
            boolean r1 = r13 instanceof nm0.k.a
            r1 = r1 ^ r5
            if (r1 == 0) goto L55
            r1 = r13
            com.withings.user.core.models.User$Images r1 = (com.withings.user.core.models.User.Images) r1
            com.withings.wiscale2.user.ui.profile.s0.G0(r4, r3, r1)
        L55:
            java.lang.Throwable r13 = nm0.k.b(r13)
            if (r13 == 0) goto L71
            x70.b.e(r0, r13)
            r4.getClass()
            kotlinx.coroutines.CoroutineScope r5 = androidx.lifecycle.h1.a(r4)
            com.withings.wiscale2.user.ui.profile.k0 r8 = new com.withings.wiscale2.user.ui.profile.k0
            r8.<init>(r4, r2)
            r6 = 0
            r7 = 0
            r9 = 3
            r10 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r5, r6, r7, r8, r9, r10)
        L71:
            nm0.y r13 = nm0.y.f85009a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.user.ui.profile.x0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
