package com.withings.wiscale2.device.common.ui;

import android.content.Context;
import androidx.compose.material.g6;
import com.withings.device.DeviceModel;
import com.withings.device.ws.SharePublicKey;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.common.ui.p0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: DeviceSharingActivity.kt */
@kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceSharingViewModel$share$1", f = "DeviceSharingActivity.kt", l = {ConstantsWs.MEASURE_TYPE_FAT_MASS_SEGMENT}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class u0 extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

    /* renamed from: a  reason: collision with root package name */
    kotlin.jvm.internal.p0 f54090a;

    /* renamed from: b  reason: collision with root package name */
    int f54091b;

    /* renamed from: c  reason: collision with root package name */
    private /* synthetic */ Object f54092c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ p0 f54093d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Context f54094e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceSharingActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.jvm.internal.w implements ym0.p<DeviceModel, SharePublicKey, nm0.y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f54095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f54096b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context, p0 p0Var) {
            super(2);
            this.f54095a = context;
            this.f54096b = p0Var;
        }

        @Override // ym0.p
        public final nm0.y invoke(DeviceModel deviceModel, SharePublicKey sharePublicKey) {
            DeviceModel deviceModel2 = deviceModel;
            SharePublicKey sharePublicKey2 = sharePublicKey;
            kotlin.jvm.internal.u.j(deviceModel2, "deviceModel");
            kotlin.jvm.internal.u.j(sharePublicKey2, "sharePublicKey");
            int I = fl.p.f67672b.a().d(deviceModel2.b()).I(deviceModel2.a());
            Context context = this.f54095a;
            String string = context.getString(I);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            this.f54096b.m0().setValue(new p0.a(g6.i(context.getString(C1987R.string.deviceSharing_message, string, string), sharePublicKey2.shorturl), null, 2));
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceSharingActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.device.common.ui.DeviceSharingViewModel$share$1$exception$1$1", f = "DeviceSharingActivity.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.p0<SharePublicKey> f54097a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p0 f54098b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.p0<SharePublicKey> p0Var, p0 p0Var2, qm0.d<? super b> dVar) {
            super(2, dVar);
            this.f54097a = p0Var;
            this.f54098b = p0Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(this.f54097a, this.f54098b, dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        /* JADX WARN: Type inference failed for: r5v2, types: [T, com.withings.device.ws.SharePublicKey] */
        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            nm0.l.b(obj);
            p0 p0Var = this.f54098b;
            User e11 = p0Var.q0().e();
            kotlin.jvm.internal.u.i(e11, "getMainUser(...)");
            this.f54097a.f76257a = new com.withings.common.device.q(p0Var.g0().f(p0Var.k0()).getId(), e11).call();
            return nm0.y.f85009a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(p0 p0Var, Context context, qm0.d<? super u0> dVar) {
        super(2, dVar);
        this.f54093d = p0Var;
        this.f54094e = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
        u0 u0Var = new u0(this.f54093d, this.f54094e, dVar);
        u0Var.f54092c = obj;
        return u0Var;
    }

    @Override // ym0.p
    public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
        return ((u0) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r1 = r7.f54091b
            r2 = 0
            com.withings.wiscale2.device.common.ui.p0 r3 = r7.f54093d
            r4 = 1
            if (r1 == 0) goto L20
            if (r1 != r4) goto L18
            kotlin.jvm.internal.p0 r0 = r7.f54090a
            java.lang.Object r1 = r7.f54092c
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            nm0.l.b(r8)     // Catch: java.lang.Throwable -> L16
            goto L43
        L16:
            r8 = move-exception
            goto L48
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L20:
            nm0.l.b(r8)
            java.lang.Object r8 = r7.f54092c
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            kotlin.jvm.internal.p0 r1 = new kotlin.jvm.internal.p0
            r1.<init>()
            kotlinx.coroutines.CoroutineDispatcher r5 = kotlinx.coroutines.Dispatchers.getIO()     // Catch: java.lang.Throwable -> L46
            com.withings.wiscale2.device.common.ui.u0$b r6 = new com.withings.wiscale2.device.common.ui.u0$b     // Catch: java.lang.Throwable -> L46
            r6.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> L46
            r7.f54092c = r8     // Catch: java.lang.Throwable -> L46
            r7.f54090a = r1     // Catch: java.lang.Throwable -> L46
            r7.f54091b = r4     // Catch: java.lang.Throwable -> L46
            java.lang.Object r8 = kotlinx.coroutines.BuildersKt.withContext(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            if (r8 != r0) goto L42
            return r0
        L42:
            r0 = r1
        L43:
            nm0.y r8 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L16
            goto L4c
        L46:
            r8 = move-exception
            r0 = r1
        L48:
            nm0.k$a r8 = nm0.l.a(r8)
        L4c:
            java.lang.Throwable r8 = nm0.k.b(r8)
            if (r8 == 0) goto L64
            xw.n r0 = r3.m0()
            com.withings.wiscale2.device.common.ui.p0$a r1 = new com.withings.wiscale2.device.common.ui.p0$a
            java.lang.Exception r3 = new java.lang.Exception
            r3.<init>(r8)
            r1.<init>(r2, r3, r4)
            r0.setValue(r1)
            goto L7c
        L64:
            nm0.j r8 = new nm0.j
            com.withings.device.DeviceModel r1 = r3.i0()
            T r0 = r0.f76257a
            r8.<init>(r1, r0)
            com.withings.wiscale2.device.common.ui.u0$a r0 = new com.withings.wiscale2.device.common.ui.u0$a
            android.content.Context r1 = r7.f54094e
            r0.<init>(r1, r3)
            java.lang.Object r8 = cr.a.a(r8, r0)
            nm0.y r8 = (nm0.y) r8
        L7c:
            nm0.y r8 = nm0.y.f85009a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.common.ui.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
