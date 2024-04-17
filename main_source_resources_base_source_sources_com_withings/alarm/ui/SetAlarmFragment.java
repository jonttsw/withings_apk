package com.withings.alarm.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import androidx.fragment.app.Fragment;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.ui.picker.linear.LinearAlarmPicker;
import com.withings.device.Device;
import com.withings.wiscale2.C1987R;
import tg.a;
/* loaded from: classes3.dex */
public class SetAlarmFragment extends Fragment implements a.InterfaceC1652a {

    /* renamed from: c  reason: collision with root package name */
    private Device f31113c;

    /* renamed from: d  reason: collision with root package name */
    private DeviceAlarm f31114d;

    /* renamed from: e  reason: collision with root package name */
    private a f31115e;

    /* renamed from: f  reason: collision with root package name */
    private tg.a f31116f;

    /* renamed from: g  reason: collision with root package name */
    private View f31117g;

    /* renamed from: h  reason: collision with root package name */
    private View f31118h;

    /* renamed from: i  reason: collision with root package name */
    private AlarmRepeatView f31119i;

    /* loaded from: classes3.dex */
    public interface a {
    }

    private void B1() {
        boolean z5;
        if (this.f31114d == null) {
            return;
        }
        tg.a aVar = this.f31116f;
        if (aVar != null) {
            if (this.f31113c != null) {
                fl.o g11 = fl.p.f67672b.a().g(this.f31113c);
                if (g11 instanceof gl.c) {
                    z5 = ((gl.c) g11).k(this.f31113c.getFirmware());
                } else {
                    z5 = true;
                }
                aVar.setSmartWakeUpEnabled(z5);
            }
            this.f31116f.a(this.f31114d.h(), this.f31114d.k(), this.f31114d.q());
        }
        this.f31119i.setAlarm(this.f31114d);
    }

    public static void s1(SetAlarmFragment setAlarmFragment) {
        a aVar = setAlarmFragment.f31115e;
        if (aVar != null) {
            ((TrackerSetAlarmActivity) aVar).Q3(setAlarmFragment.f31114d);
        }
    }

    public final void A1(boolean z5) {
        int i11;
        if (this.f31114d.D()) {
            this.f31119i.d();
        } else {
            this.f31119i.i();
        }
        AlarmRepeatView alarmRepeatView = this.f31119i;
        if (z5) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        alarmRepeatView.setVisibility(i11);
    }

    @Override // tg.a.InterfaceC1652a
    public final void H0(tg.a aVar) {
        if (aVar instanceof LinearAlarmPicker) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, this.f31118h.getHeight(), 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setStartOffset(300L);
            if (this.f31118h.getAnimation() != null) {
                this.f31118h.getAnimation().setAnimationListener(null);
                this.f31118h.getAnimation().cancel();
            }
            this.f31118h.setVisibility(0);
            this.f31118h.setAnimation(translateAnimation);
            translateAnimation.start();
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, -this.f31117g.getHeight(), 0.0f);
            translateAnimation2.setDuration(200L);
            translateAnimation2.setStartOffset(300L);
            if (this.f31117g.getAnimation() != null) {
                this.f31117g.getAnimation().setAnimationListener(null);
                this.f31117g.getAnimation().cancel();
            }
            this.f31117g.setVisibility(0);
            this.f31117g.setAnimation(translateAnimation2);
            translateAnimation2.start();
        }
        a aVar2 = this.f31115e;
        if (aVar2 != null) {
            TrackerSetAlarmActivity trackerSetAlarmActivity = (TrackerSetAlarmActivity) aVar2;
            if (trackerSetAlarmActivity.B3() != null) {
                trackerSetAlarmActivity.B3().C();
            }
        }
    }

    @Override // tg.a.InterfaceC1652a
    public final void V0(tg.a aVar, int i11, int i12, int i13) {
        this.f31114d.W(i11);
        this.f31114d.a0(i12);
        this.f31114d.p0(i13);
    }

    @Override // tg.a.InterfaceC1652a
    public final void e1(LinearAlarmPicker linearAlarmPicker) {
        if (linearAlarmPicker instanceof LinearAlarmPicker) {
            if (this.f31118h.getVisibility() == 0 && this.f31118h.getAnimation() == null) {
                TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, this.f31118h.getHeight());
                translateAnimation.setDuration(200L);
                translateAnimation.setAnimationListener(new p(this));
                if (this.f31118h.getAnimation() != null) {
                    this.f31118h.getAnimation().setAnimationListener(null);
                    this.f31118h.getAnimation().cancel();
                }
                this.f31118h.startAnimation(translateAnimation);
            }
            if (this.f31117g.getVisibility() == 0 && this.f31117g.getAnimation() == null) {
                TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, -this.f31117g.getHeight());
                translateAnimation2.setDuration(200L);
                translateAnimation2.setAnimationListener(new o(this));
                if (this.f31117g.getAnimation() != null) {
                    this.f31117g.getAnimation().setAnimationListener(null);
                    this.f31117g.getAnimation().cancel();
                }
                this.f31117g.startAnimation(translateAnimation2);
            }
        }
    }

    @Override // tg.a.InterfaceC1652a
    public final void l0(tg.a aVar, int i11) {
        this.f31114d.p0(i11);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(C1987R.layout.fragment_hwa_set_alarm, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f31116f = (tg.a) view.findViewById(C1987R.id.alarmPicker);
        view.findViewById(C1987R.id.smartWakeUp);
        this.f31117g = view.findViewById(C1987R.id.topView);
        this.f31118h = view.findViewById(C1987R.id.bottomView);
        this.f31119i = (AlarmRepeatView) view.findViewById(C1987R.id.repeat);
        view.findViewById(C1987R.id.save_button).setOnClickListener(new sg.c(this, 1));
        this.f31116f.setListener(this);
        B1();
    }

    public final void w1(boolean z5) {
        this.f31114d.K(z5);
    }

    public final void x1(DeviceAlarm deviceAlarm) {
        this.f31114d = deviceAlarm;
        B1();
    }

    public final void y1(a aVar) {
        this.f31115e = aVar;
    }

    public final void z1(Device device) {
        this.f31113c = device;
        B1();
    }

    @Override // tg.a.InterfaceC1652a
    public final void M(tg.a aVar) {
    }

    @Override // tg.a.InterfaceC1652a
    public final void R(LinearAlarmPicker linearAlarmPicker) {
    }
}
