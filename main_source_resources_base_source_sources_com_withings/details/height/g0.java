package com.withings.details.height;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.withings.views.view.ToggleCellView;
import com.withings.wiscale2.C1987R;
import java.util.Iterator;
import kotlin.Metadata;
/* compiled from: HeightOptionSheetFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/details/height/g0;", "Lcom/google/android/material/bottomsheet/l;", "<init>", "()V", "a", "android_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public class g0 extends com.google.android.material.bottomsheet.l {

    /* renamed from: c  reason: collision with root package name */
    private boolean f36604c;

    /* renamed from: d  reason: collision with root package name */
    private a f36605d;

    /* compiled from: HeightOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void J(boolean z5);

        void T();
    }

    /* compiled from: HeightOptionSheetFragment.kt */
    /* loaded from: classes3.dex */
    public static final class b implements com.withings.views.view.m {
        b() {
        }

        @Override // com.withings.views.view.m
        public final void onCellSwitched(ToggleCellView toggleView, boolean z5) {
            kotlin.jvm.internal.u.j(toggleView, "toggleView");
            Context context = toggleView.getContext();
            kotlin.jvm.internal.u.i(context, "getContext(...)");
            SharedPreferences.Editor edit = wq.a.l(context).edit();
            edit.putBoolean("showWeightNormality", z5);
            edit.apply();
            a t12 = g0.this.t1();
            if (t12 != null) {
                t12.J(z5);
            }
        }
    }

    public static void s1(g0 this$0) {
        kotlin.jvm.internal.u.j(this$0, "this$0");
        a aVar = this$0.f36605d;
        if (aVar != null) {
            aVar.T();
        }
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.m, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        boolean z5 = false;
        if (arguments != null) {
            z5 = arguments.getBoolean("display_graph_options", false);
        }
        this.f36604c = z5;
    }

    @Override // androidx.appcompat.app.u, androidx.fragment.app.m
    public final void setupDialog(Dialog dialog, int i11) {
        kotlin.jvm.internal.u.j(dialog, "dialog");
        super.setupDialog(dialog, i11);
        View inflate = LayoutInflater.from(getContext()).inflate(C1987R.layout.dialog_height_graph, (ViewGroup) null);
        dialog.setContentView(inflate);
        inflate.findViewById(C1987R.id.dialog_height_graph_add_measurement).setOnClickListener(new com.google.android.material.search.g(this, 1));
        Iterator it = kotlin.collections.x.W(Integer.valueOf((int) C1987R.id.dialog_height_graph_seprator1), Integer.valueOf((int) C1987R.id.dialog_height_graph_display_options_title), Integer.valueOf((int) C1987R.id.toggle_normality_zone)).iterator();
        while (true) {
            int i12 = 0;
            if (it.hasNext()) {
                View findViewById = inflate.findViewById(((Number) it.next()).intValue());
                kotlin.jvm.internal.u.i(findViewById, "findViewById(...)");
                if (!this.f36604c) {
                    i12 = 8;
                }
                findViewById.setVisibility(i12);
            } else {
                ToggleCellView toggleCellView = (ToggleCellView) inflate.findViewById(C1987R.id.toggle_normality_zone);
                Context context = toggleCellView.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                toggleCellView.setChecked(wq.a.l(context).getBoolean("showWeightNormality", false));
                toggleCellView.setToggleListener(new b());
                return;
            }
        }
    }

    public final a t1() {
        return this.f36605d;
    }

    public final void u1(a aVar) {
        this.f36605d = aVar;
    }
}
