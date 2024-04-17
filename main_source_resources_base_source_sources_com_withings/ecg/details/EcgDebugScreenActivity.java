package com.withings.ecg.details;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.withings.android.activity.WithingsActivity;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: EcgDebugScreenActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/ecg/details/EcgDebugScreenActivity;", "Lcom/withings/android/activity/WithingsActivity;", "<init>", "()V", "a", "ecg_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class EcgDebugScreenActivity extends WithingsActivity {

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f37991a = nm0.h.b(new b());

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f37992b = nm0.h.b(new c());

    /* renamed from: c  reason: collision with root package name */
    private final d f37993c = new d(this);

    /* renamed from: e  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f37990e = {androidx.camera.core.v.c(EcgDebugScreenActivity.class, "ecgId", "getEcgId()J", 0)};

    /* renamed from: d  reason: collision with root package name */
    public static final a f37989d = new Object();

    /* compiled from: EcgDebugScreenActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: EcgDebugScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) EcgDebugScreenActivity.this.findViewById(C1987R.id.debug_info);
        }
    }

    /* compiled from: EcgDebugScreenActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<ProgressBar> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ProgressBar invoke() {
            return (ProgressBar) EcgDebugScreenActivity.this.findViewById(C1987R.id.debug_progress);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes3.dex */
    public static final class d implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f37996a = nm0.h.b(new com.withings.ecg.details.d(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f37997b;

        public d(Activity activity) {
            this.f37997b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f37996a.getValue();
        }
    }

    public static final void A3(EcgDebugScreenActivity ecgDebugScreenActivity, String str) {
        ((TextView) ecgDebugScreenActivity.f37991a.getValue()).setText(str);
    }

    public static final void B3(EcgDebugScreenActivity ecgDebugScreenActivity, boolean z5) {
        int i11;
        ProgressBar progressBar = (ProgressBar) ecgDebugScreenActivity.f37992b.getValue();
        kotlin.jvm.internal.u.i(progressBar, "<get-debugProgress>(...)");
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        progressBar.setVisibility(i11);
    }

    public static final long z3(EcgDebugScreenActivity ecgDebugScreenActivity) {
        return ((Number) ecgDebugScreenActivity.f37993c.getValue(ecgDebugScreenActivity, f37990e[0])).longValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_ecg_debug_screen);
        e eVar = (e) new androidx.lifecycle.k1(this, new com.withings.ecg.details.a(this)).a(e.class);
        xw.d.c(this, eVar.g0(), new com.withings.ecg.details.b(this));
        xw.d.c(this, eVar.i0(), new com.withings.ecg.details.c(this));
    }
}
