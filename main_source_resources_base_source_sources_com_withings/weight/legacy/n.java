package com.withings.weight.legacy;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.d0;
import androidx.lifecycle.h1;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.measure.detail.ui.views.AddDetailsView;
import com.withings.user.User;
import com.withings.views.measure.detail.ui.views.DataView;
import com.withings.weight.bodycomposition.ui.BodyCompositionZonesDetailView;
import com.withings.weight.legacy.n;
import com.withings.wiscale2.C1987R;
import fy.c0;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import jm.a;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
/* compiled from: WeightDetailFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/weight/legacy/n;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "weight_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class n extends com.withings.weight.legacy.b {
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public c0 f47058h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public fy.a f47059i;
    @Inject

    /* renamed from: j  reason: collision with root package name */
    public zx.r f47060j;
    @Inject

    /* renamed from: k  reason: collision with root package name */
    public fy.n f47061k;

    /* renamed from: m  reason: collision with root package name */
    private boolean f47063m;

    /* renamed from: o  reason: collision with root package name */
    private ky.d f47065o;

    /* renamed from: r  reason: collision with root package name */
    private Double f47068r;

    /* renamed from: s  reason: collision with root package name */
    private b f47069s;

    /* renamed from: t  reason: collision with root package name */
    private jm.a f47070t;

    /* renamed from: x  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f47057x = {androidx.camera.core.v.c(n.class, ConstantsWs.SCREEN_DISPLAY_CONTEXT_KEY_USER_SCREENS_SHORT, "getUser()Lcom/withings/user/User;", 0), androidx.camera.core.v.c(n.class, "binding", "getBinding()Lcom/withings/weight/databinding/FragmentMeasureWeightBinding;", 0)};

    /* renamed from: w  reason: collision with root package name */
    public static final a f47056w = new Object();

    /* renamed from: l  reason: collision with root package name */
    private final e f47062l = new e(this);

    /* renamed from: n  reason: collision with root package name */
    private boolean f47064n = true;

    /* renamed from: p  reason: collision with root package name */
    private final nm0.g f47066p = nm0.h.b(new c());

    /* renamed from: q  reason: collision with root package name */
    private double f47067q = -1.0d;

    /* renamed from: u  reason: collision with root package name */
    private final LifecycleViewBindingProperty f47071u = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f47072v = nm0.h.b(new g());

    /* compiled from: WeightDetailFragment.kt */
    /* loaded from: classes4.dex */
    public static final class a {
    }

    /* compiled from: WeightDetailFragment.kt */
    /* loaded from: classes4.dex */
    public interface b {
        void s(n nVar);
    }

    /* compiled from: WeightDetailFragment.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<Boolean> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final Boolean invoke() {
            return Boolean.valueOf(yq.b.a(n.this).getBoolean("arg_is_last_measure", false));
        }
    }

    /* compiled from: WeightDetailFragment.kt */
    /* loaded from: classes4.dex */
    static final class d implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f47074a;

        d(ym0.l lVar) {
            this.f47074a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return kotlin.jvm.internal.u.e(this.f47074a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f47074a;
        }

        public final int hashCode() {
            return this.f47074a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f47074a.invoke(obj);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes4.dex */
    public static final class e implements bn0.d<Fragment, User> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f47075a = nm0.h.b(new v(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f47076b;

        public e(Fragment fragment) {
            this.f47076b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.user.User, java.lang.Object] */
        @Override // bn0.d
        public final User getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f47075a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.jvm.internal.w implements ym0.l<n, e90.b> {
        @Override // ym0.l
        public final e90.b invoke(n nVar) {
            n fragment = nVar;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return e90.b.a(fragment.requireView());
        }
    }

    /* compiled from: WeightDetailFragment.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<a0> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final a0 invoke() {
            n nVar = n.this;
            User user = nVar.getUser();
            fy.a aVar = nVar.f47059i;
            if (aVar != null) {
                c0 c0Var = nVar.f47058h;
                if (c0Var != null) {
                    zx.r rVar = nVar.f47060j;
                    if (rVar != null) {
                        fy.n nVar2 = nVar.f47061k;
                        if (nVar2 != null) {
                            return new a0(user, aVar, c0Var, rVar, nVar2);
                        }
                        kotlin.jvm.internal.u.s("getMeasureGroupsWithAllTypes");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("sendAccountMeasureGroups");
                    throw null;
                }
                kotlin.jvm.internal.u.s("updateMeasureGroupUseCase");
                throw null;
            }
            kotlin.jvm.internal.u.s("deleteMeasureGroupUseCase");
            throw null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final User getUser() {
        return (User) this.f47062l.getValue(this, f47057x[0]);
    }

    public static void s1(n this$0, DialogInterface dialogInterface) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        dialogInterface.dismiss();
        a0 a0Var = (a0) this$0.f47072v.getValue();
        ky.d dVar = this$0.f47065o;
        if (dVar != null) {
            a0Var.getClass();
            BuildersKt__Builders_commonKt.launch$default(h1.a(a0Var), Dispatchers.getIO(), null, new x(a0Var, dVar, null), 2, null);
            return;
        }
        kotlin.jvm.internal.u.s("measuresGroup");
        throw null;
    }

    public static final void u1(n nVar, String str) {
        ky.d dVar = nVar.f47065o;
        if (dVar != null) {
            if (!kotlin.jvm.internal.u.e(dVar.b(), str)) {
                ky.d dVar2 = nVar.f47065o;
                if (dVar2 != null) {
                    nVar.f47065o = ky.d.a(dVar2, 0L, 0L, 0L, null, str, null, false, null, 479);
                    AddDetailsView addDetailsView = nVar.y1().f64959f;
                    ky.d dVar3 = nVar.f47065o;
                    if (dVar3 != null) {
                        addDetailsView.setText(dVar3.b());
                        a0 a0Var = (a0) nVar.f47072v.getValue();
                        ky.d dVar4 = nVar.f47065o;
                        if (dVar4 != null) {
                            a0Var.getClass();
                            BuildersKt__Builders_commonKt.launch$default(h1.a(a0Var), Dispatchers.getIO(), null, new z(a0Var, dVar4, null), 2, null);
                            return;
                        }
                        kotlin.jvm.internal.u.s("measuresGroup");
                        throw null;
                    }
                    kotlin.jvm.internal.u.s("measuresGroup");
                    throw null;
                }
                kotlin.jvm.internal.u.s("measuresGroup");
                throw null;
            }
            return;
        }
        kotlin.jvm.internal.u.s("measuresGroup");
        throw null;
    }

    public static final void v1(n nVar, Double d11) {
        SpannableStringBuilder c11;
        nVar.f47068r = d11;
        if (d11 != null) {
            ky.d dVar = nVar.f47065o;
            if (dVar != null) {
                if (ly.a.e(76, dVar) != null) {
                    ky.d dVar2 = nVar.f47065o;
                    if (dVar2 != null) {
                        if (ly.a.e(77, dVar2) != null) {
                            ky.d dVar3 = nVar.f47065o;
                            if (dVar3 != null) {
                                if (ly.a.e(88, dVar3) != null) {
                                    nVar.y1().f64955b.setVisibility(0);
                                    BodyCompositionZonesDetailView bodyCompositionZonesDetailView = nVar.y1().f64957d;
                                    ky.d dVar4 = nVar.f47065o;
                                    if (dVar4 != null) {
                                        bodyCompositionZonesDetailView.setBodyCompositionZonesForMeasures(dVar4);
                                    } else {
                                        kotlin.jvm.internal.u.s("measuresGroup");
                                        throw null;
                                    }
                                }
                            } else {
                                kotlin.jvm.internal.u.s("measuresGroup");
                                throw null;
                            }
                        }
                    } else {
                        kotlin.jvm.internal.u.s("measuresGroup");
                        throw null;
                    }
                }
            } else {
                kotlin.jvm.internal.u.s("measuresGroup");
                throw null;
            }
        }
        a0 a0Var = (a0) nVar.f47072v.getValue();
        User user = nVar.getUser();
        a0Var.getClass();
        kotlin.jvm.internal.u.j(user, "user");
        BuildersKt__Builders_commonKt.launch$default(h1.a(a0Var), Dispatchers.getIO(), null, new y(a0Var, user, null), 2, null);
        Double d12 = nVar.f47068r;
        if (d12 != null) {
            double doubleValue = d12.doubleValue();
            DataView dataView = nVar.y1().f64961h;
            if (nVar.getUser().C()) {
                jm.a aVar = nVar.f47070t;
                if (aVar != null) {
                    c11 = jm.a.d(aVar, doubleValue);
                } else {
                    kotlin.jvm.internal.u.s("measureFormatter");
                    throw null;
                }
            } else {
                jm.a aVar2 = nVar.f47070t;
                if (aVar2 != null) {
                    c11 = jm.a.c(aVar2, 1, doubleValue, 0, 0, 60);
                } else {
                    kotlin.jvm.internal.u.s("measureFormatter");
                    throw null;
                }
            }
            dataView.setValue(c11);
        }
    }

    public static final void w1(n nVar, List list) {
        nVar.getClass();
        if (list.isEmpty() && ((nVar.getUser().C() || !nVar.f47063m) && (!nVar.f47063m || !nVar.f47064n))) {
            nVar.y1().f64954a.setVisibility(8);
            nVar.y1().f64961h.setVisibility(8);
        } else if (!list.isEmpty()) {
            ky.d dVar = nVar.f47065o;
            if (dVar != null) {
                double a11 = q80.a.a(dVar, list);
                jm.a aVar = nVar.f47070t;
                if (aVar != null) {
                    String b10 = aVar.b(a11, 22);
                    if ((!nVar.getUser().C() && nVar.f47063m) || (nVar.f47063m && nVar.f47064n)) {
                        nVar.y1().f64954a.setValue(b10);
                        return;
                    }
                    nVar.y1().f64961h.setLabel(C1987R.string._IMC_);
                    nVar.y1().f64961h.setValue(b10);
                    nVar.y1().f64954a.setVisibility(8);
                    return;
                }
                kotlin.jvm.internal.u.s("measureFormatter");
                throw null;
            }
            kotlin.jvm.internal.u.s("measuresGroup");
            throw null;
        }
    }

    public static final void x1(n nVar, boolean z5) {
        if (z5) {
            b bVar = nVar.f47069s;
            if (bVar != null) {
                bVar.s(nVar);
            }
            FragmentActivity activity = nVar.getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        nVar.getClass();
    }

    private final e90.b y1() {
        return (e90.b) this.f47071u.getValue(this, f47057x[1]);
    }

    @Override // com.withings.weight.legacy.b, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof b) {
            this.f47069s = (b) getActivity();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        kotlin.jvm.internal.u.j(menu, "menu");
        kotlin.jvm.internal.u.j(inflater, "inflater");
        if (!getUser().D()) {
            inflater.inflate(C1987R.menu.view_measure, menu);
            boolean z5 = true;
            menu.findItem(C1987R.id.action_delete).setVisible(!((Boolean) this.f47066p.getValue()).booleanValue());
            MenuItem findItem = menu.findItem(C1987R.id.action_share);
            if (getUser().q() != m70.i.b().e().q()) {
                z5 = false;
            }
            findItem.setVisible(z5);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        int itemId = item.getItemId();
        if (itemId == C1987R.id.action_delete) {
            if (!((Boolean) this.f47066p.getValue()).booleanValue()) {
                qc.b bVar = new qc.b(requireContext());
                bVar.C(C1987R.string._DELETE_TITLE_);
                bVar.g(C1987R.string._DELETE_MEASURE_CONFIRMATION_);
                bVar.t(false);
                final androidx.appcompat.app.c create = bVar.z(C1987R.string._DELETE_YES_, new cq.b(this, 2)).w(C1987R.string._CANCEL_, new cq.c(1)).create();
                create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.withings.weight.legacy.m
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        n.a aVar = n.f47056w;
                        androidx.appcompat.app.c this_apply = androidx.appcompat.app.c.this;
                        kotlin.jvm.internal.u.j(this_apply, "$this_apply");
                        n this$0 = this;
                        kotlin.jvm.internal.u.j(this$0, "this$0");
                        Button g11 = this_apply.g(-2);
                        Context requireContext = this$0.requireContext();
                        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
                        g11.setTextColor(ah.u.w(C1987R.attr.colorOnSurface, requireContext, -65281));
                        Button g12 = this_apply.g(-1);
                        Context requireContext2 = this$0.requireContext();
                        kotlin.jvm.internal.u.i(requireContext2, "requireContext(...)");
                        g12.setTextColor(ah.u.w(C1987R.attr.colorError, requireContext2, -65281));
                    }
                });
                create.show();
            }
        } else if (itemId == C1987R.id.action_share) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                jm.a aVar = this.f47070t;
                if (aVar != null) {
                    String string = getString(C1987R.string._NEWSFEED_SOCIAL_WEIGHT__s_, jm.a.c(aVar, 1, this.f47067q, 0, 0, 60));
                    kotlin.jvm.internal.u.i(string, "getString(...)");
                    Double d11 = this.f47068r;
                    if (d11 != null) {
                        double doubleValue = d11.doubleValue();
                        jm.a aVar2 = this.f47070t;
                        if (aVar2 != null) {
                            String a11 = w6.o.a(string, " ", getString(C1987R.string._NEWSFEED_SOCIAL_FAT__s_, jm.a.c(aVar2, 1, doubleValue, 0, 0, 60)));
                            if (a11 != null) {
                                string = a11;
                            }
                        } else {
                            kotlin.jvm.internal.u.s("measureFormatter");
                            throw null;
                        }
                    }
                    u70.e.e(activity, string);
                } else {
                    kotlin.jvm.internal.u.s("measureFormatter");
                    throw null;
                }
            }
        } else {
            return super.onOptionsItemSelected(item);
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        double d11;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        Bundle a11 = yq.b.a(this);
        if (Build.VERSION.SDK_INT >= 33) {
            obj = a11.getSerializable("arg_measure_group", ky.d.class);
        } else {
            Serializable serializable = a11.getSerializable("arg_measure_group");
            if (!(serializable instanceof ky.d)) {
                serializable = null;
            }
            obj = (ky.d) serializable;
        }
        kotlin.jvm.internal.u.g(obj);
        ky.d dVar = (ky.d) obj;
        this.f47065o = dVar;
        int i11 = 8;
        this.f47063m = ly.a.g(8, dVar);
        this.f47064n = ly.a.g(1, dVar);
        this.f47067q = -1.0d;
        this.f47068r = null;
        Context requireContext = requireContext();
        kotlin.jvm.internal.u.i(requireContext, "requireContext(...)");
        this.f47070t = a.d.a(requireContext);
        AddDetailsView details = y1().f64959f;
        kotlin.jvm.internal.u.i(details, "details");
        if (!getUser().D()) {
            i11 = 0;
        }
        details.setVisibility(i11);
        ky.d dVar2 = this.f47065o;
        if (dVar2 != null) {
            y1().f64959f.setText(dVar2.b());
            y1().f64959f.setListener(new r(this));
            if (this.f47064n) {
                ky.d dVar3 = this.f47065o;
                if (dVar3 != null) {
                    ky.a e11 = ly.a.e(1, dVar3);
                    if (e11 != null) {
                        d11 = e11.f();
                    } else {
                        d11 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    }
                    this.f47067q = d11;
                } else {
                    kotlin.jvm.internal.u.s("measuresGroup");
                    throw null;
                }
            }
            DataView dataView = y1().f64960g;
            jm.a aVar = this.f47070t;
            if (aVar != null) {
                dataView.setValue(jm.a.c(aVar, 1, this.f47067q, 0, 0, 60));
                nm0.g gVar = this.f47072v;
                a0 a0Var = (a0) gVar.getValue();
                User user = getUser();
                ky.d dVar4 = this.f47065o;
                if (dVar4 != null) {
                    a0Var.q0(dVar4, user);
                    ky.d dVar5 = this.f47065o;
                    if (dVar5 != null) {
                        Context context = y1().f64958e.getContext();
                        kotlin.jvm.internal.u.i(context, "getContext(...)");
                        y1().f64958e.setBrandName(wy.a.c(context, dVar5));
                        y1().f64956c.setContent(new s1.a(true, -1289493505, new u(this)));
                        a0 a0Var2 = (a0) gVar.getValue();
                        xw.m<List<ky.d>> p02 = a0Var2.p0();
                        d0 viewLifecycleOwner = getViewLifecycleOwner();
                        kotlin.jvm.internal.u.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                        p02.t(viewLifecycleOwner, new o(this));
                        xw.m<Boolean> m02 = a0Var2.m0();
                        d0 viewLifecycleOwner2 = getViewLifecycleOwner();
                        kotlin.jvm.internal.u.i(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
                        m02.t(viewLifecycleOwner2, new p(this));
                        a0Var2.k0().observe(getViewLifecycleOwner(), new d(new q(this)));
                        return;
                    }
                    kotlin.jvm.internal.u.s("measuresGroup");
                    throw null;
                }
                kotlin.jvm.internal.u.s("measuresGroup");
                throw null;
            }
            kotlin.jvm.internal.u.s("measureFormatter");
            throw null;
        }
        kotlin.jvm.internal.u.s("measuresGroup");
        throw null;
    }
}
