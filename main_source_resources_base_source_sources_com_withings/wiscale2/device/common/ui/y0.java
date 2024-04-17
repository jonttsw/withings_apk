package com.withings.wiscale2.device.common.ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import gi.j;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
/* compiled from: DeviceShortcutsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/y0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class y0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f54126c;

    /* renamed from: d  reason: collision with root package name */
    private final b f54127d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f54128e;

    /* renamed from: g  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f54125g = {androidx.camera.core.v.c(y0.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceShortcutsBinding;", 0), androidx.camera.core.v.c(y0.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: f  reason: collision with root package name */
    public static final a f54124f = new Object();

    /* compiled from: DeviceShortcutsFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes5.dex */
    public static final class b implements bn0.d<Fragment, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f54129a = nm0.h.b(new g1(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f54130b;

        public b(Fragment fragment) {
            this.f54130b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f54129a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.w implements ym0.l<y0, tb0.p2> {
        @Override // ym0.l
        public final tb0.p2 invoke(y0 y0Var) {
            y0 fragment = y0Var;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return tb0.p2.a(fragment.requireView());
        }
    }

    /* compiled from: DeviceShortcutsFragment.kt */
    /* loaded from: classes5.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<i1> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final i1 invoke() {
            y0 y0Var = y0.this;
            return (i1) new androidx.lifecycle.k1(y0Var, new h1(y0Var)).a(i1.class);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public y0() {
        super(C1987R.layout.fragment_device_shortcuts);
        this.f54126c = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
        this.f54127d = new b(this);
        this.f54128e = nm0.h.b(new d());
    }

    public static final Device t1(y0 y0Var) {
        y0Var.getClass();
        return (Device) y0Var.f54127d.getValue(y0Var, f54125g[1]);
    }

    public static final i1 u1(y0 y0Var) {
        return (i1) y0Var.f54128e.getValue();
    }

    public static final void v1(y0 y0Var) {
        ArrayList arrayList;
        boolean z5;
        kotlin.jvm.internal.n0 n0Var = new kotlin.jvm.internal.n0();
        nm0.g gVar = y0Var.f54128e;
        n0Var.f76254a = ((i1) gVar.getValue()).m0();
        List list = (List) ((i1) gVar.getValue()).j0().getValue();
        if (list != null) {
            List<k2> list2 = list;
            arrayList = new ArrayList(kotlin.collections.x.y(list2, 10));
            for (k2 k2Var : list2) {
                String string = y0Var.getString(k2Var.c());
                kotlin.jvm.internal.u.i(string, "getString(...)");
                String string2 = y0Var.getString(k2Var.b());
                k2 k2Var2 = (k2) ((i1) gVar.getValue()).k0().getValue();
                if (k2Var2 != null) {
                    if (k2Var.d() == k2Var2.d()) {
                        z5 = true;
                        arrayList.add(new gi.b(8, string, string2, z5, false));
                    }
                }
                z5 = false;
                arrayList.add(new gi.b(8, string, string2, z5, false));
            }
        } else {
            arrayList = null;
        }
        FragmentManager supportFragmentManager = y0Var.requireActivity().getSupportFragmentManager();
        kotlin.jvm.internal.u.i(supportFragmentManager, "getSupportFragmentManager(...)");
        j.a aVar = new j.a(supportFragmentManager);
        aVar.y(y0Var.getString(C1987R.string.deviceAction_shortcut_title));
        aVar.a(y0Var.getString(C1987R.string.deviceAction_shortcut_description));
        aVar.r(new e1(n0Var), arrayList);
        String string3 = y0Var.getString(C1987R.string._CONFIRM_YES_);
        kotlin.jvm.internal.u.i(string3, "getString(...)");
        aVar.q(string3, new f1(y0Var, n0Var));
        aVar.x();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final tb0.p2 w1() {
        return (tb0.p2) this.f54126c.getValue(this, f54125g[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        kotlin.jvm.internal.u.j(item, "item");
        if (item.getItemId() == 16908332) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return true;
            }
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        AppBarLayout appBarLayout = w1().f99418a;
        kotlin.jvm.internal.u.i(appBarLayout, "appBarLayout");
        ay.b.n(appBarLayout, true, false, 29);
        NestedScrollView scrollView = w1().f99421d;
        kotlin.jvm.internal.u.i(scrollView, "scrollView");
        ay.b.n(scrollView, false, true, 23);
        MaterialToolbar toolbar = w1().f99423f;
        kotlin.jvm.internal.u.i(toolbar, "toolbar");
        androidx.camera.camera2.internal.v1.s0(this, toolbar);
        w1().f99419b.setToggleListener(new d1(this));
        w1().f99419b.w();
        w1().f99422e.setEnabled(false);
        w1().f99422e.setRightValueIcon(androidx.core.content.a.getDrawable(requireContext(), C1987R.drawable.ic_arrow_right_30dp));
        LottieAnimationView lottieAnimationView = w1().f99420c;
        if (((Device) this.f54127d.getValue(this, f54125g[1])).getModelId() == 93) {
            lottieAnimationView.setImageAssetsFolder("lottie/scanwatch_install_flow/images");
            lottieAnimationView.setAnimation("lottie/scanwatch_install_flow/shortcut.json");
            lottieAnimationView.setRepeatCount(-1);
            lottieAnimationView.m();
        } else {
            lottieAnimationView.setVisibility(8);
        }
        i1 i1Var = (i1) this.f54128e.getValue();
        xw.d.c(this, i1Var.p0(), new z0(this));
        xw.d.c(this, i1Var.k0(), new a1(this));
        xw.d.c(this, i1Var.q0(), new c1(this));
    }
}
