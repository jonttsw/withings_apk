package com.withings.wiscale2.device.wpm.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.camera.camera2.internal.r2;
import androidx.fragment.app.Fragment;
import com.withings.bloodpressure.core.BloodPressureCategory;
import com.withings.core.webcontent.HMWebActivity;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.library.measure.MeasuresGroup;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.user.User;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.joda.time.DateTime;
/* compiled from: Wpm02ResultScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/wiscale2/device/wpm/ui/c0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c0 extends com.withings.wiscale2.device.wpm.ui.b {

    /* renamed from: h  reason: collision with root package name */
    private View f55710h;

    /* renamed from: i  reason: collision with root package name */
    private TextView f55711i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f55712j;

    /* renamed from: k  reason: collision with root package name */
    private TextView f55713k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f55714l;

    /* renamed from: m  reason: collision with root package name */
    private TextView f55715m;

    /* renamed from: n  reason: collision with root package name */
    private AddDetailsView f55716n;

    /* renamed from: o  reason: collision with root package name */
    private final g f55717o = new g(this);

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f55718p = nm0.h.b(new d());

    /* renamed from: q  reason: collision with root package name */
    private final nm0.g f55719q = nm0.h.b(new f());

    /* renamed from: r  reason: collision with root package name */
    private final nm0.g f55720r = nm0.h.b(new c());

    /* renamed from: s  reason: collision with root package name */
    private final nm0.g f55721s = nm0.h.b(new e());

    /* renamed from: t  reason: collision with root package name */
    private a f55722t;
    @Inject

    /* renamed from: u  reason: collision with root package name */
    public fy.z f55723u;
    @Inject

    /* renamed from: v  reason: collision with root package name */
    public zx.r f55724v;

    /* renamed from: x  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55709x = {androidx.camera.core.v.c(c0.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0)};

    /* renamed from: w  reason: collision with root package name */
    public static final b f55708w = new Object();

    /* compiled from: Wpm02ResultScreenFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void Z0(u70.i iVar, DateTime dateTime);

        void f();

        void o();
    }

    /* compiled from: Wpm02ResultScreenFragment.kt */
    /* loaded from: classes5.dex */
    public static final class b {
    }

    /* compiled from: Wpm02ResultScreenFragment.kt */
    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(yq.b.a(c0.this).getBoolean("is_triple_measure"));
        }
    }

    /* compiled from: Wpm02ResultScreenFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<u70.i> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final u70.i invoke() {
            Object obj;
            Bundle a11 = yq.b.a(c0.this);
            if (Build.VERSION.SDK_INT >= 33) {
                obj = a11.getSerializable("extra_mac_address", u70.i.class);
            } else {
                Serializable serializable = a11.getSerializable("extra_mac_address");
                if (!(serializable instanceof u70.i)) {
                    serializable = null;
                }
                obj = (u70.i) serializable;
            }
            kotlin.jvm.internal.u.g(obj);
            return (u70.i) obj;
        }
    }

    /* compiled from: Wpm02ResultScreenFragment.kt */
    /* loaded from: classes5.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<jm.a> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final jm.a invoke() {
            TextView textView = c0.this.f55713k;
            if (textView != null) {
                Context context = textView.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                return a.d.a(context);
            }
            kotlin.jvm.internal.u.s("systolValueView");
            throw null;
        }
    }

    /* compiled from: Wpm02ResultScreenFragment.kt */
    /* loaded from: classes5.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<MeasuresGroup> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final MeasuresGroup invoke() {
            Object obj;
            Bundle a11 = yq.b.a(c0.this);
            if (Build.VERSION.SDK_INT >= 33) {
                obj = a11.getSerializable("measureGroup", MeasuresGroup.class);
            } else {
                Serializable serializable = a11.getSerializable("measureGroup");
                if (!(serializable instanceof MeasuresGroup)) {
                    serializable = null;
                }
                obj = (MeasuresGroup) serializable;
            }
            kotlin.jvm.internal.u.g(obj);
            return (MeasuresGroup) obj;
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class g implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f55729a = nm0.h.b(new g0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f55730b;

        public g(Fragment fragment) {
            this.f55730b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f55729a.getValue();
        }
    }

    public static final User A1(c0 c0Var) {
        return (User) c0Var.f55717o.getValue(c0Var, f55709x[0]);
    }

    public static final void B1(c0 c0Var, String str) {
        c0Var.D1().setComment(str);
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(c0Var), Dispatchers.getIO(), null, new h0(c0Var, null), 2, null);
    }

    private final String C1(int i11) {
        return ((jm.a) this.f55721s.getValue()).b(D1().getMeasureForType(i11).f95794y, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MeasuresGroup D1() {
        return (MeasuresGroup) this.f55719q.getValue();
    }

    public static void s1(c0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), Dispatchers.getIO(), null, new f0(this$0, null), 2, null);
    }

    public static void t1(c0 this$0) {
        String string;
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (kotlin.jvm.internal.u.e(Locale.getDefault().getCountry(), Locale.US.getCountry())) {
            string = this$0.getString(C1987R.string._BPM_HYPERTENSION_TABLE_URL_US_);
        } else {
            string = this$0.getString(C1987R.string._BPM_HYPERTENSION_TABLE_URL_);
        }
        kotlin.jvm.internal.u.g(string);
        HMWebActivity.a aVar = HMWebActivity.f35395c;
        TextView textView = this$0.f55714l;
        if (textView != null) {
            Context context = textView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            this$0.startActivity(aVar.c(context, this$0.getString(C1987R.string._BLOOD_PRESSURE_), string));
            return;
        }
        kotlin.jvm.internal.u.s("diastolValueView");
        throw null;
    }

    public static void u1(c0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        a aVar = this$0.f55722t;
        if (aVar != null) {
            if (((Boolean) this$0.f55720r.getValue()).booleanValue()) {
                aVar.o();
            } else {
                aVar.f();
            }
        }
    }

    public static final u70.i x1(c0 c0Var) {
        return (u70.i) c0Var.f55718p.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        String valueOf;
        super.onActivityCreated(bundle);
        TextView textView = this.f55711i;
        if (textView != null) {
            String format = DateFormat.getDateTimeInstance(2, 3).format(D1().getDate());
            kotlin.jvm.internal.u.i(format, "format(...)");
            if (format.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = format.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    valueOf = r2.a("getDefault(...)", charAt);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                format = androidx.appcompat.view.menu.d.e(sb2, valueOf, format, 1, "substring(...)");
            }
            textView.setText(format);
            String country = Locale.getDefault().getCountry();
            MeasuresGroup D1 = D1();
            kotlin.jvm.internal.u.g(country);
            BloodPressureCategory a11 = com.withings.wiscale2.heart.bloodpressure.j0.a(D1, country);
            View view = this.f55710h;
            if (view != null) {
                TextView textView2 = this.f55711i;
                if (textView2 != null) {
                    view.setBackgroundColor(androidx.core.content.a.getColor(textView2.getContext(), fi.a.b(a11)));
                    int b10 = androidx.health.connect.client.units.d.b(fi.a.b(a11));
                    TextView textView3 = this.f55711i;
                    if (textView3 != null) {
                        textView3.setTextColor(b10);
                        TextView textView4 = this.f55712j;
                        if (textView4 != null) {
                            textView4.setText(getText(fi.a.c(a11)));
                            TextView textView5 = this.f55712j;
                            if (textView5 != null) {
                                textView5.setTextColor(b10);
                                TextView textView6 = this.f55713k;
                                if (textView6 != null) {
                                    textView6.setText(C1(10));
                                    TextView textView7 = this.f55714l;
                                    if (textView7 != null) {
                                        textView7.setText(C1(9));
                                        TextView textView8 = this.f55715m;
                                        if (textView8 != null) {
                                            textView8.setText(C1(11));
                                            View view2 = this.f55710h;
                                            if (view2 != null) {
                                                TextView textView9 = this.f55711i;
                                                if (textView9 != null) {
                                                    Context context = textView9.getContext();
                                                    kotlin.jvm.internal.u.i(context, "getContext(...)");
                                                    int h11 = wq.a.h(context) * 2;
                                                    TextView textView10 = this.f55711i;
                                                    if (textView10 != null) {
                                                        Context context2 = textView10.getContext();
                                                        kotlin.jvm.internal.u.i(context2, "getContext(...)");
                                                        view2.setPadding(0, h11, 0, wq.a.h(context2));
                                                        View view3 = this.f55710h;
                                                        if (view3 != null) {
                                                            view3.setOnClickListener(new com.google.android.material.search.g(this, 13));
                                                            AddDetailsView addDetailsView = this.f55716n;
                                                            if (addDetailsView != null) {
                                                                addDetailsView.setText(D1().getComment());
                                                                AddDetailsView addDetailsView2 = this.f55716n;
                                                                if (addDetailsView2 != null) {
                                                                    addDetailsView2.setListener(new d0(this));
                                                                    return;
                                                                } else {
                                                                    kotlin.jvm.internal.u.s("commentView");
                                                                    throw null;
                                                                }
                                                            }
                                                            kotlin.jvm.internal.u.s("commentView");
                                                            throw null;
                                                        }
                                                        kotlin.jvm.internal.u.s("headerResultContainerView");
                                                        throw null;
                                                    }
                                                    kotlin.jvm.internal.u.s("dateView");
                                                    throw null;
                                                }
                                                kotlin.jvm.internal.u.s("dateView");
                                                throw null;
                                            }
                                            kotlin.jvm.internal.u.s("headerResultContainerView");
                                            throw null;
                                        }
                                        kotlin.jvm.internal.u.s("heartRateValueView");
                                        throw null;
                                    }
                                    kotlin.jvm.internal.u.s("diastolValueView");
                                    throw null;
                                }
                                kotlin.jvm.internal.u.s("systolValueView");
                                throw null;
                            }
                            kotlin.jvm.internal.u.s("measureStatus");
                            throw null;
                        }
                        kotlin.jvm.internal.u.s("measureStatus");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("dateView");
                    throw null;
                }
                kotlin.jvm.internal.u.s("dateView");
                throw null;
            }
            kotlin.jvm.internal.u.s("headerResultContainerView");
            throw null;
        }
        kotlin.jvm.internal.u.s("dateView");
        throw null;
    }

    @Override // com.withings.wiscale2.device.wpm.ui.b, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        if (context instanceof a) {
            this.f55722t = (a) context;
            return;
        }
        throw new ClassCastException(w6.o.a(context.getClass().getSimpleName(), " must implement ", a.class.getName()));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        View inflate = inflater.inflate(C1987R.layout.fragment_wpm02_result_screen, viewGroup, false);
        kotlin.jvm.internal.u.i(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.header_result_container);
        kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
        this.f55710h = findViewById;
        View findViewById2 = view.findViewById(C1987R.id.date);
        kotlin.jvm.internal.u.i(findViewById2, "findViewById(...)");
        this.f55711i = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.status_measure);
        kotlin.jvm.internal.u.i(findViewById3, "findViewById(...)");
        this.f55712j = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.systole_value);
        kotlin.jvm.internal.u.i(findViewById4, "findViewById(...)");
        this.f55713k = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.diastole_value);
        kotlin.jvm.internal.u.i(findViewById5, "findViewById(...)");
        this.f55714l = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.heart_rate_value);
        kotlin.jvm.internal.u.i(findViewById6, "findViewById(...)");
        this.f55715m = (TextView) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.comment_container);
        kotlin.jvm.internal.u.i(findViewById7, "findViewById(...)");
        this.f55716n = (AddDetailsView) findViewById7;
        view.findViewById(C1987R.id.try_again).setOnClickListener(new com.google.android.material.datepicker.q(this, 10));
        view.findViewById(C1987R.id.done).setOnClickListener(new sg.j(this, 10));
    }
}
