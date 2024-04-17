package com.withings.wiscale2.partner.ui;

import android.content.Context;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.withings.partner.model.Partner;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: PartnerNotificationHandler.kt */
/* loaded from: classes5.dex */
public final class c2 implements e10.b {

    /* renamed from: a  reason: collision with root package name */
    private final a10.a f58933a;

    /* renamed from: b  reason: collision with root package name */
    private final ch.d f58934b;

    /* compiled from: PartnerNotificationHandler.kt */
    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ sm0.a<Partner> f58935a = sm0.b.a(Partner.values());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerNotificationHandler.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerNotificationHandlerImpl", f = "PartnerNotificationHandler.kt", l = {26}, m = "onClick")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        Context f58936a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f58937b;

        /* renamed from: d  reason: collision with root package name */
        int f58939d;

        b(qm0.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58937b = obj;
            this.f58939d |= Integer.MIN_VALUE;
            return c2.this.a(null, 0L, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PartnerNotificationHandler.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.partner.ui.PartnerNotificationHandlerImpl$onClick$2", f = "PartnerNotificationHandler.kt", l = {27}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.j<? extends GoogleSignInAccount, ? extends List<? extends Scope>>>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f58940a;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f58942c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Context f58943d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(long j5, Context context, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f58942c = j5;
            this.f58943d = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new c(this.f58942c, this.f58943d, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.j<? extends GoogleSignInAccount, ? extends List<? extends Scope>>> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f58940a;
            if (i11 != 0) {
                if (i11 == 1) {
                    nm0.l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                nm0.l.b(obj);
                a10.a aVar = c2.this.f58933a;
                this.f58940a = 1;
                if (aVar.d(this.f58942c, "PartnerAssociationError", this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return v10.d.a(this.f58943d);
        }
    }

    public c2(x00.b bVar, ch.d dVar) {
        this.f58933a = bVar;
        this.f58934b = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    @Override // e10.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r15, long r16, int r18, qm0.d<? super nm0.y> r19) {
        /*
            r14 = this;
            r6 = r14
            r7 = r15
            r0 = r18
            r1 = r19
            boolean r2 = r1 instanceof com.withings.wiscale2.partner.ui.c2.b
            if (r2 == 0) goto L1a
            r2 = r1
            com.withings.wiscale2.partner.ui.c2$b r2 = (com.withings.wiscale2.partner.ui.c2.b) r2
            int r3 = r2.f58939d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L1a
            int r3 = r3 - r4
            r2.f58939d = r3
        L18:
            r8 = r2
            goto L20
        L1a:
            com.withings.wiscale2.partner.ui.c2$b r2 = new com.withings.wiscale2.partner.ui.c2$b
            r2.<init>(r1)
            goto L18
        L20:
            java.lang.Object r1 = r8.f58937b
            kotlin.coroutines.intrinsics.CoroutineSingletons r9 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r8.f58939d
            r10 = 0
            r11 = 1
            if (r2 == 0) goto L3a
            if (r2 != r11) goto L32
            android.content.Context r0 = r8.f58936a
            nm0.l.b(r1)
            goto L7a
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            nm0.l.b(r1)
            sm0.a<com.withings.partner.model.Partner> r1 = com.withings.wiscale2.partner.ui.c2.a.f58935a
            kotlin.collections.c r1 = (kotlin.collections.c) r1
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r1.next()
            com.withings.partner.model.Partner r2 = (com.withings.partner.model.Partner) r2
            int r3 = r2.l()
            if (r3 != r0) goto L45
            com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r1 = r2.e()
            com.withings.partner.model.PartnerAssociationStatusLoader$AssociationStatus r2 = com.withings.partner.model.PartnerAssociationStatusLoader.AssociationStatus.f43517c
            if (r1 != r2) goto La3
            kotlinx.coroutines.CoroutineDispatcher r12 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.partner.ui.c2$c r13 = new com.withings.wiscale2.partner.ui.c2$c
            r5 = 0
            r0 = r13
            r1 = r14
            r2 = r16
            r4 = r15
            r0.<init>(r2, r4, r5)
            r8.f58936a = r7
            r8.f58939d = r11
            java.lang.Object r1 = kotlinx.coroutines.BuildersKt.withContext(r12, r13, r8)
            if (r1 != r9) goto L79
            return r9
        L79:
            r0 = r7
        L7a:
            nm0.j r1 = (nm0.j) r1
            java.lang.Object r2 = r1.a()
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r2 = (com.google.android.gms.auth.api.signin.GoogleSignInAccount) r2
            java.lang.Object r1 = r1.b()
            java.util.List r1 = (java.util.List) r1
            android.app.Activity r0 = b50.b.c(r0)
            java.util.Collection r1 = (java.util.Collection) r1
            com.google.android.gms.common.api.Scope[] r3 = new com.google.android.gms.common.api.Scope[r10]
            java.lang.Object[] r1 = r1.toArray(r3)
            com.google.android.gms.common.api.Scope[] r1 = (com.google.android.gms.common.api.Scope[]) r1
            int r3 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            com.google.android.gms.common.api.Scope[] r1 = (com.google.android.gms.common.api.Scope[]) r1
            r3 = 4097(0x1001, float:5.741E-42)
            com.google.android.gms.auth.api.signin.GoogleSignIn.requestPermissions(r0, r3, r2, r1)
            goto Lb2
        La3:
            ch.d r1 = r6.f58934b
            ch.g r1 = r1.a()
            r2 = 12
            android.content.Intent r0 = ch.g.b(r1, r15, r0, r10, r2)
            r15.startActivity(r0)
        Lb2:
            nm0.y r0 = nm0.y.f85009a
            return r0
        Lb5:
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
            java.lang.String r1 = "Collection contains no element matching the predicate."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.partner.ui.c2.a(android.content.Context, long, int, qm0.d):java.lang.Object");
    }
}
