package com.withings.wiscale2.device.common.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
/* compiled from: DeviceBondingActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/r;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class r extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private v f54064c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f54065d;

    /* compiled from: DeviceBondingActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(yq.b.a(r.this).getInt("extra_model_id"));
        }
    }

    public r() {
        super(C1987R.layout.fragment_bonding_completed);
        this.f54065d = nm0.h.b(new a());
    }

    public static void s1(r this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        v vVar = this$0.f54064c;
        if (vVar != null) {
            vVar.t0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f54064c = ((DeviceBondingActivity) context).C3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f54064c = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        kotlin.jvm.internal.u.j(view, "view");
        view.findViewById(C1987R.id.button).setOnClickListener(new gi.i(this, 6));
        ImageView imageView = (ImageView) view.findViewById(C1987R.id.image);
        if (((Number) this.f54065d.getValue()).intValue() == 58) {
            i11 = 2131232832;
        } else {
            i11 = 2131231519;
        }
        imageView.setImageResource(i11);
        ((TextView) view.findViewById(C1987R.id.description)).setText(C1987R.string.pairingMigration_completedDescription);
    }
}
