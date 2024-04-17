package com.withings.wiscale2.activity.workout.ui.performance;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.r2;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.g;
import nm0.h;
/* compiled from: PerformanceGraphLegendView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006R#\u0010\u000f\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR#\u0010\u0012\u001a\n \n*\u0004\u0018\u00010\t0\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR#\u0010\u0017\u001a\n \n*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0015\u0010\u0016R#\u0010\u001a\u001a\n \n*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\f\u001a\u0004\b\u0019\u0010\u0016¨\u0006#"}, d2 = {"Lcom/withings/wiscale2/activity/workout/ui/performance/PerformanceGraphLegendView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "shouldShowPace", "Lnm0/y;", "setPaceVisibility", "(Z)V", "shouldShowElevation", "setElevationVisibility", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getPaceLegendText", "()Landroid/widget/TextView;", "paceLegendText", "u", "getElevationLegendText", "elevationLegendText", "Landroid/widget/ImageView;", ConstantsWs.JSON_SESSION_KEY_VALUE, "getPaceLegendIcon", "()Landroid/widget/ImageView;", "paceLegendIcon", ConstantsWs.JSON_SESSION_KEY_WEIGHTUNIT, "getElevationLegendIcon", "elevationLegendIcon", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class PerformanceGraphLegendView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final g f49947t;

    /* renamed from: u  reason: collision with root package name */
    private final g f49948u;

    /* renamed from: v  reason: collision with root package name */
    private final g f49949v;

    /* renamed from: w  reason: collision with root package name */
    private final g f49950w;

    /* compiled from: PerformanceGraphLegendView.kt */
    /* loaded from: classes4.dex */
    static final class a extends w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) PerformanceGraphLegendView.this.findViewById(C1987R.id.elevation_legend_icon);
        }
    }

    /* compiled from: PerformanceGraphLegendView.kt */
    /* loaded from: classes4.dex */
    static final class b extends w implements ym0.a<TextView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) PerformanceGraphLegendView.this.findViewById(C1987R.id.elevation_legend_text);
        }
    }

    /* compiled from: PerformanceGraphLegendView.kt */
    /* loaded from: classes4.dex */
    static final class c extends w implements ym0.a<ImageView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) PerformanceGraphLegendView.this.findViewById(C1987R.id.pace_legend_icon);
        }
    }

    /* compiled from: PerformanceGraphLegendView.kt */
    /* loaded from: classes4.dex */
    static final class d extends w implements ym0.a<TextView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) PerformanceGraphLegendView.this.findViewById(C1987R.id.pace_legend_text);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PerformanceGraphLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    private final ImageView getElevationLegendIcon() {
        return (ImageView) this.f49950w.getValue();
    }

    private final TextView getElevationLegendText() {
        return (TextView) this.f49948u.getValue();
    }

    private final ImageView getPaceLegendIcon() {
        return (ImageView) this.f49949v.getValue();
    }

    private final TextView getPaceLegendText() {
        return (TextView) this.f49947t.getValue();
    }

    public final void setElevationVisibility(boolean z5) {
        int i11;
        TextView elevationLegendText = getElevationLegendText();
        u.i(elevationLegendText, "<get-elevationLegendText>(...)");
        int i12 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        elevationLegendText.setVisibility(i11);
        ImageView elevationLegendIcon = getElevationLegendIcon();
        u.i(elevationLegendIcon, "<get-elevationLegendIcon>(...)");
        if (z5) {
            i12 = 0;
        }
        elevationLegendIcon.setVisibility(i12);
    }

    public final void setPaceVisibility(boolean z5) {
        int i11;
        TextView paceLegendText = getPaceLegendText();
        u.i(paceLegendText, "<get-paceLegendText>(...)");
        int i12 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        paceLegendText.setVisibility(i11);
        ImageView paceLegendIcon = getPaceLegendIcon();
        u.i(paceLegendIcon, "<get-paceLegendIcon>(...)");
        if (z5) {
            i12 = 0;
        }
        paceLegendIcon.setVisibility(i12);
    }

    public final void t(boolean z5) {
        String valueOf;
        if (z5) {
            getPaceLegendText().setVisibility(0);
            getPaceLegendIcon().setVisibility(0);
            TextView paceLegendText = getPaceLegendText();
            String string = getContext().getString(C1987R.string._SPEED_);
            u.i(string, "getString(...)");
            if (string.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char charAt = string.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    valueOf = r2.a("getDefault(...)", charAt);
                } else {
                    valueOf = String.valueOf(charAt);
                }
                string = androidx.appcompat.view.menu.d.e(sb2, valueOf, string, 1, "substring(...)");
            }
            paceLegendText.setText(string);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PerformanceGraphLegendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String valueOf;
        String valueOf2;
        u.j(context, "context");
        this.f49947t = h.b(new d());
        this.f49948u = h.b(new b());
        this.f49949v = h.b(new c());
        this.f49950w = h.b(new a());
        View.inflate(getContext(), C1987R.layout.view_performance_graph_legend, this);
        TextView paceLegendText = getPaceLegendText();
        String string = context.getString(C1987R.string.workout_detailView_pace);
        u.i(string, "getString(...)");
        if (string.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = string.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf2 = r2.a("getDefault(...)", charAt);
            } else {
                valueOf2 = String.valueOf(charAt);
            }
            string = androidx.appcompat.view.menu.d.e(sb2, valueOf2, string, 1, "substring(...)");
        }
        paceLegendText.setText(string);
        TextView elevationLegendText = getElevationLegendText();
        String string2 = context.getString(C1987R.string.workout_detailView_elevation);
        u.i(string2, "getString(...)");
        if (string2.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            char charAt2 = string2.charAt(0);
            if (Character.isLowerCase(charAt2)) {
                valueOf = r2.a("getDefault(...)", charAt2);
            } else {
                valueOf = String.valueOf(charAt2);
            }
            string2 = androidx.appcompat.view.menu.d.e(sb3, valueOf, string2, 1, "substring(...)");
        }
        elevationLegendText.setText(string2);
        getPaceLegendIcon().setImageDrawable(androidx.core.content.a.getDrawable(context, C1987R.drawable.gradient_legend_perf));
        getElevationLegendIcon().setImageDrawable(y70.b.c(context, ah.g.k(10, context), ah.u.w(C1987R.attr.colorOnBackground, context, -65281), ah.g.k(3, context)));
    }
}
