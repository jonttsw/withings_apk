package com.withings.common.device;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import androidx.activity.result.ActivityResult;
import androidx.appcompat.widget.Toolbar;
import androidx.camera.camera2.internal.v1;
import androidx.camera.core.v;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.g1;
import androidx.lifecycle.k1;
import androidx.lifecycle.l0;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.common.device.util.DeviceModelScanningAbilityProvider;
import com.withings.device.Device;
import com.withings.devicesetup.ui.EnablePermissionsForScanActivity;
import com.withings.wiscale2.C1987R;
import ej.w;
import ga.f;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import nm0.y;
/* compiled from: DeviceSettingsActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/common/device/j;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "common-device_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class j extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f35195c;

    /* renamed from: d  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f35196d;

    /* renamed from: e  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f35197e;

    /* renamed from: f  reason: collision with root package name */
    private final androidx.activity.result.b<Intent> f35198f;

    /* renamed from: g  reason: collision with root package name */
    private final l f35199g;

    /* renamed from: i  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f35194i = {v.c(j.class, "binding", "getBinding()Lcom/withings/common/device/databinding/FragmentDeviceConnectionBinding;", 0), v.c(j.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: h  reason: collision with root package name */
    public static final a f35193h = new Object();

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    /* synthetic */ class b implements androidx.activity.result.a, kotlin.jvm.internal.p {
        b() {
        }

        @Override // androidx.activity.result.a
        public final void a(Object obj) {
            ActivityResult p02 = (ActivityResult) obj;
            u.j(p02, "p0");
            j.v1(j.this, p02);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.activity.result.a) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(getFunctionDelegate(), ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.s(1, j.this, j.class, "finishIfResultNotOk", "finishIfResultNotOk(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    /* synthetic */ class c implements androidx.activity.result.a, kotlin.jvm.internal.p {
        c() {
        }

        @Override // androidx.activity.result.a
        public final void a(Object obj) {
            ActivityResult p02 = (ActivityResult) obj;
            u.j(p02, "p0");
            j.v1(j.this, p02);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.activity.result.a) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(getFunctionDelegate(), ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.s(1, j.this, j.class, "finishIfResultNotOk", "finishIfResultNotOk(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    /* synthetic */ class d implements androidx.activity.result.a, kotlin.jvm.internal.p {
        d() {
        }

        @Override // androidx.activity.result.a
        public final void a(Object obj) {
            ActivityResult p02 = (ActivityResult) obj;
            u.j(p02, "p0");
            j.v1(j.this, p02);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof androidx.activity.result.a) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(getFunctionDelegate(), ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return new kotlin.jvm.internal.s(1, j.this, j.class, "finishIfResultNotOk", "finishIfResultNotOk(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes3.dex */
    public static final class e implements k1.b {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f35204b;

        public e(View view) {
            this.f35204b = view;
        }

        @Override // androidx.lifecycle.k1.b
        public final <U extends g1> U create(Class<U> modelClass) {
            u.j(modelClass, "modelClass");
            j jVar = j.this;
            Application application = jVar.requireActivity().getApplication();
            u.i(application, "getApplication(...)");
            w w11 = w.w();
            u.i(w11, "get(...)");
            fl.p a11 = fl.p.f67672b.a();
            Context applicationContext = this.f35204b.getContext().getApplicationContext();
            u.i(applicationContext, "getApplicationContext(...)");
            return new com.withings.common.device.l(application, w11, a11, new aq.a(applicationContext), j.x1(jVar));
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.l<String, y> {
        f() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(String str) {
            String it = str;
            u.j(it, "it");
            if (it.length() <= 0) {
                it = null;
            }
            if (it != null) {
                j.this.y1().f22994c.setText(it);
            }
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.l<Object, y> {
        g() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Object obj) {
            if (obj != null) {
                if (!(obj instanceof String) && !(obj instanceof Integer)) {
                    obj = null;
                }
                if (obj != null) {
                    ImageView image = j.this.y1().f22993b;
                    u.i(image, "image");
                    w9.g a11 = w9.a.a(image.getContext());
                    f.a aVar = new f.a(image.getContext());
                    aVar.d(obj);
                    aVar.q(image);
                    a11.d(aVar.b());
                }
            }
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class h extends kotlin.jvm.internal.w implements ym0.l<Boolean, y> {
        h() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            if (u.e(bool, Boolean.TRUE)) {
                j.s1(j.this);
            }
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class i extends kotlin.jvm.internal.w implements ym0.l<Boolean, y> {
        i() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            if (u.e(bool, Boolean.TRUE)) {
                j.t1(j.this);
            }
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* renamed from: com.withings.common.device.j$j  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0458j extends kotlin.jvm.internal.w implements ym0.l<Boolean, y> {
        C0458j() {
            super(1);
        }

        @Override // ym0.l
        public final y invoke(Boolean bool) {
            if (u.e(bool, Boolean.TRUE)) {
                j.u1(j.this);
            }
            return y.f85009a;
        }
    }

    /* compiled from: DeviceSettingsActivity.kt */
    /* loaded from: classes3.dex */
    static final class k implements l0, kotlin.jvm.internal.p {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ ym0.l f35210a;

        k(ym0.l lVar) {
            this.f35210a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof l0) || !(obj instanceof kotlin.jvm.internal.p)) {
                return false;
            }
            return u.e(this.f35210a, ((kotlin.jvm.internal.p) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.p
        public final nm0.d<?> getFunctionDelegate() {
            return this.f35210a;
        }

        public final int hashCode() {
            return this.f35210a.hashCode();
        }

        @Override // androidx.lifecycle.l0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f35210a.invoke(obj);
        }
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class l implements bn0.d<Fragment, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f35211a = nm0.h.b(new com.withings.common.device.k(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f35212b;

        public l(Fragment fragment) {
            this.f35212b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            u.j(thisRef, "thisRef");
            u.j(property, "property");
            return this.f35211a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class m extends kotlin.jvm.internal.w implements ym0.l<j, cl.c> {
        @Override // ym0.l
        public final cl.c invoke(j jVar) {
            j fragment = jVar;
            u.j(fragment, "fragment");
            return cl.c.a(fragment.requireView());
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public j() {
        super(C1987R.layout.fragment_device_connection);
        this.f35195c = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());
        androidx.activity.result.b<Intent> registerForActivityResult = registerForActivityResult(new g.a(), new b());
        u.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f35196d = registerForActivityResult;
        androidx.activity.result.b<Intent> registerForActivityResult2 = registerForActivityResult(new g.a(), new c());
        u.i(registerForActivityResult2, "registerForActivityResult(...)");
        this.f35197e = registerForActivityResult2;
        androidx.activity.result.b<Intent> registerForActivityResult3 = registerForActivityResult(new g.a(), new d());
        u.i(registerForActivityResult3, "registerForActivityResult(...)");
        this.f35198f = registerForActivityResult3;
        this.f35199g = new l(this);
    }

    public static final void s1(j jVar) {
        FragmentActivity activity = jVar.getActivity();
        if (activity != null && !activity.isFinishing()) {
            jVar.f35196d.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    public static final void t1(j jVar) {
        FragmentActivity activity = jVar.getActivity();
        if (activity != null && !activity.isFinishing()) {
            int i11 = EnablePermissionsForScanActivity.f37827j;
            Context requireContext = jVar.requireContext();
            u.i(requireContext, "requireContext(...)");
            jVar.f35197e.a(EnablePermissionsForScanActivity.a.a(requireContext, new DeviceModelScanningAbilityProvider(((Device) jVar.f35199g.getValue(jVar, f35194i[1])).getModelId())));
        }
    }

    public static final void u1(j jVar) {
        FragmentActivity activity = jVar.getActivity();
        if (activity != null && !activity.isFinishing()) {
            int i11 = EnablePermissionsForScanActivity.f37827j;
            Context requireContext = jVar.requireContext();
            u.i(requireContext, "requireContext(...)");
            jVar.f35198f.a(EnablePermissionsForScanActivity.a.a(requireContext, new DeviceModelScanningAbilityProvider(((Device) jVar.f35199g.getValue(jVar, f35194i[1])).getModelId())));
        }
    }

    public static final void v1(j jVar, ActivityResult activityResult) {
        FragmentActivity activity;
        jVar.getClass();
        if (activityResult.b() != -1 && (activity = jVar.getActivity()) != null) {
            activity.finish();
        }
    }

    public static final Device x1(j jVar) {
        jVar.getClass();
        return (Device) jVar.f35199g.getValue(jVar, f35194i[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cl.c y1() {
        return (cl.c) this.f35195c.getValue(this, f35194i[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
    }

    @Override // androidx.fragment.app.Fragment
    public final boolean onOptionsItemSelected(MenuItem item) {
        u.j(item, "item");
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
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        Toolbar toolbar = y1().f22995d;
        u.i(toolbar, "toolbar");
        ay.b.n(toolbar, true, false, 29);
        ConstraintLayout b10 = y1().b();
        u.i(b10, "getRoot(...)");
        ay.b.n(b10, false, true, 23);
        Toolbar toolbar2 = y1().f22995d;
        u.i(toolbar2, "toolbar");
        v1.s0(this, toolbar2);
        com.withings.common.device.l lVar = (com.withings.common.device.l) new k1(this, new e(view)).a(com.withings.common.device.l.class);
        xw.d.c(this, lVar.m0(), new f());
        xw.d.c(this, lVar.k0(), new g());
        lVar.p0().observe(getViewLifecycleOwner(), new k(new h()));
        lVar.q0().observe(getViewLifecycleOwner(), new k(new i()));
        lVar.r0().observe(getViewLifecycleOwner(), new k(new C0458j()));
    }
}
