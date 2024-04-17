package com.withings.wiscale2.device.common.feature.irregularHeartBeat;

import android.os.Bundle;
import android.view.View;
import androidx.camera.core.v;
import androidx.fragment.app.Fragment;
import by.kirich1409.viewbindingdelegate.LifecycleViewBindingProperty;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import tb0.z1;
/* compiled from: IrregularHeartBeatActivationNavigation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/feature/irregularHeartBeat/IrregularHeartBeatIntroFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class IrregularHeartBeatIntroFragment extends Fragment {

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ fn0.k<Object>[] f52343d = {v.c(IrregularHeartBeatIntroFragment.class, "binding", "getBinding()Lcom/withings/wiscale2/databinding/FragmentDeviceFeatureActivationBinding;", 0)};

    /* renamed from: c  reason: collision with root package name */
    private final LifecycleViewBindingProperty f52344c;

    /* compiled from: FragmentViewBindings.kt */
    /* loaded from: classes5.dex */
    public static final class a extends w implements ym0.l<IrregularHeartBeatIntroFragment, z1> {
        @Override // ym0.l
        public final z1 invoke(IrregularHeartBeatIntroFragment irregularHeartBeatIntroFragment) {
            return android.support.v4.media.session.c.d(irregularHeartBeatIntroFragment, "fragment");
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ym0.l, kotlin.jvm.internal.w] */
    public IrregularHeartBeatIntroFragment() {
        super(C1987R.layout.fragment_device_feature_activation);
        this.f52344c = by.kirich1409.viewbindingdelegate.e.a(this, new w(1), u9.a.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        ay.b.n(view, false, true, 23);
        z1 z1Var = (z1) this.f52344c.getValue(this, f52343d[0]);
        z1Var.f99674b.setImageResource(2131232763);
        z1Var.f99676d.setText(C1987R.string.heartEvents_nonMedical_tutorial_deviceMonitor_title);
        z1Var.f99673a.setText(C1987R.string.heartEvents_nonMedical_tutorial_deviceMonitor_description);
    }
}
