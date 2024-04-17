package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class s6 extends RecyclerView.z {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f49624f = 0;

    /* renamed from: a  reason: collision with root package name */
    private final View f49625a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f49626b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f49627c;

    /* renamed from: d  reason: collision with root package name */
    private final nm0.g f49628d;

    /* renamed from: e  reason: collision with root package name */
    private final nm0.g f49629e;

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) s6.this.getView().findViewById(C1987R.id.content_body);
        }
    }

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) s6.this.getView().findViewById(C1987R.id.glyph);
        }
    }

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class c extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) s6.this.getView().findViewById(C1987R.id.timestamp);
        }
    }

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class d extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) s6.this.getView().findViewById(C1987R.id.content_title);
        }
    }

    public s6(View view) {
        super(view);
        this.f49625a = view;
        this.f49626b = nm0.h.b(new c());
        this.f49627c = nm0.h.b(new d());
        this.f49628d = nm0.h.b(new a());
        this.f49629e = nm0.h.b(new b());
    }

    public final void a(n1 simpleWorkoutNotification) {
        kotlin.jvm.internal.u.j(simpleWorkoutNotification, "simpleWorkoutNotification");
        if (simpleWorkoutNotification.f()) {
            ((TextView) this.f49626b.getValue()).setCompoundDrawables(null, null, null, null);
            this.f49625a.setEnabled(false);
        }
        ((TextView) this.f49627c.getValue()).setText(simpleWorkoutNotification.e());
        ((TextView) this.f49628d.getValue()).setText(simpleWorkoutNotification.b());
        nm0.g gVar = this.f49629e;
        ((TextView) gVar.getValue()).setText(simpleWorkoutNotification.d());
        ((TextView) gVar.getValue()).setBackgroundTintList(androidx.core.content.a.getColorStateList(this.itemView.getContext(), simpleWorkoutNotification.c()));
    }

    public final View getView() {
        return this.f49625a;
    }
}
