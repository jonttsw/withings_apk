package com.withings.wiscale2.heart.bloodpressure;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.e1;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.recyclerview.widget.RecyclerView;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.periodsbar.Period;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.heart.HeartDetailActivity;
import com.withings.wiscale2.heart.bloodpressure.a;
import com.withings.wiscale2.sections.StickyHeaderLayoutManager;
import fj0.f;
import hj0.a;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: BloodPressureMeasureListActivity.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0002\b\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/withings/wiscale2/heart/bloodpressure/BloodPressureMeasureListActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/wiscale2/sections/StickyHeaderLayoutManager$a;", "Lhj0/a$b;", "Lcom/withings/wiscale2/heart/bloodpressure/a$d;", "Lfj0/f$a;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class BloodPressureMeasureListActivity extends Hilt_BloodPressureMeasureListActivity implements StickyHeaderLayoutManager.a, a.b, a.d, f.a {

    /* renamed from: e  reason: collision with root package name */
    private final by.kirich1409.viewbindingdelegate.f f57304e;

    /* renamed from: f  reason: collision with root package name */
    private final d f57305f;

    /* renamed from: g  reason: collision with root package name */
    private final e f57306g;

    /* renamed from: h  reason: collision with root package name */
    private final f f57307h;

    /* renamed from: i  reason: collision with root package name */
    private int f57308i;

    /* renamed from: j  reason: collision with root package name */
    private final Intent f57309j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public fy.l f57310k;
    @Inject

    /* renamed from: l  reason: collision with root package name */
    public fy.n f57311l;

    /* renamed from: m  reason: collision with root package name */
    private final nm0.g f57312m;

    /* renamed from: n  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f57313n;

    /* renamed from: o  reason: collision with root package name */
    private com.withings.wiscale2.heart.bloodpressure.a f57314o;

    /* renamed from: q  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f57303q = {androidx.camera.core.v.c(BloodPressureMeasureListActivity.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/ActivityMeasuresListBinding;", 0), androidx.camera.core.v.c(BloodPressureMeasureListActivity.class, "period", "getPeriod()Lcom/withings/periodsbar/Period;", 0), androidx.camera.core.v.c(BloodPressureMeasureListActivity.class, "dateTime", "getDateTime()Lorg/joda/time/DateTime;", 0), androidx.camera.core.v.c(BloodPressureMeasureListActivity.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: p  reason: collision with root package name */
    public static final b f57302p = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BloodPressureMeasureListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a extends g1 {

        /* renamed from: a  reason: collision with root package name */
        private final User f57315a;

        /* renamed from: b  reason: collision with root package name */
        private final DateTime f57316b;

        /* renamed from: c  reason: collision with root package name */
        private final a.b f57317c;

        /* renamed from: d  reason: collision with root package name */
        private final fy.l f57318d;

        /* renamed from: e  reason: collision with root package name */
        private final fy.n f57319e;

        /* renamed from: f  reason: collision with root package name */
        private final Period f57320f;

        /* renamed from: g  reason: collision with root package name */
        private final androidx.lifecycle.k0<Boolean> f57321g;

        /* renamed from: h  reason: collision with root package name */
        private final androidx.lifecycle.j0 f57322h;

        /* compiled from: BloodPressureMeasureListActivity.kt */
        /* renamed from: com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public /* synthetic */ class C0745a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f57323a;

            static {
                int[] iArr = new int[Period.values().length];
                try {
                    Period.a aVar = Period.f43718c;
                    iArr[2] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    Period.a aVar2 = Period.f43718c;
                    iArr[4] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f57323a = iArr;
            }
        }

        public a(User user, DateTime dateTime, BloodPressureMeasureListActivity delegate, fy.l lVar, fy.n nVar, Period period) {
            kotlin.jvm.internal.u.j(user, "user");
            kotlin.jvm.internal.u.j(dateTime, "dateTime");
            kotlin.jvm.internal.u.j(delegate, "delegate");
            this.f57315a = user;
            this.f57316b = dateTime;
            this.f57317c = delegate;
            this.f57318d = lVar;
            this.f57319e = nVar;
            this.f57320f = period;
            androidx.lifecycle.k0<Boolean> b10 = xw.d.b(Boolean.FALSE);
            this.f57321g = b10;
            this.f57322h = e1.c(b10, new w(this));
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static final java.io.Serializable g0(com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity.a r13, qm0.d r14) {
            /*
                Method dump skipped, instructions count: 250
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity.a.g0(com.withings.wiscale2.heart.bloodpressure.BloodPressureMeasureListActivity$a, qm0.d):java.io.Serializable");
        }

        public final androidx.lifecycle.j0 i0() {
            return this.f57322h;
        }

        public final void j0() {
            this.f57321g.setValue(Boolean.TRUE);
        }
    }

    /* compiled from: BloodPressureMeasureListActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b {
        public static Intent a(Context context, User user, DateTime dateTime, Period period) {
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(context, BloodPressureMeasureListActivity.class).putExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, user).putExtra("date", dateTime).putExtra("period", period);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            return putExtra;
        }
    }

    /* compiled from: BloodPressureMeasureListActivity.kt */
    /* loaded from: classes5.dex */
    static final class c implements androidx.lifecycle.l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f57324a;

        c(ym0.l lVar) {
            this.f57324a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.lifecycle.l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f57324a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f57324a;
        }

        public final int hashCode() {
            return this.f57324a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f57324a.invoke(obj);
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class d implements bn0.d<Activity, Period> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57325a = nm0.h.b(new y(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57326b;

        public d(Activity activity) {
            this.f57326b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.periodsbar.Period, java.lang.Object] */
        @Override // bn0.d
        public final Period getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57325a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class e implements bn0.d<Activity, DateTime> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57327a = nm0.h.b(new z(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57328b;

        public e(Activity activity) {
            this.f57328b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [org.joda.time.DateTime, java.lang.Object] */
        @Override // bn0.d
        public final DateTime getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57327a.getValue();
        }
    }

    /* compiled from: Activity.kt */
    /* loaded from: classes5.dex */
    public static final class f implements bn0.d<Activity, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f57329a = nm0.h.b(new a0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Activity f57330b;

        public f(Activity activity) {
            this.f57330b = activity;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Activity activity, fn0.k property) {
            Activity thisRef = activity;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f57329a.getValue();
        }
    }

    /* compiled from: ActivityViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class g extends kotlin.jvm.internal.w implements ym0.l<ComponentActivity, tb0.d0> {
        @Override // ym0.l
        public final tb0.d0 invoke(ComponentActivity componentActivity) {
            ComponentActivity activity = componentActivity;
            kotlin.jvm.internal.u.j(activity, "activity");
            View e11 = androidx.core.app.a.e(activity, C1987R.id.container);
            kotlin.jvm.internal.u.i(e11, "requireViewById(this, id)");
            return tb0.d0.a(e11);
        }
    }

    /* compiled from: BloodPressureMeasureListActivity.kt */
    /* loaded from: classes5.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.a<a> {
        h() {
            super(0);
        }

        @Override // ym0.a
        public final a invoke() {
            BloodPressureMeasureListActivity bloodPressureMeasureListActivity = BloodPressureMeasureListActivity.this;
            return (a) new k1(bloodPressureMeasureListActivity, new b0(bloodPressureMeasureListActivity)).a(a.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public BloodPressureMeasureListActivity() {
        super(0);
        this.f57304e = by.kirich1409.viewbindingdelegate.b.a(this, u9.a.a(), new kotlin.jvm.internal.w(1));
        this.f57305f = new d(this);
        this.f57306g = new e(this);
        this.f57307h = new f(this);
        this.f57308i = -1;
        this.f57309j = new Intent();
        this.f57312m = nm0.h.b(new h());
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.verifyauthentication.q(this, 3));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f57313n = registerForActivityResult;
    }

    public static void A3(BloodPressureMeasureListActivity this$0, int i11) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.setResult(10);
        com.withings.wiscale2.heart.bloodpressure.a aVar = this$0.f57314o;
        if (aVar != null) {
            LifecycleCoroutineScopeImpl l5 = m0.t.l(this$0);
            int k11 = aVar.k(i11);
            BuildersKt__Builders_commonKt.launch$default(l5, Dispatchers.getIO(), null, new com.withings.wiscale2.heart.bloodpressure.b(aVar, k11, aVar.j(k11, i11), null), 2, null);
            return;
        }
        kotlin.jvm.internal.u.s("adapter");
        throw null;
    }

    public static void B3(BloodPressureMeasureListActivity this$0, androidx.appcompat.app.c alertDialog) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        kotlin.jvm.internal.u.j(alertDialog, "$alertDialog");
        Context context = this$0.J3().f98946b.getContext();
        Button g11 = alertDialog.g(-2);
        kotlin.jvm.internal.u.g(context);
        g11.setTextColor(ah.u.w(C1987R.attr.colorOnSurface, context, -65281));
        alertDialog.g(-1).setTextColor(ah.u.w(C1987R.attr.colorError, context, -65281));
    }

    public static void C3(BloodPressureMeasureListActivity this$0, int i11, DialogInterface dialogInterface) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        dialogInterface.cancel();
        com.withings.wiscale2.heart.bloodpressure.a aVar = this$0.f57314o;
        if (aVar != null) {
            aVar.notifyItemChanged(i11);
        } else {
            kotlin.jvm.internal.u.s("adapter");
            throw null;
        }
    }

    public static final DateTime D3(BloodPressureMeasureListActivity bloodPressureMeasureListActivity) {
        return (DateTime) bloodPressureMeasureListActivity.f57306g.getValue(bloodPressureMeasureListActivity, f57303q[2]);
    }

    public static final Period F3(BloodPressureMeasureListActivity bloodPressureMeasureListActivity) {
        bloodPressureMeasureListActivity.getClass();
        return (Period) bloodPressureMeasureListActivity.f57305f.getValue(bloodPressureMeasureListActivity, f57303q[1]);
    }

    public static final User H3(BloodPressureMeasureListActivity bloodPressureMeasureListActivity) {
        bloodPressureMeasureListActivity.getClass();
        return (User) bloodPressureMeasureListActivity.f57307h.getValue(bloodPressureMeasureListActivity, f57303q[3]);
    }

    public static final void I3(BloodPressureMeasureListActivity bloodPressureMeasureListActivity, List list) {
        bloodPressureMeasureListActivity.getClass();
        bloodPressureMeasureListActivity.f57314o = new com.withings.wiscale2.heart.bloodpressure.a(bloodPressureMeasureListActivity, list);
        tb0.d0 J3 = bloodPressureMeasureListActivity.J3();
        com.withings.wiscale2.heart.bloodpressure.a aVar = bloodPressureMeasureListActivity.f57314o;
        if (aVar != null) {
            J3.f98946b.setAdapter(aVar);
        } else {
            kotlin.jvm.internal.u.s("adapter");
            throw null;
        }
    }

    private final tb0.d0 J3() {
        Object value = ((LifecycleViewBindingProperty) this.f57304e).getValue(this, f57303q[0]);
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (tb0.d0) value;
    }

    public static void z3(BloodPressureMeasureListActivity this$0, ActivityResult activityResult) {
        Bundle extras;
        Serializable serializable;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        Intent a11 = activityResult.a();
        Serializable serializable2 = null;
        if (a11 != null && (extras = a11.getExtras()) != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = com.withings.wiscale2.device.common.ui.b.b(extras);
            } else {
                Serializable serializable3 = extras.getSerializable("extra_measures_group");
                if (serializable3 instanceof MeasuresGroup) {
                    serializable2 = serializable3;
                }
                serializable = (MeasuresGroup) serializable2;
            }
            serializable2 = (MeasuresGroup) serializable;
        }
        this$0.f57309j.putExtra("extra_measures_group", serializable2);
        this$0.f57308i = activityResult.b();
        ((a) this$0.f57312m.getValue()).j0();
    }

    @Override // com.withings.wiscale2.sections.StickyHeaderLayoutManager.a
    public final void R1(View view, StickyHeaderLayoutManager.HeaderPosition oldPosition, StickyHeaderLayoutManager.HeaderPosition headerPosition) {
        boolean z5;
        kotlin.jvm.internal.u.j(oldPosition, "oldPosition");
        int i11 = 0;
        if (headerPosition != StickyHeaderLayoutManager.HeaderPosition.f59604c && headerPosition != StickyHeaderLayoutManager.HeaderPosition.f59605d) {
            z5 = false;
        } else {
            z5 = true;
        }
        View findViewById = view.findViewById(C1987R.id.fake_elevation);
        if (!z5) {
            i11 = 4;
        }
        findViewById.setVisibility(i11);
    }

    @Override // fj0.f.a
    public final void k2(RecyclerView.z viewHolder) {
        kotlin.jvm.internal.u.j(viewHolder, "viewHolder");
        final int absoluteAdapterPosition = viewHolder.getAbsoluteAdapterPosition();
        qc.b bVar = new qc.b(this);
        bVar.C(C1987R.string._DELETE_MEASURE_CONFIRMATION_);
        bVar.g(C1987R.string._THIS_DATA_WILL_BE_PERMANTENTLY_DELETED_);
        bVar.t(false);
        androidx.appcompat.app.c create = bVar.z(C1987R.string._DELETE_YES_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.heart.bloodpressure.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BloodPressureMeasureListActivity.A3(BloodPressureMeasureListActivity.this, absoluteAdapterPosition);
            }
        }).w(C1987R.string._CANCEL_, new DialogInterface.OnClickListener() { // from class: com.withings.wiscale2.heart.bloodpressure.s
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                BloodPressureMeasureListActivity.C3(BloodPressureMeasureListActivity.this, absoluteAdapterPosition, dialogInterface);
            }
        }).create();
        create.setOnShowListener(new t(this, create, 0));
        create.show();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        setResult(this.f57308i, this.f57309j);
        finish();
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.Hilt_BloodPressureMeasureListActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(J3().f98947c);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        StickyHeaderLayoutManager stickyHeaderLayoutManager = new StickyHeaderLayoutManager();
        J3().f98946b.setLayoutManager(stickyHeaderLayoutManager);
        stickyHeaderLayoutManager.c1(this);
        if (!((User) this.f57307h.getValue(this, f57303q[3])).D()) {
            new androidx.recyclerview.widget.p(new fj0.f(this, this, a.c.class)).i(J3().f98946b);
        }
        ((a) this.f57312m.getValue()).i0().observe(this, new c(new x(this)));
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            setResult(this.f57308i, this.f57309j);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // hj0.a.b
    public final String p(a.C1035a section) {
        kotlin.jvm.internal.u.j(section, "section");
        DateTime a11 = section.b().get(0).a();
        if (((Period) this.f57305f.getValue(this, f57303q[1])) == Period.f43721f) {
            return b50.b.i(this, a11);
        }
        return b50.b.n(this, a11);
    }

    @Override // com.withings.wiscale2.heart.bloodpressure.a.d
    public final void r1(a.c cVar, MeasuresGroup measuresGroup) {
        this.f57313n.a(HeartDetailActivity.D3(this, measuresGroup, 0, ((User) this.f57307h.getValue(this, f57303q[3])).q()));
    }
}
