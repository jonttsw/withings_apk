package com.withings.device.details.wsd.programs.alarm;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.o1;
import androidx.fragment.app.Fragment;
import com.google.android.material.button.MaterialButton;
import com.withings.alarm.model.DeviceAlarm;
import com.withings.alarm.model.WsdProgram;
import com.withings.alarm.ui.AlarmRepeatView;
import com.withings.alarm.ui.picker.linear.LinearAlarmPicker;
import com.withings.wiscale2.C1987R;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import tg.a;
/* compiled from: WsdSetAlarmFragment.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/withings/device/details/wsd/programs/alarm/WsdSetAlarmFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/withings/alarm/ui/AlarmRepeatView$a;", "Ltg/a$a;", "<init>", "()V", "a", "device-details-wsd_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class WsdSetAlarmFragment extends Fragment implements AlarmRepeatView.a, a.InterfaceC1652a {

    /* renamed from: c  reason: collision with root package name */
    private tn.g f37147c;

    /* renamed from: d  reason: collision with root package name */
    private DeviceAlarm f37148d;

    /* renamed from: e  reason: collision with root package name */
    private WsdProgram f37149e;

    /* renamed from: f  reason: collision with root package name */
    private a f37150f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f37151g = new Handler(Looper.getMainLooper());

    /* renamed from: h  reason: collision with root package name */
    private o1 f37152h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f37153i;

    /* compiled from: WsdSetAlarmFragment.kt */
    /* loaded from: classes3.dex */
    public interface a {
        void R2(DeviceAlarm deviceAlarm);

        void Z2(WsdSetAlarmFragment wsdSetAlarmFragment);

        void p2(WsdSetAlarmFragment wsdSetAlarmFragment);
    }

    private final void A1() {
        o1 o1Var = this.f37152h;
        Handler handler = this.f37151g;
        if (o1Var != null) {
            handler.removeCallbacks(o1Var);
        }
        DeviceAlarm deviceAlarm = this.f37148d;
        u.g(deviceAlarm);
        o1 o1Var2 = new o1(3, this, deviceAlarm.a());
        this.f37152h = o1Var2;
        handler.postDelayed(o1Var2, 250L);
    }

    private final void F1() {
        LinearAlarmPicker linearAlarmPicker;
        RelativeLayout relativeLayout;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearAlarmPicker linearAlarmPicker2;
        tn.g gVar = this.f37147c;
        LinearAlarmPicker linearAlarmPicker3 = null;
        if (gVar != null) {
            linearAlarmPicker = gVar.f100323b;
        } else {
            linearAlarmPicker = null;
        }
        if (linearAlarmPicker != null) {
            if (gVar != null) {
                relativeLayout = gVar.f100331j;
            } else {
                relativeLayout = null;
            }
            u.g(relativeLayout);
            relativeLayout.setVisibility(0);
            tn.g gVar2 = this.f37147c;
            if (gVar2 != null) {
                linearLayout = gVar2.f100330i;
            } else {
                linearLayout = null;
            }
            u.g(linearLayout);
            linearLayout.setVisibility(8);
            tn.g gVar3 = this.f37147c;
            if (gVar3 != null) {
                linearLayout2 = gVar3.f100324c;
            } else {
                linearLayout2 = null;
            }
            u.g(linearLayout2);
            linearLayout2.setVisibility(8);
            tn.g gVar4 = this.f37147c;
            if (gVar4 != null) {
                linearAlarmPicker2 = gVar4.f100323b;
            } else {
                linearAlarmPicker2 = null;
            }
            if (linearAlarmPicker2 != null) {
                linearAlarmPicker2.setSmartWakeUpEnabled(false);
            }
            tn.g gVar5 = this.f37147c;
            if (gVar5 != null) {
                linearAlarmPicker3 = gVar5.f100323b;
            }
            u.h(linearAlarmPicker3, "null cannot be cast to non-null type com.withings.alarm.ui.picker.linear.LinearAlarmPicker");
            Context requireContext = requireContext();
            u.i(requireContext, "requireContext(...)");
            linearAlarmPicker3.setDefaultMarginTop(ah.g.k(250, requireContext));
        }
    }

    private final void G1() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        tn.g gVar = this.f37147c;
        if (gVar != null && (linearLayout2 = gVar.f100324c) != null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, linearLayout2.getHeight(), 0.0f);
            translateAnimation.setDuration(200L);
            translateAnimation.setStartOffset(300L);
            if (linearLayout2.getAnimation() != null) {
                linearLayout2.getAnimation().setAnimationListener(null);
                linearLayout2.getAnimation().cancel();
            }
            linearLayout2.setVisibility(0);
            linearLayout2.setAnimation(translateAnimation);
            translateAnimation.start();
        }
        tn.g gVar2 = this.f37147c;
        if (gVar2 != null && (linearLayout = gVar2.f100330i) != null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, -linearLayout.getHeight(), 0.0f);
            translateAnimation2.setDuration(200L);
            translateAnimation2.setStartOffset(300L);
            if (linearLayout.getAnimation() != null) {
                linearLayout.getAnimation().setAnimationListener(null);
                linearLayout.getAnimation().cancel();
            }
            linearLayout.setVisibility(0);
            linearLayout.setAnimation(translateAnimation2);
            translateAnimation2.start();
        }
    }

    private final void I1() {
        AlarmRepeatView alarmRepeatView;
        LinearAlarmPicker linearAlarmPicker;
        DeviceAlarm deviceAlarm = this.f37148d;
        if (deviceAlarm == null) {
            return;
        }
        tn.g gVar = this.f37147c;
        if (gVar != null && (linearAlarmPicker = gVar.f100323b) != null) {
            u.g(deviceAlarm);
            int h11 = deviceAlarm.h();
            DeviceAlarm deviceAlarm2 = this.f37148d;
            u.g(deviceAlarm2);
            int k11 = deviceAlarm2.k();
            DeviceAlarm deviceAlarm3 = this.f37148d;
            u.g(deviceAlarm3);
            linearAlarmPicker.a(h11, k11, deviceAlarm3.q());
        }
        tn.g gVar2 = this.f37147c;
        if (gVar2 != null) {
            alarmRepeatView = gVar2.f100327f;
        } else {
            alarmRepeatView = null;
        }
        if (alarmRepeatView != null) {
            alarmRepeatView.setAlarm(this.f37148d);
        }
    }

    private final void J1() {
        TextView textView;
        Context context;
        String str;
        TextView textView2;
        Context context2;
        TextView textView3;
        WsdProgram wsdProgram = this.f37149e;
        TextView textView4 = null;
        if (wsdProgram != null) {
            u.g(wsdProgram);
            tn.g gVar = this.f37147c;
            if (gVar != null && (textView3 = gVar.f100325d) != null) {
                context = textView3.getContext();
            } else {
                context = null;
            }
            int e11 = wsdProgram.e(context);
            if (e11 != 0) {
                tn.g gVar2 = this.f37147c;
                if (gVar2 != null && (textView2 = gVar2.f100325d) != null && (context2 = textView2.getContext()) != null) {
                    str = context2.getString(e11);
                } else {
                    str = null;
                }
                tn.g gVar3 = this.f37147c;
                if (gVar3 != null) {
                    textView4 = gVar3.f100325d;
                }
                if (textView4 != null) {
                    textView4.setText(str);
                    return;
                }
                return;
            }
            tn.g gVar4 = this.f37147c;
            if (gVar4 != null) {
                textView4 = gVar4.f100325d;
            }
            if (textView4 != null) {
                WsdProgram wsdProgram2 = this.f37149e;
                u.g(wsdProgram2);
                short d11 = wsdProgram2.d();
                textView4.setText("Program " + ((int) d11));
                return;
            }
            return;
        }
        tn.g gVar5 = this.f37147c;
        if (gVar5 != null) {
            textView = gVar5.f100325d;
        } else {
            textView = null;
        }
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
    }

    public static void s1(WsdSetAlarmFragment this$0) {
        u.j(this$0, "this$0");
        this$0.z1();
    }

    public static void t1(WsdSetAlarmFragment this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f37150f;
        if (aVar != null) {
            aVar.p2(this$0);
        }
    }

    public static void u1(WsdSetAlarmFragment this$0) {
        RelativeLayout relativeLayout;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        u.j(this$0, "this$0");
        long j5 = 200;
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(j5);
        alphaAnimation.setAnimationListener(new g(this$0));
        tn.g gVar = this$0.f37147c;
        LinearAlarmPicker linearAlarmPicker = null;
        if (gVar != null) {
            relativeLayout = gVar.f100333l;
        } else {
            relativeLayout = null;
        }
        u.g(relativeLayout);
        relativeLayout.startAnimation(alphaAnimation);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(j5);
        tn.g gVar2 = this$0.f37147c;
        if (gVar2 != null) {
            linearLayout = gVar2.f100330i;
        } else {
            linearLayout = null;
        }
        u.g(linearLayout);
        linearLayout.setVisibility(0);
        tn.g gVar3 = this$0.f37147c;
        if (gVar3 != null) {
            linearLayout2 = gVar3.f100330i;
        } else {
            linearLayout2 = null;
        }
        u.g(linearLayout2);
        linearLayout2.startAnimation(alphaAnimation2);
        AlphaAnimation alphaAnimation3 = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation3.setDuration(j5);
        tn.g gVar4 = this$0.f37147c;
        if (gVar4 != null) {
            linearLayout3 = gVar4.f100324c;
        } else {
            linearLayout3 = null;
        }
        u.g(linearLayout3);
        linearLayout3.setVisibility(0);
        tn.g gVar5 = this$0.f37147c;
        if (gVar5 != null) {
            linearLayout4 = gVar5.f100324c;
        } else {
            linearLayout4 = null;
        }
        u.g(linearLayout4);
        linearLayout4.startAnimation(alphaAnimation3);
        tn.g gVar6 = this$0.f37147c;
        if (gVar6 != null) {
            linearAlarmPicker = gVar6.f100323b;
        }
        u.g(linearAlarmPicker);
        linearAlarmPicker.setAlarmEnabled(true);
        this$0.f37153i = false;
    }

    public static void v1(WsdSetAlarmFragment this$0, DeviceAlarm deviceAlarm) {
        u.j(this$0, "this$0");
        a aVar = this$0.f37150f;
        if (aVar != null) {
            u.g(deviceAlarm);
            aVar.R2(deviceAlarm);
        }
    }

    public static void w1(WsdSetAlarmFragment this$0) {
        u.j(this$0, "this$0");
        a aVar = this$0.f37150f;
        if (aVar != null) {
            aVar.Z2(this$0);
        }
    }

    private final void z1() {
        RelativeLayout relativeLayout;
        Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), C1987R.anim.out_to_left);
        loadAnimation.setDuration(500L);
        loadAnimation.setAnimationListener(new j(this));
        tn.g gVar = this.f37147c;
        RelativeLayout relativeLayout2 = null;
        if (gVar != null) {
            relativeLayout = gVar.f100332k;
        } else {
            relativeLayout = null;
        }
        u.g(relativeLayout);
        relativeLayout.startAnimation(loadAnimation);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(getActivity(), C1987R.anim.in_from_right);
        loadAnimation2.setDuration(500L);
        loadAnimation2.setAnimationListener(new k(this));
        tn.g gVar2 = this.f37147c;
        if (gVar2 != null) {
            relativeLayout2 = gVar2.f100333l;
        }
        u.g(relativeLayout2);
        relativeLayout2.startAnimation(loadAnimation2);
    }

    public final void B1(a aVar) {
        this.f37150f = aVar;
    }

    public final void C1(WsdProgram wsdProgram) {
        TextView textView;
        this.f37149e = wsdProgram;
        tn.g gVar = this.f37147c;
        if (gVar != null) {
            textView = gVar.f100325d;
        } else {
            textView = null;
        }
        if (textView != null) {
            J1();
        }
    }

    @Override // com.withings.alarm.ui.AlarmRepeatView.a
    public final void D0(AlarmRepeatView view, boolean z5) {
        u.j(view, "view");
    }

    public final void D1(DeviceAlarm deviceAlarm) {
        this.f37148d = deviceAlarm;
        I1();
    }

    public final void E1() {
        LinearLayout linearLayout;
        tn.g gVar = this.f37147c;
        AlarmRepeatView alarmRepeatView = null;
        if (gVar != null) {
            linearLayout = gVar.f100326e;
        } else {
            linearLayout = null;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        tn.g gVar2 = this.f37147c;
        if (gVar2 != null) {
            alarmRepeatView = gVar2.f100327f;
        }
        if (alarmRepeatView != null) {
            alarmRepeatView.setVisibility(8);
        }
    }

    @Override // tg.a.InterfaceC1652a
    public final void H0(tg.a alarmPicker) {
        LinearAlarmPicker linearAlarmPicker;
        RelativeLayout relativeLayout;
        RelativeLayout relativeLayout2;
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        u.j(alarmPicker, "alarmPicker");
        if (this.f37153i) {
            alarmPicker.setSmartWakeUpEnabled(true);
            tn.g gVar = this.f37147c;
            LinearAlarmPicker linearAlarmPicker2 = null;
            if (gVar != null) {
                linearAlarmPicker = gVar.f100323b;
            } else {
                linearAlarmPicker = null;
            }
            if (linearAlarmPicker != null) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                long j5 = 200;
                alphaAnimation.setDuration(j5);
                tn.g gVar2 = this.f37147c;
                if (gVar2 != null) {
                    relativeLayout = gVar2.f100332k;
                } else {
                    relativeLayout = null;
                }
                u.g(relativeLayout);
                relativeLayout.startAnimation(alphaAnimation);
                tn.g gVar3 = this.f37147c;
                if (gVar3 != null) {
                    relativeLayout2 = gVar3.f100332k;
                } else {
                    relativeLayout2 = null;
                }
                u.g(relativeLayout2);
                relativeLayout2.setVisibility(0);
                AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation2.setDuration(j5);
                alphaAnimation2.setAnimationListener(new h(this));
                tn.g gVar4 = this.f37147c;
                if (gVar4 != null) {
                    linearLayout = gVar4.f100330i;
                } else {
                    linearLayout = null;
                }
                u.g(linearLayout);
                linearLayout.startAnimation(alphaAnimation2);
                AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation3.setDuration(j5);
                alphaAnimation3.setAnimationListener(new i(this));
                tn.g gVar5 = this.f37147c;
                if (gVar5 != null) {
                    linearLayout2 = gVar5.f100324c;
                } else {
                    linearLayout2 = null;
                }
                u.g(linearLayout2);
                linearLayout2.startAnimation(alphaAnimation3);
                tn.g gVar6 = this.f37147c;
                if (gVar6 != null) {
                    linearAlarmPicker2 = gVar6.f100323b;
                }
                u.h(linearAlarmPicker2, "null cannot be cast to non-null type com.withings.alarm.ui.picker.linear.LinearAlarmPicker");
                linearAlarmPicker2.setAlarmEnabled(false);
            }
        } else if (alarmPicker instanceof LinearAlarmPicker) {
            G1();
        }
        A1();
    }

    public final void H1() {
        RelativeLayout relativeLayout;
        this.f37153i = true;
        tn.g gVar = this.f37147c;
        if (gVar != null) {
            relativeLayout = gVar.f100331j;
        } else {
            relativeLayout = null;
        }
        if (relativeLayout != null) {
            F1();
        }
    }

    @Override // tg.a.InterfaceC1652a
    public final void M(tg.a alarmPicker) {
        u.j(alarmPicker, "alarmPicker");
        A1();
    }

    @Override // tg.a.InterfaceC1652a
    public final void R(LinearAlarmPicker alarmPicker) {
        RelativeLayout relativeLayout;
        u.j(alarmPicker, "alarmPicker");
        if (this.f37153i) {
            tn.g gVar = this.f37147c;
            if (gVar != null) {
                relativeLayout = gVar.f100333l;
            } else {
                relativeLayout = null;
            }
            u.g(relativeLayout);
            if (relativeLayout.getVisibility() == 8) {
                z1();
            }
        }
    }

    @Override // tg.a.InterfaceC1652a
    public final void V0(tg.a alarmPicker, int i11, int i12, int i13) {
        u.j(alarmPicker, "alarmPicker");
        DeviceAlarm deviceAlarm = this.f37148d;
        u.g(deviceAlarm);
        deviceAlarm.W(i11);
        DeviceAlarm deviceAlarm2 = this.f37148d;
        u.g(deviceAlarm2);
        deviceAlarm2.a0(i12);
        DeviceAlarm deviceAlarm3 = this.f37148d;
        u.g(deviceAlarm3);
        deviceAlarm3.p0(i13);
    }

    @Override // tg.a.InterfaceC1652a
    public final void e1(LinearAlarmPicker alarmPicker) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        u.j(alarmPicker, "alarmPicker");
        tn.g gVar = this.f37147c;
        RelativeLayout relativeLayout = null;
        if (gVar != null && (linearLayout2 = gVar.f100330i) != null && linearLayout2.getVisibility() == 0 && linearLayout2.getAnimation() == null) {
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, -linearLayout2.getHeight());
            translateAnimation.setDuration(200L);
            translateAnimation.setAnimationListener(new e(linearLayout2));
            if (linearLayout2.getAnimation() != null) {
                linearLayout2.getAnimation().setAnimationListener(null);
                linearLayout2.getAnimation().cancel();
            }
            linearLayout2.startAnimation(translateAnimation);
        }
        tn.g gVar2 = this.f37147c;
        if (gVar2 != null && (linearLayout = gVar2.f100324c) != null && linearLayout.getVisibility() == 0 && linearLayout.getAnimation() == null) {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, linearLayout.getHeight());
            translateAnimation2.setDuration(200L);
            translateAnimation2.setAnimationListener(new d(linearLayout, this));
            if (linearLayout.getAnimation() != null) {
                linearLayout.getAnimation().setAnimationListener(null);
                linearLayout.getAnimation().cancel();
            }
            linearLayout.startAnimation(translateAnimation2);
        }
        Context requireContext = requireContext();
        u.i(requireContext, "requireContext(...)");
        alarmPicker.setDefaultMarginTop(ah.g.k(102, requireContext));
        if (this.f37153i) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(200L);
            alphaAnimation.setAnimationListener(new f(this));
            tn.g gVar3 = this.f37147c;
            if (gVar3 != null) {
                relativeLayout = gVar3.f100331j;
            }
            u.g(relativeLayout);
            relativeLayout.startAnimation(alphaAnimation);
        }
    }

    @Override // tg.a.InterfaceC1652a
    public final void l0(tg.a alarmPicker, int i11) {
        u.j(alarmPicker, "alarmPicker");
        DeviceAlarm deviceAlarm = this.f37148d;
        u.g(deviceAlarm);
        deviceAlarm.p0(i11);
    }

    @Override // com.withings.alarm.ui.AlarmRepeatView.a
    public final void m0(AlarmRepeatView alarmRepeatView) {
        u.j(alarmRepeatView, "alarmRepeatView");
        A1();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        u.j(inflater, "inflater");
        tn.g b10 = tn.g.b(getLayoutInflater());
        this.f37147c = b10;
        return b10.a();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        LinearAlarmPicker linearAlarmPicker;
        LinearAlarmPicker linearAlarmPicker2;
        int i11;
        TextView textView;
        LinearAlarmPicker linearAlarmPicker3;
        MaterialButton materialButton;
        LinearLayout linearLayout;
        MaterialButton materialButton2;
        MaterialButton materialButton3;
        AlarmRepeatView alarmRepeatView;
        u.j(view, "view");
        super.onViewCreated(view, bundle);
        tn.g gVar = this.f37147c;
        LinearAlarmPicker linearAlarmPicker4 = null;
        if (gVar != null) {
            linearAlarmPicker = gVar.f100323b;
        } else {
            linearAlarmPicker = null;
        }
        if (linearAlarmPicker != null) {
            linearAlarmPicker.setSmartWakeUpEnabled(true);
        }
        tn.g gVar2 = this.f37147c;
        if (gVar2 != null) {
            linearAlarmPicker2 = gVar2.f100323b;
        } else {
            linearAlarmPicker2 = null;
        }
        if (linearAlarmPicker2 != null) {
            linearAlarmPicker2.setListener(this);
        }
        tn.g gVar3 = this.f37147c;
        if (gVar3 != null && (alarmRepeatView = gVar3.f100327f) != null) {
            alarmRepeatView.setCallBack(this);
        }
        tn.g gVar4 = this.f37147c;
        if (gVar4 != null && (materialButton3 = gVar4.f100334m) != null) {
            materialButton3.setOnClickListener(new gi.f(this, 2));
        }
        tn.g gVar5 = this.f37147c;
        if (gVar5 != null && (materialButton2 = gVar5.f100335n) != null) {
            materialButton2.setOnClickListener(new androidx.viewpager.widget.c(this, 4));
        }
        tn.g gVar6 = this.f37147c;
        if (gVar6 != null && (linearLayout = gVar6.f100326e) != null) {
            linearLayout.setOnClickListener(new androidx.viewpager.widget.d(this, 2));
        }
        tn.g gVar7 = this.f37147c;
        if (gVar7 != null && (materialButton = gVar7.f100328g) != null) {
            materialButton.setOnClickListener(new vn.d(this, 0));
        }
        if (!kn.e.c().n(61)) {
            String string = getString(C1987R.string._PROGRESSIVE_WAKE_UP_);
            u.i(string, "getString(...)");
            tn.g gVar8 = this.f37147c;
            if (gVar8 != null) {
                textView = gVar8.f100329h;
            } else {
                textView = null;
            }
            if (textView != null) {
                textView.setText(string);
            }
            tn.g gVar9 = this.f37147c;
            if (gVar9 != null && (linearAlarmPicker3 = gVar9.f100323b) != null) {
                linearAlarmPicker3.setSmartWakeUpText(string);
            }
            i11 = 20;
        } else {
            i11 = 60;
        }
        tn.g gVar10 = this.f37147c;
        if (gVar10 != null) {
            linearAlarmPicker4 = gVar10.f100323b;
        }
        if (linearAlarmPicker4 != null) {
            linearAlarmPicker4.setMaxSpan(i11);
        }
        I1();
        J1();
        if (this.f37153i) {
            F1();
        }
    }

    public final void y1() {
        LinearLayout linearLayout;
        tn.g gVar = this.f37147c;
        if (gVar == null || (linearLayout = gVar.f100324c) == null || linearLayout.getVisibility() != 0) {
            G1();
        }
    }
}
