package com.withings.nutrisync.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.core.view.l1;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: VitaminCDatavizActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/nutrisync/ui/VitaminCDatavizActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class VitaminCDatavizActivity extends Hilt_VitaminCDatavizActivity {

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f43203i = {androidx.camera.core.v.c(VitaminCDatavizActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(VitaminCDatavizActivity.class, "period", "getPeriod()Ljava/lang/String;", 0)};

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f43204j = 0;
    @Inject

    /* renamed from: e  reason: collision with root package name */
    public ch.d f43205e;
    @Inject

    /* renamed from: f  reason: collision with root package name */
    public r70.c f43206f;

    /* renamed from: g  reason: collision with root package name */
    private final b f43207g = new b(this);

    /* renamed from: h  reason: collision with root package name */
    private final c f43208h = new c(this);

    /* compiled from: VitaminCDatavizActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        a() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, 762222547, new w(VitaminCDatavizActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class b implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f43210a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f43211b;

        public b(Activity activity) {
            this.f43211b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f43210a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class c implements bn0.d<Activity, String> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f43212a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f43213b;

        public c(Activity activity) {
            this.f43213b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.lang.String] */
        @Override // bn0.d
        public final String getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f43212a.getValue();
        }
    }

    public VitaminCDatavizActivity() {
        kotlin.jvm.internal.u.i(registerForActivityResult(new g.a(), new com.withings.devicesetup.network.ui.a(this, 2)), "registerForActivityResult(...)");
        kotlin.jvm.internal.u.i(registerForActivityResult(new g.a(), new com.withings.nervehealth.ui.c(1)), "registerForActivityResult(...)");
    }

    public static final long A3(VitaminCDatavizActivity vitaminCDatavizActivity) {
        vitaminCDatavizActivity.getClass();
        return ((Number) vitaminCDatavizActivity.f43207g.getValue(vitaminCDatavizActivity, f43203i[0])).longValue();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(1:(1:9)(2:34|35))(2:36|(2:38|(1:40))(2:41|42))|10|11|12|(2:14|(2:27|28)(5:20|21|(1:23)|24|25))(2:29|30)))|43|6|(0)(0)|10|11|12|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0099, code lost:
        r8 = nm0.l.a(r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:20:0x005e, B:22:0x0062, B:24:0x0068, B:26:0x006e, B:28:0x0074, B:31:0x008b, B:32:0x0092, B:33:0x0093, B:34:0x0098), top: B:44:0x005e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093 A[Catch: all -> 0x0089, TryCatch #0 {all -> 0x0089, blocks: (B:20:0x005e, B:22:0x0062, B:24:0x0068, B:26:0x006e, B:28:0x0074, B:31:0x008b, B:32:0x0092, B:33:0x0093, B:34:0x0098), top: B:44:0x005e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object C3(com.withings.nutrisync.ui.VitaminCDatavizActivity r7, qm0.d r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof com.withings.nutrisync.ui.x
            if (r0 == 0) goto L16
            r0 = r8
            com.withings.nutrisync.ui.x r0 = (com.withings.nutrisync.ui.x) r0
            int r1 = r0.f43336d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f43336d = r1
            goto L1b
        L16:
            com.withings.nutrisync.ui.x r0 = new com.withings.nutrisync.ui.x
            r0.<init>(r7, r8)
        L1b:
            java.lang.Object r8 = r0.f43334b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.f76214a
            int r2 = r0.f43336d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            com.withings.nutrisync.ui.VitaminCDatavizActivity r7 = r0.f43333a
            nm0.l.b(r8)
            goto L5c
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            nm0.l.b(r8)
            r70.c r8 = r7.f43206f
            if (r8 == 0) goto Laa
            fn0.k<java.lang.Object>[] r2 = com.withings.nutrisync.ui.VitaminCDatavizActivity.f43203i
            r5 = 0
            r2 = r2[r5]
            com.withings.nutrisync.ui.VitaminCDatavizActivity$b r5 = r7.f43207g
            java.lang.Object r2 = r5.getValue(r7, r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r5 = r2.longValue()
            r0.f43333a = r7
            r0.f43336d = r4
            kotlinx.coroutines.flow.Flow r8 = r8.g(r5)
            java.lang.Object r8 = kotlinx.coroutines.flow.FlowKt.firstOrNull(r8, r0)
            if (r8 != r1) goto L5c
            goto La9
        L5c:
            com.withings.user.core.models.User r8 = (com.withings.user.core.models.User) r8
            ch.d r0 = r7.f43205e     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L93
            ah.d r0 = r0.s()     // Catch: java.lang.Throwable -> L89
            if (r8 == 0) goto L8b
            com.withings.user.core.models.User$Names r1 = r8.getNames()     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L8b
            java.lang.String r1 = r1.getFirst()     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L8b
            com.withings.user.core.models.User$Names r8 = r8.getNames()     // Catch: java.lang.Throwable -> L89
            java.lang.String r8 = r8.getLast()     // Catch: java.lang.Throwable -> L89
            r0.getClass()     // Catch: java.lang.Throwable -> L89
            android.content.Intent r8 = ah.d.f(r7, r1, r8)     // Catch: java.lang.Throwable -> L89
            r7.startActivity(r8)     // Catch: java.lang.Throwable -> L89
            nm0.y r8 = nm0.y.f85009a     // Catch: java.lang.Throwable -> L89
            goto L9d
        L89:
            r8 = move-exception
            goto L99
        L8b:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "null first name"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L89
            throw r8     // Catch: java.lang.Throwable -> L89
        L93:
            java.lang.String r8 = "intentBuilder"
            kotlin.jvm.internal.u.s(r8)     // Catch: java.lang.Throwable -> L89
            throw r3     // Catch: java.lang.Throwable -> L89
        L99:
            nm0.k$a r8 = nm0.l.a(r8)
        L9d:
            java.lang.Throwable r8 = nm0.k.b(r8)
            if (r8 != 0) goto La4
            goto La7
        La4:
            r7.D3(r8)
        La7:
            nm0.y r1 = nm0.y.f85009a
        La9:
            return r1
        Laa:
            java.lang.String r7 = "userRepository"
            kotlin.jvm.internal.u.s(r7)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.nutrisync.ui.VitaminCDatavizActivity.C3(com.withings.nutrisync.ui.VitaminCDatavizActivity, qm0.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D3(Throwable th2) {
        String string = getString(C1987R.string.authentication_error_generic);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        String message = th2.getMessage();
        String str = "";
        if (message == null) {
            message = "";
        }
        qc.b bVar = new qc.b(this);
        if (message.length() != 0) {
            str = " : ";
        }
        bVar.v(string + str + message);
        bVar.x(C1987R.string._OK_, new DialogInterface.OnClickListener() { // from class: com.withings.nutrisync.ui.c

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ boolean f43219a = true;

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                int i12 = VitaminCDatavizActivity.f43204j;
                VitaminCDatavizActivity this$0 = VitaminCDatavizActivity.this;
                kotlin.jvm.internal.u.j(this$0, "this$0");
                if (this.f43219a) {
                    this$0.finish();
                }
            }
        });
        bVar.s();
    }

    public static final String z3(VitaminCDatavizActivity vitaminCDatavizActivity) {
        return (String) vitaminCDatavizActivity.f43208h.getValue(vitaminCDatavizActivity, f43203i[1]);
    }

    @Override // com.withings.nutrisync.ui.Hilt_VitaminCDatavizActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        e.k.a(this, new s1.a(true, -2105234247, new a()));
    }
}
