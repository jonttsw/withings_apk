package com.withings.wiscale2.sleep.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.camera.camera2.internal.r2;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.SleepLevel;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.w;
import nm0.h;
/* compiled from: SleepManualGraphLevelsLegendView.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010#\u001a\u00020\"\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\b\b\u0002\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R#\u0010\r\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0010\u001a\n \b*\u0004\u0018\u00010\u00070\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR#\u0010\u0015\u001a\n \b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0018\u001a\n \b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\u0014R#\u0010\u001b\u001a\n \b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\n\u001a\u0004\b\u001a\u0010\u0014R#\u0010\u001e\u001a\n \b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\n\u001a\u0004\b\u001d\u0010\u0014R#\u0010!\u001a\n \b*\u0004\u0018\u00010\u00110\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\n\u001a\u0004\b \u0010\u0014¨\u0006*"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/SleepManualGraphLevelsLegendView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "visible", "Lnm0/y;", "setREMVisible", "(Z)V", "Landroid/widget/TextView;", "kotlin.jvm.PlatformType", "t", "Lnm0/g;", "getLevelsLegendText", "()Landroid/widget/TextView;", "levelsLegendText", "u", "getManualLegendText", "manualLegendText", "Landroid/widget/ImageView;", ConstantsWs.JSON_SESSION_KEY_VALUE, "getAwakeLegendIcon", "()Landroid/widget/ImageView;", "awakeLegendIcon", ConstantsWs.JSON_SESSION_KEY_WEIGHTUNIT, "getRemLegendIcon", "remLegendIcon", "x", "getLightLegendIcon", "lightLegendIcon", "y", "getDeepLegendIcon", "deepLegendIcon", "z", "getManualLegendIcon", "manualLegendIcon", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepManualGraphLevelsLegendView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    private final nm0.g f60417t;

    /* renamed from: u  reason: collision with root package name */
    private final nm0.g f60418u;

    /* renamed from: v  reason: collision with root package name */
    private final nm0.g f60419v;

    /* renamed from: w  reason: collision with root package name */
    private final nm0.g f60420w;

    /* renamed from: x  reason: collision with root package name */
    private final nm0.g f60421x;

    /* renamed from: y  reason: collision with root package name */
    private final nm0.g f60422y;

    /* renamed from: z  reason: collision with root package name */
    private final nm0.g f60423z;

    /* compiled from: SleepManualGraphLevelsLegendView.kt */
    /* loaded from: classes5.dex */
    static final class a extends w implements ym0.a<ImageView> {
        a() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) SleepManualGraphLevelsLegendView.this.findViewById(C1987R.id.awake_legend_icon);
        }
    }

    /* compiled from: SleepManualGraphLevelsLegendView.kt */
    /* loaded from: classes5.dex */
    static final class b extends w implements ym0.a<ImageView> {
        b() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) SleepManualGraphLevelsLegendView.this.findViewById(C1987R.id.deep_legend_icon);
        }
    }

    /* compiled from: SleepManualGraphLevelsLegendView.kt */
    /* loaded from: classes5.dex */
    static final class c extends w implements ym0.a<TextView> {
        c() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepManualGraphLevelsLegendView.this.findViewById(C1987R.id.levels_legend_text);
        }
    }

    /* compiled from: SleepManualGraphLevelsLegendView.kt */
    /* loaded from: classes5.dex */
    static final class d extends w implements ym0.a<ImageView> {
        d() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) SleepManualGraphLevelsLegendView.this.findViewById(C1987R.id.light_legend_icon);
        }
    }

    /* compiled from: SleepManualGraphLevelsLegendView.kt */
    /* loaded from: classes5.dex */
    static final class e extends w implements ym0.a<ImageView> {
        e() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) SleepManualGraphLevelsLegendView.this.findViewById(C1987R.id.manual_legend_icon);
        }
    }

    /* compiled from: SleepManualGraphLevelsLegendView.kt */
    /* loaded from: classes5.dex */
    static final class f extends w implements ym0.a<TextView> {
        f() {
            super(0);
        }

        @Override // ym0.a
        public final TextView invoke() {
            return (TextView) SleepManualGraphLevelsLegendView.this.findViewById(C1987R.id.manual_legend_text);
        }
    }

    /* compiled from: SleepManualGraphLevelsLegendView.kt */
    /* loaded from: classes5.dex */
    static final class g extends w implements ym0.a<ImageView> {
        g() {
            super(0);
        }

        @Override // ym0.a
        public final ImageView invoke() {
            return (ImageView) SleepManualGraphLevelsLegendView.this.findViewById(C1987R.id.rem_legend_icon);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SleepManualGraphLevelsLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    private final ImageView getAwakeLegendIcon() {
        return (ImageView) this.f60419v.getValue();
    }

    private final ImageView getDeepLegendIcon() {
        return (ImageView) this.f60422y.getValue();
    }

    private final TextView getLevelsLegendText() {
        return (TextView) this.f60417t.getValue();
    }

    private final ImageView getLightLegendIcon() {
        return (ImageView) this.f60421x.getValue();
    }

    private final ImageView getManualLegendIcon() {
        return (ImageView) this.f60423z.getValue();
    }

    private final TextView getManualLegendText() {
        return (TextView) this.f60418u.getValue();
    }

    private final ImageView getRemLegendIcon() {
        return (ImageView) this.f60420w.getValue();
    }

    public final void setREMVisible(boolean z5) {
        int i11;
        ImageView remLegendIcon = getRemLegendIcon();
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        remLegendIcon.setVisibility(i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepManualGraphLevelsLegendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String valueOf;
        String valueOf2;
        u.j(context, "context");
        this.f60417t = h.b(new c());
        this.f60418u = h.b(new f());
        this.f60419v = h.b(new a());
        this.f60420w = h.b(new g());
        this.f60421x = h.b(new d());
        this.f60422y = h.b(new b());
        this.f60423z = h.b(new e());
        View.inflate(getContext(), C1987R.layout.view_manual_sleep_graph_levels_legend, this);
        TextView levelsLegendText = getLevelsLegendText();
        String string = context.getString(C1987R.string.nightEdition_regularSleepLegend);
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
        levelsLegendText.setText(string);
        TextView manualLegendText = getManualLegendText();
        String string2 = context.getString(C1987R.string.nightEdition_manualSleepLegend);
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
        manualLegendText.setText(string2);
        getAwakeLegendIcon().setImageDrawable(y70.a.a(C1987R.drawable.rectangle_radius_3dp_white, context, SleepLevel.Awake.getColorRes()));
        getRemLegendIcon().setImageDrawable(y70.a.a(C1987R.drawable.rectangle_radius_3dp_white, context, SleepLevel.Rem.getColorRes()));
        getLightLegendIcon().setImageDrawable(y70.a.a(C1987R.drawable.rectangle_radius_3dp_white, context, SleepLevel.Light.getColorRes()));
        getDeepLegendIcon().setImageDrawable(y70.a.a(C1987R.drawable.rectangle_radius_3dp_white, context, SleepLevel.Deep.getColorRes()));
        getManualLegendIcon().setImageDrawable(y70.b.c(context, ah.g.k(10, context), androidx.core.content.a.getColor(context, C1987R.color.datavizMonochromaticNeutral5), ah.g.k(3, context)));
    }
}
