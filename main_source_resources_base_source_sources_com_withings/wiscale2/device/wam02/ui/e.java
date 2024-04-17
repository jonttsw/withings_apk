package com.withings.wiscale2.device.wam02.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.withings.coach.chatbot.y0;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import com.withings.wiscale2.device.wam02.ui.GoPolarizationView;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import tb0.y2;
/* compiled from: Wam02PolarizationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wam02/ui/e;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class e extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f54908f = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f54909c;

    /* renamed from: d  reason: collision with root package name */
    private a f54910d;

    /* renamed from: e  reason: collision with root package name */
    private y2 f54911e;

    /* compiled from: Wam02PolarizationFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void c0();

        void i0();

        void t0();
    }

    public static void s1(e this$0, y2 this_initViews) {
        u.j(this$0, "this$0");
        u.j(this_initViews, "$this_initViews");
        if (this$0.f54909c) {
            this_initViews.f99652b.setSelectedPolarizationWithAnimation(false);
            this_initViews.f99653c.setSelectedPolarizationWithAnimation(true);
            a aVar = this$0.f54910d;
            if (aVar != null) {
                aVar.t0();
            }
            this$0.f54909c = !this$0.f54909c;
        }
    }

    public static void t1(e this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f54910d;
        if (aVar != null) {
            aVar.i0();
        }
    }

    public static void u1(e this$0, y2 this_initViews) {
        u.j(this$0, "this$0");
        u.j(this_initViews, "$this_initViews");
        if (!this$0.f54909c) {
            this_initViews.f99652b.setSelectedPolarizationWithAnimation(true);
            this_initViews.f99653c.setSelectedPolarizationWithAnimation(false);
            a aVar = this$0.f54910d;
            if (aVar != null) {
                aVar.c0();
            }
            this$0.f54909c = !this$0.f54909c;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        if (context instanceof a) {
            this.f54910d = (a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        y2 b10 = y2.b(inflater, viewGroup);
        this.f54911e = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f54911e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (this.f54910d instanceof Activity) {
            this.f54910d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i11;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        boolean z5 = false;
        if (arguments != null) {
            i11 = arguments.getInt("polarization", 0);
        } else {
            i11 = 0;
        }
        y2 y2Var = this.f54911e;
        if (y2Var != null) {
            vn.d dVar = new vn.d(this, 9);
            WorkflowBar workflowBar = y2Var.f99654d;
            workflowBar.setRightClickListener(dVar);
            workflowBar.setRightText(C1987R.string._WTI_DONE_);
            if (i11 == 1) {
                z5 = true;
            }
            this.f54909c = z5;
            GoPolarizationView.a.C0726a c0726a = GoPolarizationView.a.C0726a.f54875d;
            GoPolarizationView goPolarizationView = y2Var.f99652b;
            goPolarizationView.setPolarization(c0726a);
            goPolarizationView.setSelectedPolarizationWithoutAnimation(this.f54909c);
            goPolarizationView.setOnClickListener(new pq.d(2, this, y2Var));
            GoPolarizationView.a.b bVar = GoPolarizationView.a.b.f54876d;
            GoPolarizationView goPolarizationView2 = y2Var.f99653c;
            goPolarizationView2.setPolarization(bVar);
            goPolarizationView2.setSelectedPolarizationWithoutAnimation(!this.f54909c);
            goPolarizationView2.setOnClickListener(new y0(2, this, y2Var));
        }
    }

    public final void v1(a aVar) {
        this.f54910d = aVar;
    }
}
