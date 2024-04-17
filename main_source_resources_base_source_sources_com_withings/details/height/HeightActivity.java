package com.withings.details.height;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.withings.details.height.HeightListActivity;
import com.withings.details.height.g0;
import com.withings.graph.TimeGraphView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.user.User;
import com.withings.views.graphs.GraphPopupView;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.FlowKt;
import l70.w;
import org.joda.time.DateTime;
import org.joda.time.Years;
/* compiled from: HeightActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/withings/details/height/HeightActivity;", "Lcom/withings/android/activity/WithingsActivity;", "Lcom/withings/details/height/g0$a;", "<init>", "()V", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class HeightActivity extends Hilt_HeightActivity implements g0.a {

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f36504e = nm0.h.b(new d());

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f36505f = nm0.h.b(new a());

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f36506g = nm0.h.b(new c());

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f36507h = nm0.h.b(new e());

    /* renamed from: i  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f36508i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public fy.n f36509j;

    /* renamed from: k  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f36510k;

    /* compiled from: HeightActivity.kt */
    /* loaded from: classes3.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TimeGraphView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TimeGraphView invoke() {
            return (TimeGraphView) HeightActivity.this.findViewById(C1987R.id.graph);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HeightActivity.kt */
    @kotlin.coroutines.jvm.internal.e(c = "com.withings.details.height.HeightActivity$loadAndShowData$1", f = "HeightActivity.kt", l = {ConstantsWs.MEASURE_TYPE_NEPHRO, ConstantsWs.MEASURE_TYPE_VO2MAX_HR_MAX}, m = "invokeSuspend")
    /* loaded from: classes3.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super nm0.y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        HeightActivity f36512a;

        /* renamed from: b  reason: collision with root package name */
        List f36513b;

        /* renamed from: c  reason: collision with root package name */
        int f36514c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: HeightActivity.kt */
        @kotlin.coroutines.jvm.internal.e(c = "com.withings.details.height.HeightActivity$loadAndShowData$1$data$1", f = "HeightActivity.kt", l = {ConstantsWs.MEASURE_TYPE_NEPHRO}, m = "invokeSuspend")
        /* loaded from: classes3.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.i implements ym0.p<CoroutineScope, qm0.d<? super List<? extends ky.d>>, Object> {

            /* renamed from: a  reason: collision with root package name */
            int f36516a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ HeightActivity f36517b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(HeightActivity heightActivity, qm0.d<? super a> dVar) {
                super(2, dVar);
                this.f36517b = heightActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
                return new a(this.f36517b, dVar);
            }

            @Override // ym0.p
            public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super List<? extends ky.d>> dVar) {
                return ((a) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
                int i11 = this.f36516a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        nm0.l.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    nm0.l.b(obj);
                    this.f36516a = 1;
                    obj = HeightActivity.B3(this.f36517b, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return obj;
            }
        }

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<nm0.y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super nm0.y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(nm0.y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            List list;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f36514c;
            HeightActivity heightActivity = HeightActivity.this;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 == 2) {
                        list = this.f36513b;
                        heightActivity = this.f36512a;
                        nm0.l.b(obj);
                        HeightActivity.C3(heightActivity, list, ((l70.v) obj).c());
                        return nm0.y.f85009a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                nm0.l.b(obj);
            } else {
                nm0.l.b(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                a aVar = new a(heightActivity, null);
                this.f36514c = 1;
                obj = BuildersKt.withContext(io2, aVar, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            List list2 = (List) obj;
            l70.w a11 = w.a.a();
            this.f36512a = heightActivity;
            this.f36513b = list2;
            this.f36514c = 2;
            Object first = FlowKt.first(a11.get(), this);
            if (first == coroutineSingletons) {
                return coroutineSingletons;
            }
            list = list2;
            obj = first;
            HeightActivity.C3(heightActivity, list, ((l70.v) obj).c());
            return nm0.y.f85009a;
        }
    }

    /* compiled from: HeightActivity.kt */
    /* loaded from: classes3.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<GraphPopupView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final GraphPopupView invoke() {
            return (GraphPopupView) HeightActivity.this.findViewById(C1987R.id.popup);
        }
    }

    /* compiled from: HeightActivity.kt */
    /* loaded from: classes3.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<Toolbar> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final Toolbar invoke() {
            return (Toolbar) HeightActivity.this.findViewById(C1987R.id.toolbar);
        }
    }

    /* compiled from: HeightActivity.kt */
    /* loaded from: classes3.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<User> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final User invoke() {
            Parcelable parcelableExtra = HeightActivity.this.getIntent().getParcelableExtra(ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT);
            kotlin.jvm.internal.u.h(parcelableExtra, "null cannot be cast to non-null type com.withings.user.User");
            return (User) parcelableExtra;
        }
    }

    public HeightActivity() {
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new com.withings.authentication.b(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f36508i = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new com.withings.authentication.c(this, 1));
        kotlin.jvm.internal.u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f36510k = registerForActivityResult2;
    }

    public static void A3(HeightActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == -1) {
            this$0.E3();
        }
    }

    public static final Serializable B3(HeightActivity heightActivity, qm0.d dVar) {
        fy.n nVar = heightActivity.f36509j;
        if (nVar != null) {
            return nVar.a(heightActivity.getUser().q(), null, true, null, new int[]{4}, dVar);
        }
        kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypes");
        throw null;
    }

    public static final void C3(HeightActivity heightActivity, List list, int i11) {
        heightActivity.D3().i();
        Context context = heightActivity.D3().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        f80.a aVar = new f80.a(0.0f, 3.0f, 0.1f, true, wq.a.l(context).getInt("KEY_HEIGHT_GRAPH_LAST_ZOOM_GRANULARITY", 31), null, 30668);
        heightActivity.D3().setGraphTagsToAdjustVerticalBounds(kotlin.collections.x.W("TAG_MAIN_GRAPH", "normalityZone"));
        heightActivity.D3().setIgnoreInvisibleGraphsToAdjustVerticalBounds(true);
        User user = heightActivity.getUser();
        GraphPopupView graphPopupView = (GraphPopupView) heightActivity.f36506g.getValue();
        kotlin.jvm.internal.u.i(graphPopupView, "<get-popupView>(...)");
        TimeGraphView D3 = heightActivity.D3();
        kotlin.jvm.internal.u.i(D3, "<get-graphView>(...)");
        com.withings.details.height.d dVar = new com.withings.details.height.d(user, list, heightActivity, graphPopupView, i11, D3, aVar, m0.t.l(heightActivity));
        dVar.i().setInitialZoomGranularity(31);
        dVar.k();
    }

    private final TimeGraphView D3() {
        return (TimeGraphView) this.f36505f.getValue();
    }

    private final void E3() {
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this), null, null, new b(null), 3, null);
    }

    private final User getUser() {
        return (User) this.f36507h.getValue();
    }

    public static void z3(HeightActivity this$0, ActivityResult activityResult) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (activityResult.b() == 1) {
            this$0.E3();
        }
    }

    @Override // com.withings.details.height.g0.a
    public final void J(boolean z5) {
        TimeGraphView D3 = D3();
        List<ts.d> graphs = D3.getGraphs();
        kotlin.jvm.internal.u.i(graphs, "getGraphs(...)");
        ArrayList<ts.d> arrayList = new ArrayList();
        for (Object obj : graphs) {
            if (kotlin.jvm.internal.u.e("normalityZone", ((ts.d) obj).g())) {
                arrayList.add(obj);
            }
        }
        for (ts.d dVar : arrayList) {
            dVar.k(z5);
        }
        D3.invalidate();
    }

    @Override // com.withings.details.height.g0.a
    public final void T() {
        Intent putExtra = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL).setClassName(getPackageName(), "com.withings.wiscale2.measure.accountmeasure.ui.add.AddMeasureActivity").putExtra("EXTRA_MEASURE_TYPE", 4).putExtra("EXTRA_FROM_DETAIL_VIEW", true).putExtra("GO_BACK_TIMELINE", false).putExtra("EXTRA_USER", getUser().q()).putExtra("EXTRA_INPUT_VALUE", (Serializable) null);
        kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
        this.f36510k.a(putExtra);
    }

    @Override // com.withings.details.height.Hilt_HeightActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1987R.layout.activity_height);
        setSupportActionBar((Toolbar) this.f36504e.getValue());
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o(true);
        }
        E3();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        kotlin.jvm.internal.u.j(menu, "menu");
        getMenuInflater().inflate(C1987R.menu.activity_height, menu);
        MenuItem findItem = menu.findItem(C1987R.id.action_display_bottom_sheet);
        if (findItem != null) {
            findItem.setVisible(!getUser().D());
        }
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.withings.details.height.Hilt_HeightActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected final void onDestroy() {
        Context context = D3().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        int currentZoomGranularity = D3().getCurrentZoomGranularity();
        SharedPreferences.Editor edit = wq.a.l(context).edit();
        edit.putInt("KEY_HEIGHT_GRAPH_LAST_ZOOM_GRANULARITY", currentZoomGranularity);
        edit.apply();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean z5;
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == C1987R.id.action_display_list) {
            HeightListActivity.b bVar = HeightListActivity.f36521k;
            User user = getUser();
            bVar.getClass();
            kotlin.jvm.internal.u.j(user, "user");
            Intent putExtra = new Intent(this, HeightListActivity.class).putExtra("extra_user", user);
            kotlin.jvm.internal.u.i(putExtra, "putExtra(...)");
            this.f36508i.a(putExtra);
            return true;
        } else if (itemId == C1987R.id.action_display_bottom_sheet) {
            DateTime f11 = getUser().f();
            kotlin.jvm.internal.u.i(f11, "getBirthDate(...)");
            DateTime now = DateTime.now();
            kotlin.jvm.internal.u.i(now, "now(...)");
            if (f11.isAfter(now) || Years.yearsBetween(f11, now).getYears() < 19) {
                z5 = true;
            } else {
                z5 = false;
            }
            g0 g0Var = new g0();
            Bundle bundle = new Bundle();
            bundle.putBoolean("display_graph_options", z5);
            g0Var.setArguments(bundle);
            g0Var.u1(this);
            g0Var.show(getSupportFragmentManager(), g0.class.getSimpleName());
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}
