package com.withings.device.setup.ui.ondemand;

import android.content.Context;
import android.widget.Toast;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import androidx.work.o;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/withings/device/setup/ui/ondemand/OnDemandDeviceSetupUninstallWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class OnDemandDeviceSetupUninstallWorker extends CoroutineWorker {

    /* renamed from: a  reason: collision with root package name */
    private final Context f37590a;

    /* renamed from: b  reason: collision with root package name */
    private final g f37591b;

    /* renamed from: c  reason: collision with root package name */
    private final g f37592c;

    /* renamed from: d  reason: collision with root package name */
    private o.a.c f37593d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnDemandDeviceSetup.kt */
    @e(c = "com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker", f = "OnDemandDeviceSetup.kt", l = {ConstantsWs.MEASURE_TYPE_HR_RMS_SD}, m = "doWork")
    /* loaded from: classes3.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: a  reason: collision with root package name */
        /* synthetic */ Object f37594a;

        /* renamed from: c  reason: collision with root package name */
        int f37596c;

        a(qm0.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f37594a = obj;
            this.f37596c |= Integer.MIN_VALUE;
            return OnDemandDeviceSetupUninstallWorker.this.doWork(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OnDemandDeviceSetup.kt */
    @e(c = "com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker$doWork$2", f = "OnDemandDeviceSetup.kt", l = {ConstantsWs.MEASURE_TYPE_NHS_LEFT_FOOT}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends i implements p<CoroutineScope, qm0.d<? super o.a>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f37597a;

        /* renamed from: b  reason: collision with root package name */
        private /* synthetic */ Object f37598b;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f37598b = obj;
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
            int i11 = this.f37597a;
            OnDemandDeviceSetupUninstallWorker onDemandDeviceSetupUninstallWorker = OnDemandDeviceSetupUninstallWorker.this;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    l.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f37598b;
                    if (OnDemandDeviceSetupUninstallWorker.o(onDemandDeviceSetupUninstallWorker)) {
                        return new o.a.c();
                    }
                    this.f37597a = 1;
                    obj = OnDemandDeviceSetupUninstallWorker.t(onDemandDeviceSetupUninstallWorker, this);
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
                Context context = onDemandDeviceSetupUninstallWorker.getContext();
                String string = onDemandDeviceSetupUninstallWorker.getContext().getString(C1987R.string._ERROR_);
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
            OnDemandDeviceSetupUninstallWorker onDemandDeviceSetupUninstallWorker = OnDemandDeviceSetupUninstallWorker.this;
            String string = onDemandDeviceSetupUninstallWorker.getContext().getString(onDemandDeviceSetupUninstallWorker.getInputData().c("param_module_name", -1));
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
            if (OnDemandDeviceSetupUninstallWorker.this.getInputData().c("param_module_name", -1) == -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            return Boolean.valueOf(z5);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnDemandDeviceSetupUninstallWorker(Context context, WorkerParameters params) {
        super(context, params);
        u.j(context, "context");
        u.j(params, "params");
        this.f37590a = context;
        this.f37591b = h.b(new c());
        this.f37592c = h.b(new d());
        this.f37593d = new o.a.c();
    }

    public static final boolean o(OnDemandDeviceSetupUninstallWorker onDemandDeviceSetupUninstallWorker) {
        return ((Boolean) onDemandDeviceSetupUninstallWorker.f37592c.getValue()).booleanValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(9:11|12|13|14|(1:16)|17|(1:19)|20|21)(2:24|25))(3:26|27|28))(3:37|38|(1:41)(1:40))|29|(1:32)(8:31|13|14|(0)|17|(0)|20|21)))|43|6|7|(0)(0)|29|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
        r6 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v9, types: [com.google.android.gms.tasks.OnFailureListener, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker r5, qm0.d r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof com.withings.device.setup.ui.ondemand.c
            if (r0 == 0) goto L16
            r0 = r6
            com.withings.device.setup.ui.ondemand.c r0 = (com.withings.device.setup.ui.ondemand.c) r0
            int r1 = r0.f37612e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f37612e = r1
            goto L1b
        L16:
            com.withings.device.setup.ui.ondemand.c r0 = new com.withings.device.setup.ui.ondemand.c
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.f37610c
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f37612e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker r5 = r0.f37608a
            nm0.l.b(r6)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r6 = move-exception
            goto L69
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker r5 = r0.f37609b
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker r2 = r0.f37608a
            nm0.l.b(r6)     // Catch: java.lang.Throwable -> L41
            goto L55
        L41:
            r6 = move-exception
            r5 = r2
            goto L69
        L44:
            nm0.l.b(r6)
            r0.f37608a = r5     // Catch: java.lang.Throwable -> L2f
            r0.f37609b = r5     // Catch: java.lang.Throwable -> L2f
            r0.f37612e = r4     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r6 = r5.getForegroundInfo(r0)     // Catch: java.lang.Throwable -> L2f
            if (r6 != r1) goto L54
            goto Lad
        L54:
            r2 = r5
        L55:
            androidx.work.g r6 = (androidx.work.g) r6     // Catch: java.lang.Throwable -> L41
            r0.f37608a = r2     // Catch: java.lang.Throwable -> L41
            r4 = 0
            r0.f37609b = r4     // Catch: java.lang.Throwable -> L41
            r0.f37612e = r3     // Catch: java.lang.Throwable -> L41
            java.lang.Object r5 = r5.setForeground(r6, r0)     // Catch: java.lang.Throwable -> L41
            if (r5 != r1) goto L65
            goto Lad
        L65:
            r5 = r2
        L66:
            nm0.y r6 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L2f
            goto L6c
        L69:
            nm0.l.a(r6)
        L6c:
            android.content.Context r6 = r5.f37590a
            id.e0 r6 = id.j0.a(r6)
            id.a r6 = r6.zza()
            java.lang.String r0 = "create(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            java.util.Set r0 = r6.d()
            nm0.g r1 = r5.f37591b
            java.lang.Object r2 = r1.getValue()
            java.lang.String r2 = (java.lang.String) r2
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto La3
            java.lang.Object r0 = r1.getValue()
            java.lang.String r0 = (java.lang.String) r0
            java.util.List r0 = kotlin.collections.x.V(r0)
            com.google.android.gms.tasks.Task r6 = r6.b(r0)
            com.google.android.gms.common.internal.a r0 = new com.google.android.gms.common.internal.a
            r0.<init>()
            r6.addOnFailureListener(r0)
        La3:
            androidx.work.o$a$c r5 = r5.f37593d
            if (r5 != 0) goto Lac
            androidx.work.o$a$c r5 = new androidx.work.o$a$c
            r5.<init>()
        Lac:
            r1 = r5
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker.t(com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker, qm0.d):java.lang.Object");
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
            boolean r0 = r6 instanceof com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker.a
            if (r0 == 0) goto L13
            r0 = r6
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker$a r0 = (com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker.a) r0
            int r1 = r0.f37596c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37596c = r1
            goto L18
        L13:
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker$a r0 = new com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f37594a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f37596c
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
            com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker$b r2 = new com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker$b
            r4 = 0
            r2.<init>(r4)
            r0.f37596c = r3
            java.lang.Object r6 = kotlinx.coroutines.BuildersKt.withContext(r6, r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r0 = "withContext(...)"
            kotlin.jvm.internal.u.i(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.device.setup.ui.ondemand.OnDemandDeviceSetupUninstallWorker.doWork(qm0.d):java.lang.Object");
    }

    public final Context getContext() {
        return this.f37590a;
    }
}
