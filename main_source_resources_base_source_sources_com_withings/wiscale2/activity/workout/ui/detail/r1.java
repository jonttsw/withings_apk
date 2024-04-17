package com.withings.wiscale2.activity.workout.ui.detail;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class r1 extends RecyclerView.z {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f49576d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f49577a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f49578b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f49579c;

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) r1.this.itemView.findViewById(C1987R.id.content_body);
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
            return (TextView) r1.this.itemView.findViewById(C1987R.id.glyph);
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
            return (TextView) r1.this.itemView.findViewById(C1987R.id.content_title);
        }
    }

    public r1(View view) {
        super(view);
        this.f49577a = nm0.h.b(new c());
        this.f49578b = nm0.h.b(new a());
        this.f49579c = nm0.h.b(new b());
    }

    public final void a(s1 notification) {
        kotlin.jvm.internal.u.j(notification, "notification");
        nm0.g gVar = this.f49579c;
        ((TextView) gVar.getValue()).setText(notification.d());
        ((TextView) gVar.getValue()).setBackground(notification.c());
        ((TextView) this.f49577a.getValue()).setText(notification.f());
        ((TextView) this.f49578b.getValue()).setText(notification.b());
    }
}
