package com.withings.wiscale2.healthsync;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.core.app.r;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.partner.model.Partner;
import com.withings.partner.model.capabilities.PartnerCapabilities;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.MainActivity;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.h;
import nm0.j;
import nm0.y;
import org.joda.time.DateTime;
import u10.g;
import u10.n0;
import ym0.l;
import ym0.p;
/* compiled from: Worker.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/withings/wiscale2/healthsync/ExchangeWorker;", "Lu10/g;", "Request", "Landroidx/work/CoroutineWorker;", "Lu10/n0;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class ExchangeWorker<Request extends g<?, ?, ?>> extends CoroutineWorker implements n0<Request> {

    /* renamed from: a  reason: collision with root package name */
    public User f56172a;

    /* renamed from: b  reason: collision with root package name */
    public DateTime f56173b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f56174c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f56175d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f56176e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f56177f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, List<Integer>> f56178g;

    /* compiled from: Worker.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<uf0.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f56179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Context context) {
            super(0);
            this.f56179a = context;
        }

        @Override // ym0.a
        public final uf0.a invoke() {
            return new uf0.a(this.f56179a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Worker.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.ExchangeWorker", f = "Worker.kt", l = {100}, m = "doWork$suspendImpl")
    /* loaded from: classes5.dex */
    public static final class b<Request extends g<?, ?, ?>> extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f56180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ExchangeWorker<Request> f56181b;

        /* renamed from: c  reason: collision with root package name */
        int f56182c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ExchangeWorker<Request> exchangeWorker, qm0.d<? super b> dVar) {
            super(dVar);
            this.f56181b = exchangeWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f56180a = obj;
            this.f56182c |= Integer.MIN_VALUE;
            return ExchangeWorker.w(this.f56181b, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: Worker.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.wiscale2.healthsync.ExchangeWorker$doWork$2", f = "Worker.kt", l = {111, 114, 115, 121, 121, 126}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class c extends i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        Object f56183a;

        /* renamed from: b  reason: collision with root package name */
        Object f56184b;

        /* renamed from: c  reason: collision with root package name */
        Object f56185c;

        /* renamed from: d  reason: collision with root package name */
        Partner f56186d;

        /* renamed from: e  reason: collision with root package name */
        Object f56187e;

        /* renamed from: f  reason: collision with root package name */
        ExchangeWorker f56188f;

        /* renamed from: g  reason: collision with root package name */
        int f56189g;

        /* renamed from: h  reason: collision with root package name */
        boolean f56190h;

        /* renamed from: i  reason: collision with root package name */
        int f56191i;

        /* renamed from: j  reason: collision with root package name */
        private /* synthetic */ Object f56192j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ ExchangeWorker<Request> f56193k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ExchangeWorker<Request> exchangeWorker, qm0.d<? super c> dVar) {
            super(2, dVar);
            this.f56193k = exchangeWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            c cVar = new c(this.f56193k, dVar);
            cVar.f56192j = obj;
            return cVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((c) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:100:0x02a1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:101:0x02a2  */
        /* JADX WARN: Removed duplicated region for block: B:108:0x02c9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:109:0x02ca  */
        /* JADX WARN: Removed duplicated region for block: B:112:0x02d3 A[Catch: all -> 0x00ba, TryCatch #5 {all -> 0x00ba, blocks: (B:110:0x02cb, B:112:0x02d3, B:113:0x02dd, B:106:0x02b3, B:98:0x028b, B:79:0x0231, B:86:0x0255, B:92:0x0262, B:94:0x0270, B:103:0x02ab, B:83:0x024a, B:85:0x0250, B:27:0x00b0, B:75:0x0209), top: B:137:0x00b0 }] */
        /* JADX WARN: Removed duplicated region for block: B:115:0x02e1  */
        /* JADX WARN: Removed duplicated region for block: B:116:0x02e4  */
        /* JADX WARN: Removed duplicated region for block: B:124:0x02f9  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x01df A[Catch: all -> 0x00da, TRY_LEAVE, TryCatch #4 {all -> 0x00da, blocks: (B:32:0x00d2, B:69:0x01db, B:71:0x01df), top: B:135:0x00d2 }] */
        /* JADX WARN: Removed duplicated region for block: B:77:0x022f A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0230  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x0247  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x025b  */
        /* JADX WARN: Removed duplicated region for block: B:91:0x0260  */
        /* JADX WARN: Type inference failed for: r0v13, types: [androidx.work.o$a$a, T] */
        /* JADX WARN: Type inference failed for: r7v0, types: [androidx.work.o$a$c, T] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 796
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.ExchangeWorker.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Worker.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements l<u10.w, u10.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ DateTime f56194a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f56195b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f56196c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f56197d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(DateTime dateTime, int i11, int i12, int i13) {
            super(1);
            this.f56194a = dateTime;
            this.f56195b = i11;
            this.f56196c = i12;
            this.f56197d = i13;
        }

        @Override // ym0.l
        public final u10.w invoke(u10.w wVar) {
            u10.w wVar2 = wVar;
            DateTime dateTime = this.f56194a;
            if (wVar2 != null) {
                return u10.w.a(wVar2, dateTime.getMillis(), null, 23);
            }
            return new u10.w(dateTime.getMillis(), null, this.f56195b, this.f56196c, this.f56197d);
        }
    }

    /* compiled from: Worker.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ExchangeWorker<Request> f56198a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(ExchangeWorker<Request> exchangeWorker) {
            super(0);
            this.f56198a = exchangeWorker;
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(this.f56198a.getInputData().b("forceread"));
        }
    }

    /* compiled from: Worker.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements l<u10.w, u10.w> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f56199a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f56200b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f56201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, int i11, int i12) {
            super(1);
            this.f56199a = str;
            this.f56200b = i11;
            this.f56201c = i12;
        }

        @Override // ym0.l
        public final u10.w invoke(u10.w wVar) {
            u10.w wVar2 = wVar;
            if (wVar2 != null) {
                return u10.w.a(wVar2, 0L, this.f56199a, 15);
            }
            return new u10.w(DateTime.now().getMillis(), this.f56199a, this.f56200b, this.f56201c, 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExchangeWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f56176e = h.b(new e(this));
        this.f56177f = h.b(new a(context));
        this.f56178g = s0.j(new j(2, x.W(1, 2, 3)), new j(1, x.V(4)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @android.annotation.SuppressLint({"RestrictedApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <Request extends u10.g<?, ?, ?>> java.lang.Object w(com.withings.wiscale2.healthsync.ExchangeWorker<Request> r5, qm0.d<? super androidx.work.o.a> r6) {
        /*
            boolean r0 = r6 instanceof com.withings.wiscale2.healthsync.ExchangeWorker.b
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.wiscale2.healthsync.ExchangeWorker$b r0 = (com.withings.wiscale2.healthsync.ExchangeWorker.b) r0
            int r1 = r0.f56182c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56182c = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.ExchangeWorker$b r0 = new com.withings.wiscale2.healthsync.ExchangeWorker$b
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f56180a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56182c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.wiscale2.healthsync.ExchangeWorker$c r2 = new com.withings.wiscale2.healthsync.ExchangeWorker$c
            r4 = 0
            r2.<init>(r5, r4)
            r0.f56182c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.ExchangeWorker.w(com.withings.wiscale2.healthsync.ExchangeWorker, qm0.d):java.lang.Object");
    }

    public final boolean A() {
        return this.f56175d;
    }

    public final String B(PartnerCapabilities capability) {
        Integer num;
        u.j(capability, "capability");
        int c11 = getInputData().c("brand", 0);
        List<Integer> list = a20.a.a().get(capability);
        if (list != null && (num = (Integer) x.K(list)) != null) {
            return z().b().c(c11, num.intValue());
        }
        return null;
    }

    public final boolean C() {
        return ((Boolean) this.f56176e.getValue()).booleanValue();
    }

    public Object D(int i11, qm0.d<? super o.a> dVar) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        return new o.a.C0176a();
                    }
                    return h().f(dVar);
                }
                return h().c(dVar);
            }
            return h().b(dVar);
        }
        return h().d(dVar);
    }

    public final void E(boolean z5) {
        this.f56175d = z5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void F(int i11, int i12, DateTime date) {
        u.j(date, "date");
        int c11 = getInputData().c("brand", 0);
        z().b().i(c11, i11, i12, new d(date, c11, i11, i12));
    }

    public final void G(PartnerCapabilities capability, String changeToken) {
        Integer num;
        u.j(capability, "capability");
        u.j(changeToken, "changeToken");
        int c11 = getInputData().c("brand", 0);
        List<Integer> list = a20.a.a().get(capability);
        if (list != null && (num = (Integer) x.K(list)) != null) {
            int intValue = num.intValue();
            z().b().i(c11, intValue, 1, new f(changeToken, c11, intValue));
        }
    }

    @Override // androidx.work.CoroutineWorker
    @SuppressLint({"RestrictedApi"})
    public final Object doWork(qm0.d<? super o.a> dVar) {
        return w(this, dVar);
    }

    @Override // androidx.work.CoroutineWorker
    public final Object getForegroundInfo(qm0.d<? super androidx.work.g> dVar) {
        int c11 = getInputData().c("brand", 0);
        MainActivity.a aVar = MainActivity.f47950r;
        Context applicationContext = getApplicationContext();
        u.i(applicationContext, "getApplicationContext(...)");
        aVar.getClass();
        PendingIntent activity = PendingIntent.getActivity(getApplicationContext(), 0, MainActivity.a.a(applicationContext), 201326592);
        Context applicationContext2 = getApplicationContext();
        u.i(applicationContext2, "getApplicationContext(...)");
        String a11 = wy.a.a(c11);
        u.g(activity);
        NotificationChannel notificationChannel = new NotificationChannel("PartnerSyncNotification", a11, 3);
        notificationChannel.setDescription("Health connect notification channel");
        Object systemService = applicationContext2.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        String string = applicationContext2.getString(C1987R.string._HEALTHKIT_SYNC_DATA_);
        u.i(string, "getString(...)");
        String string2 = applicationContext2.getString(C1987R.string._PARTNER_SYNC_MAY_TAKE_A_MOMENT__s_);
        u.i(string2, "getString(...)");
        String format = String.format(string2, Arrays.copyOf(new Object[]{a11}, 1));
        r rVar = new r(applicationContext2, "PartnerSyncNotification");
        rVar.F();
        rVar.e(true);
        rVar.u(true);
        rVar.h(androidx.core.content.a.getColor(applicationContext2, C1987R.color.statusInfo));
        rVar.B(2131231550);
        rVar.m(string);
        rVar.l(format);
        rVar.k(activity);
        Notification c12 = rVar.c();
        u.i(c12, "build(...)");
        if (Build.VERSION.SDK_INT >= 34) {
            return new androidx.work.g(42, 256, c12);
        }
        return new androidx.work.g(42, 0, c12);
    }

    public final User getUser() {
        User user = this.f56172a;
        if (user != null) {
            return user;
        }
        u.s(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final uf0.a p() {
        return (uf0.a) this.f56177f.getValue();
    }

    public final DateTime x() {
        DateTime dateTime = this.f56173b;
        if (dateTime != null) {
            return dateTime;
        }
        u.s("activationDate");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x008c, code lost:
        if (r8 != null) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable y(int r6, com.withings.partner.model.capabilities.PartnerCapabilities r7, qm0.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.withings.wiscale2.healthsync.a
            if (r0 == 0) goto L13
            r0 = r8
            com.withings.wiscale2.healthsync.a r0 = (com.withings.wiscale2.healthsync.a) r0
            int r1 = r0.f56205d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f56205d = r1
            goto L18
        L13:
            com.withings.wiscale2.healthsync.a r0 = new com.withings.wiscale2.healthsync.a
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f56203b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f56205d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.withings.wiscale2.healthsync.ExchangeWorker r6 = r0.f56202a
            nm0.l.b(r8)
            goto L71
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            nm0.l.b(r8)
            java.util.Map r8 = a20.a.a()
            java.lang.Object r7 = r8.get(r7)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L8f
            java.lang.Object r7 = kotlin.collections.x.K(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L8f
            int r7 = r7.intValue()
            androidx.work.f r8 = r5.getInputData()
            java.lang.String r2 = "brand"
            r4 = 0
            int r8 = r8.c(r2, r4)
            if (r6 != r3) goto L74
            fg0.a r6 = r5.z()
            u10.a0 r6 = r6.b()
            org.joda.time.DateTime r2 = r5.x()
            r0.f56202a = r5
            r0.f56205d = r3
            java.lang.Object r8 = r6.e(r8, r7, r2, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            r6 = r5
        L71:
            org.joda.time.DateTime r8 = (org.joda.time.DateTime) r8
            goto L8c
        L74:
            fg0.a r6 = r5.z()
            u10.a0 r6 = r6.b()
            org.joda.time.DateTime r6 = r6.d(r8, r7)
            org.joda.time.DateTime r7 = r5.x()
            java.lang.Comparable r6 = en0.r.d(r6, r7)
            r8 = r6
            org.joda.time.DateTime r8 = (org.joda.time.DateTime) r8
            r6 = r5
        L8c:
            if (r8 == 0) goto L90
            goto L94
        L8f:
            r6 = r5
        L90:
            org.joda.time.DateTime r8 = r6.x()
        L94:
            org.joda.time.DateTime r6 = org.joda.time.DateTime.now()
            java.lang.String r7 = "now(...)"
            kotlin.jvm.internal.u.i(r6, r7)
            org.joda.time.DateTime r6 = hn.a.m(r6)
            nm0.j r7 = new nm0.j
            r7.<init>(r8, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.healthsync.ExchangeWorker.y(int, com.withings.partner.model.capabilities.PartnerCapabilities, qm0.d):java.io.Serializable");
    }

    public abstract fg0.a z();
}
