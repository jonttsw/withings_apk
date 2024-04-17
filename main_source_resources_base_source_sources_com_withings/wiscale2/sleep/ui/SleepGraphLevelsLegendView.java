package com.withings.wiscale2.sleep.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.d;
import androidx.camera.camera2.internal.r2;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.vasistas.model.SleepLevel;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import tb0.i4;
import y70.a;
/* compiled from: SleepGraphLevelsLegendView.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/withings/wiscale2/sleep/ui/SleepGraphLevelsLegendView;", "Landroid/widget/LinearLayout;", "", "visible", "Lnm0/y;", "setREMVisible", "(Z)V", "setUnspecifiedVisible", "Landroid/content/Context;", ConstantsWs.JSON_ACCOUNT_KEY_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "HealthMate_prodRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class SleepGraphLevelsLegendView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    private final i4 f60416a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SleepGraphLevelsLegendView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        u.j(context, "context");
    }

    public final void setREMVisible(boolean z5) {
        int i11;
        LinearLayout remLegend = this.f60416a.f99208i;
        u.i(remLegend, "remLegend");
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        remLegend.setVisibility(i11);
    }

    public final void setUnspecifiedVisible(boolean z5) {
        int i11;
        int i12;
        int i13;
        i4 i4Var = this.f60416a;
        LinearLayout unspecifiedLegend = i4Var.f99211l;
        u.i(unspecifiedLegend, "unspecifiedLegend");
        int i14 = 8;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        unspecifiedLegend.setVisibility(i11);
        LinearLayout lightLegend = i4Var.f99205f;
        u.i(lightLegend, "lightLegend");
        if (!z5) {
            i12 = 0;
        } else {
            i12 = 8;
        }
        lightLegend.setVisibility(i12);
        LinearLayout deepLegend = i4Var.f99202c;
        u.i(deepLegend, "deepLegend");
        if (!z5) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        deepLegend.setVisibility(i13);
        LinearLayout remLegend = i4Var.f99208i;
        u.i(remLegend, "remLegend");
        if (!z5) {
            i14 = 0;
        }
        remLegend.setVisibility(i14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepGraphLevelsLegendView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String valueOf;
        String valueOf2;
        String valueOf3;
        String valueOf4;
        u.j(context, "context");
        i4 a11 = i4.a(View.inflate(getContext(), C1987R.layout.view_sleep_graph_levels_legend, this));
        this.f60416a = a11;
        SleepLevel sleepLevel = SleepLevel.Awake;
        String string = context.getString(sleepLevel.getStringResID());
        u.i(string, "getString(...)");
        if (string.length() > 0) {
            StringBuilder sb2 = new StringBuilder();
            char charAt = string.charAt(0);
            if (Character.isLowerCase(charAt)) {
                valueOf4 = r2.a("getDefault(...)", charAt);
            } else {
                valueOf4 = String.valueOf(charAt);
            }
            string = d.e(sb2, valueOf4, string, 1, "substring(...)");
        }
        a11.f99201b.setText(string);
        SleepLevel sleepLevel2 = SleepLevel.Rem;
        String string2 = context.getString(sleepLevel2.getStringResID());
        u.i(string2, "getString(...)");
        String upperCase = string2.toUpperCase(Locale.ROOT);
        u.i(upperCase, "toUpperCase(...)");
        a11.f99210k.setText(upperCase);
        SleepLevel sleepLevel3 = SleepLevel.Light;
        String string3 = context.getString(sleepLevel3.getStringResID());
        u.i(string3, "getString(...)");
        if (string3.length() > 0) {
            StringBuilder sb3 = new StringBuilder();
            char charAt2 = string3.charAt(0);
            if (Character.isLowerCase(charAt2)) {
                valueOf3 = r2.a("getDefault(...)", charAt2);
            } else {
                valueOf3 = String.valueOf(charAt2);
            }
            string3 = d.e(sb3, valueOf3, string3, 1, "substring(...)");
        }
        a11.f99207h.setText(string3);
        SleepLevel sleepLevel4 = SleepLevel.Deep;
        String string4 = context.getString(sleepLevel4.getStringResID());
        u.i(string4, "getString(...)");
        if (string4.length() > 0) {
            StringBuilder sb4 = new StringBuilder();
            char charAt3 = string4.charAt(0);
            if (Character.isLowerCase(charAt3)) {
                valueOf2 = r2.a("getDefault(...)", charAt3);
            } else {
                valueOf2 = String.valueOf(charAt3);
            }
            string4 = d.e(sb4, valueOf2, string4, 1, "substring(...)");
        }
        a11.f99204e.setText(string4);
        SleepLevel sleepLevel5 = SleepLevel.Unspecified;
        String string5 = context.getString(sleepLevel5.getStringResID());
        u.i(string5, "getString(...)");
        if (string5.length() > 0) {
            StringBuilder sb5 = new StringBuilder();
            char charAt4 = string5.charAt(0);
            if (Character.isLowerCase(charAt4)) {
                valueOf = r2.a("getDefault(...)", charAt4);
            } else {
                valueOf = String.valueOf(charAt4);
            }
            string5 = d.e(sb5, valueOf, string5, 1, "substring(...)");
        }
        a11.f99213n.setText(string5);
        a11.f99200a.setImageDrawable(a.a(C1987R.drawable.rectangle_radius_3dp_white, context, sleepLevel.getColorRes()));
        a11.f99209j.setImageDrawable(a.a(C1987R.drawable.rectangle_radius_3dp_white, context, sleepLevel2.getColorRes()));
        a11.f99206g.setImageDrawable(a.a(C1987R.drawable.rectangle_radius_3dp_white, context, sleepLevel3.getColorRes()));
        a11.f99203d.setImageDrawable(a.a(C1987R.drawable.rectangle_radius_3dp_white, context, sleepLevel4.getColorRes()));
        a11.f99212m.setImageDrawable(a.a(C1987R.drawable.rectangle_radius_3dp_white, context, sleepLevel5.getColorRes()));
    }
}
