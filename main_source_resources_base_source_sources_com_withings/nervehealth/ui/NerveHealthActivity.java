package com.withings.nervehealth.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.URLUtil;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.v0;
import androidx.core.view.l1;
import androidx.lifecycle.i1;
import androidx.lifecycle.k1;
import androidx.lifecycle.m1;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.graph.decorator.i;
import com.withings.healthplus.navigation.ui.navigation.NavigationArguments;
import com.withings.nervehealth.core.model.MeasureCategory;
import com.withings.wiscale2.C1987R;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import p00.c;
/* compiled from: NerveHealthActivity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000b²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\nX\u008a\u0084\u0002²\u0006\u000e\u0010\n\u001a\u0004\u0018\u00010\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/withings/nervehealth/ui/NerveHealthActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lpy/a;", "<init>", "()V", "Lp00/c;", "uiState", "", "", "deviceModels", "relevantModelId", "nervehealth-ui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class NerveHealthActivity extends Hilt_NerveHealthActivity implements py.a {

    /* renamed from: u  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f42355u = {androidx.camera.core.v.c(NerveHealthActivity.class, NavigationArguments.USER_ID, "getUserId()J", 0), androidx.camera.core.v.c(NerveHealthActivity.class, "category", "getCategory()Lcom/withings/nervehealth/core/model/MeasureCategory;", 0)};
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public ch.d f42360i;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public o00.h f42363l;
    @Inject

    /* renamed from: m  reason: collision with root package name */
    public o00.b f42364m;
    @Inject

    /* renamed from: n  reason: collision with root package name */
    public u00.b f42365n;
    @Inject

    /* renamed from: o  reason: collision with root package name */
    public o00.a f42366o;

    /* renamed from: p  reason: collision with root package name */
    private StateFlow<? extends p00.c> f42367p;

    /* renamed from: q  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f42368q;

    /* renamed from: r  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f42369r;

    /* renamed from: s  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f42370s;

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f42371t;

    /* renamed from: e  reason: collision with root package name */
    private final f f42356e = new f(this);

    /* renamed from: f  reason: collision with root package name */
    private final g f42357f = new g(this);

    /* renamed from: g  reason: collision with root package name */
    private final i1 f42358g = new i1(kotlin.jvm.internal.q0.b(NerveHealthViewModel.class), new i(this), new h(this), new j(this));

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f42359h = nm0.h.b(new b());

    /* renamed from: j  reason: collision with root package name */
    private final nm0.g f42361j = nm0.h.b(new c());

    /* renamed from: k  reason: collision with root package name */
    private final nm0.g f42362k = nm0.h.b(new d());

    /* compiled from: NerveHealthActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<String> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final String invoke() {
            int ordinal = NerveHealthActivity.A3(NerveHealthActivity.this).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 || ordinal == 2) {
                    return "electrodermal_activity";
                }
                throw new NoWhenBranchMatchedException();
            }
            return "nerve_health_score";
        }
    }

    /* compiled from: NerveHealthActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<ys.d> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ys.d invoke() {
            ParcelableSnapshotMutableState f11;
            f11 = androidx.compose.runtime.l0.f(null, v0.f8878a);
            return new ys.d(new p0(NerveHealthActivity.this, f11));
        }
    }

    /* compiled from: NerveHealthActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(androidx.core.content.a.getColor(NerveHealthActivity.this, C1987R.color.datavizGridlineDefault));
        }
    }

    /* compiled from: NerveHealthActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<List<? extends i.b>> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final List<? extends i.b> invoke() {
            NerveHealthActivity nerveHealthActivity = NerveHealthActivity.this;
            String string = nerveHealthActivity.getString(C1987R.string.nerveHealth_confirmedScore);
            kotlin.jvm.internal.u.i(string, "getString(...)");
            i.b bVar = new i.b(string, C1987R.drawable.legend_circle_blue);
            String string2 = nerveHealthActivity.getString(C1987R.string.nerveHealth_predictedScore);
            kotlin.jvm.internal.u.i(string2, "getString(...)");
            return kotlin.collections.x.W(bVar, new i.b(string2, C1987R.drawable.legend_diamond_monochromatic_ghost3));
        }
    }

    /* compiled from: NerveHealthActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.p<androidx.compose.runtime.a, Integer, nm0.y> {
        e() {
            super(2);
        }

        @Override // ym0.p
        public final nm0.y invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            if ((num.intValue() & 11) == 2 && aVar2.h()) {
                aVar2.C();
            } else {
                yk.o.b(false, s1.b.b(aVar2, -1234790932, new v(NerveHealthActivity.this)), aVar2, 48, 1);
            }
            return nm0.y.f85009a;
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class f implements bn0.d<Activity, Long> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f42377a = nm0.h.b(new w(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f42378b;

        public f(Activity activity) {
            this.f42378b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Long, java.lang.Object] */
        @Override // bn0.d
        public final Long getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f42377a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes4.dex */
    public static final class g implements bn0.d<Activity, MeasureCategory> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f42379a = nm0.h.b(new x(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f42380b;

        public g(Activity activity) {
            this.f42380b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.nervehealth.core.model.MeasureCategory, java.lang.Object] */
        @Override // bn0.d
        public final MeasureCategory getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f42379a.getValue();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class h extends kotlin.jvm.internal.w implements ym0.a<k1.b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f42381a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentActivity componentActivity) {
            super(0);
            this.f42381a = componentActivity;
        }

        @Override // ym0.a
        public final k1.b invoke() {
            return this.f42381a.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class i extends kotlin.jvm.internal.w implements ym0.a<m1> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f42382a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ComponentActivity componentActivity) {
            super(0);
            this.f42382a = componentActivity;
        }

        @Override // ym0.a
        public final m1 invoke() {
            return this.f42382a.getViewModelStore();
        }
    }

    /* compiled from: ActivityViewModelLazy.kt */
    /* loaded from: classes4.dex */
    public static final class j extends kotlin.jvm.internal.w implements ym0.a<i6.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComponentActivity f42383a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f42383a = componentActivity;
        }

        @Override // ym0.a
        public final i6.a invoke() {
            return this.f42383a.getDefaultViewModelCreationExtras();
        }
    }

    public NerveHealthActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.nervehealth.ui.c(0));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f42368q = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new Object());
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f42369r = registerForActivityResult2;
        androidx.activity.result.b<Intent> registerForActivityResult3 = registerForActivityResult(new g.a(), new Object());
        kotlin.jvm.internal.u.i(registerForActivityResult3, "registerForActivityResult(...)");
        this.f42370s = registerForActivityResult3;
        this.f42371t = nm0.h.b(new a());
    }

    public static final MeasureCategory A3(NerveHealthActivity nerveHealthActivity) {
        nerveHealthActivity.getClass();
        return (MeasureCategory) nerveHealthActivity.f42357f.getValue(nerveHealthActivity, f42355u[1]);
    }

    public static final ys.d B3(NerveHealthActivity nerveHealthActivity) {
        return (ys.d) nerveHealthActivity.f42359h.getValue();
    }

    public static final int C3(NerveHealthActivity nerveHealthActivity) {
        return ((Number) nerveHealthActivity.f42361j.getValue()).intValue();
    }

    public static final List E3(NerveHealthActivity nerveHealthActivity) {
        return (List) nerveHealthActivity.f42362k.getValue();
    }

    public static final long H3(NerveHealthActivity nerveHealthActivity) {
        return ((Number) nerveHealthActivity.f42356e.getValue(nerveHealthActivity, f42355u[0])).longValue();
    }

    public static final void J3(NerveHealthActivity nerveHealthActivity, Integer num) {
        int i11;
        nerveHealthActivity.getClass();
        MeasureCategory category = (MeasureCategory) nerveHealthActivity.f42357f.getValue(nerveHealthActivity, f42355u[1]);
        kotlin.jvm.internal.u.j(category, "category");
        MeasureCategory measureCategory = MeasureCategory.f42341c;
        if (category == measureCategory && num != null && num.intValue() == 10) {
            i11 = C1987R.string.nerveHealthScore_secondaryCard_predicted_help_url_wbs08;
        } else if (category == measureCategory) {
            i11 = C1987R.string.nerveHealthScore_secondaryCard_predicted_help_url;
        } else if (category == MeasureCategory.f42343e) {
            i11 = C1987R.string.electrochemicalSkinConductanceScore_secondaryCard_predicted_help_url;
        } else if (category == MeasureCategory.f42342d && num != null && num.intValue() == 10) {
            i11 = C1987R.string.electrodermalActivity_secondaryCard_predicted_help_url_wbs08;
        } else {
            i11 = C1987R.string.electrodermalActivity_secondaryCard_predicted_help_url;
        }
        String string = nerveHealthActivity.getString(i11);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        if (URLUtil.isValidUrl(string)) {
            nerveHealthActivity.startActivity(HMWebActivity.f35395c.c(nerveHealthActivity, null, string));
            return;
        }
        String string2 = nerveHealthActivity.getString(C1987R.string._ERROR_WRONGACCOUNTPARAMS_);
        Toast.makeText(nerveHealthActivity, string2 + " " + string, 1).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NerveHealthViewModel K3() {
        return (NerveHealthViewModel) this.f42358g.getValue();
    }

    @Override // py.a
    public final String getAnalyticsDetailsViewIdentifier() {
        return (String) this.f42371t.getValue();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [ym0.q, kotlin.coroutines.jvm.internal.i] */
    @Override // com.withings.nervehealth.ui.Hilt_NerveHealthActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        l1.a(getWindow(), false);
        Flow combine = FlowKt.combine(K3().M0(), K3().U0(), new com.withings.nervehealth.ui.i(this, null));
        com.withings.nervehealth.ui.e eVar = new com.withings.nervehealth.ui.e(K3().M0(), this);
        com.withings.nervehealth.ui.f fVar = new com.withings.nervehealth.ui.f(K3().T0(), this);
        this.f42367p = FlowKt.stateIn(FlowKt.combine(FlowKt.combine(K3().T0(), fVar, combine, eVar, new com.withings.nervehealth.ui.h(this, null)), FlowKt.combine(K3().O0(), K3().V0(), K3().d1(), K3().R0(), K3().X0(), new com.withings.nervehealth.ui.j(null)), new kotlin.coroutines.jvm.internal.i(3, null)), m0.t.l(this), SharingStarted.Companion.getEagerly(), c.a.f90174a);
        e.k.a(this, new s1.a(true, -951070894, new e()));
        K3().K0().v(this, new k(this));
        K3().W0().observe(this, new y(new l(this)));
    }
}
