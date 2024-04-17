package com.withings.wiscale2.utils.fcmlegacy;

import android.content.Context;
import androidx.activity.result.c;
import androidx.appcompat.app.h;
import androidx.camera.core.y1;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.withings.library.authentication.api.ConstantsWs;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import qm0.d;
/* compiled from: FcmRegisterer.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/withings/wiscale2/utils/fcmlegacy/RegisterFcmWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RegisterFcmWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final CoroutineDispatcher f62161a;

    /* compiled from: FcmRegisterer.kt */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final int f62162a;

        /* renamed from: b  reason: collision with root package name */
        private final long f62163b;

        /* renamed from: c  reason: collision with root package name */
        private final int f62164c;

        /* renamed from: d  reason: collision with root package name */
        private final String f62165d;

        /* renamed from: e  reason: collision with root package name */
        private final String f62166e;

        public a(long j5, String applicationVersion, int i11, int i12, String str) {
            u.j(applicationVersion, "applicationVersion");
            this.f62162a = i11;
            this.f62163b = j5;
            this.f62164c = i12;
            this.f62165d = applicationVersion;
            this.f62166e = str;
        }

        public final long a() {
            return this.f62163b;
        }

        public final int b() {
            return this.f62164c;
        }

        public final String c() {
            return this.f62165d;
        }

        public final int d() {
            return this.f62162a;
        }

        public final String e() {
            return this.f62166e;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f62162a == aVar.f62162a && this.f62163b == aVar.f62163b && this.f62164c == aVar.f62164c && u.e(this.f62165d, aVar.f62165d) && u.e(this.f62166e, aVar.f62166e)) {
                return true;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode;
            int c11 = d.c(this.f62165d, h.a(this.f62164c, c.a(this.f62163b, Integer.hashCode(this.f62162a) * 31, 31), 31), 31);
            String str = this.f62166e;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return c11 + hashCode;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Params(consumer=");
            sb2.append(this.f62162a);
            sb2.append(", accountOrUserId=");
            sb2.append(this.f62163b);
            sb2.append(", applicationId=");
            sb2.append(this.f62164c);
            sb2.append(", applicationVersion=");
            sb2.append(this.f62165d);
            sb2.append(", syncContext=");
            return y1.e(sb2, this.f62166e, ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FcmRegisterer.kt */
    @e(c = "com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker", f = "FcmRegisterer.kt", l = {107}, m = "doWork")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        RegisterFcmWorker f62167a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f62168b;

        /* renamed from: d  reason: collision with root package name */
        int f62170d;

        b(d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f62168b = obj;
            this.f62170d |= Integer.MIN_VALUE;
            return RegisterFcmWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RegisterFcmWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f62161a = Dispatchers.getIO();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker.b
            if (r0 == 0) goto L13
            r0 = r12
            com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker$b r0 = (com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker.b) r0
            int r1 = r0.f62170d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f62170d = r1
            goto L18
        L13:
            com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker$b r0 = new com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f62168b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f62170d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker r0 = r0.f62167a
            nm0.l.b(r12)
            goto L4d
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            nm0.l.b(r12)
            com.google.firebase.messaging.FirebaseMessaging r12 = com.google.firebase.messaging.FirebaseMessaging.getInstance()
            com.google.android.gms.tasks.Task r12 = r12.getToken()
            java.lang.String r2 = "getToken(...)"
            kotlin.jvm.internal.u.i(r12, r2)
            r0.f62167a = r11
            r0.f62170d = r3
            java.lang.Object r12 = kotlinx.coroutines.tasks.TasksKt.await(r12, r0)
            if (r12 != r1) goto L4c
            return r1
        L4c:
            r0 = r11
        L4d:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r1 = "FCM Registration Token: "
            java.lang.String r1 = androidx.activity.a0.b(r1, r12)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            x70.b.l(r0, r1, r2)
            java.lang.String r1 = "BLACKLISTED"
            boolean r1 = kotlin.jvm.internal.u.e(r12, r1)
            if (r1 != 0) goto Le4
            com.google.gson.JsonObject r1 = new com.google.gson.JsonObject
            r1.<init>()
            androidx.work.f r2 = r0.getInputData()
            java.lang.String r3 = "applicationVersion"
            java.lang.String r2 = r2.g(r3)
            java.lang.String r3 = "appliver"
            r1.addProperty(r3, r2)
            androidx.work.f r2 = r0.getInputData()
            java.lang.String r3 = "syncContext"
            java.lang.String r2 = r2.g(r3)
            com.withings.webservices.legacy.Webservices r3 = com.withings.webservices.legacy.Webservices.get()
            java.lang.Class<com.withings.wiscale2.utils.fcmlegacy.PushApi> r4 = com.withings.wiscale2.utils.fcmlegacy.PushApi.class
            java.lang.Object r2 = r3.getApiForAccount(r4, r2)
            com.withings.wiscale2.utils.fcmlegacy.PushApi r2 = (com.withings.wiscale2.utils.fcmlegacy.PushApi) r2
            kotlin.jvm.internal.u.g(r12)
            java.lang.String r3 = r1.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.u.i(r3, r1)
            androidx.work.f r1 = r0.getInputData()
            java.lang.String r4 = "accountOrUser"
            r5 = -1
            long r4 = r1.e(r4, r5)
            androidx.work.f r1 = r0.getInputData()
            java.lang.String r6 = "consumer"
            r7 = -1
            int r1 = r1.c(r6, r7)
            long r8 = (long) r1
            androidx.work.f r0 = r0.getInputData()
            java.lang.String r1 = "applicationId"
            int r0 = r0.c(r1, r7)
            java.lang.String r10 = "nmw"
            r1 = r2
            r2 = r12
            r6 = r8
            r8 = r0
            r9 = r10
            r1.registerPush(r2, r3, r4, r6, r8, r9)
            java.util.HashMap r0 = u70.l.f101541c
            java.lang.String r1 = "withings-library"
            java.lang.Object r0 = r0.get(r1)
            u70.l r0 = (u70.l) r0
            android.content.SharedPreferences r0 = r0.b()
            java.lang.String r1 = "getPrefs(...)"
            kotlin.jvm.internal.u.i(r0, r1)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r1 = "registration_id"
            r0.putString(r1, r12)
            r0.apply()
        Le4:
            androidx.work.o$a$c r12 = new androidx.work.o$a$c
            r12.<init>()
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.utils.fcmlegacy.RegisterFcmWorker.doWork(qm0.d):java.lang.Object");
    }

    @Override // androidx.work.CoroutineWorker
    public final CoroutineDispatcher getCoroutineContext() {
        return this.f62161a;
    }
}
