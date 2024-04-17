package com.withings.alarm.ui.picker.linear;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.withings.wiscale2.C1987R;
import java.lang.ref.WeakReference;
import tg.a;
/* loaded from: classes3.dex */
public class LinearAlarmPicker extends RelativeLayout implements tg.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f31235a;

    /* renamed from: b  reason: collision with root package name */
    private a.InterfaceC1652a f31236b;

    /* renamed from: c  reason: collision with root package name */
    private float f31237c;

    /* renamed from: d  reason: collision with root package name */
    private int f31238d;

    /* renamed from: e  reason: collision with root package name */
    private int f31239e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f31240f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f31241g;

    /* renamed from: h  reason: collision with root package name */
    private LinearAlarmPickerBackground f31242h;

    /* renamed from: i  reason: collision with root package name */
    private LinearAlarmLineView f31243i;

    /* renamed from: j  reason: collision with root package name */
    private RelativeLayout.LayoutParams f31244j;

    /* renamed from: k  reason: collision with root package name */
    private int f31245k;

    /* renamed from: l  reason: collision with root package name */
    private float f31246l;

    /* renamed from: m  reason: collision with root package name */
    private DragType f31247m;

    /* renamed from: n  reason: collision with root package name */
    private b f31248n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    private static final class DragType {

        /* renamed from: a  reason: collision with root package name */
        public static final DragType f31249a;

        /* renamed from: b  reason: collision with root package name */
        public static final DragType f31250b;

        /* renamed from: c  reason: collision with root package name */
        private static final /* synthetic */ DragType[] f31251c;

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, com.withings.alarm.ui.picker.linear.LinearAlarmPicker$DragType] */
        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, com.withings.alarm.ui.picker.linear.LinearAlarmPicker$DragType] */
        static {
            ?? r02 = new Enum("HOUR", 0);
            f31249a = r02;
            ?? r12 = new Enum("SMARTWAKEUP", 1);
            f31250b = r12;
            f31251c = new DragType[]{r02, r12};
        }

        private DragType() {
            throw null;
        }

        public static DragType valueOf(String str) {
            return (DragType) Enum.valueOf(DragType.class, str);
        }

        public static DragType[] values() {
            return (DragType[]) f31251c.clone();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private WeakReference<LinearAlarmPicker> f31253a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31254b;

        /* renamed from: c  reason: collision with root package name */
        private Runnable f31255c = new a();

        /* loaded from: classes3.dex */
        final class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public final void run() {
                LinearAlarmPicker linearAlarmPicker;
                b bVar = b.this;
                if (!bVar.f31254b && (linearAlarmPicker = (LinearAlarmPicker) bVar.f31253a.get()) != null) {
                    linearAlarmPicker.n();
                    bVar.postDelayed(bVar.f31255c, 100L);
                }
            }
        }

        public b(LinearAlarmPicker linearAlarmPicker) {
            this.f31253a = new WeakReference<>(linearAlarmPicker);
        }

        public final void d() {
            this.f31254b = false;
            postDelayed(this.f31255c, 100L);
        }

        public final void e() {
            this.f31254b = true;
            removeCallbacks(this.f31255c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c implements View.OnTouchListener {
        c() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                LinearAlarmPicker linearAlarmPicker = LinearAlarmPicker.this;
                if (linearAlarmPicker.f31247m == null && linearAlarmPicker.f31235a) {
                    linearAlarmPicker.f31247m = DragType.f31249a;
                    linearAlarmPicker.f31243i.m();
                    linearAlarmPicker.f31243i.j();
                    if (linearAlarmPicker.f31243i.getAnimation() != null) {
                        linearAlarmPicker.f31243i.getAnimation().setAnimationListener(null);
                        linearAlarmPicker.f31243i.getAnimation().cancel();
                    }
                    if (linearAlarmPicker.f31236b != null) {
                        a.InterfaceC1652a interfaceC1652a = linearAlarmPicker.f31236b;
                        linearAlarmPicker.getHour();
                        linearAlarmPicker.getMinute();
                        linearAlarmPicker.getSmartWakeUp();
                        interfaceC1652a.e1(linearAlarmPicker);
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    private class d implements View.OnTouchListener {
        d() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() == 0) {
                LinearAlarmPicker linearAlarmPicker = LinearAlarmPicker.this;
                if (linearAlarmPicker.f31247m == null) {
                    linearAlarmPicker.f31247m = DragType.f31250b;
                    linearAlarmPicker.f31243i.k();
                    if (linearAlarmPicker.f31236b != null) {
                        a.InterfaceC1652a interfaceC1652a = linearAlarmPicker.f31236b;
                        linearAlarmPicker.getHour();
                        linearAlarmPicker.getMinute();
                        linearAlarmPicker.getSmartWakeUp();
                        interfaceC1652a.R(linearAlarmPicker);
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
    }

    public LinearAlarmPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31235a = true;
        this.f31245k = 60;
        this.f31248n = new b(this);
        p();
    }

    private int getMinuteOfDay() {
        return (int) this.f31237c;
    }

    private void m(float f11) {
        this.f31237c = Math.max(0.0f, Math.min(1435.0f, this.f31237c + f11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        int i11 = this.f31244j.topMargin;
        if (i11 == 0) {
            m(1.0f);
            q();
        } else if (i11 == getHeight() - this.f31243i.getMeasuredHeight()) {
            m(-1.0f);
            q();
        } else {
            this.f31248n.e();
        }
    }

    private void p() {
        this.f31239e = (int) TypedValue.applyDimension(1, 102.0f, getResources().getDisplayMetrics());
        View.inflate(getContext(), C1987R.layout.alarm_picker_linear, this);
        LinearAlarmPickerBackground linearAlarmPickerBackground = (LinearAlarmPickerBackground) findViewById(C1987R.id.background);
        this.f31242h = linearAlarmPickerBackground;
        linearAlarmPickerBackground.setVisibility(8);
        this.f31240f = true;
        LinearAlarmLineView linearAlarmLineView = (LinearAlarmLineView) findViewById(C1987R.id.hourLine);
        this.f31243i = linearAlarmLineView;
        linearAlarmLineView.setOnLineTouchListener(new c());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f31243i.getLayoutParams();
        this.f31244j = layoutParams;
        layoutParams.topMargin = this.f31239e;
    }

    private void q() {
        this.f31243i.setMinuteOfDay((int) this.f31237c);
        this.f31243i.setSmartWakeUp(this.f31238d);
        this.f31242h.b((int) this.f31237c, this.f31244j.topMargin);
    }

    @Override // tg.a
    public final void a(int i11, int i12, int i13) {
        this.f31237c = (i11 * 60) + i12;
        this.f31238d = i13;
        q();
    }

    public int getHour() {
        return getMinuteOfDay() / 60;
    }

    public a.InterfaceC1652a getListener() {
        return this.f31236b;
    }

    public int getMaxSpan() {
        return this.f31245k;
    }

    public int getMinute() {
        return ((getMinuteOfDay() % 60) / 5) * 5;
    }

    public int getSmartWakeUp() {
        return this.f31238d;
    }

    public final void o() {
        if (this.f31240f) {
            return;
        }
        if (this.f31242h.getAnimation() != null) {
            this.f31242h.getAnimation().setAnimationListener(null);
            this.f31242h.getAnimation().cancel();
        }
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setAnimationListener(new a());
        this.f31242h.startAnimation(alphaAnimation);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            DragType dragType = DragType.f31250b;
            b bVar = this.f31248n;
            DragType dragType2 = DragType.f31249a;
            if (action != 1) {
                if (action == 2) {
                    DragType dragType3 = this.f31247m;
                    if (dragType3 == dragType2) {
                        RelativeLayout.LayoutParams layoutParams = this.f31244j;
                        int rawY = layoutParams.topMargin + ((int) (motionEvent.getRawY() - this.f31246l));
                        layoutParams.topMargin = rawY;
                        if (rawY < 0) {
                            layoutParams.topMargin = 0;
                        } else if (rawY > getHeight() - this.f31243i.getMeasuredHeight()) {
                            this.f31244j.topMargin = getHeight() - this.f31243i.getMeasuredHeight();
                        }
                        this.f31243i.requestLayout();
                        int i11 = this.f31244j.topMargin;
                        if (i11 == 0 || i11 == getHeight() - this.f31243i.getMeasuredHeight()) {
                            bVar.d();
                            n();
                        } else {
                            m((this.f31246l - motionEvent.getRawY()) / 4.0f);
                            bVar.e();
                        }
                        q();
                        if (!this.f31241g) {
                            if (this.f31242h.getAnimation() != null) {
                                this.f31242h.getAnimation().setAnimationListener(null);
                                this.f31242h.getAnimation().cancel();
                            }
                            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                            alphaAnimation.setDuration(300L);
                            alphaAnimation.setAnimationListener(new com.withings.alarm.ui.picker.linear.c(this));
                            this.f31242h.startAnimation(alphaAnimation);
                        }
                        a.InterfaceC1652a interfaceC1652a = this.f31236b;
                        if (interfaceC1652a != null) {
                            interfaceC1652a.V0(this, getHour(), getMinute(), getSmartWakeUp());
                        }
                    } else if (dragType3 == dragType) {
                        int l5 = this.f31243i.l(((int) motionEvent.getY()) - this.f31244j.topMargin);
                        this.f31238d = l5;
                        this.f31238d = Math.max(0, Math.min(this.f31245k, l5));
                        this.f31243i.requestLayout();
                        q();
                        a.InterfaceC1652a interfaceC1652a2 = this.f31236b;
                        if (interfaceC1652a2 != null) {
                            getHour();
                            getMinute();
                            interfaceC1652a2.l0(this, getSmartWakeUp());
                        }
                    }
                    this.f31246l = motionEvent.getRawY();
                }
            } else {
                bVar.e();
                if (this.f31247m == dragType2) {
                    this.f31243i.n();
                    com.withings.alarm.ui.picker.linear.a aVar = new com.withings.alarm.ui.picker.linear.a(this, this.f31244j.topMargin);
                    aVar.setDuration(300L);
                    aVar.setAnimationListener(new com.withings.alarm.ui.picker.linear.b(this));
                    this.f31243i.startAnimation(aVar);
                    a.InterfaceC1652a interfaceC1652a3 = this.f31236b;
                    if (interfaceC1652a3 != null) {
                        getHour();
                        getMinute();
                        getSmartWakeUp();
                        interfaceC1652a3.H0(this);
                    }
                }
                if (this.f31247m == dragType) {
                    this.f31243i.o();
                    a.InterfaceC1652a interfaceC1652a4 = this.f31236b;
                    if (interfaceC1652a4 != null) {
                        getHour();
                        getMinute();
                        getSmartWakeUp();
                        interfaceC1652a4.M(this);
                    }
                }
                this.f31247m = null;
            }
        } else {
            this.f31246l = motionEvent.getRawY();
        }
        return true;
    }

    public void setAlarmEnabled(boolean z5) {
        this.f31235a = z5;
    }

    public void setDefaultMarginTop(int i11) {
        this.f31239e = i11;
        if (this.f31247m == null) {
            this.f31244j.topMargin = i11;
            this.f31243i.requestLayout();
        }
    }

    @Override // tg.a
    public void setListener(a.InterfaceC1652a interfaceC1652a) {
        this.f31236b = interfaceC1652a;
    }

    public void setMaxSpan(int i11) {
        this.f31245k = i11;
    }

    @Override // tg.a
    public void setSmartWakeUpEnabled(boolean z5) {
        this.f31243i.setSmartWakeUpEnabled(z5);
        this.f31243i.setOnSmartWakeUpTouchListener(new d());
    }

    public void setSmartWakeUpText(String str) {
        this.f31243i.setSmartWakeUpText(str);
    }

    public LinearAlarmPicker(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31235a = true;
        this.f31245k = 60;
        this.f31248n = new b(this);
        p();
    }

    /* loaded from: classes3.dex */
    final class a implements Animation.AnimationListener {
        a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            LinearAlarmPicker linearAlarmPicker = LinearAlarmPicker.this;
            linearAlarmPicker.f31241g = false;
            linearAlarmPicker.f31242h.setVisibility(8);
            linearAlarmPicker.requestLayout();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            LinearAlarmPicker linearAlarmPicker = LinearAlarmPicker.this;
            linearAlarmPicker.f31240f = true;
            linearAlarmPicker.f31242h.setVisibility(0);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }
    }
}
