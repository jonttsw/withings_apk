package com.withings.device.details.scale;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.device.Device;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
/* compiled from: ScaleSharingFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/withings/device/details/scale/c0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", com.huawei.hms.feature.dynamic.e.b.f28627a, "device-details-scale_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class c0 extends e {
    @Inject

    /* renamed from: h  reason: collision with root package name */
    public com.withings.device.details.scale.b f36915h;
    @Inject

    /* renamed from: i  reason: collision with root package name */
    public qn.a f36916i;

    /* renamed from: k  reason: collision with root package name */
    private a f36918k;

    /* renamed from: n  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f36914n = {androidx.camera.core.v.c(c0.class, "binding", "getBinding()Lcom/withings/device/details/scale/databinding/FragmentScaleSharingBinding;", 0), androidx.camera.core.v.c(c0.class, "device", "getDevice()Lcom/withings/device/Device;", 0)};

    /* renamed from: m  reason: collision with root package name */
    public static final b f36913m = new Object();

    /* renamed from: j  reason: collision with root package name */
    private final LifecycleViewBindingProperty f36917j = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: l  reason: collision with root package name */
    private final c f36919l = new c(this);

    /* compiled from: ScaleSharingFragment.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void w1();
    }

    /* compiled from: ScaleSharingFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b {
    }

    /* compiled from: Fragment.kt */
    /* loaded from: classes3.dex */
    public static final class c implements bn0.d<Fragment, Device> {

        /* renamed from: a  reason: collision with root package name */
        private final nm0.g f36920a = nm0.h.b(new e0(this));

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f36921b;

        public c(Fragment fragment) {
            this.f36921b = fragment;
        }

        /* JADX WARN: Type inference failed for: r2v4, types: [com.withings.device.Device, java.lang.Object] */
        @Override // bn0.d
        public final Device getValue(Fragment fragment, fn0.k property) {
            Fragment thisRef = fragment;
            kotlin.jvm.internal.u.j(thisRef, "thisRef");
            kotlin.jvm.internal.u.j(property, "property");
            return this.f36920a.getValue();
        }
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes3.dex */
    public static final class d extends kotlin.jvm.internal.w implements ym0.l<c0, pn.a> {
        @Override // ym0.l
        public final pn.a invoke(c0 c0Var) {
            c0 fragment = c0Var;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return pn.a.a(fragment.requireView());
        }
    }

    public static void s1(c0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        a aVar = this$0.f36918k;
        kotlin.jvm.internal.u.g(aVar);
        aVar.w1();
    }

    public static void t1(c0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        BuildersKt__Builders_commonKt.launch$default(m0.t.l(this$0), null, null, new d0(this$0, null), 3, null);
    }

    private final pn.a v1() {
        return (pn.a) this.f36917j.getValue(this, f36914n[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Device w1() {
        return (Device) this.f36919l.getValue(this, f36914n[1]);
    }

    @Override // com.withings.device.details.scale.e, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f36918k = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f36918k = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        fl.o d11 = fl.p.f67672b.a().d(w1().getModelId());
        v1().f91540b.setVisibility(0);
        v1().f91540b.setImageResource(d11.M(w1().getColor()));
        TextView textView = v1().f91541c;
        String string = getString(C1987R.string._WBS_SHARING_TITLE__s_);
        kotlin.jvm.internal.u.i(string, "getString(...)");
        textView.setText(String.format(string, Arrays.copyOf(new Object[]{getString(d11.I(w1().getColor()))}, 1)));
        v1().f91539a.setVisibility(0);
        v1().f91539a.setText(C1987R.string._WBS_SHARING_DETAIL_);
        WorkflowBar workflowBar = v1().f91542d;
        workflowBar.setRightText(C1987R.string._INVITE_);
        workflowBar.setRightClickListener(new sg.b(this, 1));
        workflowBar.setLeftText(C1987R.string._DONE_);
        workflowBar.setLeftClickListener(new sg.c(this, 2));
    }
}
