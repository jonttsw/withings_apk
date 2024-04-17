package com.withings.alarm.ui.picker.linear;

import android.content.Context;
import android.text.format.DateFormat;
import android.text.format.DateUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.view.u0;
import com.withings.library.authentication.api.ConstantsWs;
import com.withings.wiscale2.C1987R;
import org.joda.time.DateTime;
/* loaded from: classes3.dex */
public class LinearAlarmLineView extends ViewGroup {

    /* renamed from: a  reason: collision with root package name */
    private int f31203a;

    /* renamed from: b  reason: collision with root package name */
    private int f31204b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f31205c;

    /* renamed from: d  reason: collision with root package name */
    private int f31206d;

    /* renamed from: e  reason: collision with root package name */
    private int f31207e;

    /* renamed from: f  reason: collision with root package name */
    private int f31208f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31209g;

    /* renamed from: h  reason: collision with root package name */
    private int f31210h;

    /* renamed from: i  reason: collision with root package name */
    private int f31211i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f31212j;

    /* renamed from: k  reason: collision with root package name */
    private View f31213k;

    /* renamed from: l  reason: collision with root package name */
    private TextView f31214l;

    /* renamed from: m  reason: collision with root package name */
    private RelativeLayout.LayoutParams f31215m;

    /* renamed from: n  reason: collision with root package name */
    private TextView f31216n;

    /* renamed from: o  reason: collision with root package name */
    private TextView f31217o;

    /* renamed from: p  reason: collision with root package name */
    private View f31218p;

    /* renamed from: q  reason: collision with root package name */
    private View f31219q;

    /* renamed from: r  reason: collision with root package name */
    private ViewGroup.LayoutParams f31220r;

    /* renamed from: s  reason: collision with root package name */
    private TextView f31221s;

    /* renamed from: t  reason: collision with root package name */
    private TextView f31222t;

    /* loaded from: classes3.dex */
    final class a extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31223a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31224b;

        a(int i11, int i12) {
            this.f31223a = i11;
            this.f31224b = i12;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f11, Transformation transformation) {
            LinearAlarmLineView linearAlarmLineView = LinearAlarmLineView.this;
            RelativeLayout.LayoutParams layoutParams = linearAlarmLineView.f31215m;
            int i11 = this.f31224b;
            int i12 = this.f31223a;
            layoutParams.topMargin = i12 + ((int) (f11 * (i11 - i12)));
            linearAlarmLineView.f31214l.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    final class b extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31226a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f31227b;

        b(int i11, int i12) {
            this.f31226a = i11;
            this.f31227b = i12;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f11, Transformation transformation) {
            LinearAlarmLineView linearAlarmLineView = LinearAlarmLineView.this;
            RelativeLayout.LayoutParams layoutParams = linearAlarmLineView.f31215m;
            int i11 = this.f31227b;
            int i12 = this.f31226a;
            layoutParams.topMargin = i12 + ((int) (f11 * (i11 - i12)));
            linearAlarmLineView.f31214l.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    final class e extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31231a;

        e(int i11) {
            this.f31231a = i11;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f11, Transformation transformation) {
            LinearAlarmLineView linearAlarmLineView = LinearAlarmLineView.this;
            ViewGroup.LayoutParams layoutParams = linearAlarmLineView.f31220r;
            int i11 = this.f31231a;
            layoutParams.height = (int) (((linearAlarmLineView.f31207e - i11) * f11) + i11);
            linearAlarmLineView.f31219q.requestLayout();
        }
    }

    /* loaded from: classes3.dex */
    final class f extends Animation {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f31233a;

        f(int i11) {
            this.f31233a = i11;
        }

        @Override // android.view.animation.Animation
        protected final void applyTransformation(float f11, Transformation transformation) {
            LinearAlarmLineView linearAlarmLineView = LinearAlarmLineView.this;
            ViewGroup.LayoutParams layoutParams = linearAlarmLineView.f31220r;
            int i11 = this.f31233a;
            layoutParams.height = (int) (((linearAlarmLineView.f31206d - i11) * f11) + i11);
            linearAlarmLineView.f31219q.requestLayout();
        }
    }

    public LinearAlarmLineView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getLineHeight() {
        int i11 = this.f31204b;
        return androidx.datastore.preferences.protobuf.e.a(this.f31203a - i11, this.f31211i, 60, i11);
    }

    private void q() {
        String str;
        int indexOf;
        int i11 = this.f31210h;
        int i12 = 0;
        DateTime withTime = new DateTime().withTimeAtStartOfDay().withTime(i11 / 60, ((i11 % 60) / 5) * 5, 0, 0);
        String formatDateTime = DateUtils.formatDateTime(getContext(), withTime.getMillis(), 1);
        boolean z5 = this.f31209g;
        if (!z5 && (indexOf = formatDateTime.indexOf(" ")) > -1) {
            formatDateTime = formatDateTime.substring(0, indexOf);
        }
        this.f31214l.setText(formatDateTime);
        if (this.f31211i > 0 && this.f31212j) {
            this.f31217o.setText(DateUtils.formatDateTime(getContext(), withTime.minusMinutes(this.f31211i).getMillis(), 1));
        } else {
            this.f31217o.setText("");
        }
        this.f31222t.setText(String.valueOf(this.f31211i));
        TextView textView = this.f31216n;
        if (z5) {
            i12 = 8;
        }
        textView.setVisibility(i12);
        int i13 = this.f31210h / 60;
        TextView textView2 = this.f31216n;
        if (i13 != 24 && i13 >= 12) {
            str = "PM";
        } else {
            str = "AM";
        }
        textView2.setText(str);
    }

    public final void j() {
        a aVar = new a(this.f31215m.topMargin, (this.f31213k.getMeasuredHeight() - this.f31214l.getMeasuredHeight()) / 2);
        aVar.setDuration(300L);
        this.f31214l.startAnimation(aVar);
    }

    public final void k() {
        if (this.f31206d == 0) {
            this.f31206d = this.f31220r.height;
        }
        if (this.f31219q.getAnimation() != null) {
            this.f31219q.getAnimation().cancel();
        }
        e eVar = new e(this.f31220r.height);
        eVar.setDuration(300L);
        this.f31219q.startAnimation(eVar);
    }

    public final int l(int i11) {
        int i12 = this.f31204b;
        return ((i11 - i12) * 60) / (this.f31203a - i12);
    }

    public final void m() {
        if (this.f31205c && this.f31212j) {
            if (this.f31218p.getAnimation() != null) {
                this.f31218p.getAnimation().setAnimationListener(null);
                this.f31218p.getAnimation().cancel();
            }
            if (this.f31217o.getAnimation() != null) {
                this.f31217o.getAnimation().setAnimationListener(null);
                this.f31217o.getAnimation().cancel();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new d());
            this.f31218p.startAnimation(alphaAnimation);
            if (this.f31211i > 0) {
                this.f31217o.startAnimation(alphaAnimation);
            }
        }
    }

    public final void n() {
        b bVar = new b(this.f31215m.topMargin, (this.f31204b - this.f31214l.getMeasuredHeight()) / 2);
        bVar.setDuration(300L);
        this.f31214l.startAnimation(bVar);
    }

    public final void o() {
        if (this.f31219q.getAnimation() != null) {
            this.f31219q.getAnimation().cancel();
        }
        f fVar = new f(this.f31220r.height);
        fVar.setDuration(300L);
        this.f31219q.startAnimation(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z5, int i11, int i12, int i13, int i14) {
        View view = this.f31213k;
        view.layout(0, this.f31208f, view.getMeasuredWidth(), this.f31213k.getMeasuredHeight() + this.f31208f);
        if (this.f31218p.getVisibility() == 0) {
            int measuredWidth = getMeasuredWidth() - ((int) TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics()));
            int measuredHeight = getMeasuredHeight();
            this.f31218p.layout(measuredWidth - this.f31218p.getMeasuredWidth(), measuredHeight - this.f31218p.getMeasuredHeight(), measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        this.f31213k.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH), View.MeasureSpec.makeMeasureSpec(getLineHeight(), ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
        int measuredHeight = this.f31213k.getMeasuredHeight() + this.f31208f;
        if (this.f31218p.getVisibility() == 0) {
            this.f31218p.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight += this.f31218p.getMeasuredHeight() - (this.f31219q.getMeasuredHeight() / 2);
        }
        super.onMeasure(i11, View.MeasureSpec.makeMeasureSpec(measuredHeight, ConstantsWs.DEBUG_BITMASK_EXTENDED_WPM04_RAWDATA_RESEARCH));
    }

    public final void p() {
        if (!this.f31205c && this.f31212j) {
            if (this.f31218p.getAnimation() != null) {
                this.f31218p.getAnimation().setAnimationListener(null);
                this.f31218p.getAnimation().cancel();
            }
            if (this.f31217o.getAnimation() != null) {
                this.f31217o.getAnimation().setAnimationListener(null);
                this.f31217o.getAnimation().cancel();
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            alphaAnimation.setAnimationListener(new c());
            this.f31218p.startAnimation(alphaAnimation);
            if (this.f31211i > 0) {
                this.f31217o.startAnimation(alphaAnimation);
            }
        }
    }

    public void setMinuteOfDay(int i11) {
        this.f31210h = i11;
        q();
    }

    public void setOnLineTouchListener(View.OnTouchListener onTouchListener) {
        this.f31213k.setOnTouchListener(onTouchListener);
    }

    public void setOnSmartWakeUpTouchListener(View.OnTouchListener onTouchListener) {
        this.f31219q.setOnTouchListener(onTouchListener);
    }

    public void setSmartWakeUp(int i11) {
        this.f31211i = i11;
        q();
        requestLayout();
    }

    public void setSmartWakeUpEnabled(boolean z5) {
        int i11;
        this.f31212j = z5;
        View view = this.f31218p;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        view.setVisibility(i11);
        this.f31205c = z5;
        this.f31214l.requestLayout();
    }

    public void setSmartWakeUpText(String str) {
        this.f31221s.setText(str);
    }

    public LinearAlarmLineView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11, 0);
        this.f31209g = DateFormat.is24HourFormat(getContext());
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f31203a = (int) TypedValue.applyDimension(1, 160.0f, displayMetrics);
        this.f31204b = (int) TypedValue.applyDimension(1, 56.0f, displayMetrics);
        this.f31207e = (int) TypedValue.applyDimension(1, 110.0f, displayMetrics);
        this.f31208f = (int) TypedValue.applyDimension(1, 10.0f, displayMetrics);
        View.inflate(getContext(), C1987R.layout.alarm_picker_linear_hour, this);
        this.f31213k = findViewById(C1987R.id.line);
        TextView textView = (TextView) findViewById(C1987R.id.alarmTime);
        this.f31214l = textView;
        this.f31215m = (RelativeLayout.LayoutParams) textView.getLayoutParams();
        this.f31216n = (TextView) findViewById(C1987R.id.amPm);
        this.f31217o = (TextView) findViewById(C1987R.id.alarmStartTime);
        this.f31218p = findViewById(C1987R.id.smartWakeUpContainer);
        View findViewById = findViewById(C1987R.id.smartWakeUpPad);
        this.f31219q = findViewById;
        this.f31220r = findViewById.getLayoutParams();
        u0.j0(this.f31219q, TypedValue.applyDimension(1, 1.0f, displayMetrics));
        this.f31222t = (TextView) findViewById(C1987R.id.smartWakeUpTime);
        this.f31221s = (TextView) findViewById(C1987R.id.smartWakeUpLabel);
        q();
    }

    /* loaded from: classes3.dex */
    final class c implements Animation.AnimationListener {
        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            LinearAlarmLineView.this.f31205c = true;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            LinearAlarmLineView linearAlarmLineView = LinearAlarmLineView.this;
            linearAlarmLineView.f31218p.setVisibility(0);
            linearAlarmLineView.f31217o.setVisibility(0);
            linearAlarmLineView.requestLayout();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }

    /* loaded from: classes3.dex */
    final class d implements Animation.AnimationListener {
        d() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            LinearAlarmLineView linearAlarmLineView = LinearAlarmLineView.this;
            linearAlarmLineView.f31218p.setVisibility(8);
            linearAlarmLineView.f31217o.setVisibility(8);
            linearAlarmLineView.requestLayout();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            LinearAlarmLineView linearAlarmLineView = LinearAlarmLineView.this;
            linearAlarmLineView.f31205c = false;
            linearAlarmLineView.f31218p.setVisibility(0);
            linearAlarmLineView.f31217o.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
