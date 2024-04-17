package com.withings.alarm.ui.picker.linear;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import java.util.HashMap;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class LinearAlarmPickerBackground extends ScrollView {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31259a;

    /* renamed from: b  reason: collision with root package name */
    private a f31260b;

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ViewConstructor"})
    /* loaded from: classes3.dex */
    public static class a extends ViewGroup {

        /* renamed from: a  reason: collision with root package name */
        private int f31261a;

        /* renamed from: b  reason: collision with root package name */
        private int f31262b;

        /* renamed from: c  reason: collision with root package name */
        private HashMap f31263c;

        a(Context context, int i11, int i12) {
            super(context);
            this.f31263c = new HashMap();
            this.f31261a = i11;
            this.f31262b = i12;
        }

        public final void a(ViewGroup viewGroup, int i11) {
            this.f31263c.put(viewGroup, Integer.valueOf(i11));
            addView(viewGroup);
        }

        public final int b(int i11) {
            return ((1435 - i11) * (this.f31261a - this.f31262b)) / 1435;
        }

        @Override // android.view.ViewGroup, android.view.View
        protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
            for (int i15 = 0; i15 < getChildCount(); i15++) {
                View childAt = getChildAt(i15);
                int b10 = b(((Integer) this.f31263c.get(childAt)).intValue()) - (childAt.getMeasuredHeight() / 2);
                childAt.layout(i11, b10, i13, childAt.getMeasuredHeight() + b10);
            }
        }

        @Override // android.view.View
        protected final void onMeasure(int i11, int i12) {
            super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(this.f31261a, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
            for (int i13 = 0; i13 < getChildCount(); i13++) {
                getChildAt(i13).measure(i11, View.MeasureSpec.makeMeasureSpec(0, 0));
            }
        }
    }

    public LinearAlarmPickerBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31259a = DateFormat.is24HourFormat(getContext());
        a();
    }

    private void a() {
        String str;
        int indexOf;
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int i11 = displayMetrics.heightPixels;
        this.f31260b = new a(getContext(), ((int) TypedValue.applyDimension(1, 3840.0f, displayMetrics)) + i11, i11);
        for (int i12 = 0; i12 < 24; i12++) {
            a aVar = this.f31260b;
            ViewGroup viewGroup = (ViewGroup) View.inflate(getContext(), C1987R.layout.alarm_picker_linear_graduation, null);
            TextView textView = (TextView) viewGroup.findViewById(C1987R.id.hour);
            TextView textView2 = (TextView) viewGroup.findViewById(C1987R.id.am_pm);
            DateTime plusHours = new DateTime().withTimeAtStartOfDay().plusHours(i12);
            String formatDateTime = DateUtils.formatDateTime(getContext(), plusHours.getMillis(), 1);
            boolean z5 = this.f31259a;
            if (!z5 && (indexOf = formatDateTime.indexOf(" ")) > -1) {
                formatDateTime = formatDateTime.substring(0, indexOf);
            }
            textView.setText(formatDateTime);
            if (z5) {
                textView2.setVisibility(4);
            } else {
                if (plusHours.getHourOfDay() >= 12) {
                    str = "PM";
                } else {
                    str = "AM";
                }
                textView2.setText(str);
            }
            aVar.a(viewGroup, i12 * 60);
        }
        addView(this.f31260b, new ViewGroup.LayoutParams(-1, -2));
    }

    public final void b(int i11, int i12) {
        scrollTo(0, this.f31260b.b(i11) - i12);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public LinearAlarmPickerBackground(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31259a = DateFormat.is24HourFormat(getContext());
        a();
    }
}
