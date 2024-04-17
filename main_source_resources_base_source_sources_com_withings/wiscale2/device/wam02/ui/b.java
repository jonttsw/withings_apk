package com.withings.wiscale2.device.wam02.ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.android.material.search.j;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import tb0.v1;
/* compiled from: Wam02AutoSleepFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/wam02/ui/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class b extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private int f54902c;

    /* renamed from: d  reason: collision with root package name */
    private a f54903d;

    /* renamed from: e  reason: collision with root package name */
    private v1 f54904e;

    /* compiled from: Wam02AutoSleepFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void I(b bVar, int i11);
    }

    public static void s1(b this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f54903d;
        if (aVar != null) {
            aVar.I(this$0, this$0.f54902c);
        }
    }

    public static void t1(b this$0, v1 this_initViews) {
        u.j(this$0, "this$0");
        u.j(this_initViews, "$this_initViews");
        this$0.x1(this_initViews, 2);
    }

    public static void u1(b this$0, v1 this_initViews) {
        u.j(this$0, "this$0");
        u.j(this_initViews, "$this_initViews");
        this$0.x1(this_initViews, 0);
    }

    public static void v1(b this$0, v1 this_initViews) {
        u.j(this$0, "this$0");
        u.j(this_initViews, "$this_initViews");
        this$0.x1(this_initViews, 2);
    }

    public static void w1(b this$0, v1 this_initViews) {
        u.j(this$0, "this$0");
        u.j(this_initViews, "$this_initViews");
        this$0.x1(this_initViews, 0);
    }

    private final void x1(v1 v1Var, int i11) {
        boolean z5;
        int i12;
        boolean z11;
        this.f54902c = i11;
        WorkflowBar workflowBar = v1Var.f99552f;
        u.i(workflowBar, "workflowBar");
        boolean z12 = true;
        if (this.f54902c < 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        workflowBar.setVisibility(i12);
        if (this.f54902c == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        v1Var.f99550d.setChecked(z11);
        if (this.f54902c != 2) {
            z12 = false;
        }
        v1Var.f99551e.setChecked(z12);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        if (context instanceof a) {
            this.f54903d = (a) context;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        v1 b10 = v1.b(inflater, viewGroup);
        this.f54904e = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f54904e = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        if (this.f54903d instanceof Activity) {
            this.f54903d = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        int i11 = -1;
        if (arguments != null) {
            i11 = arguments.getInt("KEY_KNOWN_AUTO_SLEEP", -1);
        }
        v1 v1Var = this.f54904e;
        if (v1Var != null) {
            j jVar = new j(this, 11);
            WorkflowBar workflowBar = v1Var.f99552f;
            workflowBar.setRightClickListener(jVar);
            workflowBar.setRightText(C1987R.string._SAVE_);
            v1Var.f99550d.setOnClickListener(new je0.c(0, this, v1Var));
            v1Var.f99548b.setOnClickListener(new qb0.c(3, this, v1Var));
            v1Var.f99551e.setOnClickListener(new com.withings.webradio.ui.b(3, this, v1Var));
            v1Var.f99549c.setOnClickListener(new com.withings.coach.chatbot.c(1, this, v1Var));
            x1(v1Var, i11);
        }
    }

    public final void y1(a aVar) {
        this.f54903d = aVar;
    }
}
