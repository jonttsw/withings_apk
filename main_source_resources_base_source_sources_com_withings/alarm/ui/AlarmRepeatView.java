package com.withings.alarm.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.views.anim.ResizeAnimation;
import com.withings.wiscale2.C1987R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Timer;
import java.util.TimerTask;
/* loaded from: classes3.dex */
public class AlarmRepeatView extends LinearLayout {

    /* renamed from: l  reason: collision with root package name */
    private static final int[] f31098l = {C1987R.string._SUNDAY_S_, C1987R.string._MONDAY_M_, C1987R.string._TUESDAY_T_, C1987R.string._WEDNESDAY_W_, C1987R.string._THURSDAY_T_, C1987R.string._FRIDAY_F_, C1987R.string._SATURDAY_S_};

    /* renamed from: m  reason: collision with root package name */
    private static final int[] f31099m = {C1987R.string._SUNDAY_, C1987R.string._MONDAY_, C1987R.string._TUESDAY_, C1987R.string._WEDNESDAY_, C1987R.string._TURSDAY_, C1987R.string._FRIDAY_, C1987R.string._SATURDAY_};

    /* renamed from: n  reason: collision with root package name */
    private static final int[] f31100n = {C1987R.string._MONDAY_M_, C1987R.string._TUESDAY_T_, C1987R.string._WEDNESDAY_W_, C1987R.string._THURSDAY_T_, C1987R.string._FRIDAY_F_, C1987R.string._SATURDAY_S_, C1987R.string._SUNDAY_S_};

    /* renamed from: a  reason: collision with root package name */
    private int[] f31101a;

    /* renamed from: b  reason: collision with root package name */
    private DeviceAlarm f31102b;

    /* renamed from: c  reason: collision with root package name */
    private a f31103c;

    /* renamed from: d  reason: collision with root package name */
    private Timer f31104d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31105e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31106f;

    /* renamed from: g  reason: collision with root package name */
    private String f31107g;

    /* renamed from: h  reason: collision with root package name */
    TextView f31108h;

    /* renamed from: i  reason: collision with root package name */
    AppCompatCheckBox f31109i;

    /* renamed from: j  reason: collision with root package name */
    LinearLayout f31110j;

    /* renamed from: k  reason: collision with root package name */
    ArrayList f31111k;

    /* loaded from: classes3.dex */
    public interface a {
        void D0(AlarmRepeatView alarmRepeatView, boolean z5);

        void m0(AlarmRepeatView alarmRepeatView);
    }

    /* loaded from: classes3.dex */
    private class b extends TimerTask {
        b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            AlarmRepeatView alarmRepeatView = AlarmRepeatView.this;
            if (alarmRepeatView.f31103c != null) {
                alarmRepeatView.f31103c.m0(alarmRepeatView);
            }
        }
    }

    public AlarmRepeatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31105e = false;
        this.f31106f = false;
        e();
    }

    public static void a(AlarmRepeatView alarmRepeatView, TextView textView) {
        int indexOf = alarmRepeatView.f31111k.indexOf(textView);
        if (alarmRepeatView.f31105e) {
            indexOf = (indexOf + 1) % 7;
        }
        DeviceAlarm deviceAlarm = alarmRepeatView.f31102b;
        deviceAlarm.Q(indexOf, !deviceAlarm.C(indexOf));
        textView.setSelected(alarmRepeatView.f31102b.C(indexOf));
        alarmRepeatView.h();
        DeviceAlarm deviceAlarm2 = alarmRepeatView.f31102b;
        for (int i11 = 0; i11 < 7; i11++) {
            if (deviceAlarm2.C(i11)) {
                Timer timer = alarmRepeatView.f31104d;
                if (timer != null) {
                    timer.cancel();
                }
                alarmRepeatView.f31104d = new Timer();
                alarmRepeatView.f31104d.schedule(new b(), 250L);
                return;
            }
        }
        deviceAlarm2.getClass();
        alarmRepeatView.f(textView);
    }

    private void e() {
        int i11;
        boolean z5;
        LayoutInflater.from(getContext()).inflate(C1987R.layout.view_alarm_repeat, this);
        this.f31108h = (TextView) findViewById(C1987R.id.repeatLabel);
        this.f31109i = (AppCompatCheckBox) findViewById(C1987R.id.repeatCheckBox);
        this.f31110j = (LinearLayout) findViewById(C1987R.id.days_layout);
        ArrayList arrayList = new ArrayList();
        this.f31111k = arrayList;
        arrayList.add((TextView) findViewById(C1987R.id.day1));
        this.f31111k.add((TextView) findViewById(C1987R.id.day2));
        this.f31111k.add((TextView) findViewById(C1987R.id.day3));
        this.f31111k.add((TextView) findViewById(C1987R.id.day4));
        this.f31111k.add((TextView) findViewById(C1987R.id.day5));
        this.f31111k.add((TextView) findViewById(C1987R.id.day6));
        this.f31111k.add((TextView) findViewById(C1987R.id.day7));
        Iterator it = this.f31111k.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            TextView textView = (TextView) it.next();
            textView.setOnClickListener(new sg.a(0, this, textView));
        }
        findViewById(C1987R.id.repeatLabel).setOnClickListener(new sg.b(this, 0));
        findViewById(C1987R.id.repeatCheckBox).setOnClickListener(new sg.c(this, 0));
        findViewById(C1987R.id.title_layout).setOnClickListener(new sg.d(this, 0));
        if (Calendar.getInstance().getFirstDayOfWeek() == 2) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f31105e = z5;
        if (z5) {
            this.f31101a = f31100n;
        } else {
            this.f31101a = f31098l;
        }
        for (i11 = 0; i11 < this.f31101a.length; i11++) {
            ((TextView) this.f31111k.get(i11)).setText(this.f31101a[i11]);
        }
    }

    public final boolean c() {
        return this.f31106f;
    }

    public final void d() {
        this.f31110j.getLayoutParams().height = 0;
        this.f31110j.invalidate();
        this.f31106f = false;
    }

    public final void f(View view) {
        boolean z5;
        if (view.getId() == C1987R.id.repeatCheckBox) {
            z5 = this.f31109i.isChecked();
        } else if (!this.f31109i.isChecked()) {
            z5 = true;
        } else {
            z5 = false;
        }
        boolean z11 = !z5;
        this.f31102b.f0(z11);
        invalidate();
        if (z5) {
            ResizeAnimation resizeAnimation = new ResizeAnimation(this.f31110j, Math.round(ah.g.k(48, getContext())));
            resizeAnimation.setDuration(getResources().getInteger(17694720));
            this.f31110j.requestLayout();
            this.f31110j.startAnimation(resizeAnimation);
            Iterator it = this.f31111k.iterator();
            while (it.hasNext()) {
                TextView textView = (TextView) it.next();
                textView.setVisibility(0);
                Animation loadAnimation = AnimationUtils.loadAnimation(textView.getContext(), 17432576);
                loadAnimation.setDuration(150L);
                loadAnimation.setAnimationListener(new com.withings.alarm.ui.a(textView));
                textView.startAnimation(loadAnimation);
            }
            this.f31106f = true;
            for (int i11 = 0; i11 < 7; i11++) {
                this.f31102b.Q(i11, true);
                ((TextView) this.f31111k.get(i11)).setSelected(true);
            }
        } else {
            ResizeAnimation resizeAnimation2 = new ResizeAnimation(this.f31110j, 0);
            resizeAnimation2.setDuration(getResources().getInteger(17694720));
            this.f31110j.startAnimation(resizeAnimation2);
            Iterator it2 = this.f31111k.iterator();
            while (it2.hasNext()) {
                TextView textView2 = (TextView) it2.next();
                Animation loadAnimation2 = AnimationUtils.loadAnimation(textView2.getContext(), 17432577);
                loadAnimation2.setDuration(150L);
                loadAnimation2.setAnimationListener(new com.withings.alarm.ui.b(textView2));
                textView2.startAnimation(loadAnimation2);
            }
            this.f31106f = false;
            for (int i12 = 0; i12 < 7; i12++) {
                this.f31102b.Q(i12, false);
                ((TextView) this.f31111k.get(i12)).setSelected(false);
            }
        }
        this.f31102b.f0(z11);
        h();
        a aVar = this.f31103c;
        if (aVar != null) {
            aVar.D0(this, this.f31106f);
        }
    }

    public final void g(DeviceAlarm deviceAlarm, boolean z5) {
        int i11;
        this.f31102b = deviceAlarm;
        if (z5) {
            this.f31109i.setTypeface(androidx.core.content.res.g.e(C1987R.font.roboto_regular, getContext()));
        }
        if (this.f31102b != null && this.f31111k != null) {
            for (int i12 = 0; i12 < this.f31111k.size(); i12++) {
                TextView textView = (TextView) this.f31111k.get(i12);
                DeviceAlarm deviceAlarm2 = this.f31102b;
                if (this.f31105e) {
                    i11 = (i12 + 1) % 7;
                } else {
                    i11 = i12;
                }
                textView.setSelected(deviceAlarm2.C(i11));
            }
        }
        h();
        if (!deviceAlarm.D() && z5) {
            i();
        } else {
            d();
        }
    }

    public DeviceAlarm getAlarm() {
        return this.f31102b;
    }

    public String getSummary() {
        return this.f31107g;
    }

    public final void h() {
        Iterator it = this.f31111k.iterator();
        String str = "";
        int i11 = 0;
        while (it.hasNext()) {
            int indexOf = this.f31111k.indexOf((TextView) it.next());
            if (this.f31105e) {
                indexOf = (indexOf + 1) % 7;
            }
            if (this.f31102b.C(indexOf)) {
                String string = getContext().getString(f31099m[indexOf]);
                String str2 = string.substring(0, 1).toUpperCase() + string.substring(1);
                if (str2.length() <= 3) {
                    str = w6.o.a(str, str2, "  ");
                } else {
                    str = w6.o.a(str, str2.substring(0, Math.min(str2.length(), 3)), ". ");
                }
                i11++;
            }
        }
        if (i11 == 7) {
            str = getContext().getString(C1987R.string._RMNDR_ALL_DAYS_);
        } else if (i11 == 0) {
            str = getContext().getString(C1987R.string._RMNDR_NEVER_);
        } else if (i11 == 2 && this.f31102b.C(0) && this.f31102b.C(6)) {
            str = getContext().getString(C1987R.string._RMNDR_WEEKEND_DAYS_);
        } else if (i11 == 5 && !this.f31102b.C(0) && !this.f31102b.C(6)) {
            str = getContext().getString(C1987R.string._RMNDR_WEEKDAYS_);
        }
        this.f31108h.setText(str);
        this.f31107g = str;
        this.f31109i.setChecked(!this.f31102b.D());
    }

    public final void i() {
        this.f31110j.getLayoutParams().height = Math.round(ah.g.k(48, getContext()));
        this.f31110j.invalidate();
        this.f31106f = true;
    }

    public void setAlarm(DeviceAlarm deviceAlarm) {
        g(deviceAlarm, false);
    }

    public void setCallBack(a aVar) {
        this.f31103c = aVar;
    }

    public void setSummaryVisible(boolean z5) {
        int i11;
        TextView textView = this.f31108h;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 4;
        }
        textView.setVisibility(i11);
    }

    public AlarmRepeatView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31105e = false;
        this.f31106f = false;
        e();
    }
}
