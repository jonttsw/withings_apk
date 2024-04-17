package com.withings.wiscale2.device.wpm.ui;

import android.os.Bundle;
import android.view.View;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.views.widget.LineCellView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import tb0.o2;
/* compiled from: WpmInfoFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wpm/ui/l0;", "Lcom/withings/wiscale2/device/common/ui/h;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class l0 extends com.withings.wiscale2.device.common.ui.h {

    /* renamed from: t  reason: collision with root package name */
    private final LifecycleViewBindingProperty f55778t = by.kirich1409.viewbindingdelegate.e.a(this, new kotlin.jvm.internal.w(1), u9.a.a());

    /* renamed from: u  reason: collision with root package name */
    private final int f55779u = C1987R.layout.fragment_device_info_wpm;

    /* renamed from: w  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f55777w = {androidx.camera.core.v.c(l0.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceInfoWpmBinding;", 0)};

    /* renamed from: v  reason: collision with root package name */
    public static final a f55776v = new Object();

    /* compiled from: WpmInfoFragment.kt */
    /* loaded from: classes5.dex */
    public static final class a {
    }

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.jvm.internal.w implements ym0.l<l0, o2> {
        @Override // ym0.l
        public final o2 invoke(l0 l0Var) {
            l0 fragment = l0Var;
            kotlin.jvm.internal.u.j(fragment, "fragment");
            return o2.a(fragment.requireView());
        }
    }

    public static void S1(l0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        this$0.N1();
    }

    @Override // com.withings.wiscale2.device.common.ui.h
    public final int H1() {
        return this.f55779u;
    }

    @Override // com.withings.wiscale2.device.common.ui.h, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        o2 o2Var = (o2) this.f55778t.getValue(this, f55777w[0]);
        o2Var.f99394c.setSecondaryLabel(F1().getMacAddress().toString());
        LineCellView deviceFirmware = o2Var.f99393b;
        kotlin.jvm.internal.u.i(deviceFirmware, "deviceFirmware");
        deviceFirmware.setVisibility(8);
        o2Var.f99395d.setOnClickListener(new androidx.viewpager.widget.c(this, 14));
        o2Var.f99392a.setOnClickListener(new androidx.viewpager.widget.d(this, 8));
    }
}
