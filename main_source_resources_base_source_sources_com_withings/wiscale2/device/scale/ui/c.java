package com.withings.wiscale2.device.scale.ui;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.withings.target.WeightGoal;
import com.withings.views.view.WorkflowBar;
import com.withings.wiscale2.C1987R;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import m0.t;
import nm0.l;
import nm0.y;
import ym0.p;
/* compiled from: WeightGoalResultFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/withings/wiscale2/device/scale/ui/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class c extends Fragment {

    /* renamed from: c  reason: collision with root package name */
    private a f54700c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f54701d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f54702e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f54703f;

    /* renamed from: g  reason: collision with root package name */
    private TextView f54704g;

    /* renamed from: h  reason: collision with root package name */
    private TextView f54705h;

    /* renamed from: i  reason: collision with root package name */
    private WorkflowBar f54706i;

    /* renamed from: j  reason: collision with root package name */
    private TextView f54707j;

    /* compiled from: WeightGoalResultFragment.kt */
    /* loaded from: classes5.dex */
    public interface a {
        void d2(c cVar);

        void e1(c cVar);
    }

    /* compiled from: WeightGoalResultFragment.kt */
    @e(c = "com.withings.wiscale2.device.scale.ui.WeightGoalResultFragment$onViewCreated$3", f = "WeightGoalResultFragment.kt", l = {68}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    static final class b extends i implements p<CoroutineScope, qm0.d<? super y>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f54708a;

        b(qm0.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final qm0.d<y> create(Object obj, qm0.d<?> dVar) {
            return new b(dVar);
        }

        @Override // ym0.p
        public final Object invoke(CoroutineScope coroutineScope, qm0.d<? super y> dVar) {
            return ((b) create(coroutineScope, dVar)).invokeSuspend(y.f85009a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.f76214a;
            int i11 = this.f54708a;
            if (i11 != 0) {
                if (i11 == 1) {
                    l.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                l.b(obj);
                c cVar = c.this;
                Bundle a11 = yq.b.a(cVar);
                if (Build.VERSION.SDK_INT >= 33) {
                    obj2 = a11.getSerializable("GOAL_KEY", WeightGoal.class);
                } else {
                    Serializable serializable = a11.getSerializable("GOAL_KEY");
                    if (!(serializable instanceof WeightGoal)) {
                        serializable = null;
                    }
                    obj2 = (WeightGoal) serializable;
                }
                u.g(obj2);
                this.f54708a = 1;
                if (c.u1(cVar, (WeightGoal) obj2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return y.f85009a;
        }
    }

    public static void s1(c this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f54700c;
        if (aVar != null) {
            aVar.d2(this$0);
        }
    }

    public static void t1(c this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f54700c;
        if (aVar != null) {
            aVar.e1(this$0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u1(com.withings.wiscale2.device.scale.ui.c r10, com.withings.target.WeightGoal r11, qm0.d r12) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.withings.wiscale2.device.scale.ui.c.u1(com.withings.wiscale2.device.scale.ui.c, com.withings.target.WeightGoal, qm0.d):java.lang.Object");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        u.j(context, "context");
        super.onAttach(context);
        if (getActivity() instanceof a) {
            FragmentActivity activity = getActivity();
            u.h(activity, "null cannot be cast to non-null type com.withings.wiscale2.device.scale.ui.WeightGoalResultFragment.Callback");
            this.f54700c = (a) activity;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        View inflate = inflater.inflate(C1987R.layout.fragment_scale_goal_set, viewGroup, false);
        u.i(inflate, "inflate(...)");
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        View findViewById = view.findViewById(C1987R.id.goal_value);
        u.i(findViewById, "findViewById(...)");
        this.f54701d = (TextView) findViewById;
        View findViewById2 = view.findViewById(C1987R.id.goal_unit);
        u.i(findViewById2, "findViewById(...)");
        this.f54702e = (TextView) findViewById2;
        View findViewById3 = view.findViewById(C1987R.id.goal_secondary_value);
        u.i(findViewById3, "findViewById(...)");
        this.f54703f = (TextView) findViewById3;
        View findViewById4 = view.findViewById(C1987R.id.goal_secondary_unit);
        u.i(findViewById4, "findViewById(...)");
        this.f54704g = (TextView) findViewById4;
        View findViewById5 = view.findViewById(C1987R.id.goal_speed);
        u.i(findViewById5, "findViewById(...)");
        this.f54705h = (TextView) findViewById5;
        View findViewById6 = view.findViewById(C1987R.id.workflowBar);
        u.i(findViewById6, "findViewById(...)");
        this.f54706i = (WorkflowBar) findViewById6;
        View findViewById7 = view.findViewById(C1987R.id.change_button);
        u.i(findViewById7, "findViewById(...)");
        this.f54707j = (TextView) findViewById7;
        WorkflowBar workflowBar = this.f54706i;
        if (workflowBar != null) {
            ay.b.n(workflowBar, false, true, 23);
            WorkflowBar workflowBar2 = this.f54706i;
            if (workflowBar2 != null) {
                workflowBar2.setRightClickListener(new sg.c(this, 12));
                TextView textView = this.f54707j;
                if (textView != null) {
                    textView.setOnClickListener(new sg.d(this, 12));
                    BuildersKt__Builders_commonKt.launch$default(t.l(this), null, null, new b(null), 3, null);
                    return;
                }
                u.s("changeGoalButton");
                throw null;
            }
            u.s("workflowBar");
            throw null;
        }
        u.s("workflowBar");
        throw null;
    }
}
