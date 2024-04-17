package com.withings.device.details.scale;

import com.withings.device.Device;
import com.withings.device.ws.SharePublicKey;
import com.withings.user.User;
import javax.inject.Inject;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* compiled from: GenerateShareScaleLinkUseCase.kt */
/* loaded from: classes3.dex */
public final class a implements com.withings.device.details.scale.b {

    /* renamed from: a  reason: collision with root package name */
    private final m70.i f36900a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GenerateShareScaleLinkUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.scale.GenerateShareScaleLinkFromPublicKeyUseCase", f = "GenerateShareScaleLinkUseCase.kt", l = {29}, m = "execute")
    /* renamed from: com.withings.device.details.scale.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0485a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f36901a;

        /* renamed from: c  reason: collision with root package name */
        int f36903c;

        C0485a(qm0.d<? super C0485a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f36901a = obj;
            this.f36903c |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: GenerateShareScaleLinkUseCase.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.device.details.scale.GenerateShareScaleLinkFromPublicKeyUseCase$execute$2$1", f = "GenerateShareScaleLinkUseCase.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super SharePublicKey>, Object> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Device f36905b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Device device, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f36905b = device;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f36905b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super SharePublicKey> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            User e11 = a.this.f36900a.e();
            kotlin.jvm.internal.u.i(e11, "getMainUser(...)");
            return new com.withings.common.device.q(this.f36905b.getId(), e11).call();
        }
    }

    @Inject
    public a(m70.i userManager) {
        kotlin.jvm.internal.u.j(userManager, "userManager");
        this.f36900a = userManager;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:34|35))(3:36|37|(1:39))|11|12|(2:14|(2:16|17)(2:19|20))(5:21|(1:23)(1:32)|(1:25)|26|(2:28|29)(2:30|31))))|42|6|7|(0)(0)|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r7 = nm0.l.a(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    @Override // com.withings.device.details.scale.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.withings.device.Device r6, qm0.d<? super com.withings.device.details.scale.b.a> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.withings.device.details.scale.a.C0485a
            if (r0 == 0) goto L13
            r0 = r7
            com.withings.device.details.scale.a$a r0 = (com.withings.device.details.scale.a.C0485a) r0
            int r1 = r0.f36903c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36903c = r1
            goto L18
        L13:
            com.withings.device.details.scale.a$a r0 = new com.withings.device.details.scale.a$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f36901a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f36903c
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            nm0.l.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L47
        L28:
            r6 = move-exception
            goto L4a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            nm0.l.b(r7)
            kotlinx.coroutines.CoroutineDispatcher r7 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L28
            com.withings.device.details.scale.a$b r2 = new com.withings.device.details.scale.a$b     // Catch: java.lang.Throwable -> L28
            r2.<init>(r6, r4)     // Catch: java.lang.Throwable -> L28
            r0.f36903c = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = kotlinx.coroutines.BuildersKt.withContext(r7, r2, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L47
            return r1
        L47:
            com.withings.device.ws.SharePublicKey r7 = (com.withings.device.ws.SharePublicKey) r7     // Catch: java.lang.Throwable -> L28
            goto L4e
        L4a:
            nm0.k$a r7 = nm0.l.a(r6)
        L4e:
            java.lang.Throwable r6 = nm0.k.b(r7)
            if (r6 != 0) goto L72
            com.withings.device.ws.SharePublicKey r7 = (com.withings.device.ws.SharePublicKey) r7
            if (r7 != 0) goto L65
            com.withings.device.details.scale.b$a$a r6 = new com.withings.device.details.scale.b$a$a
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Public Key for device is null"
            r7.<init>(r0)
            r6.<init>(r7)
            goto L8e
        L65:
            com.withings.device.details.scale.b$a$c r6 = new com.withings.device.details.scale.b$a$c
            java.lang.String r7 = r7.shorturl
            java.lang.String r0 = "shorturl"
            kotlin.jvm.internal.u.i(r7, r0)
            r6.<init>(r7)
            goto L8e
        L72:
            boolean r7 = r6 instanceof retrofit.RetrofitError
            if (r7 == 0) goto L7a
            r7 = r6
            retrofit.RetrofitError r7 = (retrofit.RetrofitError) r7
            goto L7b
        L7a:
            r7 = r4
        L7b:
            if (r7 == 0) goto L81
            retrofit.RetrofitError$Kind r4 = r7.getKind()
        L81:
            retrofit.RetrofitError$Kind r7 = retrofit.RetrofitError.Kind.NETWORK
            if (r4 != r7) goto L88
            com.withings.device.details.scale.b$a$b r6 = com.withings.device.details.scale.b.a.C0487b.f36908a
            goto L8e
        L88:
            com.withings.device.details.scale.b$a$a r7 = new com.withings.device.details.scale.b$a$a
            r7.<init>(r6)
            r6 = r7
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.details.scale.a.a(com.withings.device.Device, qm0.d):java.lang.Object");
    }
}
