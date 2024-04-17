package com.withings.device.setup.ui.ondemand;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.appcompat.widget.v0;
import androidx.core.app.r;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import kotlinx.coroutines.CoroutineScope;
import nm0.g;
import nm0.h;
import nm0.k;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: OnDemandDeviceSetup.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/withings/device/setup/ui/ondemand/OnDemandDeviceSetupInstallWorker;", "Landroidx/work/CoroutineWorker;", "Lcom/withings/device/setup/ui/select/uc/LoadOnDemandModuleUseCase;", "loadOnDemandModuleUseCase", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Lcom/withings/device/setup/ui/select/uc/LoadOnDemandModuleUseCase;Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OnDemandDeviceSetupInstallWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final LoadOnDemandModuleUseCase f37578a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f37579b;

    /* renamed from: c  reason: collision with root package name */
    private final g f37580c;

    /* renamed from: d  reason: collision with root package name */
    private final g f37581d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnDemandDeviceSetup.kt */
    @e(c = "com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker", f = "OnDemandDeviceSetup.kt", l = {75}, m = "doWork")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f37582a;

        /* renamed from: c  reason: collision with root package name */
        int f37584c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37582a = obj;
            this.f37584c |= Integer.MIN_VALUE;
            return OnDemandDeviceSetupInstallWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnDemandDeviceSetup.kt */
    @e(c = "com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker$doWork$2", f = "OnDemandDeviceSetup.kt", l = {79}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37585a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f37586b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f37586b = obj;
            return bVar;
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super o.a> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object a11;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f37585a;
            OnDemandDeviceSetupInstallWorker onDemandDeviceSetupInstallWorker = OnDemandDeviceSetupInstallWorker.this;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f37586b;
                    if (OnDemandDeviceSetupInstallWorker.o(onDemandDeviceSetupInstallWorker)) {
                        return new o.a.c();
                    }
                    this.f37585a = 1;
                    obj = OnDemandDeviceSetupInstallWorker.t(onDemandDeviceSetupInstallWorker, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                a11 = (o.a) obj;
            } catch (Throwable th2) {
                a11 = l.a(th2);
            }
            Throwable b10 = k.b(a11);
            if (b10 != null) {
                x70.b.n(b10);
                Context context = onDemandDeviceSetupInstallWorker.getContext();
                String string = onDemandDeviceSetupInstallWorker.getContext().getString(C1987R.string._ERROR_);
                String message = b10.getMessage();
                Toast.makeText(context, string + ": " + message, 1).show();
                return new o.a.C0176a();
            }
            return a11;
        }
    }

    /* compiled from: OnDemandDeviceSetup.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<String> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            OnDemandDeviceSetupInstallWorker onDemandDeviceSetupInstallWorker = OnDemandDeviceSetupInstallWorker.this;
            String string = onDemandDeviceSetupInstallWorker.getContext().getString(onDemandDeviceSetupInstallWorker.getInputData().c("param_module_name", -1));
            u.i(string, "getString(...)");
            return string;
        }
    }

    /* compiled from: OnDemandDeviceSetup.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<Boolean> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            boolean z5;
            if (OnDemandDeviceSetupInstallWorker.this.getInputData().c("param_module_name", -1) == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnDemandDeviceSetupInstallWorker(LoadOnDemandModuleUseCase loadOnDemandModuleUseCase, Context context, WorkerParameters params) {
        super(context, params);
        u.j(loadOnDemandModuleUseCase, "loadOnDemandModuleUseCase");
        u.j(context, "context");
        u.j(params, "params");
        this.f37578a = loadOnDemandModuleUseCase;
        this.f37579b = context;
        this.f37580c = h.b(new c());
        this.f37581d = h.b(new d());
        new o.a.c();
    }

    public static final boolean o(OnDemandDeviceSetupInstallWorker onDemandDeviceSetupInstallWorker) {
        return ((Boolean) onDemandDeviceSetupInstallWorker.f37581d.getValue()).booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(1:(5:12|13|(1:23)(1:(1:17)(2:21|22))|18|19)(2:24|25))(10:26|27|28|29|(1:31)|13|(0)|23|18|19))(3:33|34|35))(3:44|45|(1:48)(1:47))|36|(1:39)(9:38|28|29|(0)|13|(0)|23|18|19)))|50|6|7|(0)(0)|36|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003f, code lost:
        r9 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker r8, qm0.d r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof com.withings.device.setup.ui.ondemand.a
            if (r0 == 0) goto L16
            r0 = r9
            com.withings.device.setup.ui.ondemand.a r0 = (com.withings.device.setup.ui.ondemand.a) r0
            int r1 = r0.f37606e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f37606e = r1
            goto L1b
        L16:
            com.withings.device.setup.ui.ondemand.a r0 = new com.withings.device.setup.ui.ondemand.a
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f37604c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f37606e
            r3 = 3
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L41
            if (r2 == r5) goto L39
            if (r2 != r3) goto L31
            nm0.l.b(r9)
            goto L8f
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L39:
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker r8 = r0.f37602a
            nm0.l.b(r9)     // Catch: java.lang.Throwable -> L3f
            goto L6d
        L3f:
            r9 = move-exception
            goto L70
        L41:
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker r8 = r0.f37603b
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker r2 = r0.f37602a
            nm0.l.b(r9)     // Catch: java.lang.Throwable -> L49
            goto L5d
        L49:
            r9 = move-exception
            r8 = r2
            goto L70
        L4c:
            nm0.l.b(r9)
            r0.f37602a = r8     // Catch: java.lang.Throwable -> L3f
            r0.f37603b = r8     // Catch: java.lang.Throwable -> L3f
            r0.f37606e = r6     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r9 = r8.getForegroundInfo(r0)     // Catch: java.lang.Throwable -> L3f
            if (r9 != r1) goto L5c
            goto Lae
        L5c:
            r2 = r8
        L5d:
            androidx.work.g r9 = (androidx.work.g) r9     // Catch: java.lang.Throwable -> L49
            r0.f37602a = r2     // Catch: java.lang.Throwable -> L49
            r0.f37603b = r4     // Catch: java.lang.Throwable -> L49
            r0.f37606e = r5     // Catch: java.lang.Throwable -> L49
            java.lang.Object r8 = r8.setForeground(r9, r0)     // Catch: java.lang.Throwable -> L49
            if (r8 != r1) goto L6c
            goto Lae
        L6c:
            r8 = r2
        L6d:
            nm0.y r9 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L3f
            goto L73
        L70:
            nm0.l.a(r9)
        L73:
            com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase r9 = r8.f37578a
            nm0.g r2 = r8.f37580c
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            com.withings.device.setup.ui.ondemand.b r7 = new com.withings.device.setup.ui.ondemand.b
            r7.<init>(r8)
            r0.f37602a = r4
            r0.f37603b = r4
            r0.f37606e = r3
            java.lang.Object r9 = r9.a(r2, r7, r0)
            if (r9 != r1) goto L8f
            goto Lae
        L8f:
            com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase$Status r9 = (com.withings.device.setup.ui.select.uc.LoadOnDemandModuleUseCase.Status) r9
            int r8 = r9.ordinal()
            if (r8 == 0) goto La8
            if (r8 == r6) goto La8
            if (r8 != r5) goto La2
            androidx.work.o$a$a r8 = new androidx.work.o$a$a
            r8.<init>()
        La0:
            r1 = r8
            goto Lae
        La2:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        La8:
            androidx.work.o$a$c r8 = new androidx.work.o$a$c
            r8.<init>()
            goto La0
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker.t(com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker, qm0.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(qm0.d<? super androidx.work.o.a> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker$a r0 = (com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker.a) r0
            int r1 = r0.f37584c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37584c = r1
            goto L18
        L13:
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker$a r0 = new com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37582a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f37584c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            nm0.l.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            nm0.l.b(r6)
            kotlinx.coroutines.CoroutineDispatcher r6 = kotlinx.coroutines.Dispatchers.getIO()
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker$b r2 = new com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f37584c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupInstallWorker.doWork(qm0.d):java.lang.Object");
    }

    public final Context getContext() {
        return this.f37579b;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object getForegroundInfo(qm0.d<? super androidx.work.g> dVar) {
        Context context = this.f37579b;
        String string = context.getString(C1987R.string.wifiConfiguring_title);
        String format = String.format(v0.c(string, "getString(...)", context, C1987R.string._PARTNER_SYNC_MAY_TAKE_A_MOMENT__s_, "getString(...)"), Arrays.copyOf(new Object[]{new Integer(getInputData().c("param_device_model_name", -1))}, 1));
        NotificationChannel notificationChannel = new NotificationChannel("onDemandChannel", string, 3);
        Object systemService = context.getSystemService(RemoteMessageConst.NOTIFICATION);
        u.h(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannel(notificationChannel);
        r rVar = new r(context, "onDemandChannel");
        rVar.F();
        rVar.e(true);
        rVar.h(androidx.core.content.a.getColor(context, C1987R.color.statusInfo));
        rVar.B(2131231550);
        rVar.m(string);
        rVar.l(format);
        Notification c11 = rVar.c();
        u.i(c11, "build(...)");
        if (Build.VERSION.SDK_INT >= 34) {
            return new androidx.work.g(43, 256, c11);
        }
        return new androidx.work.g(43, 0, c11);
    }
}
