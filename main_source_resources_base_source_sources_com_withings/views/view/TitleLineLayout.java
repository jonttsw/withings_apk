package com.withings.views.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.withings.wiscale2.C1987R;
import java.util.Locale;
import kotlin.jvm.internal.u;
/* loaded from: classes4.dex */
public class TitleLineLayout extends RelativeLayout {
    public TitleLineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes;
        float c11;
        if (attributeSet != null && (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j70.a.f73863a)) != null) {
            String string = obtainStyledAttributes.getString(0);
            TextView textView = new TextView(context);
            String lowerCase = string.toLowerCase();
            u.j(lowerCase, "<this>");
            Locale locale = Locale.getDefault();
            u.i(locale, "getDefault(...)");
            if (lowerCase.length() > 0) {
                char charAt = lowerCase.charAt(0);
                if (Character.isLowerCase(charAt)) {
                    StringBuilder sb2 = new StringBuilder();
                    char titleCase = Character.toTitleCase(charAt);
                    if (titleCase != Character.toUpperCase(charAt)) {
                        sb2.append(titleCase);
                    } else {
                        String substring = lowerCase.substring(0, 1);
                        u.i(substring, "substring(...)");
                        String upperCase = substring.toUpperCase(locale);
                        u.i(upperCase, "toUpperCase(...)");
                        sb2.append(upperCase);
                    }
                    String substring2 = lowerCase.substring(1);
                    u.i(substring2, "substring(...)");
                    sb2.append(substring2);
                    lowerCase = sb2.toString();
                    u.i(lowerCase, "toString(...)");
                }
            }
            textView.setText(lowerCase);
            xq.a.a(textView, C1987R.style.body1);
            textView.setTextColor(androidx.core.content.a.getColor(context, C1987R.color.textPrimary));
            addView(textView, new RelativeLayout.LayoutParams(-2, -2));
            View view = new View(context);
            if (isInEditMode()) {
                c11 = 2.0f;
            } else {
                c11 = wq.a.c(1, context);
            }
            view.setBackgroundResource(C1987R.color.textPrimary);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, (int) c11);
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            view.setLayoutParams(layoutParams);
            addView(view, layoutParams);
            obtainStyledAttributes.recycle();
        }
    }
}
