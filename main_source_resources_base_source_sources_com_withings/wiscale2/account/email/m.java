package com.withings.wiscale2.account.email;

import com.withings.account.core.model.Account;
import com.withings.library.authentication.api.ConstantsWs;
import kotlinx.coroutines.CoroutineScope;
import nm0.y;
import ym0.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: EmailModificationActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.account.email.EmailModificationViewModel$updateEmail$1", f = "EmailModificationActivity.kt", l = {ConstantsWs.WS_STATUS_PHONEACCOUNTNOTFOUND}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements p<CoroutineScope, qm0.d<? super y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    EmailModificationViewModel f48088a;

    /* renamed from: b  reason: collision with root package name */
    Account f48089b;

    /* renamed from: c  reason: collision with root package name */
    int f48090c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ Object f48091d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ EmailModificationViewModel f48092e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f48093f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(EmailModificationViewModel emailModificationViewModel, String str, qm0.d<? super m> dVar) {
        super(2, dVar);
        this.f48092e = emailModificationViewModel;
        this.f48093f = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
        m mVar = new m(this.f48092e, this.f48093f, dVar);
        mVar.f48091d = obj;
        return mVar;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
        return ((m) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r14.f48090c
            r2 = 2132017667(0x7f140203, float:1.9673619E38)
            r3 = 0
            com.withings.wiscale2.account.email.EmailModificationViewModel r4 = r14.f48092e
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 != r5) goto L1d
            com.withings.account.core.model.Account r0 = r14.f48089b
            com.withings.wiscale2.account.email.EmailModificationViewModel r1 = r14.f48088a
            java.lang.Object r6 = r14.f48091d
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            nm0.l.b(r15)     // Catch: java.lang.Throwable -> L1b
            goto L58
        L1b:
            r15 = move-exception
            goto L5e
        L1d:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L25:
            nm0.l.b(r15)
            java.lang.Object r15 = r14.f48091d
            kotlinx.coroutines.CoroutineScope r15 = (kotlinx.coroutines.CoroutineScope) r15
            androidx.lifecycle.j0 r1 = com.withings.wiscale2.account.email.EmailModificationViewModel.g0(r4)
            java.lang.Object r1 = r1.getValue()
            com.withings.account.core.model.Account r1 = (com.withings.account.core.model.Account) r1
            if (r1 == 0) goto Lb3
            java.lang.String r6 = r14.f48093f
            com.withings.account.network.ws.AccountRemoteRepository r7 = com.withings.wiscale2.account.email.EmailModificationViewModel.f0(r4)     // Catch: java.lang.Throwable -> L5b
            com.withings.account.core.model.Account$b r8 = r1.i()     // Catch: java.lang.Throwable -> L5b
            long r8 = r8.b()     // Catch: java.lang.Throwable -> L5b
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L5b
            r14.f48091d = r15     // Catch: java.lang.Throwable -> L5b
            r14.f48088a = r4     // Catch: java.lang.Throwable -> L5b
            r14.f48089b = r1     // Catch: java.lang.Throwable -> L5b
            r14.f48090c = r5     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r15 = r7.requestEmailUpdate(r8, r6, r14)     // Catch: java.lang.Throwable -> L5b
            if (r15 != r0) goto L56
            return r0
        L56:
            r0 = r1
            r1 = r4
        L58:
            nm0.y r15 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L1b
            goto L62
        L5b:
            r15 = move-exception
            r0 = r1
            r1 = r4
        L5e:
            nm0.k$a r15 = nm0.l.a(r15)
        L62:
            boolean r6 = r15 instanceof nm0.k.a
            r5 = r5 ^ r6
            if (r5 == 0) goto L8c
            r5 = r15
            nm0.y r5 = (nm0.y) r5
            androidx.lifecycle.k0 r5 = r1.t0()
            java.lang.Integer r6 = new java.lang.Integer
            r7 = 2132022065(0x7f141331, float:1.968254E38)
            r6.<init>(r7)
            r5.postValue(r6)
            kotlinx.coroutines.CoroutineScope r8 = androidx.lifecycle.h1.a(r1)
            kotlinx.coroutines.CoroutineDispatcher r9 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.account.email.l r11 = new com.withings.wiscale2.account.email.l
            r11.<init>(r1, r3)
            r10 = 0
            r12 = 2
            r13 = 0
            kotlinx.coroutines.BuildersKt.launch$default(r8, r9, r10, r11, r12, r13)
        L8c:
            java.lang.Throwable r15 = nm0.k.b(r15)
            if (r15 == 0) goto Lb2
            boolean r15 = r15 instanceof com.withings.webservices.legacy.common.exception.EmailExistsException
            if (r15 == 0) goto La6
            androidx.lifecycle.k0 r15 = r1.t0()
            java.lang.Integer r1 = new java.lang.Integer
            r3 = 2132022057(0x7f141329, float:1.9682523E38)
            r1.<init>(r3)
            r15.postValue(r1)
            goto Lb2
        La6:
            androidx.lifecycle.k0 r15 = r1.t0()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r2)
            r15.postValue(r1)
        Lb2:
            r3 = r0
        Lb3:
            if (r3 != 0) goto Lc1
            androidx.lifecycle.k0 r15 = r4.t0()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r2)
            r15.postValue(r0)
        Lc1:
            nm0.y r15 = nm0.y.f85009a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.account.email.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
