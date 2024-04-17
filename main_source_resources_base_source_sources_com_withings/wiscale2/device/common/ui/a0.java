package com.withings.wiscale2.device.common.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SeekBar;
import androidx.fragment.app.Fragment;
import com.withings.comm.wpp.generated.object.LuminosityLevel;
import com.withings.views.view.ToggleCellView;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import tb0.a3;
/* compiled from: DeviceBrightnessFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/common/ui/a0;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class a0 extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private a3 f53770c;

    /* renamed from: d  reason: collision with root package name */
    private LuminosityLevel f53771d;

    /* renamed from: e  reason: collision with root package name */
    private a f53772e;

    /* renamed from: f  reason: collision with root package name */
    private long f53773f;

    /* compiled from: DeviceBrightnessFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void U(a0 a0Var, LuminosityLevel luminosityLevel);
    }

    public static final void v1(a0 a0Var, a3 a3Var) {
        a0Var.getClass();
        if (System.currentTimeMillis() - a0Var.f53773f > 200) {
            LuminosityLevel luminosityLevel = a0Var.f53771d;
            if (luminosityLevel != null) {
                luminosityLevel.level = (short) a3Var.f98857d.getProgress();
                a aVar = a0Var.f53772e;
                if (aVar != null) {
                    LuminosityLevel luminosityLevel2 = a0Var.f53771d;
                    if (luminosityLevel2 != null) {
                        aVar.U(a0Var, luminosityLevel2);
                    } else {
                        kotlin.jvm.internal.u.s("luminosityLevel");
                        throw null;
                    }
                }
                a0Var.f53773f = System.currentTimeMillis();
                return;
            }
            kotlin.jvm.internal.u.s("luminosityLevel");
            throw null;
        }
    }

    public static final /* synthetic */ void w1(a0 a0Var, a3 a3Var) {
        a0Var.getClass();
        x1(a3Var);
    }

    private static void x1(a3 a3Var) {
        int i11;
        if (a3Var.f98857d.isEnabled()) {
            i11 = C1987R.color.textPrimary;
        } else {
            i11 = C1987R.color.textSecondary;
        }
        Context context = a3Var.a().getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        a3Var.f98855b.setImageDrawable(y70.a.a(C1987R.drawable.ic_utilitary_lightdown, context, i11));
        Context context2 = a3Var.a().getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        a3Var.f98856c.setImageDrawable(y70.a.a(C1987R.drawable.ic_utilitary_lightup, context2, i11));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.u.j(context, "context");
        super.onAttach(context);
        this.f53772e = (a) context;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.u.j(inflater, "inflater");
        a3 b10 = a3.b(inflater, viewGroup);
        this.f53770c = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f53772e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        short s11;
        kotlin.jvm.internal.u.j(view, "view");
        super.onViewCreated(view, bundle);
        LuminosityLevel luminosityLevel = new LuminosityLevel();
        Bundle arguments = getArguments();
        boolean z5 = false;
        if (arguments != null) {
            s11 = arguments.getShort("mode", (short) 0);
        } else {
            s11 = 0;
        }
        luminosityLevel.mode = s11;
        Bundle arguments2 = getArguments();
        short s12 = 50;
        if (arguments2 != null) {
            s12 = arguments2.getShort("brightness", (short) 50);
        }
        luminosityLevel.level = s12;
        this.f53771d = luminosityLevel;
        a3 a3Var = this.f53770c;
        if (a3Var != null) {
            b0 b0Var = new b0(this, a3Var);
            ToggleCellView toggleCellView = a3Var.f98858e;
            toggleCellView.setToggleListener(b0Var);
            LuminosityLevel luminosityLevel2 = this.f53771d;
            if (luminosityLevel2 != null) {
                if (luminosityLevel2.mode == 0) {
                    z5 = true;
                }
                toggleCellView.setChecked(z5);
                LuminosityLevel luminosityLevel3 = this.f53771d;
                if (luminosityLevel3 != null) {
                    int min = Math.min((int) luminosityLevel3.level, 100);
                    SeekBar seekBar = a3Var.f98857d;
                    seekBar.setProgress(min);
                    seekBar.setOnSeekBarChangeListener(new c0(this, a3Var));
                    seekBar.setEnabled(!toggleCellView.z());
                    x1(a3Var);
                    return;
                }
                kotlin.jvm.internal.u.s("luminosityLevel");
                throw null;
            }
            kotlin.jvm.internal.u.s("luminosityLevel");
            throw null;
        }
    }
}
