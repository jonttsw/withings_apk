package com.withings.ecg.live;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.k1;
import com.withings.core.device.FullScreenVideoActivity;
import com.withings.device.Device;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.ecg.instruction.EcgInstructionScreenActivity;
import com.withings.wiscale2.C1987R;
import javax.inject.Inject;
import kotlin.Metadata;
/* compiled from: LiveEcgActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/ecg/live/LiveEcgActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "CloseActivityBroadcastReceiver", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveEcgActivity extends Hilt_LiveEcgActivity {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f38591e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f38592f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f38593g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f38594h;

    /* renamed from: i  reason: collision with root package name */
    private final nm0.g f38595i;

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f38596j;

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f38597k;

    /* renamed from: l  reason: collision with root package name */
    private final nm0.g f38598l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f38599m;

    /* renamed from: n  reason: collision with root package name */
    private final nm0.g f38600n;

    /* renamed from: o  reason: collision with root package name */
    private final nm0.g f38601o;

    /* renamed from: p  reason: collision with root package name */
    private final m f38602p;

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f38603q;
    @Inject

    /* renamed from: r  reason: collision with root package name */
    public vf.c f38604r;
    @Inject

    /* renamed from: s  reason: collision with root package name */
    public pi.i f38605s;

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f38606t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f38607u;

    /* renamed from: v  reason: collision with root package name */
    private CloseActivityBroadcastReceiver f38608v;

    /* renamed from: x  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f38590x = {androidx.camera.core.v.c(LiveEcgActivity.class, "macAddress", "getMacAddress()Lcom/withings/util/MacAddress;", 0)};

    /* renamed from: w  reason: collision with root package name */
    public static final a f38589w = new Object();

    /* compiled from: LiveEcgActivity.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/withings/ecg/live/LiveEcgActivity$CloseActivityBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "ecg_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes3.dex */
    public final class CloseActivityBroadcastReceiver extends BroadcastReceiver {
        public CloseActivityBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            int i11;
            int i12;
            kotlin.jvm.internal.u.j(context, "context");
            kotlin.jvm.internal.u.j(intent, "intent");
            LiveEcgActivity liveEcgActivity = LiveEcgActivity.this;
            liveEcgActivity.finish();
            if (intent.getBooleanExtra("showError", false)) {
                Device f11 = kn.e.c().f(LiveEcgActivity.H3(liveEcgActivity));
                if (f11.getType() == 16) {
                    if (f11.getTrackerWearPosition() == 0) {
                        i11 = 2131231316;
                    } else {
                        i11 = 2131231315;
                    }
                    FullScreenVideoActivity.a aVar = FullScreenVideoActivity.f35312g;
                    if (f11.getModelId() == 91) {
                        i12 = C1987R.string.hwa08_ecgExplanationTutorial_video_URL;
                    } else {
                        i12 = C1987R.string.hwa09_ecgExplanationTutorial_video_URL_right;
                    }
                    aVar.getClass();
                    context.startActivity(FullScreenVideoActivity.a.a(C1987R.string.ecg_instruction_title, i12, i11, liveEcgActivity).addFlags(805306368));
                    return;
                }
                int i13 = EcgInstructionScreenActivity.f38566i;
                context.startActivity(new Intent(context, EcgInstructionScreenActivity.class).addFlags(805306368));
            }
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<EcgLineChart> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final EcgLineChart invoke() {
            return (EcgLineChart) LiveEcgActivity.this.findViewById(C1987R.id.graph);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) LiveEcgActivity.this.findViewById(C1987R.id.ecg_live_countdown);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) LiveEcgActivity.this.findViewById(C1987R.id.ecg_live_countdown_unit);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<jq.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f38613a = new kotlin.jvm.internal.w(0);

        @Override // ym0.a
        public final jq.f invoke() {
            jq.f fVar = jq.f.f74749d;
            if (fVar != null) {
                return fVar;
            }
            kotlin.jvm.internal.u.s("instance");
            throw null;
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<g0> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final g0 invoke() {
            EcgLineChart z32 = LiveEcgActivity.z3(LiveEcgActivity.this);
            kotlin.jvm.internal.u.i(z32, "access$getChartView(...)");
            return new g0(z32);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<ConstraintLayout> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) LiveEcgActivity.this.findViewById(C1987R.id.ecg_view);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<ImageView> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) LiveEcgActivity.this.findViewById(C1987R.id.fixed_signal);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        i() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) LiveEcgActivity.this.findViewById(C1987R.id.frame_rate);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class j extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        j() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) LiveEcgActivity.this.findViewById(C1987R.id.ecg_live_hr);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class k extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        k() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) LiveEcgActivity.this.findViewById(C1987R.id.loading);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class l extends kotlin.jvm.internal.w implements ym0.a<ConstraintLayout> {
        l() {
            super(0);
        }

        @Override // ym0.a
        public final ConstraintLayout invoke() {
            return (ConstraintLayout) LiveEcgActivity.this.findViewById(C1987R.id.loading_view);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class m implements bn0.d<Activity, u70.i> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f38621a = nm0.h.b(new d0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38622b;

        public m(Activity activity) {
            this.f38622b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [u70.i, java.lang.Object] */
        @Override // bn0.d
        public final u70.i getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f38621a.getValue();
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class n extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        n() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) LiveEcgActivity.this.findViewById(C1987R.id.ecg_live_subtitle);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class o extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        o() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) LiveEcgActivity.this.findViewById(C1987R.id.ecg_live_title);
        }
    }

    /* compiled from: LiveEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class p extends kotlin.jvm.internal.w implements ym0.a<com.withings.ecg.live.c> {
        p() {
            super(0);
        }

        @Override // ym0.a
        public final com.withings.ecg.live.c invoke() {
            LiveEcgActivity liveEcgActivity = LiveEcgActivity.this;
            return (com.withings.ecg.live.c) new k1(liveEcgActivity, new e0(liveEcgActivity)).a(com.withings.ecg.live.c.class);
        }
    }

    public LiveEcgActivity() {
        super(0);
        this.f38591e = nm0.h.b(new b());
        this.f38592f = nm0.h.b(new c());
        this.f38593g = nm0.h.b(new d());
        this.f38594h = nm0.h.b(new k());
        this.f38595i = nm0.h.b(new j());
        this.f38596j = nm0.h.b(new o());
        this.f38597k = nm0.h.b(new n());
        this.f38598l = nm0.h.b(new h());
        this.f38599m = nm0.h.b(new i());
        this.f38600n = nm0.h.b(new g());
        this.f38601o = nm0.h.b(new l());
        this.f38602p = new m(this);
        this.f38603q = nm0.h.b(e.f38613a);
        this.f38606t = nm0.h.b(new p());
        this.f38607u = nm0.h.b(new f());
        this.f38608v = new CloseActivityBroadcastReceiver();
    }

    public static final TextView A3(LiveEcgActivity liveEcgActivity) {
        return (TextView) liveEcgActivity.f38592f.getValue();
    }

    public static final TextView B3(LiveEcgActivity liveEcgActivity) {
        return (TextView) liveEcgActivity.f38593g.getValue();
    }

    public static final jq.f C3(LiveEcgActivity liveEcgActivity) {
        return (jq.f) liveEcgActivity.f38603q.getValue();
    }

    public static final g0 D3(LiveEcgActivity liveEcgActivity) {
        return (g0) liveEcgActivity.f38607u.getValue();
    }

    public static final TextView E3(LiveEcgActivity liveEcgActivity) {
        return (TextView) liveEcgActivity.f38599m.getValue();
    }

    public static final TextView F3(LiveEcgActivity liveEcgActivity) {
        return (TextView) liveEcgActivity.f38595i.getValue();
    }

    public static final ProgressBar G3(LiveEcgActivity liveEcgActivity) {
        return (ProgressBar) liveEcgActivity.f38594h.getValue();
    }

    public static final u70.i H3(LiveEcgActivity liveEcgActivity) {
        return (u70.i) liveEcgActivity.f38602p.getValue(liveEcgActivity, f38590x[0]);
    }

    public static final void J3(LiveEcgActivity liveEcgActivity) {
        xw.d.c(liveEcgActivity, liveEcgActivity.N3().G0(), new a0(liveEcgActivity));
        xw.d.c(liveEcgActivity, liveEcgActivity.N3().T0(), new b0(liveEcgActivity));
        xw.d.c(liveEcgActivity, liveEcgActivity.N3().M0(), new c0(liveEcgActivity));
    }

    public static final void K3(LiveEcgActivity liveEcgActivity) {
        EcgLineChart ecgLineChart = (EcgLineChart) liveEcgActivity.f38591e.getValue();
        kotlin.jvm.internal.u.i(ecgLineChart, "<get-chartView>(...)");
        ecgLineChart.setVisibility(4);
        ImageView imageView = (ImageView) liveEcgActivity.f38598l.getValue();
        kotlin.jvm.internal.u.i(imageView, "<get-fixedSignalImage>(...)");
        imageView.setVisibility(0);
    }

    public static final void L3(LiveEcgActivity liveEcgActivity) {
        ((ConstraintLayout) liveEcgActivity.f38600n.getValue()).setVisibility(8);
        ((ConstraintLayout) liveEcgActivity.f38601o.getValue()).setVisibility(0);
    }

    public static final void M3(LiveEcgActivity liveEcgActivity) {
        ((TextView) liveEcgActivity.f38596j.getValue()).setText(C1987R.string.ecg_live_lostPacketTitle);
        ((TextView) liveEcgActivity.f38597k.getValue()).setText(C1987R.string.ecg_live_lostPacketDescription);
        ((TextView) liveEcgActivity.f38595i.getValue()).setText(C1987R.string.ecg_live_lostPacketBottomText);
        EcgLineChart ecgLineChart = (EcgLineChart) liveEcgActivity.f38591e.getValue();
        kotlin.jvm.internal.u.i(ecgLineChart, "<get-chartView>(...)");
        ecgLineChart.setVisibility(4);
        ImageView imageView = (ImageView) liveEcgActivity.f38598l.getValue();
        kotlin.jvm.internal.u.i(imageView, "<get-fixedSignalImage>(...)");
        imageView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.withings.ecg.live.c N3() {
        return (com.withings.ecg.live.c) this.f38606t.getValue();
    }

    public static final EcgLineChart z3(LiveEcgActivity liveEcgActivity) {
        return (EcgLineChart) liveEcgActivity.f38591e.getValue();
    }

    @Override // com.withings.ecg.live.Hilt_LiveEcgActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        androidx.core.content.a.registerReceiver(this, this.f38608v, new IntentFilter("com.withings.wiscale2.activity.workout.gps.model.ui.closeEcgLiveViewActivity"), 4);
        xw.d.c(this, N3().U0(), new t(this));
        xw.d.c(this, N3().K0(), new v(this));
        xw.d.c(this, N3().F0(), new w(this));
        xw.d.c(this, N3().V0(), new x(this));
        xw.d.c(this, N3().R0(), new y(this));
        xw.d.c(this, N3().O0(), new z(this));
    }

    @Override // com.withings.ecg.live.Hilt_LiveEcgActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        ((g0) this.f38607u.getValue()).o();
        N3().X0();
        N3().Y0();
        ay.b.w(this, this.f38608v);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        N3().W0();
    }
}
