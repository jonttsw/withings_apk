package com.withings.wiscale2.device.common.feature.activitygoal;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.ViewGroup;
import android.widget.TextView;
import com.withings.views.view.SetValueView;
import com.withings.wiscale2.C1987R;
import java.text.NumberFormat;
/* compiled from: SetValueViewExtensions.kt */
/* loaded from: classes5.dex */
public final class b0 {
    public static final void a(SetValueView setValueView, String str, float f11) {
        TextView textView = new TextView(setValueView.getContext());
        textView.setText(str);
        xq.a.a(textView, C1987R.style.detail1);
        textView.setGravity(8388613);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.rightMargin = textView.getResources().getDimensionPixelSize(C1987R.dimen.keyline_1);
        textView.setLayoutParams(marginLayoutParams);
        setValueView.f(textView, f11);
    }

    public static final int b(SetValueView setValueView, float f11) {
        kotlin.jvm.internal.u.j(setValueView, "<this>");
        return ah.u.B(f11, 2000.0f, 16000.0f, androidx.core.content.a.getColor(setValueView.getContext(), C1987R.color.statusInfo), androidx.core.content.a.getColor(setValueView.getContext(), C1987R.color.statusGood));
    }

    public static final void c(SetValueView setValueView, float f11) {
        ((TextView) setValueView.getValueView().findViewById(C1987R.id.value)).setText(NumberFormat.getInstance().format(f11));
        setValueView.getValueView().getBackground().setColorFilter(new PorterDuffColorFilter(b(setValueView, f11), PorterDuff.Mode.SRC_IN));
    }
}
