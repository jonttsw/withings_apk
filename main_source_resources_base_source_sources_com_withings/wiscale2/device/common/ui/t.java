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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/t;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class t extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private v f54082c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f54083d;

    /* compiled from: DeviceBondingActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<Integer> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final Integer invoke() {
            return Integer.valueOf(yq.b.a(t.this).getInt("extra_model_id"));
        }
    }

    public t() {
        super(C1987R.layout.fragment_bonding_instruction);
        this.f54083d = nm0.h.b(new a());
    }

    public static void s1(t this$0, View view) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        view.setEnabled(false);
        v vVar = this$0.f54082c;
        if (vVar != null) {
            vVar.y0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f54082c = ((DeviceBondingActivity) context).C3();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f54082c = null;
        super.onDetach();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        String string;
        String string2;
        kotlin.jvm.internal.u.j(view, "view");
        view.findViewById(C1987R.id.button).setOnClickListener(new com.withings.device.details.scale.z(this, 6));
        ImageView imageView = (ImageView) view.findViewById(C1987R.id.image);
        nm0.g gVar = this.f54083d;
        if (((Number) gVar.getValue()).intValue() == 58) {
            i11 = 2131232833;
        } else {
            i11 = 2131231520;
        }
        imageView.setImageResource(i11);
        TextView textView = (TextView) view.findViewById(C1987R.id.title);
        if (((Number) gVar.getValue()).intValue() == 58) {
            string = getString(C1987R.string.wam03_pairingMigration_instructionTitle);
        } else {
            string = getString(C1987R.string.pairingMigration_instructionTitle);
        }
        textView.setText(string);
        TextView textView2 = (TextView) view.findViewById(C1987R.id.description);
        if (((Number) gVar.getValue()).intValue() == 58) {
            string2 = getString(C1987R.string.wam03_pairingMigration_instructionDescription);
        } else {
            string2 = getString(C1987R.string.pairingMigration_instructionDescription);
        }
        textView2.setText(string2);
    }
}
