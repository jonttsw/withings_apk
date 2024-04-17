package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.views.view.StatBarLayout;
import com.withings.views.view.StatBarView;
import com.withings.wiscale2.C1987R;
import java.util.List;
/* compiled from: AllWorkoutsActivity.kt */
/* loaded from: classes4.dex */
public final class u1 extends RecyclerView.z {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f49663i = 0;

    /* renamed from: a  reason: collision with root package name */
    private final View f49664a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f49665b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f49666c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f49667d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f49668e;

    /* renamed from: f  reason: collision with root package name */
    private final nm0.g f49669f;

    /* renamed from: g  reason: collision with root package name */
    private final nm0.g f49670g;

    /* renamed from: h  reason: collision with root package name */
    private final nm0.g f49671h;

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) u1.this.itemView.findViewById(C1987R.id.workout_category);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) u1.this.itemView.findViewById(C1987R.id.timestamp);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<View> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return u1.this.itemView.findViewById(C1987R.id.gradientBottom);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<View> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return u1.this.itemView.findViewById(C1987R.id.gradientTop);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class e extends kotlin.jvm.internal.w implements ym0.a<View> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final View invoke() {
            return u1.this.itemView.findViewById(C1987R.id.workout_separator);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class f extends kotlin.jvm.internal.w implements ym0.a<StatBarLayout> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final StatBarLayout invoke() {
            return (StatBarLayout) u1.this.itemView.findViewById(C1987R.id.statbar);
        }
    }

    /* compiled from: AllWorkoutsActivity.kt */
    /* loaded from: classes4.dex */
    static final class g extends kotlin.jvm.internal.w implements ym0.a<WorkoutPreview> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final WorkoutPreview invoke() {
            return (WorkoutPreview) u1.this.itemView.findViewById(C1987R.id.workout_preview);
        }
    }

    public u1(View view) {
        super(view);
        this.f49664a = view;
        this.f49665b = nm0.h.b(new a());
        this.f49666c = nm0.h.b(new b());
        this.f49667d = nm0.h.b(new f());
        this.f49668e = nm0.h.b(new g());
        this.f49669f = nm0.h.b(new c());
        this.f49670g = nm0.h.b(new d());
        this.f49671h = nm0.h.b(new e());
    }

    public final void a(l7 l7Var, boolean z5) {
        int i11;
        Context context;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        Context context2 = this.itemView.getContext();
        View view = (View) this.f49671h.getValue();
        kotlin.jvm.internal.u.i(view, "<get-separator>(...)");
        if (z5) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        view.setVisibility(i11);
        nm0.g gVar = this.f49668e;
        ((WorkoutPreview) gVar.getValue()).C(l7Var);
        kotlin.jvm.internal.u.g(context2);
        View view2 = this.f49664a;
        Context context3 = view2.getContext();
        kotlin.jvm.internal.u.i(context3, "getContext(...)");
        int i16 = 16842806;
        if (!ah.u.D(context3) && l7Var.f() != null) {
            i16 = 16842809;
        }
        int w11 = ah.u.w(i16, context2, -65281);
        kotlin.jvm.internal.u.i(view2.getContext(), "getContext(...)");
        if ((!ah.u.D(context)) && l7Var.f() == null && ((WorkoutPreview) gVar.getValue()) != null) {
            i12 = C1987R.drawable.background_timeline_workout_top_light_gradient;
            i13 = C1987R.drawable.background_timeline_workout_bottom_light_gradient;
        } else {
            i12 = C1987R.drawable.background_timeline_workout_top_dark_gradient;
            i13 = C1987R.drawable.background_timeline_workout_bottom_dark_gradient;
        }
        nm0.g gVar2 = this.f49670g;
        View view3 = (View) gVar2.getValue();
        kotlin.jvm.internal.u.i(view3, "<get-gradientTop>(...)");
        if (((WorkoutPreview) gVar.getValue()) == null && l7Var.f() == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z11) {
            i14 = 0;
        } else {
            i14 = 8;
        }
        view3.setVisibility(i14);
        ((View) gVar2.getValue()).setBackgroundResource(i12);
        nm0.g gVar3 = this.f49669f;
        View view4 = (View) gVar3.getValue();
        kotlin.jvm.internal.u.i(view4, "<get-gradientBottom>(...)");
        if (((WorkoutPreview) gVar.getValue()) == null && l7Var.f() == null) {
            i15 = 8;
        } else {
            i15 = 0;
        }
        view4.setVisibility(i15);
        ((View) gVar3.getValue()).setBackgroundResource(i13);
        nm0.g gVar4 = this.f49665b;
        ((TextView) gVar4.getValue()).setTextColor(w11);
        ((TextView) gVar4.getValue()).setText(l7Var.a().getName(context2));
        nm0.g gVar5 = this.f49666c;
        ((TextView) gVar5.getValue()).setTextColor(w11);
        ((TextView) gVar5.getValue()).setText(b50.b.m(l7Var.c(), context2, false, 6));
        StatBarLayout statBarLayout = (StatBarLayout) this.f49667d.getValue();
        kotlin.jvm.internal.u.i(statBarLayout, "<get-statBarLayout>(...)");
        List<StatBarView> A = cp0.n.A(cp0.n.h(androidx.core.view.b1.a(statBarLayout), v1.f49733a));
        for (StatBarView statBarView : A) {
            statBarView.setVisibility(8);
        }
        int min = Math.min(4, l7Var.i().size());
        for (int i17 = 0; i17 < min; i17++) {
            xa0.a aVar = l7Var.i().get(i17);
            StatBarView statBarView2 = (StatBarView) A.get(i17);
            statBarView2.setId(aVar.a());
            statBarView2.getLabelView().setTextColor(w11);
            statBarView2.getValueView().setTextColor(w11);
            statBarView2.setVisibility(0);
            statBarView2.setLabel(aVar.b());
            statBarView2.setValue(aVar.c());
        }
        this.itemView.setOnClickListener(new fa0.c(1, context2, l7Var));
    }
}
