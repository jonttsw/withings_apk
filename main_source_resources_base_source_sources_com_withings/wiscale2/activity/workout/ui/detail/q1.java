package com.withings.wiscale2.activity.workout.ui.detail;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: WorkoutNotification.kt */
/* loaded from: classes4.dex */
final class q1 extends RecyclerView.z {

    /* renamed from: d  reason: collision with root package name */
    public static final /* synthetic */ int f49551d = 0;

    /* renamed from: a  reason: collision with root package name */
    private final nm0.g f49552a;

    /* renamed from: b  reason: collision with root package name */
    private final nm0.g f49553b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f49554c;

    /* compiled from: WorkoutNotification.kt */
    /* loaded from: classes4.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TextView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) q1.this.itemView.findViewById(C1987R.id.content_body);
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
            return (TextView) q1.this.itemView.findViewById(C1987R.id.glyph);
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
            return (TextView) q1.this.itemView.findViewById(C1987R.id.content_title);
        }
    }

    public q1(View view) {
        super(view);
        this.f49552a = nm0.h.b(new c());
        this.f49553b = nm0.h.b(new a());
        nm0.g b10 = nm0.h.b(new b());
        this.f49554c = b10;
        Context context = this.itemView.getContext();
        kotlin.jvm.internal.u.i(context, "getContext(...)");
        Context context2 = this.itemView.getContext();
        kotlin.jvm.internal.u.i(context2, "getContext(...)");
        ((TextView) b10.getValue()).setBackground(y70.a.c(C1987R.drawable.white_circle, context, ah.u.w(C1987R.attr.colorPrimary, context2, -65281)));
        Context context3 = this.itemView.getContext();
        kotlin.jvm.internal.u.i(context3, "getContext(...)");
        ((TextView) b10.getValue()).setTextColor(ah.u.w(C1987R.attr.colorOnPrimary, context3, -65281));
    }

    public final void a(p1 notification) {
        int i11;
        kotlin.jvm.internal.u.j(notification, "notification");
        TextView textView = (TextView) this.f49554c.getValue();
        String e11 = notification.b().e().e();
        if (e11 != null) {
            if (e11.length() == 0) {
                e11 = null;
            }
            if (e11 != null) {
                Context context = this.itemView.getContext();
                kotlin.jvm.internal.u.i(context, "getContext(...)");
                i11 = wq.a.f(context, e11);
                textView.setText(zq.b.b(this, i11));
                ((TextView) this.f49552a.getValue()).setText(notification.b().e().l());
                ((TextView) this.f49553b.getValue()).setText(notification.b().e().j());
            }
        }
        i11 = C1987R.string.glyph_message;
        textView.setText(zq.b.b(this, i11));
        ((TextView) this.f49552a.getValue()).setText(notification.b().e().l());
        ((TextView) this.f49553b.getValue()).setText(notification.b().e().j());
    }
}
