package com.withings.ecg.fullscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.camera.core.v;
import androidx.lifecycle.k1;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.withings.alarm.ui.f;
import com.withings.android.activity.WithingsActivity;
import com.withings.ecg.graph.EcgLineChart;
import com.withings.library.ecg.EcgLeadType;
import com.withings.wiscale2.C1987R;
import fn0.k;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
import sg.j;
/* compiled from: FullScreenEcgActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/fullscreen/FullScreenEcgActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FullScreenEcgActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final g f38373a = h.b(new c());

    /* renamed from: b  reason: collision with root package name */
    private final e f38374b = new e(this);

    /* renamed from: c  reason: collision with root package name */
    private final g f38375c = h.b(new b());

    /* renamed from: d  reason: collision with root package name */
    private final g f38376d = h.b(new d());

    /* renamed from: f  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f38372f = {v.c(FullScreenEcgActivity.class, "ecgId", "getEcgId()J", 0)};

    /* renamed from: e  reason: collision with root package name */
    public static final a f38371e = new Object();

    /* compiled from: FullScreenEcgActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: FullScreenEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends w implements ym0.a<EcgLeadType> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final EcgLeadType invoke() {
            Object obj;
            Intent intent = FullScreenEcgActivity.this.getIntent();
            u.i(intent, "getIntent(...)");
            if (Build.VERSION.SDK_INT >= 33) {
                obj = intent.getSerializableExtra("lead", EcgLeadType.class);
            } else {
                Object serializableExtra = intent.getSerializableExtra("lead");
                if (!(serializableExtra instanceof EcgLeadType)) {
                    serializableExtra = null;
                }
                obj = (EcgLeadType) serializableExtra;
            }
            return (EcgLeadType) obj;
        }
    }

    /* compiled from: FullScreenEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends w implements ym0.a<EcgLineChart> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final EcgLineChart invoke() {
            return (EcgLineChart) FullScreenEcgActivity.this.findViewById(C1987R.id.graph);
        }
    }

    /* compiled from: FullScreenEcgActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends w implements ym0.a<FloatingActionButton> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final FloatingActionButton invoke() {
            return (FloatingActionButton) FullScreenEcgActivity.this.findViewById(C1987R.id.button_scale);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class e implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final g f38380a = h.b(new com.withings.ecg.fullscreen.c(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f38381b;

        public e(Activity activity) {
            this.f38381b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, k property) {
            Activity thisRef = activity;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f38380a.getValue();
        }
    }

    public static final long A3(FullScreenEcgActivity fullScreenEcgActivity) {
        return ((Number) fullScreenEcgActivity.f38374b.getValue(fullScreenEcgActivity, f38372f[0])).longValue();
    }

    public static final EcgLeadType B3(FullScreenEcgActivity fullScreenEcgActivity) {
        return (EcgLeadType) fullScreenEcgActivity.f38375c.getValue();
    }

    public static final EcgLineChart C3(FullScreenEcgActivity fullScreenEcgActivity) {
        Object value = fullScreenEcgActivity.f38373a.getValue();
        u.i(value, "getValue(...)");
        return (EcgLineChart) value;
    }

    public static final FloatingActionButton D3(FullScreenEcgActivity fullScreenEcgActivity) {
        Object value = fullScreenEcgActivity.f38376d.getValue();
        u.i(value, "getValue(...)");
        return (FloatingActionButton) value;
    }

    public static void z3(FullScreenEcgActivity this$0) {
        u.j(this$0, "this$0");
        Object value = this$0.f38373a.getValue();
        u.i(value, "getValue(...)");
        EcgLineChart ecgLineChart = (EcgLineChart) value;
        while (ecgLineChart.getViewPortHandler().c()) {
            ecgLineChart.O();
        }
        Object value2 = this$0.f38376d.getValue();
        u.i(value2, "getValue(...)");
        ((FloatingActionButton) value2).setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_ecg_fullscreen);
        Object value = this.f38373a.getValue();
        u.i(value, "getValue(...)");
        EcgLineChart ecgLineChart = (EcgLineChart) value;
        ecgLineChart.setZoomOutMoreListener(new com.withings.ecg.fullscreen.a(this));
        ecgLineChart.setFullScreen(true);
        ecgLineChart.setPinchZoom(true);
        ecgLineChart.setGridEnabled(true);
        ecgLineChart.setScaleXEnabled(true);
        findViewById(C1987R.id.button_close).setOnClickListener(new j(this, 3));
        findViewById(C1987R.id.button_rotate).setOnClickListener(new com.google.android.material.search.g(this, 4));
        Object value2 = this.f38376d.getValue();
        u.i(value2, "getValue(...)");
        ((FloatingActionButton) value2).setOnClickListener(new f(this, 3));
        xw.d.c(this, ((nq.a) new k1(this, new nq.d(this)).a(nq.a.class)).f0(), new com.withings.ecg.fullscreen.b(this));
    }
}
