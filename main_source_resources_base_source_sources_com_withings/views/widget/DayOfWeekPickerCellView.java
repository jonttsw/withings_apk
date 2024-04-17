package com.withings.views.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withings.reminder.details.ReminderDetailsActivity;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes4.dex */
public class DayOfWeekPickerCellView extends ConstraintLayout {

    /* renamed from: t  reason: collision with root package name */
    protected TextView f46770t;

    /* renamed from: u  reason: collision with root package name */
    protected TextView f46771u;

    /* renamed from: v  reason: collision with root package name */
    protected ArrayList f46772v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f46773w;

    /* renamed from: x  reason: collision with root package name */
    private List<Integer> f46774x;

    /* renamed from: y  reason: collision with root package name */
    private a f46775y;

    /* renamed from: z  reason: collision with root package name */
    private static final int[] f46769z = {C1987R.string._SUNDAY_S_, C1987R.string._MONDAY_M_, C1987R.string._TUESDAY_T_, C1987R.string._WEDNESDAY_W_, C1987R.string._THURSDAY_T_, C1987R.string._FRIDAY_F_, C1987R.string._SATURDAY_S_};
    private static final int[] A = {C1987R.string._MONDAY_M_, C1987R.string._TUESDAY_T_, C1987R.string._WEDNESDAY_W_, C1987R.string._THURSDAY_T_, C1987R.string._FRIDAY_F_, C1987R.string._SATURDAY_S_, C1987R.string._SUNDAY_S_};

    /* loaded from: classes4.dex */
    public interface a {
    }

    public DayOfWeekPickerCellView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1987R.attr.dayOfWeekPickerViewStyle);
    }

    public static void t(DayOfWeekPickerCellView dayOfWeekPickerCellView, TextView textView) {
        int indexOf = dayOfWeekPickerCellView.f46772v.indexOf(textView);
        if (Calendar.getInstance().getFirstDayOfWeek() != 2) {
            if (indexOf == 0) {
                indexOf = 6;
            } else {
                indexOf--;
            }
        }
        if (dayOfWeekPickerCellView.f46774x.contains(Integer.valueOf(indexOf))) {
            dayOfWeekPickerCellView.f46774x.remove(Integer.valueOf(indexOf));
        } else {
            dayOfWeekPickerCellView.f46774x.add(Integer.valueOf(indexOf));
        }
        dayOfWeekPickerCellView.u();
        a aVar = dayOfWeekPickerCellView.f46775y;
        if (aVar != null) {
            ReminderDetailsActivity.initDatePickerView$lambda$4((ReminderDetailsActivity) ((iq.a) aVar).f73216a, dayOfWeekPickerCellView.f46774x);
        }
    }

    private void u() {
        Iterator it = this.f46772v.iterator();
        while (it.hasNext()) {
            ((TextView) it.next()).setSelected(false);
        }
        for (Integer num : this.f46774x) {
            int intValue = num.intValue();
            ArrayList arrayList = this.f46772v;
            if (!this.f46773w) {
                intValue = (intValue + 1) % 7;
            }
            ((View) arrayList.get(intValue)).setSelected(true);
        }
    }

    public List<Integer> getSelectedDays() {
        return this.f46774x;
    }

    public void setLabel(CharSequence charSequence) {
        this.f46770t.setText(charSequence);
    }

    public void setOnSelectionChangedListener(a aVar) {
        this.f46775y = aVar;
    }

    public void setSelectedDays(List<Integer> list) {
        this.f46774x = list;
        u();
        a aVar = this.f46775y;
        if (aVar != null) {
            ReminderDetailsActivity.initDatePickerView$lambda$4((ReminderDetailsActivity) ((iq.a) aVar).f73216a, list);
        }
    }

    public DayOfWeekPickerCellView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f46774x = new ArrayList();
        this.f46775y = null;
        LayoutInflater.from(getContext()).inflate(C1987R.layout.view_day_of_week_picker, this);
        this.f46770t = (TextView) findViewById(C1987R.id.day_picker_label);
        this.f46771u = (TextView) findViewById(C1987R.id.day_picker_value);
        ArrayList arrayList = new ArrayList();
        this.f46772v = arrayList;
        arrayList.add((TextView) findViewById(C1987R.id.day1));
        this.f46772v.add((TextView) findViewById(C1987R.id.day2));
        this.f46772v.add((TextView) findViewById(C1987R.id.day3));
        this.f46772v.add((TextView) findViewById(C1987R.id.day4));
        this.f46772v.add((TextView) findViewById(C1987R.id.day5));
        this.f46772v.add((TextView) findViewById(C1987R.id.day6));
        this.f46772v.add((TextView) findViewById(C1987R.id.day7));
        Iterator it = this.f46772v.iterator();
        while (it.hasNext()) {
            TextView textView = (TextView) it.next();
            textView.setOnClickListener(new sg.a(2, this, textView));
        }
        this.f46773w = Calendar.getInstance().getFirstDayOfWeek() == 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, c80.a.f22412h);
            this.f46770t.setText(obtainStyledAttributes.getText(0));
            this.f46771u.setText(obtainStyledAttributes.getText(2));
            this.f46771u.setVisibility(obtainStyledAttributes.getBoolean(1, true) ? 0 : 8);
            int[] iArr = this.f46773w ? A : f46769z;
            for (int i12 = 0; i12 < iArr.length; i12++) {
                ((TextView) this.f46772v.get(i12)).setText(iArr[i12]);
            }
            obtainStyledAttributes.recycle();
        }
    }
}
