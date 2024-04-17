package com.withings.wiscale2.settings;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.withings.wiscale2.C1987R;
/* compiled from: DebugDeeplinkActivity.kt */
/* loaded from: classes5.dex */
public final class d0 extends RecyclerView.z {

    /* renamed from: a  reason: collision with root package name */
    private final ym0.l<e0, nm0.y> f59955a;

    /* renamed from: b  reason: collision with root package name */
    private final ym0.l<b0, nm0.y> f59956b;

    /* renamed from: c  reason: collision with root package name */
    private final nm0.g f59957c;

    /* compiled from: DebugDeeplinkActivity.kt */
    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.w implements ym0.a<TextView> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f59958a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view) {
            super(0);
            this.f59958a = view;
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) this.f59958a.findViewById(C1987R.id.deeplink_label);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d0(View view, ym0.l<? super e0, nm0.y> openUsersSelectionListener, ym0.l<? super b0, nm0.y> openDeeplinkListener) {
        super(view);
        kotlin.jvm.internal.u.j(openUsersSelectionListener, "openUsersSelectionListener");
        kotlin.jvm.internal.u.j(openDeeplinkListener, "openDeeplinkListener");
        this.f59955a = openUsersSelectionListener;
        this.f59956b = openDeeplinkListener;
        this.f59957c = nm0.h.b(new a(view));
    }

    public static void a(b0 deeplink, d0 this$0) {
        kotlin.jvm.internal.u.j(deeplink, "$deeplink");
        kotlin.jvm.internal.u.j(this$0, "this$0");
        if (deeplink instanceof e0) {
            if (!((e0) deeplink).b().isEmpty()) {
                this$0.f59955a.invoke(deeplink);
                return;
            }
            return;
        }
        this$0.f59956b.invoke(deeplink);
    }

    public final TextView b() {
        Object value = this.f59957c.getValue();
        kotlin.jvm.internal.u.i(value, "getValue(...)");
        return (TextView) value;
    }
}
